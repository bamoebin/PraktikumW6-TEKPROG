package src.com.PaintingShapes;

abstract class Shape {
    String ShapeName;

    public Shape(String shapeName) {
        this.ShapeName = shapeName;
    }
    
    public abstract double area();
    
    @Override
    public String toString() {
        return "A shape with [shape of " + this.ShapeName + "]";
    }
}
