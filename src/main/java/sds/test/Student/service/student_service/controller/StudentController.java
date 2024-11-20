package sds.test.Student.service.student_service.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Students", description = "Operations related to student management")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    @Transactional
    @Operation(
            summary = "Get all students",
            description = "Retrieve a list of all students",
            responses = {
                    @ApiResponse(responseCode = "200", description = "List of students retrieved successfully"),
                    @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
            }
    )
    public List<StudentGetDto> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping
    @ResponseBody
    @Transactional
    @Operation(
            summary = "Create a new student",
            description = "Add a new student to the database",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Student created successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid input data", content = @Content)
            }
    )
    public StudentCreateDto createStudent(@RequestBody @Valid StudentAddRequest student) {
        return service.addStudent(student);
    }

    @PutMapping("/{id}")
    @Transactional
    @Operation(
            summary = "Update student details",
            description = "Update the details of an existing student",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Student updated successfully"),
                    @ApiResponse(responseCode = "404", description = "Student not found", content = @Content)
            }
    )
    public StudentUpdateDto updateStudent(@PathVariable String id, @RequestBody @Valid StudentUpdateRequest request) {
        return service.updateStudent(id, request);
    }

    @DeleteMapping("/{id}")
    @Transactional
    @Operation(
            summary = "Delete a student",
            description = "Delete a student from the database by ID",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Student deleted successfully"),
                    @ApiResponse(responseCode = "404", description = "Student not found", content = @Content)
            }
    )
    public void deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
    }
}