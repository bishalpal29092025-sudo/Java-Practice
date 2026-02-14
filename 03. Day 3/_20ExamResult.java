import java.util.Scanner;

public class _20ExamResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = { "Math", "Science", "English", "History", "Computer" };
        int total = 0;
        int numSubjects = subjects.length;

        System.out.println("--- Enter Marks for 5 Subjects (out of 100) ---");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print(subjects[i] + ": ");
            int marks = scanner.nextInt();
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Please enter marks between 0-100.");
                i--; 
                continue;
            }
            total += marks;
        }

        double percent = (double) total / numSubjects;

        System.out.println("\n--- Final Results ---");
        System.out.println("Total Marks: " + total + " / " + (numSubjects * 100));
        System.out.printf("Percentage: %.2f%%%n", percent);

        String grade;
        if (percent >= 90) {
            grade = "A (Excellent)";
        } else if (percent >= 75) {
            grade = "B (Distinction)";
        } else if (percent >= 60) {
            grade = "C (First Class)";
        } else if (percent >= 40) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail)";
        }
        System.out.println("Result Status: " + grade);
        scanner.close();
    }
}