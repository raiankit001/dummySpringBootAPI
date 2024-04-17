package com.example.StudentManagement.service;

import com.example.StudentManagement.model.Student;
import com.example.StudentManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplem implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public boolean saveStudent(Student student) {
        studentRepo.save(student);
        if(studentRepo.findById(student.getId()) != null){
            return true;
        }
        else return false;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public boolean deleteStudentById(long id) {
        studentRepo.deleteById(id);
        if(studentRepo.findById(id) != null){
            return false;
        }
        else return true;
    }
}
