import java.util.Scanner;

public class Perfect_Trio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            int max = Math.max(n1, Math.max(n2, n3));
//            System.out.println(max);

//            if(n1 == n2 && n2 == n3){
//                System.out.println("NO");
//                continue;
//            }

            if(max == n3){
                int ans = n1 + n2;
                if(max == ans){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                    continue;
                }
            }

            if(max == n2){
                int ans = n1 + n3;
                if(max == ans){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                    continue;
                }
            }

            if(max == n1){
                int ans = n3 + n2;
                if(max == ans){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
