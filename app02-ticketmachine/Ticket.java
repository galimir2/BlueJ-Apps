import java.util.Date;
/**
 * This will be creating the ticket with destination, price and also date.
 *
 * @author Galimir Bozmarov (ID 22014494)
 * @version 1.0
 */
public class Ticket
{
    //Attributes
    
    private String destination;
    
    private int price;
    
    private Date dateDay;
    /**
     * Constructor for objects of class Ticket will be including the current
     * date of the system and also the time that the system is showing.
     * This will also be chosing the destination and price.
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        
        dateDay = new Date();
    }
    /**
     * This is going to be printing the date destinatio and price of
     * the price of the ticket.
     */
    public void print()
    {
        System.out.println("Ticket" + destination + " Price : " + price +
         " Date " + dateDay);
    }
}
