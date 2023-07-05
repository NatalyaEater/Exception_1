package org.example;
/*Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?*/
public class Task2 {

    public static void main(String[] args) {
        String[][] arr = {{"1","2","1","2","1"},{"1","2","1","2","1"},{"1","2","1","2","1"}};
        System.out.println(sum2d(arr));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {//ArrayIndexOutOfBoundsException: Запрашиваемый индекс должен совпадать с размерами массивов
            for (int j = 0; j < 5; j++) { //ArrayIndexOutOfBoundsException: Запрашиваемый индекс должен совпадать с размерами массивов
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
