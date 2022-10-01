import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);

         System.out.println(concatStream.distinct().count());
    }
}