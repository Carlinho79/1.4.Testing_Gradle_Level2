package exercises;

import static org.assertj.core.api.Assertions.assertThat;

public class e3_Array {
    public static void demo() {

        int[] arr1 = {17, 423, 630, 4, 1055};
        int[] arr2 = {17, 423, 630, 4, 1055};
        int[] arr3 = {17, 423, 630, 4, 1056};

        assertThat(arr1).containsExactly(17, 423, 630, 4, 1055); // Exact content values and order
        assertThat(arr1).isEqualTo(arr2); // Same content objects
        assertThat(arr1).doesNotContain(1056); // Different content value
        assertThat(arr1).isNotEqualTo(arr3); // Different content objects
        System.out.println("Array comparison assertions passed.");
    }
}
