package Method;

public class Method01 {
    int tuoi;
    String ten;
    static float inSotien (float soTien) {    // Tinh tien
        return soTien*100;
    }
     static void inThongtin (String ten, int tuoi, float soTien) {   // In thong tin nguoi dung
        float x = inSotien(soTien);
        System.out.println(" Tên: " +ten + " " + "Tuổi: " +tuoi + "Số Tiền: " + x);
    }

    public static void main(String[] args) {
        inThongtin("Linh", 29, 7.3F);
    }
}
