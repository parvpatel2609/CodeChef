import java.util.Scanner;

public class Non_Negative_Product {

    public static int Non_negative_function(int[] array){
        int multi=1;
        int count=0;
        for(int i=0; i< array.length; i++){
            if(array[i] == 0){
                return 0;
            }
            if(array[i] < 0){
                count++;
            }
        }
        if(count%2==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean flag = false,flag1 = false;
        for(int i=0; i<num; i++){
            int arr_length = sc.nextInt();
            int[] arr = new int[arr_length];
            for(int j=0; j<arr_length ; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(Non_negative_function(arr));;
        }
    }
}
