import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args){
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John",
                "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

        int first = first(times);
        System.out.println(names[first]);
    }

    public static int first(int[] array) {
        int num = array[0];
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                num = array[i];
                ind = i;
            }
        }
        return ind;
    }
}

