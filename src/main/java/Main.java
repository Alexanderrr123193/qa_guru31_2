
package org.example;

public class Main {
    public static void main(String[] args)
    {
        int x = 25;
        int y = 10;

        int g = -2147483648;
        int l = 2147483647;
// математические операторы
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
//Операторы сравнения
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);

        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println (!a);

        System.out.println (!a);

        // переполнение

        System.out.println (g * l);
// операции с int  и double
        int e = 10;
        double  i = 5.1;
        System.out.println(e + i);
        System.out.println(e - i);
        System.out.println(e * i);
        System.out.println(e / i);

    }
}