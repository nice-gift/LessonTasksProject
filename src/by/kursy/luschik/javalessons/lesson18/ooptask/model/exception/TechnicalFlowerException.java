package by.kursy.luschik.javalessons.lesson18.ooptask.model.exception;

public class TechnicalFlowerException extends FlowerProjectException{
    public TechnicalFlowerException() {
        super();
    }
    public TechnicalFlowerException(String message) {
        super(message);
    }
    public TechnicalFlowerException(String message, Throwable cause) {
        super(message, cause);
    }
    public TechnicalFlowerException(Throwable cause) {
        super(cause);
    }
}
