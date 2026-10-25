import java.util.ArrayList;
public class TicketManager {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private int nextId = 1;
    public Ticket addTicket(String title, String description){
        Ticket t = new Ticket(nextId++, title,description);
        tickets.add(t);
        return t;
    }
    public ArrayList<Ticket> getAllTickets(){
        return tickets ;
    }
    public Ticket findById(int Id ){
        for (Ticket t : tickets){
            if (t.getId() == Id)return t;
        }
        return null ;
    } public boolean closeTicket(int id){
        Ticket t = findById(id);
        if (t == null) return false;
        t.setStatus("CLOSED");
        return true ;
    }
}
