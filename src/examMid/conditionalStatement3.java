package examMid;
import java.util.Scanner;

/*      Store a number in an int variable.
        if the number is divisible by 15
        Display "Divisible by 15"
        Otherwise
        Display the remainder you get when divide number by 15*/


public class conditionalStatement3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int remainder = 0;
        System.out.println("Enter your Number :");
        number = input.nextInt();
        remainder = number % 15;

        if (remainder == 15) {

            System.out.println("Divisible by 15");
        } else {

            System.out.println(number + "is not Divisible by 15");
            System.out.println("Remainder:" + remainder);


        }

    }
}