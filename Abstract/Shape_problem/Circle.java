package Shape_problem;

public class Circle extends Shape {
    
    Circle(double r){
       super(r, r);
}

void area(){
    double result = Math.PI*dim1 * dim2;
    System.out.println("Triangle size: "+result);
}

}
