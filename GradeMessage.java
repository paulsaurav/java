package decision_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("What is your letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        scanner.close();

        String message;

        switch (grade){
            case "A" :
                message = "Very good";
                break;
            case "B" :
                message = "Good";
                break;
            case "C" :
                message = "You need to work hard";
            default:
                message = "Invalid grade";

        }
        System.out.println(message);
    }
}
