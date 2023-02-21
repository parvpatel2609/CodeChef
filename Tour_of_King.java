import java.util.Scanner;

public class Tour_of_King {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt()*5;
            int n2 = sc.nextInt()*7;
            int total = n1+n2;
            System.out.println(total);
        }
    }
}
