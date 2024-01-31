
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhạp năm của bạn muốn");
        int year = sc.nextInt();
        sc.close();
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println("Đây là năm nhuận");
            } else
                System.out.println("Đây không phải năm nhuận");
        } else
            System.out.println("Đây không phải năm nhuận");
    }
}
