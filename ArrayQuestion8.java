package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayQuestion8 {
    static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        num.add("4");
        num.add("1");
        num.add("3");
        num.add("2");
        System.out.println("Original ArrayList: " + num);
        Collections.sort((num));
        System.out.println("sorted ArrayList " + num );

    }

}
