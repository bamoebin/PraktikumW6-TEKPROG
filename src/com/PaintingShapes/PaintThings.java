package src.com.PaintingShapes;

import java.text.DecimalFormat;

public class PaintThings {
    /**
     * @param args the command line arguments
     * Creates some shapes and a Paint object and prints the amount of paint needed to paint each shape
     */
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        // Instantiati the there shapes to paint
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        
        // Compute the amount of paint needed for each shape
        double deckAmt = paint.amount(deck);
        double ballAmt = paint.amount(bigBall);
        double tankAmt = paint.amount(tank);
                
        // Print the amount of paint for each
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
