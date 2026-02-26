package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayQuestion11 {
    public static void main(String[] args) {
        ArrayList<  Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        int True = 2;

        if (list.contains(True)) {
            int index = list.indexOf(True);
            System.out.print("Palindrome" + index);
        } else {
            System.out.print("Palindrome not found");

        }
    }
}

