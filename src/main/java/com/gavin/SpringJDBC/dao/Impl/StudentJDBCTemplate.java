package com.gavin.SpringJDBC.dao.Impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gavin.SpringJDBC.dao.StudentDao;
import com.gavin.SpringJDBC.model.Student;

public class StudentJDBCTemplate implements StudentDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	


	public void create(String name, Integer age) {
		String SQL = "inset into Student(name,age) valuess (?,?)";

		jdbcTemplateObject.update(SQL,name,age);
		System.out.println("Created Record Name = " + name +"Afe="+age);
	}

	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public void update(Integer id, Integer age) {
		// TODO Auto-generated method stub
		
	}

}
