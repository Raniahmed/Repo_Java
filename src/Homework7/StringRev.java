package Homework7;

public class StringRev {

/*  1. Reverse a string
       Eg: Input to method : Sample
          Output/Return from method : elpmaS*/




        public static void main(String[] args) {
            System.out.println(method("Sample"));

        }
        public static String method(String name){
            String reversed = "";
            int stringLength = name.length();

            for (int i = name.length()-1; i >=0; i--) {
                reversed = reversed + name.charAt(i);

            }
            return reversed;


        }

    }
