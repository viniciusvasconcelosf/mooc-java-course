public class Statistics {
 
    private int count;
    private int sum;
 
    public Statistics() {
        // initialize the variable numberCount here
    }
 
    public void addNumber(int number) {
        // write code here
        this.count = this.count + 1;
        this.sum = this.sum + number;
    }
 
    public int getCount() {
        return this.count;
    }
 
    public int sum() {
        return this.sum;
    }
 
    public double average() {
        double avg = 0.0;
        if (this.count != 0.0) {
            avg = 1.0 * this.sum / this.count;
        }
        return avg;
    }
}
 