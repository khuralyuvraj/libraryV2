import java.util.Scanner;

public abstract class MediaObject {
    Scanner scn =  new Scanner(System.in);
    private String title;
    private int yearPublished;
    private int copies;
    private boolean isCheckedIn = true;
    private String checkOutPerson;

    public MediaObject(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public int getCopies(){
        return copies;
    }
    public void addCopies(){
        this.copies++;
    }
    public boolean getCheckedStatus(){
        return isCheckedIn;
    }
    public String getCheckedOutPerson(){
        return checkOutPerson;
    }
    public void checkOutByName(String checkOutPerson){
        this.checkOutPerson = checkOutPerson;
        this.isCheckedIn = false;
    }
    public void checkIn(){
        this.checkOutPerson = null;
        this.isCheckedIn = true;
    }

    public abstract void printInfo();
}
