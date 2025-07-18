
import java.util.Scanner;

public class MeanVarianceMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of marks: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of marks.");
            return;
        }

        double[] marks = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            while (marks[i] < 0 || marks[i] > 30) {
                System.out.println("Invalid mark, must be between 0 and 30.");
                System.out.print("Re-enter mark " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }
            sum += marks[i];
        }

        double mean = sum / n;
        double sumSquaredDiff = 0;

        for (int i = 0; i < n; i++) {
            sumSquaredDiff += Math.pow(marks[i] - mean, 2);
        }

        double variance = sumSquaredDiff / n;

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Variance: %.2f\n", variance);
    }
}
