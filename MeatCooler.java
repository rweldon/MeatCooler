
 import java.util.Scanner;
 
public class MeatCooler {
  
  public static void main(String[] args) {  
  Scanner input = new Scanner(System.in);
    
    int MeatWt;
    Double CoolerSpc;
    Double sum = 1.2;
    
    //declarations 
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Meat Weight");
    
    MeatWt = in.nextInt();
   
    //Scanner info
    
    CoolerSpc = MeatWt*sum;
    
    //Equation 
      
    System.out.println("You will need " + CoolerSpc);
   
    
      
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
