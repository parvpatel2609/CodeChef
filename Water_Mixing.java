import java.util.Scanner;

public class Water_Mixing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(a<=b){
                a = a+x;
                if(a>=b){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else{
                a = a-y;
                if(a>b){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}
