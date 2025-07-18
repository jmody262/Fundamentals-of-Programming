
import java.util.Scanner;

public class MinMaxMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of marks: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of marks.");
            return;
        }

        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            while (marks[i] < 0 || marks[i] > 30) {
                System.out.println("Invalid mark, must be between 0 and 30.");
                System.out.print("Re-enter mark " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }
        }

        double min = marks[0];
        double max = marks[0];

        for (int i = 1; i < n; i++) {
            if (marks[i] < min) min = marks[i];
            if (marks[i] > max) max = marks[i];
        }

        System.out.println("Minimum mark: " + min);
        System.out.println("Maximum mark: " + max);
    }
}
