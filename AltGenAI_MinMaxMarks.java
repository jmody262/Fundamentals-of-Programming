
import java.util.Scanner;

public class AltGenAI_MinMaxMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of students: ");
        int count = input.nextInt();

        double[] scores = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter mark " + (i+1) + ": ");
            scores[i] = input.nextDouble();
            while (scores[i] < 0 || scores[i] > 30) {
                System.out.print("Invalid. Enter again: ");
                scores[i] = input.nextDouble();
            }
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double score : scores) {
            if (score < min) min = score;
            if (score > max) max = score;
        }

        System.out.println("Lowest Mark: " + min);
        System.out.println("Highest Mark: " + max);
    }
}
