package ClassLectures.nineteenthClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KnowGenerics {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");


        List<Integer> integers = new ArrayList<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        Map<String, Integer> map = new HashMap<>();

        map.put("shamaratun", 19);
        Integer saima = map.put("Saima", 18);
        Integer saima1 = map.put("Saima", 20);
        Integer saima2 = map.put("Saima", 22);

        System.out.println(saima);
        System.out.println(saima1);
        System.out.println(saima2);
        // System.out.println(map.get("Saima"));

    }
}
