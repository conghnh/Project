import java.util.Scanner;

public class Bai1 {
    //Cộng 2 số cho nhau
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thuws nhat");
        int sum1 = scanner.nextInt();
        System.out.println("Nhap so thu 2");
        int sum2 = scanner.nextInt();
        int sum = sum1 + sum2;
        System.out.println("Tổng 2 số là: " + sum);
    }
}
