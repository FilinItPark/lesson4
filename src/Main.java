import java.util.Random;
import java.util.Scanner;

/**
 * @author 1ommy
 * @version 20.08.2023
 */
public class Main {

    enum CrissAndCross {
        CRESTIK('X'),
        NOLIK('0');

        char symbol;

        CrissAndCross(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }

        @Override
        public String toString() {
            return new String(String.valueOf(symbol));
        }
    }

    public static void main(String[] args) {

        char krestik = 'X';
        char nolik = 'O';

        String data = "Qwerty1234";

        char[] charArray = new char[10];
        Random random = new Random();

        System.out.println(CrissAndCross.CRESTIK);

/*

        for (int i = 0; i < 10; i++) {
            charArray[i] = data.charAt(i);
        }

        for (char el : charArray) {
            System.out.println(el);
        }
*/

     /*   int[] array = new int[600];
        int[] array2 = new int[600];

        Random random = new Random();

        for (int i = 0; i <= 599; i++) {
            array[i] = random.nextInt(100);
            array2[i] = array[i];
        }

        for (int i = 0; i <= 599; i++) {
            System.out.println(array[i]);
        }
//        System.out.println("-----");
        long start1 = System.nanoTime();
        int max = -1;
        int min = 101;
        for (int element : array2) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        long end1 = System.nanoTime();
        System.out.println("Отработало за " + (end1 - start1) + " нс");

//        System.out.println(String.format("max=%d, min=%d", max, min));
        long start = System.nanoTime();
        Arrays.sort(array);
        long end = System.nanoTime();
        System.out.println("Отработало за " + (end - start) + " нс");

        System.out.println(String.format("max=%d, min=%d", array[array.length - 1], array[0]));*/


 /*       Scanner scanner = new Scanner(System.in);
        int n = 3;
        int m = 3;

        int sum = 0;
        int[][] array = {{1, 9, 14}, {5, 7, 13}, {12, 11, 10}};

*//*
        for (int i = 0, j = m - 1; i < n && j >= 0; i++, j--) {
            sum += array[i][j];
        }*//*


//        int count = 0;
//        // среднее арифмитическое - сумма чисел деленная на их количество
//        double sum = 0;
//
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) sum += array[i][j];
            }
        }
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i == j) sum += array[i][j];
//            }
//        }

        System.out.println(sum);*/

    }
}