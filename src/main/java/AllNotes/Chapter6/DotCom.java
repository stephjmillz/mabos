package AllNotes.Chapter6;

import java.util.ArrayList;

class DotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = " miss";

        for(int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = " kill";
        }
        System.out.println(result);
            return result;
    }
}

class DotComAL {
    private ArrayList<String> locationCells;
    // private int numOfHits;
    // Dont need that now

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >=0){
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}