
/*
1. Menu:
  boolean isGuestOneVegan = true;
  boolean isGuestTwoVegan = true;

  Are both vegan? only offer up vegan dishes.
  At least one vegan? make sure offer up some vegan options.
  Else, offer anything on the menu */


import java.util.Scanner;

public class Menu_Homework {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean isGuestOneVegan = false;
        boolean isGuestTwoVegan = false;

        System.out.println("Is Guest One Vegan: ");
        isGuestOneVegan = input.nextBoolean();

        System.out.println("Is Guest Two Vegan: ");
        isGuestTwoVegan = input.nextBoolean();


        if(isGuestOneVegan && isGuestTwoVegan){

            System.out.println("Vegetable Dishes only ");
        }
        else if (isGuestOneVegan || isGuestTwoVegan){

            System.out.println("Some Vegetarian Dishes");
        }
        else {

            System.out.println("Offer anything from the menu");
        }

    }
}






