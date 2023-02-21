import java.util.Scanner;

public class Nearest_Exit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num ; i++){
            int n1 = sc.nextInt();
            if(n1>=1 && n1<=50){
                System.out.println("LEFT");
            }
            else{
                System.out.println("RIGHT");
            }
        }
    }
}
