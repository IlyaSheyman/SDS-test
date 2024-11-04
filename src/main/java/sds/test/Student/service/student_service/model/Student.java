package sds.test.Student.service.student_service.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Data
public class Student {

    @Id
    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String group;
    private Double averageGrade;

}