import java.text.NumberFormat;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.print("Hello ");
//        System.out.print("World");
//
//        int myFavoriteNumber = 8;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "3.14159";
//        System.out.println(myString);
//
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
//
////        int x = 5;
////        System.out.println(x++);
////        System.out.println(x);
//    //z: this
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
////        String theNumberThree = "three";
////        Object o = theNumberThree;
////        int three = (int) o;
//
//        //! adding
//        int add = 4;
//        add+=1;
//        System.out.println("add, " + add);

        //! FORMATED STRING
        String name = "Amber";
        System.out.printf("Hello %s", name);
        System.out.println();

        int favorrite = 8;
        System.out.format("%s's favorite number is %d %n", name, favorrite);

        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String input = scan.nextLine();
        System.out.printf("Hello %s", input);
        System.out.println();


        //! Number FORMAT
        double money = 3.38;
       String formated = NumberFormat.getCurrencyInstance().format(money);
        System.out.println(formated);













    }
}
