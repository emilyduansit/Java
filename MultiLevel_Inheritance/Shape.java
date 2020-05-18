public class Shape {
   public void what() { System.out.println("Shape ");}

   public static void main(  String[] args) {

        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();

       Shape[] shapes = {shape, rectangle , square, circle};
      for ( Shape s : shapes)
      {
         s.what();
      }

    }

}

 class Rectangle extends Shape {
   public void what() { System.out.println("Rectangle "); }
}

 class Square extends Rectangle {
}

 class Oval extends Shape {
   public void what() { System.out.println("Oval "); }
}

 class Circle extends Oval {
   public void what() { System.out.println("Circle ");}
}
