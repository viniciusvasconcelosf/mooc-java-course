
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        double avg = 0;
        while(true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0) {
                break;
            }
            t = t + 1;
            avg = avg + num;
        }
        avg = avg/t;
        System.out.println("Average of the numbers: " + avg);
 
    }
}