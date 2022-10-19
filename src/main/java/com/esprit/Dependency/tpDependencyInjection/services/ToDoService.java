package com.esprit.Dependency.tpDependencyInjection.services;

import java.util.List;

import com.esprit.Dependency.tpDependencyInjection.dao.IToDoDao;

import com.esprit.Dependency.tpDependencyInjection.dao.ToDoDao;
import com.esprit.Dependency.tpDependencyInjection.dao.ToDoDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("ToDoService1")
public class ToDoService {
	@Autowired
	private IToDoDao IttoDoDao;
	@Autowired
	@Qualifier("ToDoDao1")
	private ToDoDao toDoDao1;
	@Qualifier("ToDoDao2")
	private ToDoDao2 toDoDao2;


	//Paramétrer
	//les classes de façon à afficher la liste des cours liées à la matière UML.
	public List<String> getCoursesList() {
		return IttoDoDao.getCoursesList();
	}

	public List<String> getCoursesListSpring() {
		return toDoDao1.getCoursesList();
	}
	public List<String> getCoursesListUML() {
		return toDoDao2.getCoursesList();
	}




}
