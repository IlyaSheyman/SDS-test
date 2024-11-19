package sds.test.Student.service.student_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import static sds.test.Student.service.student_service.constants.Constants.MAX_GRADE;
import static sds.test.Student.service.student_service.constants.Constants.MIN_GRADE;

@Data
public class StudentAddRequest {

    //TODO add schemas (everywhere)

    @NotBlank
    @JsonProperty("last_name")
    private String lastName;

    @NotBlank
    @JsonProperty("first_name")
    private String firstName;

    @NotBlank
    @JsonProperty("middle_name")
    private String middleName;

    @NotBlank
    private String group;

    @Size(min = MIN_GRADE, max = MAX_GRADE)
    @JsonProperty("average_grade")
    private Double averageGrade;

}
