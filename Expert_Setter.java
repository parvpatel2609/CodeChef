import java.util.Scanner;

public class Expert_Setter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            int result = (n2*100)/n1;
            if(result >= 50){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
