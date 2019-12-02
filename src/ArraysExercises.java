import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        var arr = new ArraysExercises();
        arr.iterate();
        System.out.println(arr.addPerson(new Person("Dad")));
    }

    //! outside the main

    private static Person[] people = {new Person("Amber"), new Person("Cami"), new Person("Mom")};

    public void iterate(){
        for(Person peep : people){
            System.out.println(peep.getName());
        }
    }

    public static String addPerson(Person person){
            int length = people.length;
            Person[] copy = Arrays.copyOf(people, length+1);
            copy[length] = person;
            return Arrays.toString(copy);
    }


//    public Person[] addPerson(String name){
//            int length = people.length;
//            Person[] copy = Arrays.copyOf(people, length+1);
//            copy[length-1] = new Person(name);
//            return copy;
//    }



}
