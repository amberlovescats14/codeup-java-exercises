package shapes;

import util.Input;

public class CircleApp {

    private Input input = new Input();

    public CircleApp() throws Exception {
        runApplication();
    }
    private void runApplication() throws Exception {
        double radius = askRadius();
        Circle circle = createCircle(radius);
        displayInfo(circle);
        askToContinue();
    }

    private double askRadius(){
        System.out.println("What is the radius of the circle?");
        return input.getDouble();
    }

    private void displayInfo(Circle circle){
        System.out.println("Area = " + circle.getArea());
        System.out.println("Circumference = " + circle.getCircumference());
    }

    private void askToContinue() throws Exception {
        System.out.println("Would you like to create another circle?");
        boolean answer;
        while (true){
            answer = input.getBoolean();
            if(!answer) break;
            runApplication();
        }
        System.out.println("Thank you. GoodBye.");
    }

    private Circle createCircle(double r){
        return new Circle(r);
    }




}
