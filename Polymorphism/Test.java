package Polymorphism;

  class Test {
    public static void main(String[] args) {
      
      // Shape[] s = new Shape[3];

      // s[0] = new Shape();
      // s[1] = new Rectangle(10, 3);
      // s[2] = new Triangle(10, 20);

      // for (int i = 0;i<3; i++){
      //   System.out.println(s[i].area());
      // }


      
      Shape s = new Shape(0, 0);
      System.out.println("Shape Area: " + s.area());

      s = new Rectangle(10, 20);
      System.out.println("Rectangle Area: " + s.area());

      s = new Triangle(10, 20);
      System.out.println("Triangle Area: " + s.area());
    }
  }
