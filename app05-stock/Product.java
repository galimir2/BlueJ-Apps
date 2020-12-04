import java.util.*;
import java.lang.String;
/**
 * Model some details of a product sold by a company.
 * 
 * @author Galimir Bozmarov
 * @version 1.0 04/11/2020
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This will be used to change the name of a product
     * based on the id.
     */
    public void replaceName(String replacementName)
    {
        this.name = replacementName;
    }
    
    /**
     * This will check if the stock quantity is low.
     * If its low it will print out a message.
     */
    public void getLow()
    {
        if(checkLow() == true)
        {
            System.out.println("This product has low amounts of stock: " + id + " " +
            getQuantity() + " in stock.");
        }
    }
    
    public boolean checkLow()
    {
        int low = 3;
        
        if(getQuantity() <= low)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return id + ": " +  name + " stock level: " + quantity;
    }

    /**
     * Restock with the given amount of this product.
     * The current quantity is incremented by the given amount.
     * @param amount The number of new items added to the stock.
     *               This must be greater than zero.
     */
    public void increaseQuantity(int amount)
    {
        if(amount > 0) 
        {
            quantity += amount;
        }
        else 
        {
            System.out.println("Attempt to restock " + name +
                               " with a non-positive amount: " + amount);
        }
    }

    /**
     * Sell one of these products.
     * An error is reported if there appears to be no stock.
     */
    public void sellOne(int amount)
    {
        if( amount < 0) 
        {
            System.out.println("An attempt made to sell a negative amount: " 
                + amount + " of this item " + name);
        }
        else if(quantity >= amount && quantity > 0) 
        {
            quantity -= amount;
            System.out.println("You have sold" + amount + "of" + name);

        }
        else
        {
            System.out.println(
                "You have tried to sell an out of stock item: " + name);
        }
    }
}
