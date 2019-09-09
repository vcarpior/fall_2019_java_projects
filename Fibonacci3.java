import java.util.Scanner;
public class Fibonacci3 {
   public static void main(String []args){
      Scanner kb = new Scanner(System.in);
   //Welcome user to program explain briefly what the program will do
      System.out.println("Welcome to the Fibonacci program!");
      System.out.println("In this program we will simulate the fibonacci sequence.");
      System.out.println("The fibonacci sequence will always begin with 0 and 1.\nFor a more exciting result enter a number greater than 2.");
      System.out.print("To begin enter the limit of iterations: ");
      int response = kb.nextInt();
      System.out.print("Please choose which algorithm you would like to run.(1 or 2): ");
      byte algo = kb.nextByte();
   
      //while loop to ensure that user inputs a number that is greater than 2
      while (response <= 2) {
         System.out.print("Please enter a number > 2: ");
         response = kb.nextInt();
      
      }
   
      //create an array that inputs the results of the sequence
      //make the array long because an int data type is too small
      long [] arr = new long[response];
      //set the positions 0 and 1 of the array to 0 and 1 since sequence always begins like that
      arr [0] = 0;
      arr [1] = 1;
      if (algo == 1){
         fibo1(arr);
         printOut(arr);
      }
      else if (algo ==2){
         fibo2(arr);
         printOut(arr);
      }
   
   }
   private static void printOut(long []arry){
      // Display the array elements.
      for (int i= 0; i < arry.length; i++)
         System.out.print(arry[i] + " ");
   }
   private static void fibo2(long [] arr ) {
   
      //this for loop needs to start on 1 since we need a number to add the previous to
      //response has to one number less otherwise it will make more elements than are possible in the array
      for (int i = 1; i < (arr.length - 1); i++) {
         //to get the next number you need the current number plus the previous number
         arr[i + 1] = arr[i] + arr[i - 1];
      }
   }
   private static void fibo1(long [] arr){
      //for loop that adds arr (i-1)+ arr(i-2) and then sets the total for the next number in the sequence
      for (int num = 2; num < arr.length; num++ ){
         arr[num]= arr[num-1] + arr[num-2];
      }
   }

}