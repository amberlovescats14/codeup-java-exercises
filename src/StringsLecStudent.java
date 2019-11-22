import java.util.Scanner;

public class StringsLecStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Please enter your name:");
        String input = sc.nextLine();
//        String first = sc.next();
//        String second = sc.next();
        String name = "Jane Doe";
        /*
         *  TO DO: Write the control statements below to check the input
         *  String using Java methods.
         */


        //  If the input is an exact match to String name...
        //  Print message: "Welcome Jane Doe!"
        if(input.equals(name)) System.out.printf("Welcome %s!", name);

        //  If the input is not capitalized correctly...
        //  Print message: "Names are proper nouns."
        if(input.startsWith("Jane")) System.out.println("good");
        if(input.endsWith("Doe")) System.out.println("good");



        //  If the input starts with "Jane"...
        //  Print message: "Hi Jane!"

        //  If the input ends with "Doe"...
        //  Print message: "Doe, a deer..."


        /*
         *  TO DO TOGETHER: Uncomment each line and view the results of each
         *  String manipulation method.
         */

//        System.out.println(name.charAt(3));
        //z: prints 'e

//        System.out.println(name.indexOf("Doe"));
        //z: prints 5 -- when the substring starts

//        System.out.println(name.lastIndexOf("e"));
        //z: 7

//        System.out.println(name.length());

//        System.out.println(name.replace("Doe", "Smith"));
//        System.out.println(name.substring(3));
//        System.out.println(name.substring(0,3));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());


        // trim is really useful for catching user errors on input.
//        String trimThis = "    too many spaces   ";

//        System.out.println(trimThis);
//        System.out.println(trimThis.trim());

        // How would we fix this?
//        System.out.println("Here is a backslash \");

    }
}