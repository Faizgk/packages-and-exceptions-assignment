package esg.itp.shape;

public class Rectangle implements Polygon{

    float length;
    float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public float calcArea() {
        return length * breadth;
    }

    @Override
    public float calcPeri() {
        return 2*(length+breadth);

    }
    @Override
    public void display() {

        System.out.println("area of the Rectangle = "+calcArea());
        System.out.println("perimeter of the Rectangle = "+calcPeri());

    }
}