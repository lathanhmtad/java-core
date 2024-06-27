package com.vti.frontend;

import com.vti.repository.UserRepository;
import com.vti.util.JDBCUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        // JDBCUtil.checkConnection();
        UserRepository repository = new UserRepository();
        UserFunction function = new UserFunction(repository);
        function.showMenu();
    }
}
