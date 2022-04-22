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
        System.out.println("Atribuição");
        //atribuicao();
        System.out.println("precedencia");
        //precedencia();
    }

    public static void prePos () {

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }



}
