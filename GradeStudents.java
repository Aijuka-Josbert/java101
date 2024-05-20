import java.util.Scanner;

public class GradeStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter student mark: ");
            int mark = scanner.nextInt();

            if (mark < 0) {
                System.out.println("Invalid mark. Please enter a positive number.");
                continue;
            }

            if (mark > 100) {
                System.out.println("Invalid mark. Please enter a number less than or equal to 100.");
                continue;
            }

            if (mark >= 90) {
                System.out.println("Grade: A");
            } else if (mark >= 85) {
                System.out.println("Grade: B+");
            } else if (mark >= 80) {
                System.out.println("Grade: B");
            } else if (mark >= 75) {
                System.out.println("Grade: C+");
            } else if (mark >= 70) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}
/*
 * import java.util.Scanner;

public class StudentGrader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the student's score (-1 to exit): ");
            int score = scanner.nextInt();
            
            if (score == -1) {
                System.out.println("Exiting...");
                break;
            }
            
            String grade = calculateGrade(score);
            System.out.println("Grade: " + grade);
        }
        
        scanner.close();
    }
    
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 85) {
            return "B+";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 75) {
            return "C+";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }
}
 */