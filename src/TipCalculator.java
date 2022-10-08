import java.text.DecimalFormat;

public class TipCalculator {

    DecimalFormat formatter = new DecimalFormat("#.##");

    private final int numPeople;
    private final int tipPercentage;
    private double totalBillBeforeTip;
    private double tip;
    private double totalBill;

    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public String getTotalBillBeforeTip() { return formatter.format(totalBillBeforeTip); }

    public int getTipPercentage() { return tipPercentage; }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public String tipAmount() {
        tip = totalBillBeforeTip * ((double)tipPercentage / 100);
        return formatter.format(tip);
    }

    public String totalBill(){
         totalBill = totalBillBeforeTip + tip ;
        return formatter.format(totalBill);
    }

    public String perPersonCostBeforeTip() {
        double costPerPersonBeforeTip = totalBillBeforeTip / numPeople;
        return formatter.format(costPerPersonBeforeTip);
    }

    public String perPersonTipAmount() {
        double costOfTipPerPerson = tip / numPeople;
        return formatter.format(costOfTipPerPerson);
    }

    public String perPersonTotalCost() {
        double costOfTotalPerPerson = totalBill / numPeople;
        return formatter.format(costOfTotalPerPerson);
    }
}
