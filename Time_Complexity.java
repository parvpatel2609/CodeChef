import java.util.Scanner;

public class Time_Complexity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1>n2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
