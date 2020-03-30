package AllNotes.Chapter7;

public class PantherMan extends SuperHero {
    public PantherMan(String suit, String tights, String specialPower) {
        super(suit, tights, specialPower);
    }

    @Override
    public String useSpecialPower() {
        return "Black Panther Activate - * claws open up  *  ";
    }

    @Override
    public String putOnSuit() {
        return "I put on my black panther suit";
    }
}
