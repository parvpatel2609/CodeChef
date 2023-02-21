import java.util.Scanner;

public class Hackerman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1+n2 == 2 || n1+n2 == 3 || n1+n2 == 5 || n1+n2 == 7 || n1+n2 == 11){
                System.out.println("Alice");
            }
            else {
                System.out.println("Bob");
            }
        }
    }
}
