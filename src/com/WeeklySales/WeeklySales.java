package src.com.WeeklySales;

import java.util.Scanner;

public class WeeklySales {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[10];

        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);

        Sorting.insertionSort(salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff)
            System.out.println(s);

        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many staff data do you want to add? ");
        size = Integer.parseInt(scan.nextLine());
        salesStaff = new Salesperson[size];

        System.out.println("Enter the data");
        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter staff[" + i + "] first name: ");
            String first = scan.nextLine();
            System.out.println("\nEnter staff[" + i + "] last name: ");
            String last = scan.nextLine();
            System.out.println("\nEnter total sales staff[" + i + "]: ");
            int totalSales = Integer.parseInt(scan.nextLine());
            salesStaff[i] = new Salesperson(first, last, totalSales);
        }

        Sorting.insertionSort((salesStaff));

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
