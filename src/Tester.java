public class Tester {
    public static void main(String[] args) {
        Triangle triangle= new Triangle(1,1,90);
        System.out.println(triangle.getArea());

        Circle round = new Circle(5);
        System.out.println(round.getArea());

        Rectangle rectangle= new Rectangle(2,5);
        System.out.println(rectangle.getArea());

        Cylinder cylinder = new Cylinder(6, 5);
        System.out.println(cylinder.getArea());
    }
}
