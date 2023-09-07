package cvicenie1;
import java.util.Scanner;  // Import the Scanner class

public class Stringy {
    // TODO: 1.
    public static String getReversedString(String str) {
        StringBuilder stbuilder = new StringBuilder(str);
        System.out.println(stbuilder.reverse());
        return str;
    }

    // TODO: 2.

    // TODO
    public void metodka(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write something: ");

        String s = scanner.nextLine();

        System.out.println("Your input: " + s);
    }
}
