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
    
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
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
    
   /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProducts();
        // Take delivery of 5 items of one of the products.
        manager.delivery(101, 5);
        manager.delivery(102, 2);
        manager.delivery(103, 15);
        manager.delivery(104, 64);
        manager.delivery(105, 32);
        manager.delivery(106, 8);
        manager.delivery(107, 19);
        manager.delivery(108, 24);
        manager.delivery(109, 4);
        manager.delivery(110, 1);
        manager.delivery(111, 3);
        manager.printAllProducts();
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
