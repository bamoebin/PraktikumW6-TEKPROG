package src.com.PaintingShapes;

public class Paint {
    private double coverage; // Number of aquare feet per gallon

    // Constructor: Sets up the paint object
    public Paint(double c) {
        coverage = c;
    }

    // Returns the amount of paint (number of gallons) needed to paint the shape
    // given as the parameter
    public double amount(Shape s) {
        //System.out.println("Computing amount for " + s); //ignored
        return s.area()/ coverage;
    }
}
