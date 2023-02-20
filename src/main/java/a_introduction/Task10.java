package a_introduction;

public class Task10 {
    public static String bookDetails(String title, String author, String illustrator) {
        return title + ", written by " + author + " was illustrated by " + illustrator;
    }

    public static void main(String[] args) {
        String title = "Hobbit";
        String author = "J.R.R. Tolkien";
        String illustrator = "David Wyatt";
        System.out.println(bookDetails(title, author, illustrator));
    }
}
