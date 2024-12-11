public class Book extends MediaObject {
    private int numPages;

    public Book(String title, int numPages){
        super(title);
        this.numPages = numPages;
    }

    @Override
    public void printInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Number of pages: " + numPages);
        System.out.print("Book is currently checked ");
        if (getCheckedStatus()){
            System.out.println("in.");
        }
        else{
            System.out.println("out by " + getCheckedOutPerson() + ".");
        }
    }
}
