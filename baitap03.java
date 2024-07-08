import java.util.Scanner;
public class baitap03 {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài của cạnh: ");
        int a = new Scanner(System.in).nextInt();
        int b = 4;
        System.out.println("Chu vi hình vuông: " + a*b + " cm");
        System.out.println("Nhập độ dài của cạnh: ");
        int c = new Scanner(System.in).nextInt();
        int d = c;
        System.out.println("Diện tích hình vuông: " + c*d + " m2");
    }
}
