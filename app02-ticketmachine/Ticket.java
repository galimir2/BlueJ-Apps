import java.util.Date;
/**
 * This ticket class will be storing information about 
 * the ticket destination, price and also purchase date.
 *
 * @author Galimir Bozmarov
 * @version 1.0 9/10/2020
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    
    // The currency will be in pence
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
    
    public int getPrice()
    {
        return price;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * This is going to be printing the date destinatio and price of
     * the price of the ticket.
     */
    public void print()
    {
        System.out.println();
        System.out.println("Ticket:" + destination + " Price:" + price + "pence" +
         " Date:" + dateDay);
        System.out.println(); 
    }
}
