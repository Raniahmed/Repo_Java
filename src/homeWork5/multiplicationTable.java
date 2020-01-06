package homeWork5;


import java.util.Scanner;


public class multiplicationTable {


    public static void main(String[] args) {

        //. Write a logic that prints multiplication table of the user provided number up to ten.


        Scanner in = new Scanner(System.in);
        System.out.print("Input a number:");
        int num1 = in.nextInt();
        for (int i = 0; i < 10; i++) {

            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }
}