package com.ccb.demo2.dao.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ccb.demo2.entity.Test;
@Mapper
public interface TestDao {
	Test findByName(@Param("name") String n);
}
