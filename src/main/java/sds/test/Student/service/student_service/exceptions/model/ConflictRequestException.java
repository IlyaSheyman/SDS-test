package sds.test.Student.service.student_service.exceptions.model;

public class ConflictRequestException extends RuntimeException {
    public ConflictRequestException(String message) {
        super(message);
    }
}
