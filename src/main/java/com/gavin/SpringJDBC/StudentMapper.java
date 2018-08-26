package com.gavin.SpringJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gavin.SpringJDBC.model.Student;

public class StudentMapper  implements RowMapper<Student>{

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student= new Student();
		student.setId( rs.getLong("id"));
		student.setName(rs.getString("mane"));
		student.setAge(rs.getInt("age"));
		return student;
	}

}
