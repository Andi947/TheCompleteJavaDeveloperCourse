package com.example.formulas;

/**
 * Created by Andrea on 2017/04/23.
 */
public class Series {
    public static int nSum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        return sum;   // return n*(n+1)/2
    }

    public static int factorial(int n) {
        // if(n==0){
        //    return 0;
        // }
        int factor = 1;
        for(int i=1; i<=n; i++){
            factor *= i;
        }
        return factor;  //
    }

    public static int fibonacci(int n){
        if (n == 0){
            return 0;
        } else if(n == 1 || n == 2){
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibo = 1;
        for(int i = 3; i <= n; i++){
            fibo = fibo1+fibo2; // Fib no. is sum og previous 2 Fib numbers
            fibo1 = fibo2;
            fibo2 = fibo;
        }
        return fibo;  // this is the fibonacci number
    }
}
