import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int value = sc.nextInt();
            if(value%2 == 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
