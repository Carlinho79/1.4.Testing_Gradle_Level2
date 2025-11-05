package exercises;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class e7_Optional {
    public static void demo() {
        Optional<String> optional = Optional.empty();

        assertThat(optional).isEmpty();

        System.out.println("Optional assertions passed.");
    }
}
