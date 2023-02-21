import java.util.Scanner;

public class Alice_and_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Alice_mark = sc.nextInt();
        int Bob_mark = sc.nextInt();
        if(Alice_mark>=2*Bob_mark){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
