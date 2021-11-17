public class hw5 {

    public static void main(String[] args) {
        Child child1 = new Child("child1", new Circle(2));
        System.out.println(child1.getNameAndArea());
        Child child2 = new Child("child2", new Cylinder(6,5));
        System.out.println(child2.getNameAndArea());
        Child child3 = new Child("child3", new Rectangle(2,5));
        System.out.println(child3.getNameAndArea());
        Child child4 = new Child("child4", new Triangle(1,2,90));
        System.out.println(child4.getNameAndArea());
    }

}
