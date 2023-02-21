import java.util.Scanner;

public class Fever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            if(n1>98){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
