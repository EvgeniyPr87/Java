package practicalWork_1;

import java.util.Scanner;

public class PracticTask {
    public static void main(String[] args) {

        //Task_1
        String word = "Какой то текст";
        String word2 = "текст";
        System.out.println(word);
        System.out.println(word2);

        //Task_2
        int prizes=15;
        int teaams=4;
        int total=prizes/teaams;
        int residue=prizes%teaams;

        //Task_3
        System.out.println("Количество целых призов: "+total);
        System.out.println("Осталось после раздачи: "+residue);

        System.out.println("Расчет стоимости товаров");
        Scanner priseConsol=new Scanner(System.in);
        System.out.println("Введите стоимость товара_1: ");
        double price1 =priseConsol.nextDouble();
        System.out.println("Введите стоимость товара_2: ");
        double price2= priseConsol.nextDouble();
        double sumPrice=price1+price2;
        System.out.println("Общая стоимость товаров: "+sumPrice);
        priseConsol.close();
        }

}
