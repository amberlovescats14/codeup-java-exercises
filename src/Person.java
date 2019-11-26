public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello %s", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //! MAIN
    public static void main(String[] args) {
        var amber = new Person("Amber");

        //z: true / false
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        //z: true - they are the same reference
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //z: if you set them equal to each other, and change one's name, it changes both
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

        //z:


    }
    //!
}
