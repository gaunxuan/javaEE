package club.bauyan;

import org.example.RandomInt;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        RandomInt randomInt = new RandomInt();
        for (int i = 0; i < 20; i++) {
            System.out.println("第" + i + "输出的值是：\t" + array[randomInt.randomInt(array.length)]);
        }

    }
}
