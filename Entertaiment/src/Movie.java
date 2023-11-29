import java.util.ArrayList;

public class Movie extends MediaItem{
    public Movie(String title, String author, String synopsis, int likes, ArrayList<String> comments) {
        super(title, author, synopsis, likes, comments);
    }
}
