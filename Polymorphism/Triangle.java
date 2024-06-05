package Polymorphism;

class Triangle extends Shape {

    Triangle(double dim1, double dim2) {
      super(dim1, dim2);
    }

    double area() {
      return 0.5 * dim1 * dim2;
    }
  }