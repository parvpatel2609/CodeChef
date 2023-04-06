import java.util.Scanner;

public class Melt_Gold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;
            int j=1;
            while(y<x){
                y += j;
                j++;
                count++;
            }
            System.out.println(count);
        }
    }
}
