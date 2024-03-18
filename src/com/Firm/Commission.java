package src.com.Firm;

public class Commission extends Hourly {
    private double totalSales;
    private double commRate;

    // Constructor 
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commRate = commRate;
    }
    
    public void addSales (double totalSales) {
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay() {
        double payment = super.pay() + (totalSales * commRate);
        
        totalSales = 0;
        
        return payment;
        
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nCurrent total sales = " + totalSales;
        return result;
    }
}
