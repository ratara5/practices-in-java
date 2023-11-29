import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<MediaItem> mediaItems = new ArrayList<>();

        // Crear objetos de la clase Book
        Book book1 = new Book("Book Title 1", "Author 1", "Synopsis 1", 100, new ArrayList<>());
        Book book2 = new Book("Book Title 2", "Author 2", "Synopsis 2", 50, new ArrayList<>());
        Book book3 = new Book("Book Title 3", "Author 3", "Synopsis 3", 75, new ArrayList<>());

        // Crear objetos de la clase Magazine
        Magazine magazine1 = new Magazine("Magazine Title 1", "Editor 1", "Content 1", 200, new ArrayList<>());
        Magazine magazine2 = new Magazine("Magazine Title 2", "Editor 2", "Content 2", 80, new ArrayList<>());
        Magazine magazine3 = new Magazine("Magazine Title 3", "Editor 3", "Content 3", 120, new ArrayList<>());

        // Crear objetos de la clase Movie
        Movie movie1 = new Movie("Movie Title 1", "Director 1", "Plot 1", 300, new ArrayList<>());
        Movie movie2 = new Movie("Movie Title 2", "Director 2", "Plot 2", 150, new ArrayList<>());
        Movie movie3 = new Movie("Movie Title 3", "Director 3", "Plot 3", 220, new ArrayList<>());

        // Crear objetos de la clase Song
        Song song1 = new Song("Song Title 1", "Artist 1", "Description 1", 500, new ArrayList<>());
        Song song2 = new Song("Song Title 2", "Artist 2", "Description 2", 250, new ArrayList<>());
        Song song3 = new Song("Song Title 3", "Artist 3", "Description 3", 350, new ArrayList<>());

        // Agregar los objetos a una lista general de medios
        mediaItems.add(book1);
        mediaItems.add(book2);
        mediaItems.add(book3);
        mediaItems.add(magazine1);
        mediaItems.add(magazine2);
        mediaItems.add(magazine3);
        mediaItems.add(movie1);
        mediaItems.add(movie2);
        mediaItems.add(movie3);
        mediaItems.add(song1);
        mediaItems.add(song2);
        mediaItems.add(song3);




        //INTERACCIÓN DE USUARIO
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar una selección aleatoria de 3 MediaItems al usuario
            System.out.println("Here are three random MediaItems:");
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(mediaItems.size());
                MediaItem randomMediaItem = mediaItems.get(randomIndex);
                System.out.println((i + 1) + ": " + randomMediaItem.getTitle());
            }

            // Preguntar al usuario sobre cuál quiere dejar un registro
            System.out.print("Enter the number of the MediaItem you want to leave a record for (1-3): ");
            int selectedMediaItemIndex = scanner.nextInt();
            if (selectedMediaItemIndex < 1 || selectedMediaItemIndex > 3) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                continue;
            }
            MediaItem selectedMediaItem = mediaItems.get(selectedMediaItemIndex - 1);

            // Preguntar si el usuario quiere hacer "like" al MediaItem
            System.out.print("Do you want to like this MediaItem? (yes/no): ");
            String likeChoice = scanner.next();
            if (likeChoice.equalsIgnoreCase("yes")) {
                selectedMediaItem.setLikes(selectedMediaItem.getLikes() + 1);
                System.out.println("You liked the MediaItem.");
            }

            // Mostrar el total de "likes"
            System.out.println("Total Likes: " + selectedMediaItem.getLikes());

            // Preguntar si el usuario quiere dejar un comentario
            System.out.print("Do you want to leave a comment? (yes/no): ");
            String commentChoice = scanner.next();
            if (commentChoice.equalsIgnoreCase("yes")) {
                System.out.print("Enter your comment: ");
                String comment = scanner.next();
                selectedMediaItem.getComments().add(comment);
                System.out.println("Your comment has been added.");
            }

            // Mostrar todos los comentarios
            System.out.println("Comments:");
            for (String comment : selectedMediaItem.getComments()) {
                System.out.println(comment);
            }

            // Preguntar al usuario si desea continuar
            System.out.print("Do you want to continue? (yes/no): ");
            String continueChoice = scanner.next();
            if (!continueChoice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // Cerrar el Scanner
        scanner.close();

    }
}
