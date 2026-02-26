package ArrayList;
import java.util.ArrayList;
public class ArrayQuestion6 {
        public static void main(String[] args) {
            ArrayList<String> languages = new ArrayList<>();
            languages.add("Java");
            languages.add("Python");
            languages.add("C++");

            System.out.println("After Adding: " + languages);
            languages.remove("Python");
            System.out.println("After Removing Python: " + languages);


            int index = languages.indexOf("C++");
            if (index != -1) {
                languages.set(index, "Go");
            }

            System.out.println("After Updating C++ to Go: " + languages);
        }
    }




