import java.util.ArrayList;
import java.util.Scanner;

public abstract class MediaObject {
    Scanner scn =  new Scanner(System.in);
    private String title;
    private int yearPublished;
    private int copies = 1;
    private int copiesAvailable;
    private ArrayList<String> checkedOutPeople = new ArrayList<>();

    public MediaObject(String title, int yearPublished){
        this.title = title;
        this.yearPublished = yearPublished;
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
    public void addCopy(){
        this.copies++;
    }
    public int getCopiesAvailable(){
        return copiesAvailable;
    }
    public ArrayList<String> getCheckedOutPerson(){
        return checkedOutPeople;
    }
    public void checkOutByName(String checkOutPerson){
        if (copies>this.checkedOutPeople.size()){
            this.checkedOutPeople.add(checkOutPerson);
        }
        this.copiesAvailable--;
    }
    public void checkIn(){
        this.checkedOutPeople = null;
        this.copiesAvailable++;
    }

    public abstract void printInfo();
}
