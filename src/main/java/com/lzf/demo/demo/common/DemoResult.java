package com.lzf.demo.demo.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * json返回工具类
 * Created in 2018-04-13 14:11
 *
 * @author Li Zhenfeng
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DemoResult implements Serializable {

    /**
     * 定义jackson对象
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final long serialVersionUID = -2492072809889519824L;

    /**
     * 响应业务状态
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String msg;

    /**
     * 响应中的数据
     */
    private Object data;

    public static DemoResult build(Integer code, String msg, Object data) {
        return new DemoResult(code, msg, data);
    }

    public static DemoResult ok(Object data) {
        return new DemoResult(data);
    }

    public static DemoResult ok() {
        return new DemoResult(null);
    }

    public DemoResult() {

    }

    public static DemoResult build(Integer code, String msg) {
        return new DemoResult(code, msg, null);
    }

    public DemoResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public DemoResult(Object data) {
        this.code = Constant.OK;
        this.msg = Constant.TEXT_OK;
        this.data = data;
    }

    public Boolean isOK() {
        return Objects.equals(this.code, Constant.OK);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 将json结果集转化为E3Result对象
     *
     * @param jsonData json数据
     * @param clazz    E3Result中的object类型
     * @return
     */
    public static DemoResult formatToPojo(String jsonData, Class<?> clazz) {
        try {
            if (clazz == null) {
                return MAPPER.readValue(jsonData, DemoResult.class);
            }
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isObject()) {
                obj = MAPPER.readValue(data.traverse(), clazz);
            } else if (data.isTextual()) {
                obj = MAPPER.readValue(data.asText(), clazz);
            }
            return build(jsonNode.get("code").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 没有object对象的转化
     *
     * @param json
     * @return
     */
    public static DemoResult format(String json) {
        try {
            return MAPPER.readValue(json, DemoResult.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Object是集合转化
     *
     * @param jsonData json数据
     * @param clazz    集合中的类型
     * @return
     */
    public static DemoResult formatToList(String jsonData, Class<?> clazz) {
        try {
            JsonNode jsonNode = MAPPER.readTree(jsonData);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (data.isArray() && data.size() > 0) {
                obj = MAPPER.readValue(data.traverse(),
                        MAPPER.getTypeFactory().constructCollectionType(List.class, clazz));
            }
            return build(jsonNode.get("code").intValue(), jsonNode.get("msg").asText(), obj);
        } catch (Exception e) {
            return null;
        }
    }
}
