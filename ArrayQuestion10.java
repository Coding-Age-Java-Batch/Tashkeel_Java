package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayQuestion10 {
    static void main(String[]args) {
        ArrayList<Integer> numA = new ArrayList<>();
        numA.add(10);
            numA.add(20);
        ArrayList<Integer> numB = (ArrayList<Integer>) numA.clone();

        System.out.println("numA: " + numA);

        System.out.println("cloned numB " +numB);
    }
}
