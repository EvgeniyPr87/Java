package practicalWork_2.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4.Пользователь вводит температуру в градусах Цельсия (double).
//Перевести её в Фаренгейты по формуле:
//F = C * 9 / 5 + 32

        System.out.println("Укажите температуру /в градусах Цельсия/: ");
        Scanner temperatureConsole = new Scanner(System.in);
        double C = temperatureConsole.nextDouble();
        double F = C * 9 / 5 + 32;
        System.out.println("Температура /в градусах Фаренгейта/: "+F);

    }
}
