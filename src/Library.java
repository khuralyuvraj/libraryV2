import java.util.ArrayList;

public class Library extends ArrayList<MediaObject> {

    // Add a new item to the system
    public void addNewItem(MediaObject item) {
        this.add(item);
        System.out.println("Item added: " + item.getTitle());
    }

    // Check an item out by title
    public void checkOutByTitle(String title, String person) {
        for (MediaObject item : this) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                if (item.getCopiesAvailable() > 0) {
                    item.checkOutByName(person);
                    System.out.println(title + " has been checked out by " + person + ".");
                } else {
                    System.out.println("No copies of " + title + " are available.");
                }
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found in the system.");
    }

    // Check an item in by title
    public void checkInByTitle(String title) {
        for (MediaObject item : this) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.checkIn();
                System.out.println(title + " has been checked in.");
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found in the system.");
    }

    // Determine how many copies of an item are available, by title
    public void getCopiesAvailable(String title) {
        for (MediaObject item : this) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Copies available for " + title + ": " + item.getCopiesAvailable());
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found in the system.");
    }

    // Display all books in the system
    public void displayAllBooks() {
        System.out.println("All Books in the System:");
        for (MediaObject item : this) {
            if (item instanceof Book) {
                item.printInfo();
            }
        }
    }

    // Display all movies in the system
    public void displayAllMovies() {
        System.out.println("All Movies in the System:");
        for (MediaObject item : this) {
            if (item instanceof Movie) {
                item.printInfo();
            }
        }
    }

    // Display all games in the system
    public void displayAllGames() {
        System.out.println("All Games in the System:");
        for (MediaObject item : this) {
            if (item instanceof Game) {
                item.printInfo();
            }
        }
    }

    // Display all items in the system
    public void displayAllMedia() {
        System.out.println("All Items in the System:");
        for (MediaObject obj : this) {
            obj.printInfo();
        }
    }

    // Check whether an item exists in the system (by title), and show details if it exists
    public void checkItemExists(String title) {
        for (MediaObject item : this) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Item found:");
                item.printInfo();
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found in the system.");
    }

    // View all items published in a certain year
    public void viewItemsByYear(int year) {
        System.out.println("Items published in the year " + year + ":");
        boolean found = false;
        for (MediaObject item : this) {
            if (item.getYearPublished() == year) {
                item.printInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No items found for the year " + year + ".");
        }
    }
}
