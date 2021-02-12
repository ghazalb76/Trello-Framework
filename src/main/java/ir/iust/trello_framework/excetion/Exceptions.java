package ir.iust.trello_framework.excetion;

public class Exceptions extends RuntimeException {

    protected ExceptionCode code;

    public Exceptions(String message, ExceptionCode code) {
        super(message);
        this.code = code;
    }

    public Exceptions(String message, Throwable throwable, ExceptionCode code) {
        super(message, throwable);
        this.code = code;
    }

}
