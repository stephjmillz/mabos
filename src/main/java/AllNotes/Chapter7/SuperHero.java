package AllNotes.Chapter7;

public abstract class SuperHero {
    private String suit;
    private String tights;
    private String specialPower;

    // Constructor
    public SuperHero(String suit, String tights, String specialPower){
        this.suit = suit;
        this.tights = tights;
        this.specialPower = specialPower;
    }

    // Getters and Setter
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public String getTights() {
        return tights;
    }
    public void setTights(String tights) {
        this.tights = tights;
    }
    public String getSpecialPower() {
        return specialPower;
    }
    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    // Methods
    public String useSpecialPower(){
        return "Power Actived";
    }
    public String putOnSuit(){
        return "Suit is on";
    }

}

