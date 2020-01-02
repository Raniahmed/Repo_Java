package Technosoft2019;

/*
1. If customer has $1000 or more on the checking account and iPhone X is
Available on the inventory then display alert saying "You can goto store and purchase the iPhone"
2. If customer has credit score greater than 600 or customer has $1000
or more on checking account then display alert saying "You are eligible to purchase the phone",
3. if none of the above condition is not true then display alert saying "Your not eligible for iPhone
* */

public class Inventory {

    public static void main(String[] args) {

        int customerCheckingBalance = 1000;
        int iPhoneInventory = 10;
        int customerCreditScore = 700;

        if (customerCheckingBalance >=1000 && iPhoneInventory > 0) {
            System.out.println("You can purchase iPhone");
        }
        else if (customerCreditScore > 600 || customerCheckingBalance >= 1000) {
            System.out.println("You are eligible");
        }
        else {
            System.out.println("Your not eligible for iPhone");
        }

    }
}
