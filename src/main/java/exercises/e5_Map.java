package exercises;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class e5_Map {
    public static void demo() {
        Map<String, Integer> map = new HashMap<>();
        map.put("familia", 1);
        map.put("amigos", 2);

        assertThat(map)
            .containsKey("familia")
            .doesNotContainKey("desconocidos")
            .containsEntry("amigos", 2)
            .hasSize(2);

        System.out.println("Map assertions passed.");
    }
}
