public class Cylinder {
    public static void main(String[] args) {
        Cylinders c1 = new Cylinders();
        c1.setRadius(7);
        c1.setHeight(10);
        System.out.println("Cylinder (setters):");
        System.out.println("Surface Area = " + c1.getSurfaceArea());
        System.out.println("Volume = " + c1.getVolume());
        Cylinders c2 = new Cylinders(5, 12);
        System.out.println("\nCylinder (constructor):");
        System.out.println("Surface Area = " + c2.getSurfaceArea());
        System.out.println("Volume = " + c2.getVolume());
        Rectangle r1 = new Rectangle();
        System.out.println("\nRectangle (default):");
        r1.printDetails();
        Rectangle r2 = new Rectangle(8, 6);
        System.out.println("\nRectangle (custom):");
        r2.printDetails();
    }
}
class Cylinders {
    private double radius;
    private double height;
    Cylinders() {}
    Cylinders(double r, double h) {
        radius = r;
        height = h;
    }
    public double getRadius() { return radius; }
    public void setRadius(double r) { radius = r; }
    public double getHeight() { return height; }
    public void setHeight(double h) { height = h; }
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
class Rectangle {
    private int length;
    private int breadth;
    Rectangle() {
        length = 4;
        breadth = 5;
    }
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    public void printDetails() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + (length * breadth));
    }
}