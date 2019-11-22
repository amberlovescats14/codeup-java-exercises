import javax.swing.*;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //!WHILE
//        int i = 5;
//        while(i <= 15){
//            System.out.println("i: " + i );
//            i++;
//        }


        //! DO WHILE
//        int a = 0;
//        do {
//            System.out.println("a: " + a);
//            a+=2;
//        }while(a <= 100);

        //! FOR
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println("i: " + i);
//        }

        //! FIZZ BUZZ
//        for (int i = 0; i < 100; i++) {
//            System.out.print(i + ": ");
//            if(i % 3 == 0 ) System.out.print("Fizz");
//            if(i % 15 == 0) System.out.print("Buzz");
//            System.out.println();
//        }
        //! TABLE
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Please enter a number: ");
//        int number = scan.nextInt();
//        int start = 0;
//        System.out.println("Number  |  Squared  |  Cubed");
//        while(true){
//            int squared = (int)Math.pow(number, 2);
//            int cubed = (int)Math.pow(number, 3);
//            System.out.printf("%d%n | %d%n | %d%n", start, squared, cubed);
//            if(start >= number) break;
//            start++;
//        }
    //! LETTER GRADES
        Scanner scan = new Scanner(System.in);
        System.out.print("Numerical Grade: ");
        int grade = scan.nextInt();
//        if(grade >= 88 && grade <= 100) System.out.println("A");
//        if(grade >= 80 && grade <= 87) System.out.println("B");
//        if(grade >= 67 && grade <= 79) System.out.println("C");
//        if(grade >= 60 && grade <= 66) System.out.println("D");
//        else System.out.println("F");


        System.out.println(gradeAlph(grade));


    }

    public static String gradeAlph(int num){
        if(num >= 88 && num <= 100)
            if(num >= 94) return "A+";
            else return "A-";
        if(num >= 80 && num <= 87)
            if(num >= 81) return "B+";
            else return "B-";
        if(num >= 67 && num <= 79)
            if(num >= 73) return "C+";
            else return "C-";
        if(num >= 60 && num <= 66)
            if(num >= 60 ) return "D+";
            else return "D-";
        else return "F";
    }

}
