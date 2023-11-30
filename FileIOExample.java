import java.util.Scanner;
import java.io.File;

class FileIOExample {

    public static void main(String[] args) {
    
    //Quantity, UnitPrice, OrderID, ProductID, Discount
    
    int[] quantity = new int[0];
    double[] unitPrice = new double[1];
    int[] orderID = new int[2];
    int[] productID = new int[3];
    double[] Disount = new double[4];
   
   
        try{
           File readFile = new File("OrderDetails.txt");
           Scanner in = new Scanner(readFile);
           
           while(in.hasNext()){
             String data = in.nextLine();
             
             String[] arr = data.split(",",5);
             
           //  arr[0]=
             
            
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
    




