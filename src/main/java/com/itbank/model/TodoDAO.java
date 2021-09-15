package com.itbank.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface TodoDAO {

	@Select("select * from todoList order by d_day")
	List<TodoDTO> list();

	@Delete("delete todoList where idx = #{idx}")
	int delete(int idx);

	@Insert("insert into todoList (d_day, title) values (#{d_day}, #{title})")
	int write(HashMap<String, String> map);

}
