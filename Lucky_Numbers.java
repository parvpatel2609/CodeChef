import java.util.Scanner;

public class Lucky_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            String str = sc.next();
            if(str.contains("7")){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
