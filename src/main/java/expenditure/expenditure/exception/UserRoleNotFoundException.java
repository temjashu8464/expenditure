package expenditure.expenditure.exception;

public class UserRoleNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UserRoleNotFoundException(String message) {
        super(message);
    }
}
