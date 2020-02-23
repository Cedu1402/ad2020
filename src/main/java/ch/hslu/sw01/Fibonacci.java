package ch.hslu.sw01;

import java.util.ArrayList;

public class Fibonacci {

    private ArrayList<Integer> fiboValues = new ArrayList<>();

    /**
     * Berechne N-te Fibonacci Zahl mit einer rekursiven implementation.
     */
    public static int fiboRec1(int number){
        if(number <= 1){  // Rekursionsbasis
            return number;
        }
        return fiboRec1(number - 1) + fiboRec1(number - 2); // Rekursionsvorschrift
    }

    /**
     * Berechne N-te Fibonacci Zahl mit einer rekursiven implementation. Optimierte Variante.

    public long fiboRec2(int number){
        if(number <= 1){ // Rekursionsbasis
            return fiboValues.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
        if(number <= 1){  // Rekursionsbasis
            return number;
        }
        fiboRec1(number - 1) + fiboRec1(number - 2); // Rekursionsvorschrift
    }*/

    /**
     * Berechne N-te Fibonacci Zahl mit einer iterativen implementation.
     */
    public static int fiboIter(int number){
        int fibo1 = 0;
        int fibo2 = 1;
        int result = 0;

        if(number <= 1){
            return number;
        }

        for(int i = 1; i < number; i++){
            result = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = result;
        }

        return result;
    }


}
