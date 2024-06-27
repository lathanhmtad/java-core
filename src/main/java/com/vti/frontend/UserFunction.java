package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository repository;

    public void showMenu() throws SQLException {
        while (true) {
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Thêm người dùng");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng: ");

            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                create();
            } else if (menu == 3) {
                System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                return;
            } else {
                System.err.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    private void findAll() throws SQLException {
        List<User> users = repository.findAll();
        System.out.println("+------+-------------------------+-------------------------");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIl");
        System.out.println("+------+-------------------------+-------------------------");

        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------");
        } else {
            for (User u : users) {
                System.out.printf("| %-4s | %-23s | %-23s |%n",
                        u.getId(), u.getFullName(), u.getEmail());
            }
            System.out.println("+------+-------------------------+-------------------------");
        }
    }

    private void create() throws SQLException {
        System.out.println("Mời bạn nhập vào thông tin user.");
        System.out.println("Nhập vào họ và tên: ");
        String fullName = ScannerUtil.inputFullName();
        System.out.println("Nhập vào email: ");
        String email = ScannerUtil.inputEmail();
        int result = repository.create(fullName, email);
        System.out.printf("Đã tạo thành công %d user.%n", result);
    }
}
