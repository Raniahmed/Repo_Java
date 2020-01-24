package examMid;

/*1)
         String myStatment = "I am a good programmer";
         Use string methods to do following tasks:
       1. Extract "Programmer" string from myStatement.
       2. Display the total number of words in the myStatement.
       3. replace all the 'r' characters with 'f' characters.
  2)
        Store your name in a string variable.
        Calculate the length of your name, without using length() method of String class.
  3)
        String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
        Verify if "JOHN" is present at index 1.*/
 /*4)
        Array:
        Store first names of 5 of your friends/colleagues in an array, and display the following in console:
        1. Length of that array
        2. Print name written on 3rd position (hint: 2nd index)
        3. Name of each friend/colleague
        4. Does name on 2nd position, start with "A"
        */


     /* -Extract sub string
        -String length calculation
        -Verification of array elements
        -Different operations on arrays*/

public class StringnArray {

    public static void main(String[] args) {

        //1//declare and initialize

        String myStatement = "I am a good Programmer";

        //Extract
        int indexOfP = myStatement.indexOf('P');
        String subString = myStatement.substring(indexOfP);

        //split my Statement
        String[] words = myStatement.split("");
        int totalNumOfWords = words.length;
        //replace
        String modifiedmystatement = myStatement.replace('r', 'f');


        //2//     Store your name in a string variable.
        //        Calculate the length of your name, without using length() method of String class.


        String myName = "Rani Ferdous";

        char[] chars = myName.toCharArray();

        int lengthOfmyname = 0;


        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != ' ') {

                lengthOfmyname++;
            }

            //an array of names
            String[] names = {"Mohammad", "John", "Michael", "Jordan", "Duane"};

            //operations
            int lengthOfArray = names.length;
            String aName = names[2];
            boolean isFirstCharacterA = names[1].startsWith("A");


            System.out.println("1).Extracted sub String : " + subString);
            System.out.println("2).Total number of words : " + totalNumOfWords);
            System.out.println("3).All the 'r' characters with 'f' characters : " + modifiedmystatement);
            System.out.println("4).The length of my name :" + lengthOfmyname);
            System.out.println("5). Length of the array: " + lengthOfArray);

            System.out.println("6). Name written on 3rd position: " + aName);

            System.out.println("7). Name of each friend/colleague: ");
            for (String name : names) {

                System.out.println(name);
            }

            System.out.println(" Does name on 2nd position, start with \"A\": " + isFirstCharacterA);

        }


    }

}


