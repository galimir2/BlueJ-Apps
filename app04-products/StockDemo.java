/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Galimir Bozmarov
 * @version 1.0 04/11/2020
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
        manager.delivery(111, 5);
        manager.delivery(112, 2);
        manager.delivery(113, 4);
        manager.delivery(114, 1);
        manager.delivery(115, 7);
        manager.delivery(116, 10);
        manager.delivery(117, 2);
        manager.delivery(118, 4);
        manager.delivery(119, 8);
        manager.delivery(120, 1);
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
