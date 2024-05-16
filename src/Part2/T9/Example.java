package Part2.T9;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static final int maxItems = 100;

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        // Додавання елементів у список
        for (int i = 0; i < maxItems; i++) {
            items.add("Item " + i);
        }
    }
}