import java.util.Scanner;

public class Building_Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            float r1 = (float) a/x;
            float r2 = (float) b/y;

            if(r2>r1){
                System.out.println("Chef");
            }
            else if(r1>r2){
                System.out.println("Chefina");
            }
            else{
                System.out.println("Both");
            }
        }
    }
}
