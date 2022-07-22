package by.kursy.luschik.javalessons.lesson18.ooptask.model.exception;

public class FlowerProjectException extends Exception{
    public FlowerProjectException() {
    super();
}
    public FlowerProjectException(String message) {
        super(message);
    }
    public FlowerProjectException(String message, Throwable cause) {
        super(message, cause);
    }
    public FlowerProjectException(Throwable cause) {
        super(cause);
    }
}

