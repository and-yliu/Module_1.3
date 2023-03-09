public class Triangle extends TwoDShape implements Rotate{
    private double side1;
    private double side2;
    private double side3;
    private int angle = 0;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public Triangle(double width, double height){
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private double heronsHeight(){
        double constant = 2.0;
        double s = (side1 + side2 + side3)/ constant;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return (area * constant)/side2;
    }

    public double getArea(){
        double cons = 2.0;
        return (heronsHeight()*side2) / cons;
    }

    public String toString(){
        return "Height:" + heronsHeight();
    }

    @Override
    public void rotate90() {
        angle += 90;
        if(angle > 360){
            angle -= 360;
        }
    }

    @Override
    public void rotate180() {
        angle += 180;
        if(angle > 360){
            angle -= 360;
        }
    }

    @Override
    public void rotate(double degree) {
        angle += degree;
        if(angle > 360){
            angle -= 360;
        }
    }
}
