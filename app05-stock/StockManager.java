import java.util.ArrayList;
import java.util.*;
import java.io.IOException;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Galimir Bozmarov
 * @version 1.0 04/11/2020
 */
public class StockManager
{
    public static final int FIRST_ID = 111;
    public static final int LAST_ID = 130;
    // A list of the products.
    private ArrayList<Product> stock;
    // List used for calcualtions
    List <Product> listProduct = new ArrayList<Product>();
    
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public boolean addProduct(Product item)
    {
        if(findProduct(item.getID()) != null)
        {
            System.out.println("This product has the same ID as another product!");
            return false;
        }
        else
        {
            stock.add(item);
            System.out.println("\n You have added " + item);
            return true;
        }
    }
    
    /**
     * This will be used to change the name of a product
     * based on the id.
     */
    public void changeName(int id, String replacementName)
    {
        Product product = findProduct(id);
        if (product !=null)
        {
            product.replaceName(replacementName);
        }
        else
        {
            System.out.println("Product has not been found!");
        }
    }
    
    /**
     * This will remove a product from the list.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if (product != null)
        {
            stock.remove(product);
        }
        else
        {
            System.out.println("Product has not been found!");
        }
    }
    
    /**
     * This will search for a product by specific word 
     * from the name of the product.
     */
    public void searchProduct(String word)
    {
        int id = FIRST_ID;
        
        while(id <= LAST_ID)
        {
            Product product = findProduct(id);
            if(product !=null)
            {
            String name = product.getName().toLowerCase();
            word = word.toLowerCase();
            if(name.contains(word))
            {
                System.out.println(product);
            }
            id++;  
            }            
        }
    }
    
    /**
     * This will receive a delivery and will increase the stock amount.
     * @param id is the product ID.
     * @param amount is the amount that is in stock.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        if(product !=null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Thats Delivered: " + product); 
        }
        else
        {
            System.out.println("Product ID: " + id + " Has not been found!");
        }
    }
    
    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printDetails(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            printDetails(id);
            product.sellOne();
            printDetails(id);
        }
        else
        {
            System.out.println("Product ID: " + id + " is not in stock");
        }
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * This will print a list of the products with
     * quantity less than 3.
     */
    public void printLowStock()
    {
        listProduct.clear();
        
        for (Product product : stock)
        {
            if(product.checkLow() == true)
            {
                listProduct.add(product);
            }
        }
        
        System.out.println("The stock of those products is low.");
        printListProduct();
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Prints listProduct.
     */
    public void printListProduct()
    {
        listProduct.forEach(product ->
        {
            System.out.println(product);
        });
    }
    
    /**
     * Print the details of all products.
     */
    public void printAllProducts()
    {
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
}
