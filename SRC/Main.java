public class Main {
    public static void main (String[] args){
        TicketManager manager = new TicketManager();
        manager.addTicket("ماتطبع من الصبح ","الطابعة خربانة ");
        manager.addTicket("في قسم الحاسيات", "النت بطيء");
        System.out.println(":عدد التذاكر" + manager. getAllTickets(). size());
        Ticket t = manager.findById(2);
        if (t !=null) {
            System.out.println( "لقيت تذكرة رقم" + t.getId());
        }
        System.out.println(manager.findById(99));
    }
}
