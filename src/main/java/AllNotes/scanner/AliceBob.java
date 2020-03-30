package AllNotes.scanner;

import java.util.Scanner;

public class AliceBob {
    /* I was gonna attempt to do all of this in main but
    I chose to create a method. I did not know if you could
    make the Main method a recursive method.

    This is a counter to count how many wrong attempts */
    static int counter = 1;
    public static void main(String[] args) {
       // This is calling the method again
        repeat();
    }
    public static void repeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name");
        String name = sc.nextLine();

        //Wanted to make the input non case sensitive
        if (name.equalsIgnoreCase("Alice") || name.equalsIgnoreCase("Bob")) {
            System.out.println("Welcome " + name + ". You got it right after " + counter + " attempt(s). ");
        } else {
            System.out.println("Wrong input. Try again");
            //The counter will update every time the input is wrong.
            counter++;
            System.out.println("This is attempt #" + counter);
            //The method calls itself if the input was wrong
            repeat();
        }
    }
}
