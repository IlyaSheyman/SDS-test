package sds.test.Student.service.student_service.storage;

import org.springframework.data.mongodb.repository.MongoRepository;
import sds.test.Student.service.student_service.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
}