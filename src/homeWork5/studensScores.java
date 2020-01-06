
package homeWork5;

import java.util.Scanner;

public class studensScores {


    //1.Students score, total possible score
    // 15/20 -> You got a C (75%)
    // A 90-100, B 80-89, C 70-79, D 60-69, F 0-59


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int studentScore = 0;
        int total = 0;
        int percentage = 0;
        char Grade = 0;
        System.out.println("Enter possible total score: ");
        total = input.nextInt();
        System.out.println("Students Score: ");
        studentScore = input.nextInt();
        percentage = (studentScore * 100 / total);

        if (percentage >= 0 && percentage <= 59) {

            Grade = 'F';
        } else if (percentage >= 60 && percentage <= 69) {

            Grade='D';

        } else if (percentage >= 70 && percentage <= 79) {
            Grade = 'C';

        } else if (percentage >= 80 && percentage <= 89) {
            Grade = 'B';

        } else if (percentage >= 90 && percentage <= 100) {

            Grade = 'A';
        } else {
            Grade=0;
        }
        if (Grade!=0){
            System.out.println(studentScore + "/" +total+ "-->" + "Your score  "  +  Grade +  "("  +  percentage + "%" + ")" );


        }else {
            System.out.println("not a valid Grade");
        }
    }
}