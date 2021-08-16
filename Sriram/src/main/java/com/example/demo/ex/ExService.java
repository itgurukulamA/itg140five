package com.example.demo.ex;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class ExService {
	@Autowired
	JdbcTemplate jt;
	@Autowired
	NamedParameterJdbcTemplate jpt;
	public String insert(Example ex)
	{
		String sql="insert into student values(?,?,?)";
		int id=ex.getId();
		String name=ex.getName();
		int phoneno=ex.getPhoneno();
		int result=jt.update(sql,id,name,phoneno);
		if(result>0)
		{
			return "data inserted successfully";
		}
		else
		{
			return "data inserted failed";
		}
	}
	public String insert1(Example ex)
	{
		String sql="update student set name=? where id=?";
		int id=ex.getId();
		String name=ex.getName();
		int result=jt.update(sql,name,id);
		if(result>0)
		{
			return "data updated successfully";
		}
		else
		{
			return "data updated failed";
		}
	}
	public Map<String,String> insert2(Example ex)
	{
		Map<String,String> n=new HashMap<String,String>();
		String sql="insert into student(id,name,phoneno) values(:id,:name,:phoneno)";
		SqlParameterSource par=new MapSqlParameterSource()
				.addValue("id",ex.getId())
				.addValue("name",ex.getName())
				.addValue("phoneno",ex.getPhoneno());
		int result=jpt.update(sql,par);
		if(result>0)
		{
			n.put("success","data inserted successfully");
		}
		else
		{
			n.put("failed","data inserted failed");
		}
		return n;
	}
	public String insert3(Example ex)
	{
		String sql="delete from student where id=?";
		int id=ex.getId();
		int result =jt.update(sql,id);
		if(result>0)
		{
			return "record is deleted successfully";
		}
		else
		{
			return "sorry...! record is deleted failed";
		}
	}
}