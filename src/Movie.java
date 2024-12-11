public class Movie extends MediaObject {
    private double runTime; // in mins

    public Movie(String title, double runTime){
        super(title);
        this.runTime = runTime;
    }

    @Override
    public void printInfo(){
        System.out.println("Title: " + getTitle());
        System.out.println("Movie Runtime: " + runTime);
        System.out.print("Movie is currently checked ");
        if (getCheckedStatus()){
            System.out.println("in.");
        }
        else{
            System.out.println("out by " + getCheckedOutPerson() + ".");
        }
    }
}
