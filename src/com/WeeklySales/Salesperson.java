package src.com.WeeklySales;

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    // Constructor: Sets up the sales person object with the given data
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    @Override
    // Returns the sales person as a string
    public String toString() {
        return getLastName() + ", " + getFirstName() + ": \t" + getSales();
    }

    @Override
    // Returns true if the sales people have the same name
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    @Override
    // Order is based on total sales with the name (last, then first) breaking a tie
    public int compareTo(Object other) {
        Salesperson otherSalesperson = (Salesperson) other;

        int salesComparison = Integer.compare(totalSales, otherSalesperson.totalSales);

        if (salesComparison != 0) {
            return salesComparison;
        } else {
            int lastNameComparison = lastName.compareTo(otherSalesperson.lastName);
            if (lastNameComparison != 0) {
                return lastNameComparison;
            } else {
                return firstName.compareTo(otherSalesperson.firstName);
            }
        }
    }

    // First name accessor
    public String getFirstName() {
        return firstName;
    }

    // Last name accessor
    public String getLastName() {
        return lastName;
    }

    // Total sales accessor
    public int getSales() {
        return totalSales;
    }
}
