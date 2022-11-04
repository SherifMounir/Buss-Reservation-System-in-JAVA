
package busreservationsystem;

import java.util.Date;


public class BookedTicket extends BusTicket{
    
    private Date Booking_Date;
    
    public BookedTicket(){}
    public void ViewBookedTicketDetails()
    {
      System.out.println(super.getTicketID());
      System.out.println(super.getTicketPrice());

    }
    
}
