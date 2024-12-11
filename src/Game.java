public class Game extends MediaObject {
    private int numPlayers;

    public Game(String title, int numPlayers){
        super(title);
        this.numPlayers = numPlayers;
    }

    @Override
    public void printInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Number of players: " + numPlayers);
        System.out.print("Game is currently checked ");
        if (getCheckedStatus()){
            System.out.println("in.");
        }
        else{
            System.out.println("out by " + getCheckedOutPerson() + ".");
        }
    }
}
