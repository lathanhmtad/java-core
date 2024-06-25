package innerclass;

public class User {
    private int id;
    private String username;
    private String password;
    private Gender gender;
    private Role role;

    private enum Gender {
        MALE, FEMALE
    }

    enum Role {
        ADMIN, MANAGER, EMPLOYEE
    }
}
