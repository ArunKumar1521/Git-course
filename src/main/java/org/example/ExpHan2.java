package org.example;

public class ExpHan2 {
    public static void main(String[] args) {
        int i = 36;
        int j = 0;
        try{
            j = 18/i;
            if (j==0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException e){
            j=18/1;
            System.out.println("Thats the default output");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }
        System.out.println(j);
    }
}
