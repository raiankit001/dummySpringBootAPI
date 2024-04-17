package com.example.StudentManagement.controller;

import com.example.StudentManagement.model.Student;
import com.example.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String addNewStudent(@RequestBody Student student){
        if(studentService.saveStudent(student)){
            return "Successfully New Student Data Added";
        }
        else return "Failed to add new student data";
    }

    @GetMapping({"/","/students"})
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable Long id){
        if(studentService.deleteStudentById(id)){
            return "Deleted successfully";
        }
        else return "failed";
    }
}
