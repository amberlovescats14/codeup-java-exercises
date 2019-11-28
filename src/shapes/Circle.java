package shapes;

public class Circle {

    private double radius;
    private double pi = Math.PI;

    //z: constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 6;
    }

    //z: AREA
    public double getArea(){
        double area = pi * Math.pow(radius, 2);
        return Math.floor(area * 100) /100;
    }
//    new DecimalFormat("#.##").format(pi * Math.pow(radius, 2));

    public double getCircumference(){
        double area = 2 * pi * this.radius;
        return Math.floor(area * 100)/100;
    }

    //z: getter and setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //z: toString
    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
