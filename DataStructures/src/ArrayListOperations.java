import java.util.ArrayList;
import java.util.List;
public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>(List.of(55, 66, 77, 88));
        list3.add(100);
        list.add(1);
        list.add(22);
        list.add(3);
        list.addAll(list3);
        System.out.println(list);
    }
}
