import java.util.Scanner;

public class Water_Consumption {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n = sc.nextInt();
            if(n >= 2000){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
