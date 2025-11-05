package exercises;

import model.e4_Animal;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class e4_Collection {
    public static void demo() {

        e4_Animal dog = new e4_Animal("Firulais");
        e4_Animal cat = new e4_Animal("Michín");
        e4_Animal lion = new e4_Animal("Van Dam");
        e4_Animal tiger = new e4_Animal("Chigris");

        List<e4_Animal> animals = new ArrayList<>(List.of(dog, cat, tiger));

        assertThat(animals)
            .hasSize(3)
            .containsExactly(dog, cat, tiger)
            .doesNotContain(lion)
            .allMatch(e4_Animal -> e4_Animal.getName().length() > 3)
            .filteredOn(o -> o.equals(dog))
                    .hasSize(1);

        System.out.println("Collection assertions passed.");
    }
}
