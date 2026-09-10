import java.util.*;
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        // super(message);
    }
}
class NoSubjectException extends Exception {
    NoSubjectException(String message) {
        super(message);
    }
}
public class StudentResult {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of subjects: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            int n = sc.nextInt();
            if (n == 0) {
                throw new NoSubjectException("No subjects entered");
            }
            int total = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid input");
                    return;
                }
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    throw new InvalidMarksException("Marks must be between 0 and 100");
                }
                total = total + marks;
            }
            double average = total / (double) n;
            System.out.println("Total marks: " + total);
            System.out.println("Average marks: " + average);
        }
    }
}
