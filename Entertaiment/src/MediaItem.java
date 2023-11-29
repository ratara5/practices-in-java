import java.util.ArrayList;

public class MediaItem {
    private String title;
    private String author;
    private String synopsis;
    private int likes;
    private ArrayList<String> comments;


    public MediaItem(String title, String author, String synopsis, int likes, ArrayList<String> comments) {
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.likes = likes;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<String> getComments() {
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }


}