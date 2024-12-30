package ClassPracticeFiles.Class_30_12_2024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KnowGenerics {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("one");

        List<Integer> integers = new ArrayList<>();
        integers.add(1);

        Map<String, Integer> map = new HashMap<>();
        map.put("sharier", 25);
        System.out.println(map.get("sharier"));
    }
}
