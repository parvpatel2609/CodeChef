import java.util.Scanner;

public class Donation_Rewards {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            if(val<=3)
                System.out.println("BRONZE");
            if (val<=6 && val>3)
                System.out.println("SILVER");
            if(val>6)
                System.out.println("GOLD");
        }
    }
}
