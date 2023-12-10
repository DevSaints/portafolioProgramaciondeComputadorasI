public class customExceptions extends Exception{
    public customExceptions(String errorMessage) {
        super(errorMessage);
    }
}
class EmptyStringException extends Exception{
    public EmptyStringException(String errorMessage) {
        super(errorMessage);
    }
}
class OutOfRangeException extends Exception {
    public OutOfRangeException(String errorMessage) {
        super(errorMessage);
    }
}

class DecimalNumberException extends Exception {
    public DecimalNumberException(String errorMessage) {
        super(errorMessage);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String errorMessage) {
        super(errorMessage);
    }
}