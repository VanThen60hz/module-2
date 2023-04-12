package ss15_exception_and_debug.exercise;

public class IllegalTriangleException extends Throwable {
    public IllegalTriangleException(String mesage) {
        super(mesage);
    }
}
