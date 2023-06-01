import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HinhChuNhatTest {
    @Test
    @DisplayName("Hinh chu nhat co chieu dai 1.3, chieu rong 2.234 co chu vi 7.07")
    public void testChuVi1() {
        HinhChuNhat hcn = new HinhChuNhat(1.3, 2.234);
        // 1 gía trị chính xác
        double expected = 7.07;
        // 2 giá trị tính toán được
        double actual = hcn.chuVi();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Hinh chu nhat co chieu dai 1.3, chieu rong 2.234 co dien tich 2.90")
    public void testDienTich1() {
        HinhChuNhat hcn = new HinhChuNhat(1.3, 2.234);
        // 1 gía trị chính xác
        double expected = 2.90;
        // 2 giá trị tính toán được
        double actual = hcn.dienTich();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Nem ra exception voi canh chieu dai 0, chieu rong 3")
    public void testException1() {
        Exception actual = Assertions.assertThrows(RuntimeException.class,
                () -> {
                    // Để đoạn mã có exception
                    HinhChuNhat hcn = new HinhChuNhat(0, 3);
                }
        );

        Assertions.assertEquals("Canh phai la so duong", actual.getMessage());

    }

    @Test
    @DisplayName("Nem ra exception voi canh chieu dai 3, chieu rong -2")
    public void testException2(){
        Exception actual = Assertions.assertThrows(RuntimeException.class,
                () -> {
                    // Để đoạn mã có exception
                    HinhChuNhat hcn = new HinhChuNhat(1, 1);
                    hcn.setChieuDai(3);
                    hcn.setChieuRong(-2);
                }
        );
        Assertions.assertEquals("Canh phai la so duong", actual.getMessage());

    }


}