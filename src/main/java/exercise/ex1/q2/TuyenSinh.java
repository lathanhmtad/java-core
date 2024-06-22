package exercise.ex1.q2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    Scanner scanner = new Scanner(System.in);
    private List<ThiSinh> thiSinhList = new LinkedList<>();

    @Override
    public void themThiSinh() {
        System.out.println("Nhập vào số báo danh: ");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.println("Nhập vào mức ưu tiên: ");
        int mucUuTien = Integer.parseInt(scanner.nextLine());
        String khoiThi = scanner.nextLine();
        ThiSinh thiSinh = null;
        switch (khoiThi) {
            case "A" -> thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
            case "B" -> thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
            case "C" -> thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
        }
        thiSinhList.add(thiSinh);
    }

    @Override
    public void hienThiDSTS() {
        System.out.println("+------+---------------------+---------------------+------+---------------------+");
        System.out.println("| SBD  |        HỌ TÊN       |     ĐỊA CHỈ         |  MUT |       MÔN THI       |");
        System.out.println("+------|---------------------|---------------------|------|---------------------|");
        for (ThiSinh thiSinh : thiSinhList) {
            System.out.printf("| %-4s | %-18s | %-18s | %-4s | %-18S |%n",
                    thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi());
        }
    }

    @Override
    public void timKiemTheoSBD() {
        System.out.println("Nhập vào số báo danh");
        int soBaoDanh = Integer.parseInt(scanner.nextLine());
        System.out.println("+------+---------------------+---------------------+------+---------------------+");
        System.out.println("| SBD  |        HỌ TÊN       |     ĐỊA CHỈ         |  MUT |       MÔN THI       |");
        System.out.println("+------|---------------------|---------------------|------|---------------------|");
        for (ThiSinh thiSinh : thiSinhList) {
            if (thiSinh.soBaoDanh != soBaoDanh) continue;
            System.out.printf("| %-4s | %-18s | %-18s | %-4s | %-18S |%n",
                    thiSinh.soBaoDanh, thiSinh.hoTen, thiSinh.diaChi, thiSinh.mucUuTien, thiSinh.monThi());
        }
    }
}
