import java.util.Scanner;

public class Elections_in_Chefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            int val = sc.nextInt();
            for(int j=0; j< arr.length; j++){
                arr[j] = sc.nextInt();
            }
            int count = 0;
            for(int j=0; j< arr.length; j++){
                if(arr[j]>=val){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
