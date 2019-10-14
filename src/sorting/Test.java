package sorting;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 5),
                new Duck("Howard", 1),
                new Duck("Loueie", 7),
                new Duck("Donald", 5),
                new Duck("Huey", 3)
        };

        System.out.println("Before starting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
