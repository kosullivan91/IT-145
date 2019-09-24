public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity

   /*Default Constructor
    itemName - Initialized to "none"
    itemPrice - Initialized to 0
    itemQuantity - Initialized ito 0
   */
    
   //public member methods (mutators & accessors)
   
   //setName() & getName() 
   //setPrice() & getPrice() 
   //setQuantity() & getQuantity() 
   
   //print item to purchase
   
   public void printItemPurchase() {
      System.out.println(itemQuantity + " " + itemName + " $" + itemPrice +  
                         " = $" + (itemPrice * itemQuantity));
   }
}
