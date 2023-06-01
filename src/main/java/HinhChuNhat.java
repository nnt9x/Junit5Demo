public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai <= 0 || chieuRong <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        if(chieuDai <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        if(chieuRong <= 0){
            throw new RuntimeException("Canh phai la so duong");
        }
        this.chieuRong = chieuRong;
    }

    public double chuVi() {
        double cv =  (chieuDai + chieuRong) * 2;
        return Math.round(cv * 100) / 100.0;
    }

    public double dienTich() {
        double dt =  chieuDai * chieuRong;
        return Math.round(dt * 100) / 100.0;
    }
}
