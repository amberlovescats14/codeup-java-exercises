import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        System.out.print("Server Name: ");
        var generator = new ServerNameGenerator();
        System.out.println(generator.getRandomVerb() + " " +generator.getRandomNoun());

    }
    private static String[] verb = {"fast", "nice", "hungry", "active", "smart", "happy", "healthy", "beautiful",
            "cunning", "driven"};
    private static String[] noun = {"mom", "dad", "river", "lake", "lipstick", "brush", "ant", "building", "chair",
            "desk"};
    private static int random = new Random().nextInt(10);

    public String getRandomVerb(){
        return verb[random];
    }
    public String getRandomNoun(){
        return noun[random];
    }
}
