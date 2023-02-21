import java.util.Scanner;

public class Tax_in_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n = sc.nextInt();
            if(n>100){
                System.out.println(n-10);
            }
            else {
                System.out.println(n);
            }
        }
    }
}
