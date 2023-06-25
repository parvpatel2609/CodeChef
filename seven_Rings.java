import java.util.Scanner;

public class seven_Rings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int item = sc.nextInt();
            int cost = sc.nextInt();
            int price = item*cost;
            String str = Integer.toString(price);
            if(str.length()==5 && str.charAt(0)!='0')
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
