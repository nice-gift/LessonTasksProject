package by.kursy.luschik.javalessons.stage30.model.exception;

public class ProjectException extends Exception{
    public ProjectException() {
        super();
    }
    public ProjectException(String message) {
        super(message);
    }
    public ProjectException(String message, Throwable cause) {
        super(message, cause);
    }
    public ProjectException(Throwable cause) {
        super(cause);
    }

}
