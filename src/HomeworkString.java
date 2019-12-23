import org.omg.CORBA.INTERNAL;

public class HomeworkString {


/*
1)
String myStatment = "I am a good programmer";
Use string methods to do following tasks:
	Extract "Programmer" string from myStatement.
	Display the total number of words in the myStatement.
	replace all the 'r' characters with 'f' characters.
2)
Store your name in a string variable.
Calculate the length of your name, without using length() method of String class.
3)
String[] names = {"Mohammad" , "John", "Ferdous" , "Abul" , "Ratna" , "Mareeha" , "Ruslan" , "Himani"};
Verify if "JOHN" is present at index 1.
4)
Array:
Store first names of 5 of your friends/colleagues in an array, and display the following in console:
    1. Length of that array
    2. Print name written on 3rd position (hint: 2nd index)
    3. Name of each friend/colleague
    4. Does name on 2nd position, start with "A"
 */
public static void main(String[] args) {

    String myStatement = "I am a good programmer";

    int len = myStatement.length();
    System.out.println("length:" + len);
    System.out.println("first char:" + myStatement.charAt(0));
    System.out.println("last char:" + myStatement.charAt(len-1));
    System.out.println(myStatement.charAt(12));

    String prog = myStatement.substring(12);
    System.out.println(prog);

    String mystatus = "I am a good programmer";
    String[] y = x.split(" ");
    System.out.println(y.length);


    String replacedString = myStatement.replace("r","f");
    System.out.println(replacedString);

    String a = "Ferdous Ara Nargis";
    System.out.printf("%d",a.length());

    String[]name = new String[8];
    name[0]= "Mohammed";
    name[1]= "John";
    name[2]= "Ferdous";
    name[3]= "Abul";
    name[4]= "Ratna";
    name[5]= "Maheera";
    name[6]= "Ruslen";
    name[7]= "Himani";

    int size = name.length;
    System.out.println("The Array length is:" + size);
    System.out.println(name[1]);




    boolean index1 = true;
    System.out.println("john is present:" + index1);

   String[] friend = new String[5];
    friend[0] = "Monika";
    friend[1] = "Tania";
    friend[2] = "Hira";
    friend[3] = "Rubi";
    friend[4] = "Lipi";
    
    int Size = friend.length;
    System.out.println(friend.length);

    System.out.println(friend[2]);


   /*String colleague = "Monika\" Tania \"Hira \" Rubi \" Lipi";
    System.out.println(colleague);

    String[]word = colleague.split(" ");
    for (String words : word );{
        System.out.println(colleague);*/

        boolean isEquals = friend[1].startsWith("A");
    System.out.println(isEquals);
    }








}

