import java.util.Scanner;

public class Problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num > 0) {
            int alice = scanner.nextInt();
            int bob = scanner.nextInt();
            if (alice == bob) {
                System.out.println("YES");
            }
            else {
                if (Math.abs(alice - bob) % 2 == 0) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            num--;
        }
        scanner.close();
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        for(int i=0; i<num; i++){
//            int alice = sc.nextInt();
//            int bob = sc.nextInt();
//
//            if(alice==bob){
//                System.out.println("YES");
//                continue;
//            }
//
//            while(alice!=bob){
//                if(alice>bob){
//                    alice-=1;
//                    bob+=1;
//                }
//
//                if(alice<bob){
//                    alice+=3;
//                    bob-=1;
//                }
//
//                if(alice==bob) {
//                    System.out.println("YES");
//                    break;
//                }
//                else {
//                    System.out.println("NO");
//                    break;
//                }
//            }
//        }
    }
}
