public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
    
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

   /*Default Constructor
    itemName - Initialized to "none"
    itemPrice - Initialized to 0
    itemQuantity - Initialized to 0
   */
    
    public ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }
    
   //public member methods (mutators & accessors)
   
   //setName() & getName() 
   //setPrice() & getPrice() 
   //setQuantity() & getQuantity()
    
   //setters
    
    public void setName(String name) {
        itemName = name;
        return;     //return statement to clear the stack frame.
    }
    
    public void setPrice(int price) {
        itemPrice = price;
        return;
    }
    
    public void setQuantity(int quantity) {
        itemQuantity = quantity;
        return;
    }
    
   //getters
    
    public String getName() {
        return itemName;
    }
    
    public int getPrice() {
        return itemPrice;
    }
    
    public int getQuantity() {
        return itemQuantity;
    }
   
    //calculate and return item total cost in shopping cart
    public int totalCost() {
        return (itemPrice * itemQuantity);
    }
    
   //print item to purchase
   
   public void printItemPurchase() {
      System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
