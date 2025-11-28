import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        names.remove("Charlie");

        System.out.println("Final List: " + names);
    }
}