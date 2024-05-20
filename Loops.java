import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner grades = new Scanner(System.in);

        System.out.print("Enter the child's grade: ");
        int grade = grades.nextInt();

        if (grade > 50) {
            System.out.println("The student passed with: " + grade);
        } else {
            System.out.println("The child failed");
        }
    }
}
/*
 * import java.util.Scanner;

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

 */