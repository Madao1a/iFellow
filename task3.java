// Задача 3 посложнее:
// Напишите класс BaseConverter для конвертации из градусов по Цельсию в
// Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
// и делает конвертацию.
// При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты

import java.util.Scanner;

public class task3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение температуры в градусах Цельсия");
        double n = Double.parseDouble(scanner.nextLine());
        System.out.println("Выберите единицу измерения температуры для конвертации, введите цифру 1 - Кельвины, 2 - Фаренгейты");
        double m = Double.parseDouble(scanner.nextLine());
        if (m == 1) {
            Celvin(n);
        }
        if (m==2) {
            Fara(n);
        }

    }

    static void Celvin(double n){
        double K;
        K = n +  273.15;
        System.out.println(K + " K");
    }

    static void Fara(double n){
        double F;
        F = n*1.8+32;
        System.out.println(F + " F");
    }


}
