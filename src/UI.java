import java.util.Scanner;

public class UI {

    private Scanner input;

    public UI() {
        input = new Scanner(System.in);
    }

    public String chooseTypeNumber() {
        System.out.println("\nchoose the type of numbers (complex or real):  c/r  ");
        if (input.next().equals("r")) {
            return "r";

        } else {
            return "c";
        }
    }

    public String chooseExitContue() {
        System.out.println("\nDo you want to contunue? Enter 'y'/'n' - yes/not ");
        String in = input.next();
        while (!(in.equals("y") || in.equals("n"))) {
            System.out.println("\nInput Error!\nDo you want to contunue? Enter 'y'/'n' - yes/not ");
            in = input.next();
        }
        return in;

    }

}

