package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayExample {
    public static void main(String[] args) {

        ArrayList<String> num = new ArrayList<>();

        num.add("33");
        num.add("44");
        num.add("55");
        num.add("66");
        num.add("77");
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("sorted value is: " + num);



//        titles.add("Faiz");
//        titles.add("Acer");
//        titles.add("laptop");

//        titles.remove(2);
//
//        System.out.println("Updated List "+titles);
//

//        if (titles.contains("Tashkeel")) {
//            System.out.println("faiz is in list");
//        }
//        else{
//            System.out.println("tashkeel is not in list");
        }
    }

