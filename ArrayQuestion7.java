package ArrayList;

import java.util.ArrayList;

public class ArrayQuestion7 {
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<>();
        num.add("10");
        num.add("20");
        num.add("30");

        int search = 20;
        if (num.contains(search)) {
            int index = num.indexOf(search);
            System.out.print("Found at index " + index);
        } else {
            System.out.print("found at index 1");

        }
    }
}



