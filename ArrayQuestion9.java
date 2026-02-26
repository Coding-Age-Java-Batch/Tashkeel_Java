package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayQuestion9 {
    static void main(String[] args) {
        ArrayList<Integer> Iist = new ArrayList<>();
        Iist.add(1);
        Iist.add(2);
        Iist.add(2);
        Iist.add(3);
        Iist.add(3);

        Set<Integer> set = new HashSet<>(Iist);

        ArrayList<Integer> list = new ArrayList<>(set);

        System.out.println("Input " + Iist);

        System.out.println("Output " + list);
    }

}
