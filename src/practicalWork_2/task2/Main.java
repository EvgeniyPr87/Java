package practicalWork_2.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2.Считать строку-пароль. Пройтись по ней циклом (без массивов и определить:
        //есть ли хотя бы одна цифра
        //есть ли хотя бы одна заглавная буква
        //сколько всего гласных (а, е, ё, и, о, у, ы, э, ю, я)
        //В конце вывести вердикт: «пароль надёжный» (если есть и цифра, и заглавная буква) или «слабый».

        System.out.println("Введите пароль");
        Scanner passConsole=new Scanner(System.in);
        String passwosd=passConsole.nextLine();

        boolean isDigit=false;
        boolean isUpper=false;
        int count=0;

      for(int i=0; i<passwosd.length(); i++){
          char c=passwosd.charAt(i);

          if(!isDigit && Character.isDigit(c)){
              isDigit=true;
              System.out.println("Цифра есть");
          }
          if(!isUpper && Character.isUpperCase(c)){
              isUpper=true;
              System.out.println("Есть заглавная буква");
          }

          String letters="аеёиоуыэюя";
          char lowerC=Character.toLowerCase(c);
          if(letters.indexOf(lowerC)!=-1){
              count++;
              //System.out.println(lowerC);
          }
      }
      System.out.println("Количество глассных: "+count);
        if(isDigit && isUpper){
            System.out.println("Пароль надежен");
        }else{
            System.out.println("Пароль слабый");
        }
    }
}
