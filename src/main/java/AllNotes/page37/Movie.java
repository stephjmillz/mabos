package AllNotes.page37;

 class Movie {
     String title;
     String genre;
     int rating;

     void playIt(){
         System.out.println("The movie that is about to begin is called " + title + ". It is a "+genre+ ". The rating is " + rating + ". Enjoy this movie.");
     }
}

 class MovieTest{
     public static void main(String[] args) {
         Movie one = new Movie();
         one.title = "Fifty Classes (Shades) of Code (Grey)";
         one.genre = "Romance";
         one.rating = 69;
         one.playIt();
     }
}