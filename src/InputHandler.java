import java.util.Scanner;

public class InputHandler {
    private static final Scanner scn = new Scanner(System.in);

    public static int getInt(String prompt){
        System.out.print(prompt);
        int userInt = scn.nextInt();
        scn.nextLine();
        return userInt;
    }
}
