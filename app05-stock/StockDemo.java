import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Galimir Bozmarov
 * @version 1.0
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;
   
    private Random generator;

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        generator = new Random();
        //this method adds the products 
        this.manager = manager;
        
        manager.addProduct(new Product(111, "Apple iPhone XS"));
        manager.addProduct(new Product(112, "Samsung Galaxy S8"));
        manager.addProduct(new Product(113, "Apple iPhone 11"));
        manager.addProduct(new Product(114, "Apple iPhone 12"));
        manager.addProduct(new Product(115, "Apple iPhone 11 Pro"));
        manager.addProduct(new Product(116, "Samsung Galaxy S20"));
        manager.addProduct(new Product(117, "Samsung Galaxy S10"));
        manager.addProduct(new Product(118, "Apple iPhone SE"));
        manager.addProduct(new Product(119, "Apple MacBook Pro"));
        manager.addProduct(new Product(120, "Apple iPhone 8"));
    }
    
    public void runDemo()
    {
        manager.printAllProducts();
        
        demoDelivery();
        demoSell();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        printHeading("Delivery");
        
        int amount = 0;
        
        for(int id = 111; id<=120; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.deliverProduct(id,amount);
            amount++;
        }
    }

    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demonstrating Product" + verb);
        System.out.println();
    }
    
    private void demoSell()
    {
        printHeading("Sell");
        
        int amount = 0;
        
        for(int id = 111; id<=120; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.sellProduct(id);
        }
    }
    
    /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        // this method finds the product ID for each product
        Product product = manager.findProduct(id);
        
        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                               " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
