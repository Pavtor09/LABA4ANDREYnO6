package support.check.exeptions;

public class InvalidIDExeption extends IllegalArgumentException {
    public InvalidIDExeption(String message) {
        super(message);
    }
}
