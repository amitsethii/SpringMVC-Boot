package com.mysqlDtabase.mysqlDtabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mysqlDtabase.mysqlDtabase.entity.Students;
import com.mysqlDtabase.mysqlDtabase.service.LoginService;



@RestController
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@GetMapping("/data")
	public List<Students> data(){
		return service.getStu();
	}
	
	@PostMapping("/data")
	public Students addStu(@RequestBody Students input) {
	
		return this.service.addStu(input);
	}
	
	
	@GetMapping("/login")
	public String greet()
	{
		return "hello world";
	}
}
