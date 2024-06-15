package org.example;

public class Exceptionhandling {

    public static void main(String[] args){
        int i =3;
        int j =0;
        try {
            j=18/i;
        }
        catch (Exception e){
            System.out.println("something went wrong "+e);
        }
        System.out.println(j);
        System.out.println("exception handling works");
    }
}
