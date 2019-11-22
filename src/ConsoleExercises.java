import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//        System.out.println("=======");
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter 3 words:");
//
//        System.out.print("1: ");
//        String one = scan.nextLine();
//
//        System.out.print("2: ");
//        String two = scan.nextLine();
//
//        System.out.print("3: ");
//        String three = scan.nextLine();
//
//        System.out.printf("%s, %s, %s", one, two, three);
//        System.out.println();
//
//        System.out.println("Please enter a sentence:");
//        String answer = scan.nextLine();
//        System.out.println(answer);



        //! AREA OF CLASSROOM
//        Scanner scan = new Scanner(System.in);
//        System.out.println("-----Calculate Classroom----");
//
//        System.out.print("Length: ");
//        double length = scan.nextDouble();
//
//        System.out.print("Width: ");
//        double width = scan.nextDouble();
//
//        System.out.print("Height: ");
//        double height = scan.nextDouble();
//
//        double area = width * length;
//        System.out.println("Area: " + area);
//
//        double perimeter = (width * 2) + (length * 2);
//        System.out.println("Perimeter: " + perimeter);
//
//        double volume = length * width * height;
//        System.out.println("Volume: " + volume);

        //! DELIMITER :: only use .next()
        Scanner scan = new Scanner(System.in);
        //z: Starts with a or A and has one or more chars after that
        scan.useDelimiter("(A|a)[a-z]+");
        String firstD = scan.next();
        System.out.println("D1: " + firstD);
    }
}
