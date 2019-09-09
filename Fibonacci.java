/** Vanessa Carpio Pinto
 * 8/30/19
 * This program will simulate the fibonacci sequence which will take users input and then add the number in the previous position and then the before previous position
 * this will equal the current position.
 * **/
import java.util.Scanner;
public class Fibonacci {
   public static void main(String [] args){
      Scanner kb = new Scanner(System.in);
      //Welcome user to program explain briefly what the program will do
      System.out.println("Welcome to the Fibonacci program!");
      System.out.println("In this program we will simulate the fibonacci sequence.");
      System.out.println("The fibonacci sequence will always begin with 0 and 1.\nFor a more exciting result enter a number greater than 2.");
      System.out.print("To begin enter the limit of iterations: ");
      int response = kb.nextInt();
   
      //while loop to ensure that user inputs a number that is greater than 2
      while (response < 3 ) {
         System.out.print("Please enter a number > 2: ");
         response = kb.nextInt();
      
   
      //create an array that inputs the results of the sequence
      //the length of array is set by the users response 
      long [] arr = new long [response];
      //set the positions 0 and 1 of the array to 0 and 1 since sequence always begins like that
      arr [0] = 0;
      arr [1] = 1;
   
      //for loop that adds arr (i-1)+ arr(i-2) and then sets the total for the next number in the sequence
      for (int num = 2; num < response; num++ ){
         arr[num]= arr[num-1] + arr[num-2];
      }
      //for loop that prints out the sequence
      for (int i =0 ; i < response; i++){
         System.out.print(arr[i]+ " ");
      }
   
   
   }
}
