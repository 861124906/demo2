package com.ccb.demo2.dao.oracle;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ccb.demo2.entity.Demo;
@Mapper
public interface DemoDao {
	List<Demo> getDemoList() throws Exception;
}
