import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("********Breakfast Menu**********");
            System.out.println("1. Pho tom hum");
            System.out.println("2. Pho bo kobe");
            System.out.println("3. Pho ga Viet Nam");
            System.out.println("4. Xoi trung thit");
            System.out.println("5. Banh mi trung");
            System.out.println("6. My tom khong nguoi lai");
            System.out.println("7. Thoat");
            System.out.println("Su lua chon cua ban:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Ban vua chon pho tom hum, vui long doi trong giay lat");
                case 2:
                    System.out.println("Ban vua chon pho bo kobe, vui long doi trong giay lat");
                    break;
                case 3:
                    System.out.println("Ban vua chon pho ga Viet Nam, vui long doi trong giay lat");
                    break;
                case 4:
                    System.out.println("Ban vua chon xoi trung thit, vui long doi trong giay lat");
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
