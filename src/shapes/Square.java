package shapes;

public class Square extends Quadrilateral implements Measurable {

    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }
    @Override
    public double getPerimeter(){
        return 4 * side;
    }


    @Override
    public void setLength() {
        this.length = side;
        setWidth();
    }

    @Override
    public void setWidth() {
        this.width = side;
        setLength();
    }


}
