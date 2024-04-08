public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Der Herr der Ringe: Extended Edition Trilogie";
        movie1.genre = MovieGenre.FANTASY;
        movie1.price = 25;

        Movie movie2 = new Movie();
        movie2.title = "Allein zu Haus";
        movie2.genre = MovieGenre.COMEDY;
        movie2.price = 8;

        printMovieDetails(movie1);
        printMovieDetails(movie2);
    }
    public static void printMovieDetails(Movie movie) {
        System.out.println("Title: " + movie.title + "\n"
        + "Genre: " + movie.genre + "\n"
        + "Price: " + movie.price);
    }
}