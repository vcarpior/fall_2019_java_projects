/**Vanessa Carpio
 * 9/14/19
 * This class stores the data about build a bear.
 * Using the two other classes created we simulate build-a-bear by using aggregation.
 * */
public class Build_A_Bear {
    private String storeNumber;
    private TeddyBear teddyBear;
    private BirthCertificate birthCertificate;

    /**This constructor initializes the store,
     * teddy, and certificate.
     * @param store the store number.
     * @param teddy a TeddyBear object.
     * @param certificate a BirthCertificate object.
     * */
    public Build_A_Bear(String store, TeddyBear teddy, BirthCertificate certificate){
        //assign the store number
        storeNumber = store;

        // create a new TeddyBear object and
        // passing teddy as an argument for the copy constructor
        teddyBear = new TeddyBear(teddy);

        //create a new BirthCertificate object, passing certificate as an
        //argument to the copy constructor
        birthCertificate = new BirthCertificate(certificate);
    }

    /**getStoreNumber method
     * @return the stores number.
     * */
    public String getStoreNumber(){
        return storeNumber;
    }

    /**getTeddyBear method
     * @return a reference to a copy of this build a bear's
     * teddyBear object.
     * */
    public TeddyBear getTeddyBear(){
        return new TeddyBear(teddyBear);
    }

    /**getBirthCertificate method
     * @return a reference to a copy of this build a bear 's
     * BirthCertificate object
     * */
    public BirthCertificate birthCertificate(){
        return new BirthCertificate(birthCertificate);
    }

    /**toString method
     * @return a string containing the birth certificate information
     * */
    public String toString() {
        String str =  "Store Number: "+ storeNumber+ "\n--------------"+
                     "\nTeddy Bear Information "+ teddyBear+ "\n--------------"+
                     "\nBirth Certificate "+ birthCertificate;
        return str;
    }
}
