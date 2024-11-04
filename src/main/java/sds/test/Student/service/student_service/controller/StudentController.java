package sds.test.Student.service.student_service.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import sds.test.Student.service.student_service.dto.StudentAddRequest;
import sds.test.Student.service.student_service.dto.StudentCreateDto;
import sds.test.Student.service.student_service.dto.StudentGetDto;
import sds.test.Student.service.student_service.dto.StudentUpdateDto;
import sds.test.Student.service.student_service.model.Student;
import sds.test.Student.service.student_service.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    @Transactional
    public List<StudentGetDto> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    @Transactional
    public StudentCreateDto createStudent(@RequestBody @Valid StudentAddRequest student) {
        return service.addStudent(student);
    }

    @PutMapping("/{id}")
    @Transactional
    public StudentUpdateDto updateStudent(@PathVariable String id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
}