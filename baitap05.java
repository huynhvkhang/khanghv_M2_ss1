import java.util.Scanner;
public class baitap05 {
    public static void main(String[] args) {
        System.out.println("Nhập đường kính hình tròn: ");
        int a = new Scanner(System.in).nextInt();
        int b = 2;
        System.out.println("Chu vi hình tròn: " + b*Math.PI*(a/2) + " cm");
        System.out.println("Nhập đường kính hình tròn: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Diện tích hình tròn: " + Math.PI*(c/2)*(c/2) + " m2");
    }
}