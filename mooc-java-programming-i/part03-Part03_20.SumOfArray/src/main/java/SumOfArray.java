
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        int i;
        int s = 0;
        for (i = 0; array.length > i; i++){
            s = s + array[i];
        }
        return s;
    }
}
