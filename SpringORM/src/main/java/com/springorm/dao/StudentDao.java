package com.springorm.dao;

import java.util.List;

import com.springorm.entities.Student;

public interface StudentDao 
{
	public int insert(Student student);	
	
	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
	
	public void UpdateStudent(Student student);
	
	public void deleteStudent(int id);
}
