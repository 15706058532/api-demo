package com.lzf.demo.demo.req;

import com.lzf.code.annatation.LzfApiDescribe;

import java.io.Serializable;
import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2019-03-23 12:02
 *
 * @author Li Zhenfeng
 */
public class TestReq implements Serializable {
    private static final long serialVersionUID = 7873038993428077849L;
    private String aLong;
    @LzfApiDescribe(value = "TestReqInt",must = true)
    private Integer anInt;

    private String password;

    private List<TestUserReq> testUserReqs;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getaLong() {
        return aLong;
    }

    public void setaLong(String aLong) {
        this.aLong = aLong;
    }

    public Integer getAnInt() {
        return anInt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAnInt(Integer anInt) {
        this.anInt = anInt;
    }

    @Override
    public String toString() {
        return "TestReq{" +
                "aLong='" + aLong + '\'' +
                ", anInt=" + anInt +
                ", password='" + password + '\'' +
                '}';
    }
}
