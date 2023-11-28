public class B1 {
    public static void main(String[] args) {
        System.out.println("Cac so chan trong khoang 1-10:");
        for (int i = 1; i <= 10; i++){
            if (i % 2 ==0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.printf("\n");
        int sum = 0;
        for (int i = 1; i <=100; i++){
            if(i % 3==0 && i % 5==0){
                sum+=i;
            }
        }

        System.out.printf("sum = %d", sum);
    }

}
