/**Vanessa Carpio
 * 9/14/19
 * Purpose: this class simulates a teddy bear.
 * this has the following attributes: animalBread, fur color and
 * phrase that was recorded by the voice box.
 * */
public class TeddyBear {
    private String animalBreed;
    private String furColor;
    private  String voiceBox;

    /**This constructor initializes the animal breed,
     * furcolor and voice box field.
     * @param breed the teddy bears animal breed.
     * @param fur the color of fur.
     * @param voice the phrase that the teddy bear says
     * */
    public TeddyBear(String breed, String fur, String voice){
        animalBreed = breed;
        furColor = fur;
        voiceBox = voice;
    }

    /**The copy constructor initializes the object as a copy of
     * another TeddyBear object.
     * @param teddy2 the object to copy
     * */
    public TeddyBear (TeddyBear teddy2){
        animalBreed = teddy2.animalBreed;
        furColor = teddy2.furColor;
        voiceBox = teddy2.voiceBox;
    }
    /**The set method sets the value for the following fields:
     * @param breed the teddys bear breed.
     * @param fur the color of fur.
     * @param voice the phrase that is said by the bear
     * */

    public void set(String breed, String fur, String voice){
        animalBreed = breed;
        furColor = fur;
        voiceBox = voice;
    }

    /**toString method
     * @return a string containing the birth certificate information
     * */
    public String toString() {
        String str = "\nAnimal Type: "+ animalBreed+
                     "\nFur Color: "+furColor+
                     "\nVoice Box Phrase: "+voiceBox;
        return str;
    }
}
