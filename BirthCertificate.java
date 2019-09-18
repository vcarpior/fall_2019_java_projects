/**Vanessa Carpio
 * 9/14/19
 * Purpose: This class simulates a birth certificate that is created in build a bear
 * This class has the following attributes: bearName, CreatorName, and birthday.
 * */
public class BirthCertificate {
    private String bearName; //name of the teddy bear
    private String creatorName; //name of the creator
    private String birthday; // birthday of the teddy bear

    /**This contructor initializes the bearName,
     * creatorName and birthday field.
     * @param bName the teddy bears name.
     * @param cName the creators name.
     * @param bday the bears birth date.
     * */

    public BirthCertificate (String bName, String cName, String bday){
        bearName = bName;
        creatorName = cName;
        birthday = bday;
    }

    /**The copy constructor initializes the object as a copy of
     * another BirthCertificate object.
     * @param certificate2 the object to copy.
     * */
    public BirthCertificate(BirthCertificate certificate2){
        bearName = certificate2.bearName;
        creatorName = certificate2.creatorName;
        birthday = certificate2.birthday;
    }

    /**The set method sets the value for the following fields:
     * @param bName the teddy bears name.
     * @param cName the creators name.
     * @param bday the bears birth date.
     * */
    public void set(String bName, String cName, String bday){
        bearName = bName;
        creatorName = cName;
        birthday = bday;
    }
    /**toString method
     * @return a string containing the birth certificate information
     * */

    public String toString() {
        String str = "\nDate of Birth: "+ birthday+
                      "\nBear Name: "+ bearName+
                      "\nBelongs To: "+creatorName;
        return str;
    }
}
