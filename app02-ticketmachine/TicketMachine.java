
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author Galimir Bozmarov
 * @version 1.0
 * 
 * Modified by Galimir Bozmarov
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket issuedTicket;
    
    private Ticket aylesburyTicket;
    
    private Ticket highwycombeTicket;
    
    private Ticket amershamTicket;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        
        aylesburyTicket = new Ticket("Aylesbury", 220);
        issuedTicket = null;
        
        highwycombeTicket = new Ticket("HighWycombe", 330);
        issuedTicket = null;
        
        amershamTicket = new Ticket("Amersham", 300);
        issuedTicket = null;
    }

 
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    public void printBalance()
    {
        System.out.println();
    }
    
    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    public void selectAylesbury()
    {
        issuedTicket = aylesburyTicket;
    }
    
    public void selectHighWycombe()
    {
        issuedTicket = highwycombeTicket;
    }
    
    public void selectAmersham()
    {
        issuedTicket = amershamTicket;
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()

    {
        int price = issuedTicket.getPrice();
        
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# Ticket");
            issuedTicket.print();
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public void printAllTickets()
    {
        System.out.println("The following three destinations are available");
        
        System.out.println();
        
        aylesburyTicket.print();
        
        System.out.println();
        
        highwycombeTicket.print();
        
        System.out.println();
        
        amershamTicket.print();
        
        System.out.println("Please select your ticket destination");
    }
    
    public void insert10pCoin()
    {
        balance = balance + 10;
    }
    
    public void insert20pCoin()
    {
        balance = balance + 20;
    }
    
    public void insert100pCoin()
    {
        balance = balance + 100;
    }
    
    public void insert200pCoin()
    {
        balance = balance + 200;
    }
}
