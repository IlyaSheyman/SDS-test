package sds.test.Student.service.student_service.mapper;

import org.mapstruct.Mapper;
import sds.test.Student.service.student_service.dto.StudentCreateDto;
import sds.test.Student.service.student_service.dto.StudentGetDto;
import sds.test.Student.service.student_service.dto.StudentUpdateDto;
import sds.test.Student.service.student_service.model.Student;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    StudentCreateDto toStudentCreateDto(Student student);
    StudentUpdateDto toStudentUpdateDto(Student student);
    StudentGetDto toStudentGetDto(Student student);
}
