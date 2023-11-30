import java.util.Scanner;
import java.nio.file.Paths;

class FileIOExample {

    public static void main(String[] args) {
    
        try{
           File readFile = new File("OrderDetails.txt");
           Scanner in = new Scanner(readFile);
           
           while (in.hasNext()){
               System.out.println(in.nextLine());
           }
           
           in.close();
     
        } catch (Exeption e){
            System.out.println("Error: Could not open file.");
            

}






/*//We create a scanner for reading file
try(Scanner scanner = new Scanner(Paths.get("OrderDetails.txt"))) {

     //we read the file until all lines have been read
     while (scanner.hasNextLine()) {
     
          // we read one line
        String row = scanner.nextLine();
        //we print the line that we read
        System.out.println(row);
        
     }
} catch (Exeption e) {
    System.out.println("Error: " + e.getMessage());/*
    
        
     
     //array used with only classes;
     
     
     