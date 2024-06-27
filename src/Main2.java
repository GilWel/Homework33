import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


    }
}
