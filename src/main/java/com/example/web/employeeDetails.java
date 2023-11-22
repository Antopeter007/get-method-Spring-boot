package com.example.web;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;

@RestController

public class employeeDetails {
	@RequestMapping("/details")
	@ResponseBody
	public List<employee> name() {
		List<employee> details = new ArrayList<>();

		employee emp = new employee("Saravana", 85000.05, "AVR", "6389458210");
		employee emp1 = new employee("Anto Peter", 70000.05, "TEN", "7092545780");
		employee emp2 = new employee("Sam", 120000.05, "PCM", "8957824050");
		employee emp3 = new employee("Smith", 35000.05, "KZT", "6857402658");

		details.add(emp);
		details.add(emp1);
		details.add(emp2);
		details.add(emp3);

		return details;
	}

	@RequestMapping("/info")
	@ResponseBody
	public List<Map<String, Object>> info() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();
		map.put("Anto Peter", "Producer");
		map.put("Sam", "Editor");
		map.put("Saravana", "Content Creator");
		map.put("Smith", "Acotr");
		list.add(map);
		return list;
	}

	

}
