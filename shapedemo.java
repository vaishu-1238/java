public class shapedemo{
      public static void main(String[] args) {
          Shape s=new Shape();
          s.result();
          Rectangle r=new Rectangle(5.0,2.0);
          r.result();
          r.area();
          Circle c=new Circle(4.0);
          c.result();
          c.area();
      }
  }
  class Shape{
      void result(){
          System.out.println("this is a generic shape");
      }
  }
  class Rectangle extends Shape{          double length,width;
          Rectangle(double length,double width){
              this.length=length;
              this.width=width;
          }
              @Override
      void result() {
          System.out.println("This is a rectangle.");
      }
          void area(){
              double area = length * width;
          System.out.println("Rectangle Area: " + area);
          }
      }
  class Circle extends Shape {
      double radius;
      Circle(double radius) {
          this.radius = radius;
      }
      @Override
      void result() {
          System.out.println("This is a circle.");
      }
      void area() {
          double area = Math.PI * radius * radius;
          System.out.println("Circle Area: " + area);
      }
    }