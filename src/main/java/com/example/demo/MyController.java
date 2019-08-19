package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/")
	public String register()
	{
		
		return "register.jsp";
	}
	
	@RequestMapping("/add")
	public String insert(Student student)
	{
		dao.save(student);
		return "register.jsp";
	}

}
