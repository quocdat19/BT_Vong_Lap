import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("********CACULATOR**********");
            System.out.println("1. Tổng 2 số");
            System.out.println("2. Hiệu 2 số");
            System.out.println("3. Tích 2 số");
            System.out.println("4. Thương 2 số");
            System.out.println("5. Số dư trong phép chia 2 số");
            System.out.println("6. Ước chung lớn nhất");
            System.out.println("7. Bội chung nhỏ nhất");
            System.out.println("8. Thoát");
            System.out.println("Nhập 2 số nguyên từ bản phím: ");
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("Su lua chon cua ban:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Tổng 2 số là: " + (a + b));
                    break;
                case 2:
                    System.out.println("Hiệu 2 số là: " + Math.abs(a - b));
                    break;
                case 3:
                    System.out.println("Tích 2 số là: " + (a * b) );
                    break;
                case 4:
                    System.out.println("Thương 2 số là: " + (float)(a % b));
                    break;
                case 5:
                    System.out.println("Ban vua chon banh mi trung, vui long doi trong giay lat");
                case 6:
                    System.out.println("Ban vua chon my tom khong nguoi lai, vui long doi trong giay lat");
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui long chon tu 1-7");
            }
        }while(true);
    }
}
