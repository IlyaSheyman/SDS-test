package sds.test.Student.service.student_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class StudentUpdateRequest {
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    private String group;
    @PositiveOrZero
    @JsonProperty("average_grade")
    private Double averageGrade;

}