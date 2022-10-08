import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main (String[]args) {

        Scanner scan = new Scanner(System.in);
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
            System.out.print("Enter a cost in dollars and cent format, or click -1 when you've finished entering them all in: ");
            onePrice = scan.nextDouble();
            scan.nextLine();
        }

        System.out.println("--------------------------");
        System.out.println("Total Bill Before Tip: $" + calc1.getTotalBillBeforeTip());
        System.out.println("Tip Percentage: " + calc1.getTipPercentage());
        System.out.println("Total Tip: $" + calc1.tipAmount());
        System.out.println("Total Bill With Tip: $" + calc1.totalBill());
        System.out.println("Per Person Cost Before Tip: $" + calc1.perPersonCostBeforeTip());
        System.out.println("Tip Per Person: $" + calc1.perPersonTipAmount());
        System.out.println("Total Cost Per Person: $" + calc1.perPersonTotalCost());

        scan.close();
    }
}
