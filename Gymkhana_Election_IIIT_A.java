import java.util.Scanner;

public class Gymkhana_Election_IIIT_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((b/2) + 1);
        }
    }
}
