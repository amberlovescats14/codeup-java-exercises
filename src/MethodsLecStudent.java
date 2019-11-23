public class MethodsLecStudent {
    public static void main(String[] args) {
        orderFood();
        favoriteSong();
        weeksIn();

    }
public static void orderFood(String food, int amount){
    System.out.printf("I would like %d %s's Please! %n", amount, food);
}
public static void orderFood(){
    orderFood("Kale", 10);
}
public static void orderFoord(String food){
    orderFood(food, 10);
}
public static void orderFood(int amount){
        orderFood("Kale", amount);
}

//z: favorite song
public static void favoriteSong(){
    System.out.println("My favorite song is Forever Young");
}
public static void weeksIn(){
    System.out.println("10 weeks");
}

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */

/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */


//  RECURSION

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number. This is the one you'll call in your main()

}