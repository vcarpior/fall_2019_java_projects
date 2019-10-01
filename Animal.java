/**Vanessa Carpio Pinto
 * 10/1/19
 * this class is the super class for the dog class
 * */
public class Animal {
    private double weight_Lb; //weight of animal
    private double height_Cm; //height of animal

    /**The setHeight_Cm method sets the height_cm field
     * @param cm the string in the height_cm field
     * */
    public void setHeight_Cm(double cm) {
        height_Cm = cm;
    }
    /**The setWeight_lb method sets the weight_Lb field
     * @param lb the string in the weight_Lb field
     * */
    public void setWeight_Lb(double lb) {
        weight_Lb = lb;
    }

    /**the getHeight_Cm method return the height of the animal
     * @return the height of the animal
     * */
    public double getHeight_Cm() {
        return height_Cm;
    }
    /**the getWeight_Lb method return the weight of the animal
     * @return the weight of the animal
     * */
    public double getWeight_Lb() {
        return weight_Lb;
    }

}
