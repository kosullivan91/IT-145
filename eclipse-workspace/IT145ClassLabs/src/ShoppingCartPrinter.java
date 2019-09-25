import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      //create a Scanner object to collect user input.
      Scanner scnr = new Scanner(System.in);
      
      //field declaration and initialization.
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      //item object default initialization using default constructor.
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      item1.setName(productName);
      item1.setPrice(productPrice);
      item1.setQuantity(productQuantity);
      
      scnr.nextLine();
      
      // Get item 2 details from user, create itemToPurchase object
      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      productName = scnr.nextLine();
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      item2.setName(productName);
      item2.setPrice(productPrice);
      item2.setQuantity(productQuantity);
      
      // Add costs of two items and print total
      // cartTotal = item one price + item two price
      // Totoal Cost
      // item one information
      // item two information
      // Total output
      
      return;
   }
}