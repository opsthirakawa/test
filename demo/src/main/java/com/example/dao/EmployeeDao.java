package com.example.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.entity.Employee;

@ConfigAutowireable
@Dao
public interface EmployeeDao {

	@Select
	List<Employee> findAll();
}
