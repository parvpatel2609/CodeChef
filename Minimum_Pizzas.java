import java.util.Scanner;

public class Minimum_Pizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n = sc.nextInt();       //total number of friends
            int x = sc.nextInt();       //slides for each friends
            int r1 = n*x;
            if(r1%4==0){
                System.out.println(r1/4);
            }
            else {
                System.out.println((r1/4) + 1);
            }
        }
    }
}
