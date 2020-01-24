package examMid;
import java.util.Scanner;


/*4. Store your name in a variable.
if your name length comes out greater than 8
	Display your name after replacing all 'a' to 'A' from your name.
Otherwise
	Display your name in uppercase.*/


import java.util.Scanner;

public class conditionalState2 {
    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);
        String myname = null;
        int lengthOfName = 0;
        System.out.println("Input your Name :" );
        myname = inpute.nextLine();
        lengthOfName= myname.length();

        if(lengthOfName>8){

            myname=myname.replace('A','a');
            System.out.println("My name is :" + myname);
        }
        else {

            myname=myname.toUpperCase();
            System.out.println("My name is:" +myname);//i dont have any output
        }


    }
}
