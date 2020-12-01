import java.util.ArrayList;
import java.util.*;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Galimir Bozmarov
 * @version 1.0
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';
    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "printall";
    public static final String SEARCH = "search";
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo(manager);
    
    
    // A list of the products.
    private ArrayList<Product> stock;
    List <Product> listProduct = new ArrayList<Product>();
    
   /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            if(choice.equals(QUIT))
                finished = true;
            else    
                executeMenuChoice(choice);
        }
    }
    
   private void executeMenuChoice(String choice)
    {
        if(choice.equals(ADD))
        {
            addProduct();
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.printAllProducts();
            String value = input.getString();
        }
        else if(choice.equals(SEARCH))
        {
            
        }
    }
    
   private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println("\n You have added the following product" + product);
        System.out.println();
    }
    
   /**
     * This will search for a product by specific word 
     * from the name of the product.
     */
    public void searchProduct(String word)
    {
        System.out.println("Searching for an item");
        
        System.out.println("Please enter the name of the product");
        String name = input.getString();
        

    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        //System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("      App05: by Galimir");
        System.out.println("******************************");
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
}
