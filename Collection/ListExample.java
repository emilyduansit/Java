import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List list = new ArrayList<>(List.of(1, 2));
        list.add(1,3);
        System.out.println(list);
    }
}

//output [1, 3, 2]