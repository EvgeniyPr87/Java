package practicalWork_2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3.Пользователь вводит радиус круга (double).
        //Вывести:
        //длину окружности;
        //площадь круга.

        System.out.println("Введите радиус окружности: ");
        final double PI=3.14;
        Scanner consolRadius =new Scanner(System.in);
        double radius=consolRadius.nextDouble();
        double l=2*radius*PI;
        l=Math.round(l*100.0)/100.0;
        double s=PI*Math.pow(radius,2);
        s=Math.round(s*100.0)/100.0;
        System.out.println("Длина окружности: "+l);
        System.out.println("Площадь круга: "+s);
    }
}
