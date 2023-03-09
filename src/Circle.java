public class Circle extends TwoDShape{
    public final double PI = Math.PI;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*PI;
    }

    public String toString(){
        return "Radius:" + radius;
    }
}
