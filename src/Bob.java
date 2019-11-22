import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte counter = 0;
        while(true){
            if(counter == 5 ) break;
            System.out.println("Speak to Bob");
            String input = scan.nextLine();
            System.out.println(response(input));
            counter++;
        }
    }
    public static String response(String str){
        if(str.endsWith("?")) return "Sure.";
        if(str.endsWith("!")) return "Whoa, chill out!";
        if(str.trim().equals("")) return "Fine. Be that way!";
        else return "Whatever.";
    }
}
