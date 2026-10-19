
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String input2 = scanner.nextLine();
        System.out.println(input2.equals("true") ? "You got it right!" : "Try again!");
    }
}
