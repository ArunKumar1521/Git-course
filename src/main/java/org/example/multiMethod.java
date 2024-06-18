package org.example;

public class multiMethod {

    public static void main(String[] args) {
        int result = add(1,2);
        System.out.println(result);
    }

    public static int add(int a,int b){
         int r = a+b;
         return multi(r);
    }

    public static int multi(int r){
        int r1 = r*8;
        return sub(r1);
    }

    public static int sub(int c){
        int r2 = c-2;
        return r2;
    }



}