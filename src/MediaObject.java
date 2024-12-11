import java.util.Scanner;

public abstract class MediaObject {
    Scanner scn =  new Scanner(System.in);
    private String title;
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
    public boolean getCheckedStatus(){
        return isCheckedIn;
    }
    public String getCheckedOutPerson(){
        return checkOutPerson;
    }
    public void checkOut(){
        System.out.print("Who's checking out the book: ");
        this.checkOutPerson = scn.nextLine();
        this.isCheckedIn = false;
    }
    public void checkIn(){
        this.checkOutPerson = null;
        this.isCheckedIn = true;
    }

    public abstract void printInfo();
}
