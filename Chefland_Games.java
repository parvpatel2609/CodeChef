import java.util.Scanner;

public class Chefland_Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int n4 = sc.nextInt();
            if(n1==1 || n2==1 || n3==1 || n4==1){
                System.out.println("OUT");
            }
            else{
                System.out.println("IN");
            }
        }
    }
}
