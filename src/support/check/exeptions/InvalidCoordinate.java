package support.check.exeptions;

public class InvalidCoordinate extends IllegalArgumentException {
    public InvalidCoordinate(String message) {
        super(message);
    }
}
