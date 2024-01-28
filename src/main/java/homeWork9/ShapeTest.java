package homeWork9;

public class ShapeTest {
        public static void main(String[] args) {
            Editor editor = new Editor();

            Circle circle = new Circle();
            Rectangle rectangle = new Rectangle();
            Triangle triangle = new Triangle();
            Line line = new Line();

            editor.drawShape(circle);
            editor.drawShape(rectangle);
            editor.drawShape(triangle);
            editor.drawShape(line);
        }
    }
