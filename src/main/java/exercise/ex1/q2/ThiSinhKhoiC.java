package exercise.ex1.q2;

public class ThiSinhKhoiC extends ThiSinh {


    public ThiSinhKhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String monThi() {
        return "Văn, Sử, Địa";
    }
}
