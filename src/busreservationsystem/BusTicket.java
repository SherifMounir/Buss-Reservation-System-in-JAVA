
package busreservationsystem;


public class BusTicket {
    
    private int Ticket_ID;
    private String Ticket_Price;
    
    public BusTicket(){}
    public BusTicket(int id , String price)
    {
      this.Ticket_ID = id;
      this.Ticket_Price = price;
    }
    
    public void setTicketID(int TicketID)
    {
      this.Ticket_ID = TicketID;
    }
    
    public void setTicketPrice(String TicketPrice)
    {
      this.Ticket_Price = TicketPrice;
    }    
    
    public int getTicketID()
    {
        return this.Ticket_ID;
    }
    
    public String getTicketPrice()
    {
        return this.Ticket_Price;
    }    
}
