import java.util.Scanner;

public class Bob_at_the_Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int balance = sc.nextInt();
//            System.out.println(balance);
            int add = sc.nextInt();
//            System.out.println(add);
            int pay = sc.nextInt();
//            System.out.println(pay);
            int month = sc.nextInt();
//            System.out.println(month);
            int re1 = add - pay;
//            System.out.println(re1);
            int re2 = month*re1;
//            System.out.println(re2);
            int final_result = balance+re2;
            System.out.println(final_result);
        }
    }
}
