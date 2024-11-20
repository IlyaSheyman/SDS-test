package sds.test.Student.service.student_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StudentCreateDto {
    private String id;
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    private String group;
    @JsonProperty("average_grade")
    private Double averageGrade;
}
