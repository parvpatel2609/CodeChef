import java.util.Scanner;

public class Indivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            for(int p=2; p<=100; p++){
                if(n1%p!=0 && n2%p!=0 && n3%p!=0){
                    System.out.println(p);
                    break;
                }
            }
        }
    }
}
