package com.example.entity;

import java.sql.Date;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer empno;
	public String ename;
	public String job;
	public Integer mgr;
	public Date hiredate;
	public Integer sal;
	public Integer comm;
	public Integer deptno;
}
