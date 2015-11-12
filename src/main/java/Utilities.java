import java.util.List;
import java.util.stream.Collectors;

public class Utilities {

    public static List<String> toUpperCaseList(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static List<String> filterOutWordsGreaterThan4Chars(List<String> list) {
        return list.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());
    }

    public static List<String> flatten(List<List<String>> list) {
        return list.stream()
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());
    }

    public static int sumList(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
