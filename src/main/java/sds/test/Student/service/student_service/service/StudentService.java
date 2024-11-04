package sds.test.Student.service.student_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sds.test.Student.service.student_service.dto.StudentAddRequest;
import sds.test.Student.service.student_service.dto.StudentCreateDto;
import sds.test.Student.service.student_service.dto.StudentGetDto;
import sds.test.Student.service.student_service.dto.StudentUpdateDto;
import sds.test.Student.service.student_service.model.Student;
import sds.test.Student.service.student_service.storage.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<StudentGetDto> getAllStudents() {
    }

    public StudentCreateDto addStudent(StudentAddRequest student) {
    }

    public StudentUpdateDto updateStudent(String id, Student student) {
    }

    public void deleteStudent(String id) {
    }
}
