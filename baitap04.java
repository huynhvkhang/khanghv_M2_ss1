import java.util.Scanner;
public class baitap04 {
    public static void main(String[] args) {
        System.out.println("Nhập điểm Toán: ");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Nhập điểm Văn: ");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Nhập điểm Anh: ");
        int c = new Scanner(System.in).nextInt();
        System.out.println("Trung bình 3 môn bằng: " + (a+b+c)/3 + " Điểm");
    }
}

