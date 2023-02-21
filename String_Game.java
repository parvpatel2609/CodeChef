import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0; i<num; i++){
            int length = sc.nextInt();
            String str = sc.next();
            int f = 0;
            HashMap<Character,Integer> map = new HashMap<>();
            if(length%2!=0){
                f = -1;
            }
            else {
                for (int j=0; j<str.length(); j++) {
                    if(map.containsKey(str.charAt(j))){
                        map.put(str.charAt(j),map.get(str.charAt(j))+1);
                    }
                    else {
                        map.put(str.charAt(j),1);
                    }
                }

                for (Map.Entry m:
                        map.entrySet()) {

                    if((int)m.getValue()%2!= 0){
                        f = -1;
                        break;
                    }
                }

            }
            if(f == 0){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
