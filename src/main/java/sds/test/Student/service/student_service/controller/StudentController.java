package sds.test.Student.service.student_service.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import sds.test.Student.service.student_service.dto.*;
import sds.test.Student.service.student_service.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@Validated
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    @Transactional
    public List<StudentGetDto> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    @ResponseBody
    @Transactional
    public StudentCreateDto createStudent(@RequestBody @Valid StudentAddRequest student) {
        return service.addStudent(student);
    }

    @PutMapping("/{id}")
    @Transactional
    public StudentUpdateDto updateStudent(@PathVariable String id, @RequestBody @Valid StudentUpdateRequest request) {
        return service.updateStudent(id, request);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
}