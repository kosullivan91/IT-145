// import the Scanner class to facilitate
// Scanner object instantiation
import java.util.Scanner;

// import the ArrayList utility to facilitate ArrayList creation
import java.util.ArrayList;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      // create a Scanner object to collect user input.
      Scanner scnr = new Scanner(System.in);
      
      // field declaration and initialization.
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      /* Create an ArrayList to facilitate subsequent iteration
       * to reduce program statements and make it scalable.  
       * The ArrayList makes it easy to add
       * additional item objects and expand the shopping list without
       * having to modify any for loop used to capture input or output 
       * information for each item purchased.
       */
      
      ArrayList<ItemToPurchase> shoppingList = new ArrayList<ItemToPurchase>();
      
      // item object default initialization using default constructor.
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();
      
      // Add the newly created items to the shoppingList ArrayList.
      shoppingList.add(item1);
      shoppingList.add(item2);

      // Get item details from user and set the corresponding object fields
      
      /* A for loop lets us populate the shopping cart using
       * a minimal amount of code.  For each item in shoppingList,
       * the loop's iteration can prompt the user for the item details
       * and set the object fields accordingly.
       * A for loop is used because the number of iterations is known
       * and is equal to the length of shoppingList.
       * Best practice is to use a for loop when the number of iterations
       * is known ahead of time, and a while loop when the number of iterations
       * is unknown (e.g. loop until a specific value is given).
       */
      
      for(i = 0; i < shoppingList.size(); ++i) {
          System.out.println("Item " + (i + 1));
          System.out.println("Enter the item name: ");
          productName = scnr.nextLine();
          System.out.println("Enter the item price: ");
          productPrice = scnr.nextInt();
          System.out.println("Enter the item quantity: ");
          productQuantity = scnr.nextInt();
          shoppingList.get(i).setName(productName);
          shoppingList.get(i).setPrice(productPrice);
          shoppingList.get(i).setQuantity(productQuantity);
          scnr.nextLine();
      }
      
      // Add costs of the items and print the total
      // e.g. cartTotal = item one price + item two price
      
      // Total Cost
      System.out.println("TOTAL COST");
     
      /* For loops let us print the item cost and compute the cart total
       * using a minimal amount of code.  For each item in shoppingList,
       * the loop's iteration can call the needed method for the task
       * (i.e. printItemPurchase() and totalCost())
       * A for loop is used because the number of iterations is known
       * and is equal to the length of shoppingList.
       * Best practice is to use a for loop when the number of iterations
       * is known ahead of time, and a while loop when the number of iterations
       * is unknown.
       */
      
      // Print item information
      for (i = 0; i < shoppingList.size(); ++i) {
          shoppingList.get(i).printItemPurchase();
          cartTotal += shoppingList.get(i).totalCost();
      }
      
      System.out.println();
      
      // Total output
      System.out.println("Total: $" + cartTotal);
      
      // Close the Scanner object to conserve resources
      scnr.close();
      
      return;
   }
}