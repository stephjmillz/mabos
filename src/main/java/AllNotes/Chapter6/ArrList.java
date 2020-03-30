package AllNotes.Chapter6;

//  This portion focuses on the implementation of ArrayLists
// Starting on Page 133

import java.util.ArrayList;
public class ArrList {
    public static void main(String[] args) {
        // Make one
        ArrayList<Egg> myList = new ArrayList<Egg>();
        //Put something in it
        Egg s = new Egg();
        myList.add(s);
        // Put another thing in it
        Egg b = new Egg();
        myList.add(b);
        // Find out how many things are in it
        int intSize = myList.size();
        // Find out if it contain something
        boolean isIn = myList.contains(s); // returns true. the ArayList does contain the Egg object
        // Find out where something is ( index  )
        int idx = myList.indexOf(b);
        // Find out if it's empty
        boolean empty = myList.isEmpty();
        //Remove something from it
        myList.remove(s);



    }
}
