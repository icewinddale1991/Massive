import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    public static void taskOne() {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        double[] fractions = {1.57, 7.654, 9.986};
        int[] primeNumbers = {90, 91, 93, 92, 85, 87, 84, 83, 0};


        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        System.out.print(numbers[0] + ", ");
        numbers[1] = 2;
        System.out.print(numbers[1] + ", ");
        numbers[2] = 3;
        System.out.print(numbers[2] + ".");
        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986};
        System.out.print(fractions[0] + ", ");
        System.out.print(fractions[1] + ", ");
        System.out.print(fractions[2] + ".");
        System.out.println();

        int[] primeNumbers = {90, 91, 93, 92, 85, 87, 84, 83, 0};
        System.out.print(Arrays.toString(primeNumbers));

        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[0] + ".");
        System.out.println();

        double[] fractions = {1.57, 7.654, 9.986};
        System.out.print(fractions[2] + ", ");
        System.out.print(fractions[1] + ", ");
        System.out.print(fractions[0] + ".");
        System.out.println();

        int[] primeNumbers = {90, 91, 93, 92, 85, 87, 84, 83, 0};
        System.out.print(primeNumbers[8] + ", ");
        System.out.print(primeNumbers[7] + ", ");
        System.out.print(primeNumbers[6] + ", ");
        System.out.print(primeNumbers[5] + ", ");
        System.out.print(primeNumbers[4] + ", ");
        System.out.print(primeNumbers[3] + ", ");
        System.out.print(primeNumbers[2] + ", ");
        System.out.print(primeNumbers[1] + ", ");
        System.out.print(primeNumbers[0] + ", ");
        System.out.println();


        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        int[] numbers = {2, 4 };
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(Arrays.toString(numbers));
        }
        }
    }
