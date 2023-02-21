import java.util.Scanner;

public class Apples_and_oranges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int apple = sc.nextInt();       //20
            int orange = sc.nextInt();      //12
            while(apple!=orange){           //8!=4
                if(apple>orange){           //8>4 true
                    apple= apple-orange;    //apple = 4
                }
                else{
                    orange= orange-apple;   //orange = 4
                }
            }
            System.out.println(apple);
        }

    }
}
