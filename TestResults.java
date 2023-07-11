package decision_structure;

import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        System.out.println("Enter your test score");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        char grade;
        if (score < 33){
            grade = 'F';
        }
        else if (score <= 45) {
            grade = 'C';
        }
        else if (score <= 60) {
            grade = 'B';
        }
        else if (score <= 70) {
            grade = 'A';
        }
        else {
            grade = 'V';
        }

        System.out.println("Your grade is " + grade);
    }
}
