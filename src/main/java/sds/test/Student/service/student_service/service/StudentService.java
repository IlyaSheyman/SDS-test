package sds.test.Student.service.student_service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sds.test.Student.service.student_service.dto.*;
import sds.test.Student.service.student_service.exceptions.model.ConflictRequestException;
import sds.test.Student.service.student_service.exceptions.model.NotFoundException;
import sds.test.Student.service.student_service.mapper.StudentMapper;
import sds.test.Student.service.student_service.model.Student;
import sds.test.Student.service.student_service.storage.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository repository;
    private final StudentMapper mapper;

    public List<StudentGetDto> getAllStudents() {
        return repository.findAll().stream().map(mapper::toStudentGetDto).toList();
    }

    public StudentCreateDto addStudent(StudentAddRequest request) {
        Optional<Student> existingStudent = repository.findByLastNameAndFirstNameAndMiddleName(
                request.getLastName(),
                request.getFirstName(),
                request.getMiddleName()
        );

        if (existingStudent.isPresent()) {
            throw new ConflictRequestException("Студент с таким сочетанием фамилии, имени и отчества уже существует");
        }
        Student newStudent = Student.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .middleName(request.getMiddleName())
                .group(request.getGroup())
                .averageGrade(request.getAverageGrade())
                .build();

        Student savedStudent = repository.save(newStudent);

        return mapper.toStudentCreateDto(savedStudent);

    }

    public StudentUpdateDto updateStudent(String id, StudentUpdateRequest request) {
        Student existingStudent = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("Student with ID " + id + " not found"));

        existingStudent.setGroup(request.getGroup());
        existingStudent.setAverageGrade(request.getAverageGrade());

        Student updatedStudent = repository.save(existingStudent);

        return mapper.toStudentUpdateDto(updatedStudent);
    }

    public void deleteStudent(String id) {
        boolean exists = repository.existsById(id);
        if (!exists) {
            throw new NotFoundException("Student with ID " + id + " not found");
        }

        repository.deleteById(id);
    }
}
