package exercise.ex5.q1;

public class CongNhan extends CanBo {
    protected int bac;

    public CongNhan(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, int bac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "diaChi='" + diaChi + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", bac=" + bac +
                '}';
    }
}
