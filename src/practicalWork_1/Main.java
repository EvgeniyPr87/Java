package practicalWork_1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("sout");
        System.out.println("sout");
        System.out.println("ctr+alt+l");
        System.out.print("1");
        System.out.println("Age" + 23);

        //переменные
        int a;
        a = 0;
        int scorePerson = 0;

        //однострочный коментарий

        /*
        Enter многострочный коментарий
         */

        //TODO починить

        //FIXME коментарий

        int b = 2 * 34 * a;
        int d = 5 % 2;
        d++;
        d--;

        String s = "text";
        String ss = " \"text в ковычках\"";
        String sd = " \n text в ковычках\n";
        String name = "hdbjhwdbdwkdhwidwbdwuduwdwud";
        int aa = name.length();
        System.out.println(name.length());
        System.out.println(name.toUpperCase());

        int r=1;
        int br=r;
        String str=""+r;
        String str2=String.valueOf(r);

        String as="123";
        int v=Integer.parseInt(as);

        byte bt;
        short sh;
        int it;
        long l;

        Scanner console = new Scanner(System.in);
        String name2= console.nextLine();
        int age=console.nextInt();
        System.out.println(name2+age);
        console.close();




        double c;
        String so = "Hello " + a;


    }
}