package com.esprit.Dependency.tpDependencyInjection.controller;

import java.util.List;



import com.esprit.Dependency.tpDependencyInjection.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ToDoController {
	@Autowired
	ToDoService toDoService;

	public List<String> getCoursesList() {
		return toDoService.getCoursesList();
	}

	public List<String> getCoursesListUML() {
		return toDoService.getCoursesListUML();
	}
	public List<String> getCoursesListSpring() {
		return toDoService.getCoursesListSpring();
	}
}
