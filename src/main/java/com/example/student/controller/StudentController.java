package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.example.student.Services.StudentServices;
import com.example.student.entity.Student;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/students")
public class StudentController 
{
	@Autowired
	StudentServices studentServices;
	
	@ApiOperation(value = "get", notes = "hjmn")
	@GetMapping("/getAll")
	public List<Student> getAllStudents()
	{
		return studentServices.showAll();
	}
	@ApiOperation(value = "get", notes = "hjmn")
	@GetMapping("/get")
	public Optional<Student> getById(Integer id)
	{
		return studentServices.showById(id);
	}
	@ApiOperation(value = "post", notes = "hjmn")
	@PostMapping("/Post")
	public String addStudent(@RequestBody Student student)
	{
		return studentServices.addingStudent(student);
	}
	
	@ApiOperation(value = "put", notes = "hjmn")
	@PutMapping
	public Optional<Student> updateDetailsById(Integer id,Student student)
	{
		return studentServices.updateDetails(id,student);
	}
}
