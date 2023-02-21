import java.util.Scanner;

public class Speed_Limit_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num ; i++){
            float Alice = sc.nextInt();
            float Alice_hours = sc.nextInt();
            float Bob = sc.nextInt();
            float Bob_hours = sc.nextInt();

            float time_Alice = Alice/Alice_hours;
            float time_Bob = Bob/Bob_hours;

            if(time_Bob==time_Alice){
                System.out.println("Equal");
            } else if (time_Alice>time_Bob) {
                System.out.println("Alice");
            }
            else {
                System.out.println("Bob");
            }
        }
    }
}
