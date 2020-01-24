/* 6. Create a supermarket item finder
              Take input from user and based on the input, you should display user which aisle has the item
              For example: user enter milk, you program should say aisle 8. If the item is not found,
              display a message saying "Out of stock "Please create program for below requirement
                   Milk = Aisle Eight
                   Eggs = Aisle Eight
                   French Fries = Aisle seven
                   Candy = Aisle Three
                   Frozen Pizza = Aisle seven
                   Donuts = Aisle Eight
                   Diapers = Aisle One
                   Apple = Aisle two
                   Orange = Aisle two */

import java.util.Scanner;

public class Conditionalstatement6 {


        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            String item =null;

            System.out.println("Enter item name");
            item = input.nextLine();


            switch (item) {

                case "Milk ":
                case "Eggs ":
                case "Donuts":

                    System.out.println(item+"Is on Aisle Eight");
                    break;

                case "French fries":
                case "Frozen Pizza":

                    System.out.println(item + "Is on Aisle Seven");
                    break;

                case "Candy":
                    System.out.println(item + "Is on Aisle Three");
                    break;

                case "Diapers":
                    System.out.println(item + " is on Aisle One");
                    break;

                case "Apple":
                case "Orange":

                    System.out.println(item + "Is on Aisle Two");
                    break;
                default:
                    System.out.println(item + "Out of Stock");



            }

        }
    }

