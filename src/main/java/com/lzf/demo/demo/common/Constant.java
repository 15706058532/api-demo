package com.lzf.demo.demo.common;

/**
 * 写点注释
 * <br/>
 * Created in 2019-02-15 14:02
 *
 * @author Li Zhenfeng
 */
public interface Constant {
    Integer OK = 200;
    String TEXT_OK = "请求成功";
    String TEXT_FILE_OK = "文件上传成功";
    Integer EXIST = 210;
    String TEXT_EXIST = "数据重复";
    Integer DATA_NULL = 220;
    String TEXT_DATA_NULL = "数据不存在";
    Integer PARAM_FALL = 230;
    String TEXT_PARAM_FALL = "参数不全";
    Integer PARAM_TYPE_FALL = 231;
    String TEXT_PARAM_TYPE_FALL = "参数类型不匹配";
    Integer UPDATE_FAIL = 240;
    String TEXT_UPDATE_FAIL = "更新失败";

    Integer INSUFFICIENT_AUTHORITY_FAIL = 260;
    String TEXT_INSUFFICIENT_AUTHORITY_FAIL = "权限不足";
    Integer UNENTITLED_FAIL = 270;
    String TEXT_UNENTITLED_FAIL = "无权操作";
    Integer FAIL = 300;
    String TEXT_FAIL = "失败";
    Integer FILE_NULL_FAIL = 310;
    String TEXT_FILE_NULL_FAIL = "文件为空";
    Integer FILE_FAIL = 330;
    String TEXT_FILE_FAIL = "文件上传失败";
    Integer FILE_DOWN_FAIL = 340;
    String TEXT_FILE_DOWN_FAIL = "文件下载失败";
    Integer FILE_ANALYSIS_FAIL = 350;
    String TEXT_FILE_ANALYSIS_FAIL = "文件解析失败";
    Integer FILE_CONTEXT_FAIL = 360;
    String TEXT_FILE_CONTEXT_FAIL = "文件内容不正确";
    Integer FILE_TYPE_FAIL = 370;
    String TEXT_FILE_TYPE_FAIL = "文件类型错误";


    Integer LOGIN_NULL_FAIL = 400;
    String TEXT_LOGIN_NULL_FAIL = "尚未登录";
    Integer SESSION_TIMEOUT_FAIL = 410;
    String TEXT_SESSION_TIMEOUT_FAIL = "登录超时";
    Integer LOGIN_FAIL = 420;
    String TEXT_LOGIN_FAIL = "用户名或密码不正确";
    Integer PASSWORD_FAIL = 421;
    String TEXT_PASSWORD_FAIL = "密码错误";
    Integer PASSWORD_REPEAT_FAIL = 422;
    String TEXT_PASSWORD_REPEAT_FAIL = "新密码不能为近一年内修改过的密码";
    Integer PASSWORD_MODIFY_LIMIT_FAIL = 423;
    String TEXT_PASSWORD_MODIFY_LIMIT_FAIL = "密码错误修改超过限制次数";
    Integer LOGIN_EXCEEDED_RETRY_COUNT_FAIL = 424;
    String TEXT_LOGIN_EXCEEDED_RETRY_COUNT_FAIL = "登录超过重试次数";

    Integer SYSTEM_FAIL = 500;
    String TEXT_SYSTEM_FAIL = "服务器异常";


    String SUFFIX_ZIP = ".zip";
    String SUFFIX_XLSX = ".xlsx";
    String SUFFIX_XLS = ".xls";
    String SUFFIX_LOG = ".log";
    String XLS_CONTENT_TYPE = "application/vnd.ms-excel";
    String XLSX_CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

    String SORT_SUBJECT = "subject";
    String SORT_TEMPLATE = "template_";


    String TABLE_PREFIX_TB_AMORE = "TB_AMORE_";
    String TABLE_SUFFIX_SOURCE_HISTORY = "_SOURCE_HISTORY";
    String TABLE_SUFFIX_TARGET = "_TARGET";
    String TABLE_SUFFIX_SOURCE = "_SOURCE";
    String TABLE_SUFFIX_BAD = "_BAD";

}
