import java.util.ArrayList;

public class Library extends ArrayList<MediaObject>{

    public void run(){
        System.out.println("Welcome to the library!");
        boolean running = true;
        while(running){
            printMenu();
            int userChoice = InputHandler.getInt("");
            String title;
            int yearPublished;
            String person;

            switch(userChoice){
                case 0:
                    running = false;
                    break;

                case 1:
                    int itemType = InputHandler.getInt("Do you want to add a Book(0), Movie(1) or Game(2): ");
                    title = InputHandler.getInput("Title: ");
                    yearPublished = InputHandler.getInt("Year Published: ");
                    int uniqueAttribute;

                    switch(itemType){
                        case 0:
                            uniqueAttribute = InputHandler.getInt("Number of Pages: ");
                            this.addNewItem(new Book(title, yearPublished, uniqueAttribute));
                            break;

                        case 1:
                            uniqueAttribute = InputHandler.getInt("Runtime: ");
                            this.addNewItem(new Movie(title, yearPublished, uniqueAttribute));
                            break;

                        case 2:
                            uniqueAttribute = InputHandler.getInt("Number of Players: ");
                            this.addNewItem(new Game(title, yearPublished, uniqueAttribute));
                            break;
                    }
                    break;

                case 2:
                    title = InputHandler.getInput("Title: ");
                    person = InputHandler.getInput("Who's checking out the item: ");
                    this.checkOutByTitle(title, person);
                    break;

                case 3:
                    title = InputHandler.getInput("Title: ");
                    person = InputHandler.getInput("Who's checking in the item: ");
                    this.checkInByTitle(title, person);
                    break;

                case 4:
                    title = InputHandler.getInput("Title: ");
                    this.getCopiesAvailableByTitle(title);
                    break;

                case 5:
                    this.displayAllBooks();
                    break;

                case 6:
                    this.displayAllMovies();
                    break;

                case 7:
                    this.displayAllGames();
                    break;

                case 8:
                    this.displayAllItems();
                    break;

                case 9:
                    title = InputHandler.getInput("Title: ");
                    checkItemExistence(title);
                    break;

                case 10:
                    yearPublished = InputHandler.getInt("Year: ");
                    getItemsByYear(yearPublished);
                    break;
            }
        }
    }

    private void printMenu(){
        System.out.println("Please choose one of the following options:");
        System.out.println("0 - Exit");
        System.out.println("1 - Add a new item");
        System.out.println("2 - Check an item out by title");
        System.out.println("3 - Check an item in by title");
        System.out.println("4 - Display available copies of an item by title");
        System.out.println("5 - Display all books");
        System.out.println("6 - Display all movies");
        System.out.println("7 - Display all games");
        System.out.println("8 - Display all items");
        System.out.println("9 - Check if an item exists by title");
        System.out.println("10 - Display all items by year");
    }

    // Add a new item to the system
    public void addNewItem(MediaObject item){
        for(MediaObject obj : this){
            if(item.getTitle().equals(obj.getTitle())){
                System.out.println("An item with the title '" + item.getTitle() + "' already exists in the system! Added another copy!");
                obj.addCopy();
                return;
            }
        }
        this.add(item);
    }

    // Check an item out by title
    public void checkOutByTitle(String title, String person){
        for(MediaObject item : this){
            if(item.getTitle().equals(title)){
                if(item.getCopiesAvailable() > 0){
                    item.checkOutByName(person);
                    System.out.println(title + " has been checked out by " + person + ".");
                }
                else{
                    System.out.println("No copies of " + title + " are available.");
                }
            }
        }
    }

    // Check an item in by title
    public void checkInByTitle(String title, String person){
        for(MediaObject item : this){
            if(item.getTitle().equals(title)){
                item.checkInByName(person);
                System.out.println(title + " has been checked in.");
            }
        }
    }

    // Determine how many copies of an item are available, by title
    public void getCopiesAvailableByTitle(String title){
        for(MediaObject item : this){
            if(item.getTitle().equals(title)){
                System.out.println("Copies available for " + title + ": " + item.getCopiesAvailable());
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found in the system.");
    }

    // Display all books in the system
    public void displayAllBooks(){
        System.out.println("All Books in the System:");
        for(MediaObject item : this){
            if(item instanceof Book){
                item.printInfo();
            }
        }
    }

    // Display all movies in the system
    public void displayAllMovies(){
        System.out.println("All Movies in the System:");
        for(MediaObject item : this){
            if(item instanceof Movie){
                item.printInfo();
            }
        }
    }

    // Display all games in the system
    public void displayAllGames(){
        System.out.println("All Games in the System:");
        for(MediaObject item : this){
            if(item instanceof Game){
                item.printInfo();
            }
        }
    }

    // Display all items in the system
    public void displayAllItems(){
        System.out.println("All Items in the System:");
        for(MediaObject item : this){
            item.printInfo();
        }
    }

    // Check whether an item exists in the system(by title), and show details if it exists
    public void checkItemExistence(String title){
        for(MediaObject item : this){
            if(item.getTitle().equals(title)){
                item.printInfo();
                return;
            }
        }
        System.out.println("Item with title '" + title + "' not found in the system.");
    }

    // View all items published in a certain year
    public void getItemsByYear(int year){
        System.out.println("Items published in the year " + year + ":");
        boolean found = false;
        for(MediaObject item : this){
            if(item.getYearPublished() == year){
                item.printInfo();
                found = true;
            }
        }
        if(!found){
            System.out.println("No items found for the year " + year + ".");
        }
    }
}
