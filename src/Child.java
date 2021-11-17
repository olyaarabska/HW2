public class Child {
    private String name;
    private Shape figure;

    public Child(String name, Shape figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getNameAndArea() {
        return String.format("Name %s Figure %s Area %s",
                name, figure.getClass().getName(), figure.getArea());
    }
}
