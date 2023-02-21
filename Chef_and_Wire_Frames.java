import java.util.Scanner;

public class Chef_and_Wire_Frames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int re1 = 2*(n1+n2);
            int re2 = n3*re1;
            System.out.println(re2);
        }
    }
}
