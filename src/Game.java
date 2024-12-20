public class Game extends MediaObject {
    private int numPlayers;

    public Game(String title, int yearPublished, int numPlayers){
        super(title, yearPublished);
        this.numPlayers = numPlayers;
    }

    @Override
    public void printInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Copies: " + getCopies());
        System.out.println("Number of pages: " + numPlayers);
        if(getCopiesAvailable()>0){
            System.out.println(getCopiesAvailable() + " game(s) checked in.");
        }
        if(getCopies()>getCopiesAvailable()){
            System.out.println((getCopies()-getCopiesAvailable()) + " game(s) checked out by " + getCheckedOutPerson() + ".");
        }
    }
}
