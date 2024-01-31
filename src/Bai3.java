import java.util.Scanner;

public class Bai3 {
    //Cong hai số phức
    //Khởi tạo phần thực và phần ảo
    double real;
    double img;
    // định nghĩa phần thực, phần ảo của số phức
    public Bai3(double real, double img) {
        this.real = real;
        this.img = img;
    }
    //Phép tính cộng hai số phức trả về 1 số phức mới
    public  Bai3 add(Bai3 other) {
        double newReal = this.real + other.real;
        double newImg = this.img + other.img;
        return  new Bai3(newReal, newImg);
    }
    // Nối chuỗi số phức
    public String toString() {
         return real + "+" + img + "i";
    }

    public static void main(String[] args) {
            //khởi tạo 2 số phức
            Bai3 num1 = new Bai3(2.5, 4.5);
            Bai3 num2 = new Bai3(5.6, 7.1);
            // Cộng 2 số phức
            Bai3 sum = num1.add(num2);
            // Hiển thị kết quả
            System.out.println("Tổng 2 số phức là: " + num1 + "+" + num2 + "=" + sum);

    }
}
