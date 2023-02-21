import java.util.Scanner;

public class Broken_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n1<n2){
                System.out.println("REPAIR");
            }
            else if (n1>n2) {
                System.out.println("NEW PHONE");
            }
            else{
                System.out.println("ANY");
            }
        }
    }
}