import java.util.ArrayList;

public class Book extends MediaItem{
    public Book(String title, String author, String synopsis, int likes, ArrayList<String> comments) {
        super(title, author, synopsis, likes, comments);
    }
}
