package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapper.Test;
import com.example.demo.mapper.TestMapper;

@RestController
public class IndexController {

	private static Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private TestMapper testMapper;
	
	@GetMapping("/index")
	public void index(){
		log.trace("测试开始了");
		log.info("info信息");
		log.error("error信息");
		
		Test test = new Test();
		test.setUserName("操作日志測試！");
		test.setUserUid("6666222fasdfasdfasd");
		testMapper.insertSelective(test);
	}
	
	@GetMapping("/index/{aa}")
	public void index(@PathVariable String aa){
		log.info("info信息" + aa);
		log.error("error信息" + aa);
	}
}
