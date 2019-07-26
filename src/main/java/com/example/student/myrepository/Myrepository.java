package com.example.student.myrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.student.entity.Student;

@Repository
public interface Myrepository extends CrudRepository<Student, Integer>
{
	
}
