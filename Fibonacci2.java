import java.util.Scanner;
public class Fibonacci2 {
   public static void main(String []args){
      Scanner kb = new Scanner(System.in);
    //Welcome user to program explain briefly what the program will do
      System.out.println("Welcome to the Fibonacci program!");
      System.out.println("In this program we will simulate the fibonacci sequence.");
      System.out.println("The fibonacci sequence will always begin with 0 and 1.\nFor a more exciting result enter a number greater than 2.");
      System.out.print("To begin enter the limit of iterations: ");
      int response = kb.nextInt();
   
   
    //while loop to ensure that user inputs a number that is greater than 2
      while (response <= 2) {
         System.out.print("Please enter a number > 2: ");
         response = kb.nextInt();
      
      } //create an array that inputs the results of the sequence
        //make the array long because an int data type is too small
      long [] arr = new long[response];
        //set the positions 0 and 1 of the array to 0 and 1 since sequence always begins like that
      arr [0] = 0;
      arr [1] = 1;
   
      fibo(arr);
      printOut(arr);
   
   }
   public static void printOut(long []arry){
        // Display the array elements.
      for (int i= 0; i < arry.length; i++)
         System.out.print(arry[i] + " ");
   }
   public static void fibo(long [] arr ) {
   
        //this for loop needs to start on 1 since we need a number to add the previous to
        //response has to one number less otherwise it will make more elements than are possible in the array
      for (int i = 1; i < (arr.length - 1); i++) {
            //to get the next number you need the current number plus the previous number
         arr[i + 1] = arr[i] + arr[i - 1];
      }
   
   }

}