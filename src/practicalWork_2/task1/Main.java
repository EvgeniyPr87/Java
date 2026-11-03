package practicalWork_2.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Считать число N (пока N ≠ 0). Для каждого введённого числа вывести, чётное оно или нечётное,
// и остановиться, когда введён 0.

       System.out.println("Введите число: ");
        Scanner scanner=new Scanner(System.in);
       int N=scanner.nextInt();
        while (N!=0){
            if(N%2==0){
                System.out.println(N+" четное");

            }else {
                System.out.println(N+" не четное");
            }
            System.out.println("Введите число: ");
            N=scanner.nextInt();
        }
    }
}
