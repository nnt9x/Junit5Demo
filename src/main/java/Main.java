public class Main {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(3,2);
        hcn.setChieuRong(0);
        System.out.println("Chu vi:"+ hcn.chuVi());
        System.out.println("Diện tích: "+hcn.dienTich());
    }
}
