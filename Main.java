import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
            "N40", "N36",
            "B12", "B6",
            "G53", "G49", "G60", "G50", "g64",
            "I26", "I17", "I29",
            "071");

        List<String> g = new ArrayList<>();

        // bingoNumbers.forEach(n -> {
        //     if (n.toUpperCase().startsWith("G")){
        //         g.add(n);
        //         // System.out.println(n);
        //     }
        // });

        // g.sort((String s1, String s2) -> s1.compareTo(s2));
        // g.forEach((String s ) -> System.out.println(s));

        bingoNumbers
            .stream()
            .map(String::toUpperCase)
            .filter(s->s.startsWith("G"))
            .sorted()
            .forEach(System.out::println);
    }
}