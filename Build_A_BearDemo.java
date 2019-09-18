/**Vanessa Carpio
 * 9/14/19
 * This program demonstrates the build a bear class.
 * this program ses the teddyBear, BirthCertificate and build_a_bear class to simulate build a bear
 * using all those classes it will output all the collected information
 * */

public class Build_A_BearDemo {
   public static void main(String [] args){
      //create a teddyBear object and pass the corresponding parameters
      TeddyBear teddyBear =
             new TeddyBear("Bunny","Pink","I Love You!");
      //create a BirthCertificate object and pass the corresponding parameters
      BirthCertificate birthCertificate =
             new BirthCertificate("Cooky", "Jungkook", "9/14/19");
      //create a Build_a_bear object and pass the corresponding parameters
      Build_A_Bear build_a_bear =
             new Build_A_Bear("#2390",teddyBear,birthCertificate );
   
      //Display all the collected information
      System.out.println(build_a_bear);
   }
}
