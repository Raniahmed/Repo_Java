package Homework7;

public class Average {

    /* 5. Find Average of a given array
                 Eg: Input to method : [20, 10, 40, 44]
                       Output/Return from method : 28.5*/


        public static double average(double a,double b,double c,double d) {
            double Average;
            Average = (a+b+c+d)/4;
            return Average;
        }

        public static void main(String[] args) {
            System.out.println(average(20,10,40,44));

        }
    }


