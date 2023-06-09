package Method;

public class SwitchCase {
    public static void main(String[] args) {
        int a = 0;
        int b = 7;
        switch (a + b) {
            case 10:
                System.out.println("Giá trị của a + b là: " + (a + b));
                break;
            case 15:
                System.out.println("Giá trị của a + b là: " + (a+b));
                break;
            default:
                System.out.println( "Giá trị không hợp lệ.");
        }
    }}
