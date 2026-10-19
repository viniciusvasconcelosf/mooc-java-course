
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 0;
        double avg = 0;
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            }
            if (num > 0) {
                t = t + 1;
                avg = avg + num;
            }
        }
        if (t == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            avg = avg / t;
            System.out.println(avg);
        }
 
    }
}
 