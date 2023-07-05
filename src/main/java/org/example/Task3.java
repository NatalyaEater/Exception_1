package org.example;
import java.util.Arrays;

/* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(exceptionArrays(new int[]{2,2,2,2}, new int[]{1,0,1,0})));
    }

    public static int[] exceptionArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длина массивов не равна");
        }
        int[] result = new int[arr1.length];
        for (int i =0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }


}
