import java.util.Scanner;

public class Permutation_Clear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int len_n1 = 0;
        int len_n2 = 0;
        int[] n1 = new int[0];
        int[] n2 = new int[0];
        boolean flag = false;
        for(int i=0; i<num; i++){
            len_n1 = sc.nextInt();
            n1 = new int[len_n1];
            for(int j=0; j<len_n1; j++){
                n1[j] = sc.nextInt();
            }

            len_n2 = sc.nextInt();
            n2 = new int[len_n2];
            for(int p=0; p<len_n2; p++){
                n2[p] = sc.nextInt();
            }
        }

//        System.out.println("N1 array : ");
//        for(int q=0; q<len_n1; q++){
//            System.out.print(n1[q] + " ");
//        }
//        System.out.println();
//
//        System.out.println("N2 array : ");
//        for(int r=0; r<len_n2; r++){
//            System.out.print(n2[r] + " ");
//        }
//        System.out.println();


        for(int s=0; s<len_n1; s++){
            for(int e=0; e<len_n2; e++){
                if (n1[s]==n2[e]){
//                    System.out.println(n1[s] + " , " + n2[e]);
                    flag = true;
                    break;
                }
            }
            if(flag){
                flag = false;
                continue;
            }
            else{
//                flag = true;
                System.out.print(n1[s] + " ");
            }
//            System.out.println();
        }
    }
}
