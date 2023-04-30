package com.springorm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.entities.Student;

import jakarta.transaction.Transactional;

public class StudentDaoImpl implements StudentDao
{
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() 
	{
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) 
	{
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional	
	//save student
	public int insert(Student student)
	{
		// insert
		int i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	
	// get the single data(object)
	public Student getStudent(int id) 
	{
		Student student =  this.hibernateTemplate.get(Student.class, id);
		 return student;
	}

	// get all student(all rows)
	public List<Student> getAllStudents() 
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students; 
	}

	//updating data...
	@Transactional
	public void UpdateStudent(Student student) 
	{
		this.hibernateTemplate.update(student);
	}
	
	//deleting the data
	@Transactional
	public void deleteStudent(int id) 
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
}
