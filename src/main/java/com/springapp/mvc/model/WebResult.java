package com.springapp.mvc.model;

import com.github.abel533.echarts.Option;

/**
 * Created by kangd on 2016/9/19.
 */
public class WebResult {
    Option data;

    boolean success;

    String msg="test";

    public void isOK(){
        this.success = true;
    }

    public Option getData() {
        return data;
    }

    public void setData(Option data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
