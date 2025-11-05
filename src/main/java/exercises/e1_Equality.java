package exercises;

import org.junit.jupiter.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;


public class e1_Equality {
    public static void demo() {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        assertThat(a).isEqualTo(b); // true, same value
        assertThat(a).isNotEqualTo(c); // true, different value

        System.out.println("Equality and unequality assertions passed.");
    }
}
