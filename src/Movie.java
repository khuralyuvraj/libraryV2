public class Movie extends MediaObject {
    private double runTime; // in mins

    public Movie(String title, int yearPublished, double runTime){
        super(title, yearPublished);
        this.runTime = runTime;
    }

    @Override
    public void printInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Copies: " + getCopies());
        System.out.println("Number of pages: " + runTime);
        if(getCopiesAvailable()>0){
            System.out.println("There are currently " + getCopiesAvailable() + " movies checked in.");
        }
        else if(getCopies()>getCopiesAvailable()){
            System.out.println("There are currently " + (getCopies() - getCopiesAvailable()) + " movies checked out by " + getCheckedOutPerson() + ".");
        }
    }
}
