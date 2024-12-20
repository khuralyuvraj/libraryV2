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
            System.out.println(getCopiesAvailable() + " movie(s) checked in.");
        }
        if(getCopies()>getCopiesAvailable()){
            System.out.println((getCopies() - getCopiesAvailable()) + " movie(s) checked out by " + getCheckedOutPerson() + ".");
        }
    }
}
