import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Hello user. Welcome to the tip calculator. We hope you enjoy your stay.");

        System.out.println("How many people are in your group?: ");
        int numPeople = scan.nextInt();
        scan.nextLine();

        System.out.println("What is the tip percentage? Please type in a whole number without the percent symbol: ");
        int percentage = scan.nextInt();
        scan.nextLine();

        TipCalculator calc1 = new TipCalculator(numPeople, percentage);

        System.out.print("Enter a cost in dollars and cent format, or click -1 when you've finished entering them all in:  ");
        double onePrice = scan.nextDouble();
        scan.nextLine();
        while (onePrice != -1) {
            calc1.addMeal(onePrice);
            onePrice = scan.nextDouble();
            scan.nextLine();
        }



    }
}
