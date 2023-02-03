package ua.ithillel.lesson4;

public class ArrayDataException extends RuntimeException{

    public ArrayDataException(String message) {
        super(message);
    }

    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
