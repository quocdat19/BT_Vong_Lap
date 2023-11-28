import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;

        while (a != 0) {
            System.out.println("Nhap vao mot so nguyen: ");
            a = Integer.parseInt(scanner.nextLine());

            if (a % 3 == 0) {
                System.out.printf("%d Chia hết cho 3 \n", a);
            }
        }

    }
}
