import java.sql.SQLOutput;
import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap gia tri cua n: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 9; i++)
        {
            value = i * n;
            System.out.printf(" %d = %d * %d\n", value, i, n);
        }
    }


}
