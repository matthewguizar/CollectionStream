import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
        System.out.println("-------------------------------");
         System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

                System.out.println("---------------------------");

        Employee matt = new Employee("Matte Azul", 26);
        Employee name = new Employee("Name", 30);
        Employee blue = new Employee("Azule Blue", 40);
        Employee random = new Employee("Skull Krusher", 13);

        Department hr = new Department("Human Resources");
        hr.addEmployee(random);
        hr.addEmployee(blue);
        hr.addEmployee(name);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(matt);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
            .flatMap(department -> department.getEmployees().stream())
            .forEach(System.out::println);
        System.out.println("---------------------------");
        // List<String> sortedGNumbers = bingoNumbers
        //         .stream()    
        //         .map(String::toUpperCase)
        //         .filter(s -> s.startsWith("G"))
        //         .sorted()
        //         .collect(Collectors.toList());

          List<String> sortedGNumbers = bingoNumbers
                    .stream()
                    .map(String::toUpperCase)
                    .filter(s -> s.startsWith("G"))
                    .sorted()
                    .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedGNumbers) {
            System.out.println(s);
        }
    }   
}