package com.springapp.mvc;

import com.alibaba.fastjson.JSONObject;
import com.springapp.mvc.service.Echarts;

/**
 * Created by kangd on 2016/9/19.
 */
public class Test {
    public static void main(String[] args) {
        Echarts echarts= new Echarts();
        System.out.println(JSONObject.toJSON(echarts.selectRemoveCauses()));
    }
}
