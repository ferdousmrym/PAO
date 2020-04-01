public class NameAlreadyExistsException extends Exception {
    public NameAlreadyExistsException() {
        super("Already existing name");
    }
}