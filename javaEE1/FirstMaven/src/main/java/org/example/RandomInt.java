package org.example;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/21 4:33 下午
 */
public class RandomInt {
    public int randomInt(int min, int max) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        return (int) (Math.random() * (max - min)) + min;
    }

    public int randomInt(int max) {
        return randomInt(0, max);
    }
}
