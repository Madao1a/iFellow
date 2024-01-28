// Задача 1 - легкая:
// Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
// Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].


public class task1 {

    public static void main(String[] args) {
        int n = 0;
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];    
            }
            if (min > array[i]) {
                min = array[i];
            }
            avg += array[i]/array.length;
        }
        System.out.println("MAX " + max);
        System.out.println("MIN " + min);
        System.out.println("AVG " + avg);
    }


}