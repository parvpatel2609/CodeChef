import java.util.*;

public class CodeChef_Streak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int len = sc.nextInt();
            int[] om = new int[len];
            int[] addy = new int[len];

            for(int j=0; j<om.length; j++){
                om[j] = sc.nextInt();
            }

            for(int j=0; j<addy.length; j++){
                addy[j] = sc.nextInt();
            }

            int cou_om = 0;
            int cou_add = 0;
            ArrayList<Integer> al_om = new ArrayList<>();
            ArrayList<Integer> al_add = new ArrayList<>();


            for(int j=0; j<om.length; j++){
                if(om[j]>0)
                    cou_om++;
                else {
                    al_om.add(cou_om);
                    cou_om=0;
                }
            }
            al_om.add(cou_om);


            for(int j=0; j<addy.length; j++){
                if(addy[j]>0)
                    cou_add++;
                else {
                    al_add.add(cou_add);
                    cou_add=0;
                }
            }
            al_add.add(cou_add);

            int max_om = Collections.max(al_om);
            int max_add = Collections.max(al_add);

            if(max_om>max_add)
                System.out.println("Om");
            else if (max_om<max_add)
                System.out.println("Addy");
            else
                System.out.println("Draw");
        }
    }
}
