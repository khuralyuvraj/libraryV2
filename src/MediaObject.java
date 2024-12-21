import java.util.ArrayList;
import java.util.Scanner;

public abstract class MediaObject{
    private String title;
    private int yearPublished;
    private int copies;
    private int copiesAvailable;
    private ArrayList<String> checkedOutPeople = new ArrayList<>();

    public MediaObject(String title, int yearPublished){
        this.title = title;
        this.yearPublished = yearPublished;
        this.copies = 1;
        this.copiesAvailable = copies;
    }

    public String getTitle(){
        return title;
    }
    public int getPublishingYear(){
        return yearPublished;
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
        this.copiesAvailable++;
    }
    public int getCopiesAvailable(){
        return copiesAvailable;
    }
    public ArrayList<String> getCheckedOutPerson(){
        return checkedOutPeople;
    }
    public void checkOutByName(String checkOutPerson){
        if(copies>this.checkedOutPeople.size()){
            this.checkedOutPeople.add(checkOutPerson);
        }
        this.copiesAvailable--;
    }
    public void checkInByName(String person){
        this.checkedOutPeople.remove(person);
        this.copiesAvailable++;
    }

    public abstract void printInfo();
}
