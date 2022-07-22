package by.kursy.luschik.javalessons.lesson27;

public class StudentAgeWrongException extends Exception{
    public StudentAgeWrongException() {
        super();
    }
    public StudentAgeWrongException(String message) {
        super(message);
    }
    public StudentAgeWrongException(String message, Throwable cause) {
        super(message, cause);
    }
    public StudentAgeWrongException(Throwable cause) {
        super(cause);
    }
}
