/*
*Куликов Павел
* домашнее задание
* использоание циклов, метод random()
 */

package Lesson3;

public class Main {
    public static void main(String[] args) {
        int[] arg = new int[20];

        for (int i = 0; i < arg.length; i++) {
            arg[i] = (int) (Math.random() * 20) + 1;
        }

        for (int x : arg) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("сумму элементов массива: " + countSum(arg));

        System.out.println((countSum(arg) % 2 == 0) ? "ЧЕТНО" : "НЕЧЕТНО");

    }

    /**
     * метод считает сумму элементов массива
     */
    public static int countSum(int[] args) {
        int sum = 0;

        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}
