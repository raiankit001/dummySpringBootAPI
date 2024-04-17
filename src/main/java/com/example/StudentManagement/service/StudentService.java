package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Student;

import java.util.List;

public interface StudentService {

    public boolean saveStudent(Student student);

    public List<Student> getAllStudents();

    public boolean deleteStudentById(long id);
}
