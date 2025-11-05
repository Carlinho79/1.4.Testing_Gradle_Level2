package exercises;

import static org.assertj.core.api.Assertions.assertThat;

public class e2_Reference {
    public static void demo() {
        String s1 = "Hola";
        String s2 = s1;
        String s3 = new String("Hola");

        assertThat(s1).isSameAs(s2); // s1 and s2 reference the same object
        assertThat(s1).isNotSameAs(s3); // s1 and s3 reference different objects
        assertThat(s1).isEqualTo(s3); // s1 and s3 have the same value, although different references

        System.out.println("Reference assertions passed.");
    }
}
