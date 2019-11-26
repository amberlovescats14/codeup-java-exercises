package util;

import java.util.Scanner;

public class Input {
   private Scanner scan = new Scanner(System.in);

   //! Get String
    public String getString(){
        System.out.print("Please enter a sentence:");
        return scan.nextLine();
    }

    //! YES OR NO
    public boolean yesNo(){
        System.out.print("Yes or No?");
        String input = scan.nextLine();
        if(input.equalsIgnoreCase("yes")) return true;
        else return false;
    }

    //! GET INT
    public int getInt(double min, double max){
        System.out.print("Please enter a number:");
        int num;
        while (true){
            num = Integer.parseInt(scan.nextLine());
            if(num > min && num < max) break;
            System.out.printf("Please enter a number between %d and %d", min, max);
        }
        return num;
    }

    public int getInt(){
        return getInt(0, 100);
    }

    //! DOUBLE
    public double getDouble(double min, double max){
        min = Double.parseDouble(String.valueOf(min));
        max = Double.parseDouble(String.valueOf(max));
        System.out.print("Please enter a decimal number: ");
        double input;
        while (true){

            input = Double.parseDouble(scan.nextLine());

            if(input > min && input < max) break;
            System.out.printf("Please enter a number between %s and %s: ", min, max);
        }
        return input;
    }

    public double getDouble(){
        return getDouble(0,100);
    }











}
