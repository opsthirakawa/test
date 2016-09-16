package com.example.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.EmployeeDao;

@Controller
public class TopController {

	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/index")
	public Model home(Model model) {
		model.addAttribute("emp", employeeDao.findAll());
		model.addAttribute("msg", "test");
		return model;
	}
}
