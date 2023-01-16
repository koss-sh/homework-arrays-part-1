import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1_3();
    }

    public static void task1_3() {
        System.out.println("Задача 1");
        int[] first = new int[3];
        first[0] = 1;
        first[1] = 2;
        first[2] = 3;
        double[] second = {1.57, 7.654, 9.986};
        int[] third = {10, 15, 20, 15, 10};
        System.out.println("Задача 2");
        for (int i = 0; i < first.length; i++) {
            System.out.print(first[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < third.length; i++) {
            System.out.print(third[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = first.length - 1; i >= 0; i--) {
            System.out.print(first[i] + ", ");
        }
        System.out.println();
        for (int i = second.length - 1; i >= 0; i--) {
            System.out.print(second[i] + ", ");
        }
        System.out.println();
        for (int i = third.length - 1; i >= 0; i--) {
            System.out.print(third[i] + ", ");
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < first.length; i++) {
            int k;
            if (first[i] % 2 != 0) {
                k = first[i] + 1;
            } else {
                k = first[i];
            }
            first[i] = k;
        }
        System.out.println(Arrays.toString(first));
    }
}