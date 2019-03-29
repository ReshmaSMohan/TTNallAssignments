package springsession.restwithspring.exceptions;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {

        message = "not a valid id of student";
    }

}
