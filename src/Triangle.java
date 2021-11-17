public class Triangle extends Shape {

    private double side1;
    private double side2;
    private double angle;

    public Triangle(double side1, double side2, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.angle = angle;
    }

    @Override
    public double getArea() {
        return side1 * side2 * Math.sin(angle / 360.0 * 2 * Math.PI) / 2;
    }

}
