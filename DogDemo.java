import javax.swing.JOptionPane;
public class DogDemo {
    public static void main(String [] args){
        String input;//holds input
        String name; // name of dog
        String breed; //breed of dog
        double height; //height of dog
        double weight; //weight of dog

        //asks for the name of the dog and save input to name
        name = JOptionPane.showInputDialog("Name of dog: ");

        //asks user for the breed of dog and save input to breed
        breed =JOptionPane.showInputDialog("Breed of dog: ");

        //asks user to input the height and save it to the height variable
        input = JOptionPane.showInputDialog("Height of dog(cm): ");
                height = Double.parseDouble(input);

        //asks user to input the weight and save it to weight
        input = JOptionPane.showInputDialog("Weight of dog(lb): ");
                weight = Double.parseDouble(input);

        //create dog object and pass the correct parameters
        Dog doggo = new Dog(name,breed,weight,height);

        JOptionPane.showMessageDialog(null,"This dog's name is: "+ doggo.getName()+
                "\nDog's breed: "+doggo.getBreed()+ "\nDog's height and weight is: "+doggo.getHeight_Cm()+
                " cm \n"+doggo.getWeight_Lb()+" lb");

    System.exit(0);
    }
}
