package esg.itp.shape;


public class Square implements Polygon{


    float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float calcArea() {
      return side * side;
    }

    @Override
    public float calcPeri() {
        return 4*side;

    }

    @Override
    public void display() {

        System.out.println("area of the square = "+calcArea());
        System.out.println("perimeter of the square = "+calcPeri());
    }
}
