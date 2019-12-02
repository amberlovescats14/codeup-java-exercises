package movies;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        askQuestion();

    }

    static Movie[] movies = new MoviesArray().getArr();
    static Scanner scan = new Scanner(System.in);


    public static void askQuestion(){
        int action;
        System.out.println("What would you like to do");
        System.out.println("" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category");
        while(true){
            action = Integer.parseInt(scan.next());
            if(action >= 0 && action <= 5) break;
            System.out.println("Please enter a number between 1-5");
        }
        switch (action){
            case 0: goodbye();
            case 1: seeAll();
            case 2: getCategory("animated");
            case 3: getCategory("drama");
            case 4: getCategory("horror");
            case 5: getCategory("scifi");
        }
    }

    public static void goodbye(){
        System.out.println("Goodbye.");
    }

    public static void seeAll(){
        for(Movie movie : movies){
            System.out.println(movie.getName());
        }
    }

    public static void getCategory(String category){
        for(Movie movie : movies){
            if(movie.getCategory().equals(category)){
                System.out.println(movie.getName());
            }
        }
    }
}
