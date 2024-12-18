public class Book extends MediaObject {
    private int numPages;

    public Book(String title, int yearPublished, int numPages){
        super(title, yearPublished);
        this.numPages = numPages;
    }

    @Override
    public void printInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Copies: " + getCopies());
        System.out.println("Number of pages: " + numPages);
        if(getCopiesAvailable()>0){
            System.out.println("There are currently " + getCopiesAvailable() + " books checked in.");
        }
        else if(getCopies()>getCopiesAvailable()){
            System.out.println("There are currently " + (getCopies() - getCopiesAvailable()) + " books checked out by " + getCheckedOutPerson() + ".");
        }
    }
}
