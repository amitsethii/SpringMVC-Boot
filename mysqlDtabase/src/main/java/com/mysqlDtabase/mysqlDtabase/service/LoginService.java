package com.mysqlDtabase.mysqlDtabase.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysqlDtabase.mysqlDtabase.dao.StudentsDao;
import com.mysqlDtabase.mysqlDtabase.entity.Students;

@Service
public class LoginService {
	
	
	@Autowired
	private StudentsDao stuDao;
	
	
	private static List<Students> stu = new  ArrayList<Students>();
	
//	static {
//		stu.add(new Students(1, "Amit"));
//		stu.add(new Students(2, "Bharat"));
//		stu.add(new Students(3, "gaurav"));
//		stu.add(new Students(4, "karan"));
//	}

	public List<Students> getStu(){
		return stuDao.findAll();
	}
	
	public Students addStu(Students input) {
		stuDao.save(input);
		return input;
	}
	
	
	
}
