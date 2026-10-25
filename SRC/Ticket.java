
public class Ticket {
    private int id;
    private String title ;
    private String description ;
    private String status ;
    public Ticket(int id,String title,String description){
        this.id = id ;
        this.title = title ;
        this.description = description ;
        this.status = "OPEN" ;
    }
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status;}
}
