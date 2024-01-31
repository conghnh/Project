import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        boolean isNguyenAm = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập một chữ cái");
        char ch = sc.next().charAt(0);
        sc.close();
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isNguyenAm = true;
        }
        if (isNguyenAm == true) {
            System.out.println(ch + "Là nguyên âm");
        } else if ((ch >= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z'))
        System.out.println(ch + "Là phụ ấm");
        else
        System.out.println("Không nằm trong bảng chữ cái");

    }
}
