package sds.test.Student.service.student_service.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Student entity representing a student in the database")
public class Student {

    @Id
    @Schema(description = "Unique identifier of the student", example = "642fce5aebc7367dffab5e99")
    private String id;
    @Schema(description = "Last name of the student", example = "Doe", required = true)
    private String lastName;
    @Schema(description = "First name of the student", example = "John", required = true)
    private String firstName;
    @Schema(description = "Middle name of the student", example = "Michael", required = true)
    private String middleName;
    @Schema(description = "Group name the student belongs to", example = "CS101", required = true)
    private String group;
    @Schema(description = "Average grade of the student", example = "4.5", minimum = "0")
    private Double averageGrade;

}