import java.util.Scanner;

class Ticket_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int ticket_rupees=sc.nextInt();
            int passengers = sc.nextInt();
            int collected_tickets = sc.nextInt();
            int result1 = passengers-collected_tickets;
            int final_result = result1*ticket_rupees;
            System.out.println(final_result);
        }
    }
}
