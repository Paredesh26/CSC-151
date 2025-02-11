
import java.util.Scanner;

public class AI_Project_ParedesHaylee 
{
    public static double computeAverage(Scanner scnr, int numCount) {
        double valuesSum = 0;
        int currValue = 0;
  
        for (int i = 0; i < numCount; ++i) {
           System.out.print("Enter number: ");
           currValue = scnr.nextInt(); 
           valuesSum += currValue;
        }
  
        return valuesSum / numCount;
     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
      int numValues;
      double averageVal;
      
      System.out.println("Enter number of values: ");
      numValues = scnr.nextInt(); 
      averageVal = computeAverage(scnr, numValues);
      
      System.out.print("Average: ");
      System.out.printf("%.3f", averageVal);
      System.out.println("");
    }
    
}

// Please create a Java program using JOptionPane having multiple methods. Have a welcome method to ask the user their name. Have a second welcome method welcoming the user using their name. And a goodbye method that will thank the user for using the program using their name. 