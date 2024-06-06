package Shape_problem;

public class Test {
    public static void main(String[] args) {
        Shape shape;

        shape = new Rectangle(10, 20);
        shape.area();

        shape = new Trieangle(20, 30);
        shape.area();

        shape = new Circle(3);
        shape.area();
    }
    
}
