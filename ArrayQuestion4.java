package ArrayList;

public class ArrayQuestion4 {
    public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5};
                int evenCount = 0;
                int oddCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                System.out.println("Even = " + evenCount);
                System.out.println("Odd = " + oddCount);
            }
        }

