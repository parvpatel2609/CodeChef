import java.util.Scanner;

public class Append_for_OR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[x];
            for(int p=0; p< arr.length; p++){
                arr[p] = sc.nextInt();
            }

            int ans = 0;
            for(int p=0; p<arr.length; p++){
                ans |= arr[p];
                System.out.println(ans);
            }

            int res = y-ans;
            System.out.println("RES : " + res);
            if((y & res) == res){
                System.out.println(res);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
