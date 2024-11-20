package sds.test.Student.service.student_service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class StudentUpdateRequest {
    private String group;
    @PositiveOrZero
    @JsonProperty("average_grade")
    private Double averageGrade;

}