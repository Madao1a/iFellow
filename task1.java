// Задача 1 - легкая:
// Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
// Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].

// Задача 2 средняя:
// Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»


// Задача 3 посложнее:
// Напишите класс BaseConverter для конвертации из градусов по Цельсию в
// Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
// и делает конвертацию.
// При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты


// Задача 4 посложнее:
// Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов. На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
// Расчет угла производить относительно реального поведения стрелок часов.



public class task1 {

    public static void main(String[] args) {
        int n = 0;
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(n);
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
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }


}