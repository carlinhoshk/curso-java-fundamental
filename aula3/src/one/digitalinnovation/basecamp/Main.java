package one.digitalinnovation.basecamp;

/**
 * 23:14
 * 21/04/2022
 * aula 3 variaveis, tipos de dados e operadores aritimeticos.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritimético");
        aritimetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("precedencia");
        precedencia();
    }

    public static void prePos () {

        int k = 10;

        int i = ++k;     /* pega o k que vale 10 e aumenta +1 a cada repetição 1+10 = 11 */
        int j = k--;     /*  pega o k que vale 10 e -1 a cada repetição 1-10 = 9*/
        int x = k;       /*  pega o k e atribui seu valor a x assim valendo = 10*/

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }

    public static void aritimetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-b;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b " + r1);
        System.out.println("c-b " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a "+ r4);
        System.out.println("c%b " + r5);

    }


    public static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);

        i += 5; // i = i +5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" + i);

    }

    public static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("i++ + --j * k:" + a);

        System.out.println("i: " + i); // igual a 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        c *= i +=5; // c = 2 * i; i = i + 5 -> c = 2 * i; i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c *= i +=5: " + c);
    }


}
