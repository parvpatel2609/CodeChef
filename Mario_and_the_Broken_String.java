import java.util.Scanner;

public class Mario_and_the_Broken_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int length = sc.nextInt();
            int middle = length/2;
            String str = sc.next();
            String str1 = str.substring(0,middle);
//            System.out.println(str);
//            System.out.println(str1);
            String str2 = str.substring(middle,length);
//            System.out.println(str2);
            if(str1.equals(str2)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
