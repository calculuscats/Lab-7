import java.util.Scanner;
import java.io.File;

class FileIOExample {

    public static void main(String[] args) {
    
    //Quantity, UnitPrice, OrderID, ProductID, Discount
    
    int[] quantity = new int[0];
    double[] unitPrice = new double[1];
    int[] orderID = new int[2];
    int[] productID = new int[3];
    double[] Discount = new double[4];
   
   
        try{
           File readFile = new File("OrderDetails.txt");
           Scanner in = new Scanner(readFile);
           
           while(in.hasNext()){
             String data = in.nextLine();
             
             String[] arr = data.split(",",5);
             //change the split array of type to string to a split array of each type
             
             int quantity1 = Integer.parseInt(arr[0]);
              System.out.println(quantity1);
              
             double unitPrice1 = Double.parseDouble(arr[1]);
               System.out.println(unitPrice1);
             
             int orderID1 = Integer.parseInt(arr[2]);
               System.out.println(orderID1);
               
               
             int productID1 = Integer.parseInt(arr[3]);
               System.out.println(productID1);
             
             double discount1 = Double.parseDouble(arr[4]);
               System.out.println(discount1);
               
               
             
          // for( int i = 0; i < arr.length(); i++);
           
      System.out.println(i + ": " + a.charAt(i));

           //int sum = unitPrice1 * Quantity - (Discount * Quantity * UnitPrice)
           
           
             
            
             //System.out.println(data);
         
             
           }
           
           in.close();
           
          } catch (Exception e){
            System.out.println("Error: Could not open file.");

          
         }
         
     }
}

          
           //keep doing while exists
           /*for (int i = 0; i < 2820; i++) {//stores up to 2819 index
          String str = in.nextLine(); //set the string str to next line
          System.out.println(str);/*
          
           }
           
           //System.out.println("5");
            
         
          
         in.close(); 
          
     
       } catch (Exception e){
            //System.out.println("Error: Could not open file.");

         }
         
           }
           
           //System.out.println("5");
         System.out.println("5");

         
  //String[] str = new String [5];

   
}














/*We create a scanner for reading file
try(Scanner scanner = new Scanner(Paths.get("OrderDetails.txt"))) {

     //we read the file until all lines have been read
     while (scanner.hasNextLine()) {
     
          // we read one line
        String row = scanner.nextLine();
        //we print the line that we read
        System.out.println(row);
        
     }
} catch (Exeption e) {
    System.out.println("Error: " + e.getMessage());*/
    




