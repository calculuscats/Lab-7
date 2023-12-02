import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

class FileIOExample {

      public static void main(String[] args) {
      
         int[] quantity = new int[2820];
         double[] unitPrice = new double[2820];
         int[] orderID = new int[2820];
         int[] productID = new int[2820];
         double[] discount = new double[2820];


    //Quantity, UnitPrice, OrderID, ProductID, Discount
    
        Scanner in;
        try{
           File readFile = new File("OrderDetails.txt");
           in = new Scanner(readFile);
           
            int counter = 0;
     
           while(in.hasNext()){
              
             String data = in.nextLine();
             
             String[] arr = data.split(","); //change the split array of string type to a split array of each correct type
             
             quantity[counter] = Integer.parseInt(arr[0]);
             
             unitPrice[counter] = Double.parseDouble(arr[1]);
             
             orderID[counter] = Integer.parseInt(arr[2]);

             productID[counter] = Integer.parseInt(arr[3]);
             
             discount[counter] = Double.parseDouble(arr[4]);
          
                       
           }
          
              
           in.close();
           
          } catch (Exception e){
            System.out.println("Error: Could not open file.");

          
         }

           /* for( int i = 0; i < 2820; i++){
            
               double total = (unitPrice[i] * quantity[i] -(discount[i] * quantity[i] * unitPrice[i]));    
            
             } */ 
            
           
            try{
            
                PrintWriter outfile = new PrintWriter("data.txt");
                
                for( int i = 0; i < 2820; i++){
            
                  double total = (unitPrice[i] * quantity[i] -(discount[i] * quantity[i] * unitPrice[i]));    
                  
                  //System.out.printf(%.2d
            
                    outfile.println(orderID[i] + "   " + total);
                }
          
                    outfile.close();
                
                
             }catch (Exception e){
             System.out.println(e.getMessage());
             }
         }  
   }  

 
     