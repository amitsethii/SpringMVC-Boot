package com.mysqlDtabase.mysqlDtabase.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysqlDtabase.mysqlDtabase.entity.Students;

public interface StudentsDao extends JpaRepository<Students, Integer> {

}
