package com.ccb.demo2.controller;


import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ccb.demo2.entity.Test;
import com.ccb.demo2.service.TestService;
 
@Controller
public class TestController {
	
	private Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test")
    @ResponseBody
    public String home(HttpServletRequest request) throws Exception {
		String name = request.getParameter("name");
		Test findByName = testService.findByName(name);
		logger.info("success");
        return findByName.toString();
    }
	
	@RequestMapping("/testJsp")
    public String testJsp(HttpServletRequest request,Model model) throws Exception {
		String name = request.getParameter("name");
		Test findByName = testService.findByName(name);
		logger.info("testJsp....{}",findByName.toString());
		
		model.addAttribute("time", new Date());
		model.addAttribute("message", findByName.getName());
		
        return "index";
    }
}
