import java.util.Scanner;

public class Minimum_Number_of_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt()/2;
            System.out.println(val);
        }
    }
}
