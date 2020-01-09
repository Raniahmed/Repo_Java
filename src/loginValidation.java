import java.util.Scanner;


//    /Homework:
//      * 1. Create a system that checks valid username and password
//       * And if they both are valid then only system displays homepage
//       * User can only try up to 5 times with invalid login details
//       * if it reaches 5 times then system should be locked for 10 min
//





    public class loginValidation {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            //Tell user to enter password
            System.out.println("Enter your username");
            String actualUsername = scan.nextLine();

            System.out.println("Enter your password");
            String actualPassword = scan.nextLine();

            String expectedUsername = "ferdous";
            String expectedPassword = "dhaka";

            for (int i = 1;i <=5;i++){

                if((!actualUsername.equals(expectedUsername)) || (!actualPassword.equals(expectedPassword))) {

                    int count = 5 - i;

                    System.out.println("you have" + "  " + count + "  " + "more tries");

                    System.out.println("Enter the valid username");
                    actualUsername = scan.nextLine();

                    System.out.println("Enter the valid password");
                    actualPassword = scan.nextLine();

                    if (i > 6) {

                        System.out.println("Your account will be locked for 10 min");
                    }
                }
                else {

                    System.out.println("Welcome to Home page");

                    break;
                }
            }

        }
    }


