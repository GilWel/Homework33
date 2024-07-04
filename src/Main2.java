import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


import static java.util.stream.Collectors.toList;


public class Main2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("честность");
        strings.add("ориентация");
        strings.add("восьмиклассница");
        strings.add("удовлетворительно");
        strings.add("словосочетание");
        strings.add("ответственность");
        Optional<Integer> result = strings.stream()
                .map(str -> str.length())
                .filter(x -> x < 15)
                .max(Integer::compareTo);
        System.out.println(result);

        Optional<String> string = strings.stream()
                .filter(str -> (str.length() < 15))
                .max(Comparator.comparing(String::length));

        System.out.println(string);


    }
}
