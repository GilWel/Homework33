import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(13);
        list.add(156);
        list.add(130);
        list.add(10);
        list.add(180);
        list.add(170);
        list.add(150);

        Optional<Integer> result = list.stream()
                .map(x-> x+15)
                .filter(x-> x>50)
                .reduce (Integer::sum);


        System.out.println(result);

    }
}
