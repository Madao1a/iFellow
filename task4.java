// Задача 4 посложнее:
// Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов. На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
// Расчет угла производить относительно реального поведения стрелок часов.

import java.util.Scanner;

// public class task4 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Введите переменную hours");
//         int H = Integer.parseInt(scanner.nextLine());
//         System.out.println("Ведите переменную minutes");
//         int m = Integer.parseInt(scanner.nextLine());


//     }
    
// }

public class task4 {
    public static void main (String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите переменную hours");
        int H = Integer.parseInt(scanner.nextLine());
        System.out.println("Ведите переменную minutes");
        int m = Integer.parseInt(scanner.nextLine());

        System.out.println(calc(H, m)+" градусов");
        scanner.close();
    }

    static int calc(double h, double m)
    {
        if (h <0 || m < 0 || h >12 || m > 60)
            System.out.println("Некорректные данные");
            
        if (h == 12)
            h = 0;
             if (m == 60)
       {
        m = 0;
        h += 1;
        if(h>12)
          h = h-12;
        } 
 
        int hour_angle = (int)(0.5 * (h*60 + m));
        int minute_angle = (int)(6*m);
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360-angle, angle);
        return angle;
    }

}
 