package com.example.student.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.myrepository.Myrepository;

@Service
public class StudentServices 
{
	@Autowired
	Myrepository myrepository;
	
	
	public List<Student> showAll() {
		
		return (List<Student>) myrepository.findAll();
	}
	
	public Optional<Student> showById(Integer id)
	{
		return myrepository.findById(id);
	}

	public String addingStudent(Student student) {
		myrepository.save(student);
		return "Successful";
	}

	public Optional<Student> updateDetails(Integer id, Student student) {
		if(student.getId().equals(id))
		{
			myrepository.save(student);
		}
		return null;
	}
	
}
