import java.util.Scanner;

public class The_Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cost = sc.nextInt();
        int fund = sc.nextInt();
        if(a+fund >= cost)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
