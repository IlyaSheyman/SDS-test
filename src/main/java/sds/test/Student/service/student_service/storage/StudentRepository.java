package sds.test.Student.service.student_service.storage;

import org.springframework.data.mongodb.repository.MongoRepository;
import sds.test.Student.service.student_service.model.Student;

import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findByLastNameAndFirstNameAndMiddleName(String lastName, String firstName, String middleName);
}