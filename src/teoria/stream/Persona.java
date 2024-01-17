package teoria.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public record Persona(int id, String nombre) {
}
class Test {
    public static void main(String[] args) {
        Persona[] personas = {new Persona(1, "juan"), new Persona(2, "luis"),
            new Persona(3, "felipe"), new Persona(4 , "abel"),
            new Persona(5, "amelia"), new Persona(6, "luisa")};
        System.out.println(personas);
        for (Persona persona : personas)
            System.out.println(persona);
        List<String> nombresPersona = Arrays.stream(personas)
                .map(Persona::nombre)
                .sorted(Comparator.reverseOrder())
                .toList();

        nombresPersona.forEach(System.out::println);

        Stream.iterate(15, numero -> numero + 3)
                .limit(15)
                .forEach(System.out::print);

    }
}
