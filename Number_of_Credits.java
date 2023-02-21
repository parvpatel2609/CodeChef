import java.util.Scanner;

class Number_of_Credits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int RTP = sc.nextInt();
            int Audit = sc.nextInt();
            int non_RTP = sc.nextInt();
            int result1 = 4*RTP;
//            System.out.println(result1);
            int result2 = 2*Audit;
//            System.out.println(result2);
            int sum = result1 + result2;
            System.out.println(sum);
        }
    }
}