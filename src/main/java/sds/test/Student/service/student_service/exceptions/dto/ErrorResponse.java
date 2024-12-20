package sds.test.Student.service.student_service.exceptions.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@RequiredArgsConstructor
public class ErrorResponse {
    private final String header;
    private final String message;
    private final String reason;
    private final String status;
    private final String timestamp;
}
