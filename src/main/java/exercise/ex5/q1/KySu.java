package exercise.ex5.q1;

public class KySu extends CanBo {
    protected String nganhDaoTao;

    public KySu(String hoTen, int tuoi, GioiTinh gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "diaChi='" + diaChi + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                ", nganhDaoTao=" + nganhDaoTao +
                '}';
    }
}
