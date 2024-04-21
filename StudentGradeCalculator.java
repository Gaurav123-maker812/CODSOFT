import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter marks obtained in Math: ");
        int Math = scanner.nextInt();
        
        System.out.println("Enter marks obtained in Physics: ");
        int Physics = scanner.nextInt();
        
        System.out.println("Enter marks obtained in Chemistry: ");
        int Chemistry = scanner.nextInt();
        
        System.out.println("Enter marks obtained in Computer: ");
        int Computer = scanner.nextInt();

        System.out.println("Enter marks obtained in Biology: ");
        int Biology = scanner.nextInt();

        int totalMarks = Math + Physics + Chemistry + Computer + Biology;
        double averagePercentage = totalMarks / 5.0;
        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}