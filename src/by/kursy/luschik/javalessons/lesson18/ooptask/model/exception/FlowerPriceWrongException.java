package by.kursy.luschik.javalessons.lesson18.ooptask.model.exception;

public class FlowerPriceWrongException extends LogicalFlowerException {
    public FlowerPriceWrongException() {
        super();
    }

    public FlowerPriceWrongException(String message) {
        super(message);
    }
}
