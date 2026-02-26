import java.util.Scanner;

public class Cageb5First {

    public static void main(String[] args) {
        Scanner rahul = new Scanner(System.in);
        System.out.println("Enter your first no");

        int sumit = rahul.nextInt();

        System.out.println("Enter your second no");
        int amit = rahul.nextInt();
        int aman = sumit +amit;
        System.out.println("Sum of sumit and amit is"+aman);

    }
}
