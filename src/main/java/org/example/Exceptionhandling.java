package org.example;

public class Exceptionhandling {

    public static void main(String[] args){
        int i =3;
        int j =0;
        int nums[] = new int[5];
        try {
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("the input index is out of the array size");
        }
        System.out.println(j);
        System.out.println("exception handling works");
    }
}
