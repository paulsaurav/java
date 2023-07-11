package decision_structure;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("Enter the number of sales made by the employee");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();

        if ( sales >= quota){
            System.out.println("Congratulations, You have completed your goal");
        }

        else {
            int salesShort = quota - sales;
            System.out.println("You have not met the goal. You are behind by " + salesShort + " sales");
        }

        scanner.close();
    }
}
