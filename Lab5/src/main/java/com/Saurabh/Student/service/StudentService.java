package com.saurabh.studentma.service;

import java.util.List;
import com.saurabh.studentma.entity.Student;



public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);


}
