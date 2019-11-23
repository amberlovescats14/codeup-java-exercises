import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(multiplyRecursion(8,10));

        askForNumber();
        System.out.println("3! = " + getFactorials(3));
        System.out.println("The highest factorial of a L is " + findTheHighestFactorial());
    }


// z   end main
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }
    //z: MULTIPLY
    public static int multiplication(int a , int b){
        return a * b;
    }
    public static int multiplyRecursion(int a, int b){
        if(a == 1) return b;
        return b + multiplyRecursion(a-1, b);
    }
    //z
    public static int division(int a, int b) throws IllegalAccessException {
        if(a == 0 || b == 0) throw new IllegalAccessException("Parameter cannot be 0");
        return a / b;
    }
    public static int modulus(int a, int b){
        return a % b;
    }

    //z: Valid Input recursion
    public static int validInput(int min, int max){
        Scanner scan = new Scanner(System.in)
                .useDelimiter("\n");
        int input = scan.nextInt();
        if(input >= min && input <= max) return input;
        System.out.println("Try again!");
        return validInput(1,10);
    }

    //z: FACTORIAL
    public static void askForNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10");
        int input = validInput(1,10);
        System.out.println("Would you like to continue?");
        if(scan.nextLine().equals("yes"))
            System.out.println(input +"! = " + getFactorials(6));
        else System.out.println("GoodBye.");
    }

    public static long getFactorials(int num){
        if(num == 1) return 1L;
        return (long)num * getFactorials(num -1);
    }

    //z: find the highest
    public static long findTheHighestFactorial(int num){
        String stringAnswer = String.valueOf(getFactorials(num));
        String max = String.valueOf(Long.MAX_VALUE);

        if(stringAnswer.length() > max.length()) return 0;
        return 1L + findTheHighestFactorial(++num) ;
    }
    //y: overload :: find the highest
    public static long findTheHighestFactorial(){
        return findTheHighestFactorial(1);
    }




}
