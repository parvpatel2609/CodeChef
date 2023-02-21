import java.util.Scanner;

public class Distinct_Colors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num ; i++){
            int length = sc.nextInt();
            int[] array = new int[length];
            for(int j =0; j<array.length; j++){
                array[j]=sc.nextInt();
            }
            int max = array[0];
            for(int k=1; k<array.length; k++){
                if(array[k]>max){
                    max=array[k];
                }
            }
            System.out.println(max);
        }
    }
}
