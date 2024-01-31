import java.util.Scanner;

public class Bai2 {
    //Kiem tra số chẵn lẻ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap so can kiem tra: ");
        int i = sc.nextInt();
        if(i%2 == 0) {
            System.out.println("Đây là số chăn");
        } else
            System.out.println("Đây là số lẻ");
    }
}
