import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TicketManager manager = new TicketManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n1.Add ticket");
            System.out.println("2. List ticket");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Title: ");
                String title = scanner.nextLine();
                System.out.println("Description: ");
                String descripation = scanner.nextLine();
                Ticket t = manager.addTicket(title, descripation);
                System.out.println("Added ticket #" + t.getId());

            } else if (choice == 2) {
                for (Ticket ticket : manager.getAllTickets()) {
                    System.out.println("#" + ticket.getId() + "-" + ticket.getTitle() + "-" + ticket.getStatus());
                }
                } else if (choice == 0){
                    running = false ;
                }
            }
        }
    }
