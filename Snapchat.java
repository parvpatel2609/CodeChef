import java.util.Arrays;
import java.util.Scanner;

public class Snapchat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int len = sc.nextInt();
            int[] n1 = new int[len];
            int[] n2 = new int[len];

            for(int p=0; p<n1.length; p++){
                n1[p] = sc.nextInt();
            }
            for(int p=0; p<n2.length; p++){
                n2[p] = sc.nextInt();
            }

            int count =0;
            int[] ans = new int[len];
            for(int p=0; p<n1.length; p++){
                if(n1[p] != 0 && n2[p]!=0){
                    count++;
                }
                else{
                    count = 0;
                }
                ans[p] = count;
            }

            Arrays.sort(ans);

            System.out.println(ans[ans.length-1]);
        }
    }
}
