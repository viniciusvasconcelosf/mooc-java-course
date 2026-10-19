
import java.util.Scanner;
 
public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.valueOf(scanner.nextLine());
        int t = 0;
        while(t <= num) {
            System.out.println(t);
            t = t + 1;
        }
    }

}