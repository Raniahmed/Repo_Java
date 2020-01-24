package Homework7;

/*8. Create abbreviation for any string
        Eg: Input to method : Outfit of the day ( or Good morning or Happy new year)
              Output/Return from method : OOTD ( or GM or HMY)*/


public class Abbreviation {


    //8. Abbreviation of a given string
    public String abbreviationOf(String myString) {

        //split the string into array of strings
        String[] words = myString.split(" ");

        //length of the array
        int len = words.length;

        //create an empty string
        String abbreviation = "";

        //extract the first character of each element and put it into string abbreviation
        for (int i = 0; i < words.length; i++) {

            abbreviation += words[i].charAt(0);
        }

        return abbreviation.toUpperCase();


    }
}
