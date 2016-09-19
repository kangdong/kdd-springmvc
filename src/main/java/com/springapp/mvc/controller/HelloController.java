package com.springapp.mvc.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.abel533.echarts.Option;
import com.springapp.mvc.model.WebResult;
import com.springapp.mvc.service.Echarts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "KDD");
		return "hello";
	}

	@RequestMapping(value="/removecauses",produces="text/html;charset=UTF-8")
	@ResponseBody
	public String removecauses() throws Exception {
			System.out.println("removecauses");
		WebResult result = new WebResult();
		Option option = Echarts.selectRemoveCauses();
		result.isOK();
		result.setData(option);
		System.out.println(JSONObject.toJSON(result));
		return JSONObject.toJSONString(result);
	}

}