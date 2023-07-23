package decision_structure;

import java.util.Scanner;

public class GradeMessage_SwitchExpressions {
    public static void main(String[] args) {
        System.out.println("What is your letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        scanner.close();

        String message = switch (grade){
            case "A" -> "Very good";

            case "B" -> "Good";

            case "C" -> "You need to work hard";
            default -> "Invalid grade";

        };
        System.out.println(message);
    }
}
