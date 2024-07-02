package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {


	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Student student) {
		
		final String query = "insert into student(id, name, address) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getAddress());
		return r;
	}

	@Override
	public int change(Student student) {
		
		final String query = "update student set name = ? , address = ? where id = ?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getAddress(), student.getId());
		return r;
	}

	@Override
	public int delete(Student student) {
		final String query = "delete from student where id = ?";
		int r = this.jdbcTemplate.update(query,  student.getId());
		return r;
	}

	@Override
	public Student getStudent(int studentId) {
		final String query= "select * from student where id = ?";
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAddress(rs.getString("address"));
				
				return student;
			}
		};
		Student r = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return r;
	}

	@Override
	public List<Student> getAllStudent() {
		final String query = "select * from student";
		RowMapper<Student> rowMapper = new RowMapper<Student>() {
			
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAddress(rs.getString("address"));
				
				return student;
			}
		};
		
		List<Student> r = this.jdbcTemplate.query(query, rowMapper);
		return r;
	}

}
