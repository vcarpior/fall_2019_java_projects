/**10/1/19
 * Vanessa Carpio Pinto
 * This program is an extension of the Animal class it add the following fields and methods.
 * This class add the name and breed field which are both strings.
 * This class add the getName and getBreed methods.
 * */
public class Dog extends Animal
{
    private  String name; //name of dog
    private String breed; //breed of dog

    /**the contructor sets the name and the breed of the dog
     * it also sets the weight and height using animal class methods
     * @param n the name of the dog
     * @param b the breed of the dog
     * @param lb the weight of dog
     * @param cm the height of dog
     * */
    public Dog (String n,String b,double lb, double cm){
        name = n;
        breed = b;
        setWeight_Lb(lb);
        setHeight_Cm(cm);
    }

    /**the getName method returns the name of the dog
     * @return the string in the name field
     * */
    public String getName() {
        return name;
    }
    /**the getBreed method returns the breed of the dog
     * @return the string in the breed field
     * */
    public String getBreed() {
        return breed;
    }



}

