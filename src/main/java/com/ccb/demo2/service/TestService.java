package com.ccb.demo2.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ccb.demo2.dao.mysql.TestDao;
import com.ccb.demo2.dao.oracle.DemoDao;
import com.ccb.demo2.entity.Demo;
import com.ccb.demo2.entity.Test;

@Service
public class TestService {
	
	private static final Logger logger = LoggerFactory.getLogger(TestService.class); 

	@Autowired  
	private TestDao testDao;  
	
	@Autowired  
	private DemoDao demoDao;
	
	public Test findByName(String name) throws Exception {
		List<Demo> demoList = demoDao.getDemoList();
		logger.info(demoList.toString());
		return testDao.findByName(name);
	}

}
