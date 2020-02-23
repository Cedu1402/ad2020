package ch.hslu.sw01;

public class Ackermann {

    public static long calculate(long n, long m){
        // Rekursionsbasis
        if(n == 0){
            return m + 1;
        }
        // Rekursionsvorschrift
        if(m == 0){
            return calculate(n - 1 , 1);
        }
        return calculate(n -1, calculate(n, m-1));
    }

}
