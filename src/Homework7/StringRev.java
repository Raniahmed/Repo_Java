package Homework7;

public class StringRev {

/*  1. Reverse a string
       Eg: Input to method : Sample
          Output/Return from method : elpmaS*/


        public String getreverse(String Word){
            String word= "Sample";
            int len = word.length();
            String reversed = "";


            for (int i = 1;i<=len; i++) {
                reversed = reversed + word.charAt(len-i);

            }
            return reversed;


        }

    }
