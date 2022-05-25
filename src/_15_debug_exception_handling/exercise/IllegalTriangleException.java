package _15_debug_exception_handling.exercise;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}