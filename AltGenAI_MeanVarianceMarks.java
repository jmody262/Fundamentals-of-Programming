
import java.util.Scanner;

public class AltGenAI_MeanVarianceMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of marks: ");
        int n = input.nextInt();

        double[] values = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Mark " + (i+1) + ": ");
            values[i] = input.nextDouble();
            while (values[i] < 0 || values[i] > 30) {
                System.out.print("Invalid mark. Try again: ");
                values[i] = input.nextDouble();
            }
            sum += values[i];
        }

        double mean = sum / n;
        double varianceSum = 0;

        for (int i = 0; i < n; i++) {
            varianceSum += (values[i] - mean) * (values[i] - mean);
        }

        double variance = varianceSum / n;

        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Variance: %.2f%n", variance);
    }
}
