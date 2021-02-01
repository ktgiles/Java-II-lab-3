/*Kaitlin Giles, 02/02/2021
Lab 3 - Exception Handling
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException; 

public class Giles_Lab3 {
   public static final int SIZE = 5;    //size of array in file

   public static void main(String[] args) {
      //establish variables
      double[] data;
      int index;
      Scanner input;
      data = new double[SIZE];
      index = 0;

      try {
      //initiate scanner to read contents of file
      input = new Scanner(new File("input.txt"));

         //print all data from array within input.txt.txt file
         while (input.hasNext()) {
            data[index] = input.nextDouble();
            System.out.println(data[index]);
            index++;
         }
         //if input.txt.txt not found or contains improper variable type, print error message
      } catch (FileNotFoundException | InputMismatchException e) {
         System.out.println("An error occurred.");
         e.printStackTrace(); //prints exception information
      }
   }
}
// TEST