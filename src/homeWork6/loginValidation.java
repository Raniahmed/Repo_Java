//Homework:
//        * 1. Create a system that checks valid username and password
//        * And if they both are valid then only system displays homepage
//        * User can only try up-to 5 times with invalid login details
//        * if it reaches 5 times then system should be locked for

package homeWork6;

import java.util.Scanner;

public class loginValidation {

    public static void main(String[] args) {

        Scanner newscan = new Scanner(System.in);

        int n = 5;
        int nOfTry = 1;
        int count = 0;
        boolean isMaximum = false;

        //takes input from console and storing the value into actualPassword variable


        System.out.println("Please enter your username");
        String Username = newscan.nextLine();

        System.out.println("Pleas enter your password");
        String Password = newscan.nextLine();

        String expectedUsername = "Ferdous";
        String expectedPassword = "dhaka";

        for (int i = 1; i <= n; i++) {

            count = n - nOfTry;

            if ((!Username.equals(expectedUsername)) || (!Password.equals(expectedPassword))) {
                //subtracting the count by iteration so user will have less tries (-1 every miss tries)

                if (nOfTry == n) {
                    isMaximum = true;
                    break;

                }


                System.out.println("you have" + "  " + count + "  " + "more tries");
                System.out.println();


                System.out.println("Enter the valid username again");
                Username = newscan.nextLine();

                //console message to user to enter valid password
                System.out.println("Enter the valid password");
                Password = newscan.nextLine();

                nOfTry++;

            } else {
                System.out.println("Welcome to homepage");
                break;

            }
        }
        if (isMaximum){

                    System.out.println(" Maximum attempts reached Your account will be locked for 10 min:");


                }
            }

        }


