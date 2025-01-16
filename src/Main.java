import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void taskOne() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summ);
        System.out.println();
    }

    public static void taskTwo() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxSumm = -1;
        int minSumm = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSumm) {
                maxSumm = arr[i];
            }
            if (arr[i] < minSumm) {
                minSumm = arr[i];
            }
        }
        System.out.println("maxSumm = " + maxSumm);
        System.out.println("minSumm = " + minSumm);
        System.out.println();
    }

    public static void taskThree() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        double avSumm = (double) summ / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avSumm + " рублей");
        System.out.println();
    }

    public static void taskFour() {
        System.out.println("Задача 4");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        StringBuilder correctFullName = new StringBuilder();
        for (int i = 0; i < reverseFullName.length / 2 ; i++) {
            char temp = reverseFullName[reverseFullName.length -1 -i];
            reverseFullName[reverseFullName.length -1 -i] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        System.out.println(reverseFullName);
    }
}
