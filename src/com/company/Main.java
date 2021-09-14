package com.company;

public class Main {

    public static void Fermat(int a, int b, int c, int n){
        if (n > 2 && Math.pow(a, n)+ Math.pow(b, n) == Math.pow(c, n)){
            System.out.println("Holy smokes, Fermat was wrong!");
        }else {
            System.out.println("No, that doesn't work");
        }
    }


    public static void main(String[] args) {
        Fermat(1,2,3,4);

    }
}
