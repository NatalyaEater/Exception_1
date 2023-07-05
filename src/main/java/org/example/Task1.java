package org.example;
/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/
public class Task1 {
    public static int a(int num1, int num2) {
        if (num2==0) throw new ArithmeticException("Делить на ноль нельзя");
        return num1/num2;
    }

    public static int b(int[] array) {
        if(array.length<0) throw new NegativeArraySizeException("Отрицательная длина массива");
        return array.length;
    }
    public static int c(int[] array) {
        if( array.length<100) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        return array[100];
    }

}

