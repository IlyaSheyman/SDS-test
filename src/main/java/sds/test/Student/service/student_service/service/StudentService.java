package sds.test.Student.service.student_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sds.test.Student.service.student_service.dto.StudentAddRequest;
import sds.test.Student.service.student_service.dto.StudentCreateDto;
import sds.test.Student.service.student_service.dto.StudentGetDto;
import sds.test.Student.service.student_service.dto.StudentUpdateDto;
import sds.test.Student.service.student_service.mapper.StudentMapper;
import sds.test.Student.service.student_service.model.Student;
import sds.test.Student.service.student_service.storage.StudentRepository;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;
    private StudentMapper mapper;

    public List<StudentGetDto> getAllStudents() {
        return repository.findAll().stream().map(mapper::toStudentGetDto).toList();
    }

    public StudentCreateDto addStudent(StudentAddRequest student) {
        return null;
    }

    public StudentUpdateDto updateStudent(String id, Student student) {
        return null;
    }

    public void deleteStudent(String id) {
    }
}
