public class TipCalculator {

    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;
    private double tip;
    private double totalBill;

    public TipCalculator(int numPeople, int tipPercentage){
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() { return totalBillBeforeTip; }

    public int getTipPercentage() { return tipPercentage; }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        tip = totalBillBeforeTip * (tipPercentage / 100);
        return tip;
    }

    public double totalBill(){
         totalBill = totalBillBeforeTip + tip ;
        return totalBill;
    }

    public double perPersonCostBeforeTip() {
        double costPerPersonBeforeTip = totalBillBeforeTip / numPeople;
        return costPerPersonBeforeTip;
    }

    public double perPersonTipAmount() {
        double costOfTipPerPerson = tip / numPeople;
        return costOfTipPerPerson;
    }

    public double perPersonTotalCost() {
        double costofTotalPerPerson = totalBill / numPeople;
        return costofTotalPerPerson;
    }
}
