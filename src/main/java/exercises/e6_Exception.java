package exercises;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class e6_Exception {
    public static void demo() {

        assertThatThrownBy(() -> {
            int[] enteros = {1, 2, 3};
            int valor = enteros[5]; // This will throw ArrayIndexOutOfBoundsException
        }).isInstanceOf(ArrayIndexOutOfBoundsException.class);

        System.out.println("Exception assertion passed.");
    }
}
