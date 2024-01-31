import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập số thứ nhất ");
        int a = sc.nextInt();
        System.out.println("Hãy nhập số thứ hai");
        int b = sc.nextInt();
        int tich = a*b;
        System.out.println("Tích của hai số là:" + tich);
    }
}
