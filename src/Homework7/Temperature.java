package Homework7;

public class Temperature {

    /*Homework part 2:
        convert below implementation to methods
//        Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit*/

        public static void main(String[] args) {
            System.out.println("its very cold");
            System.out.println("its hot");
            System.out.println(getConvertedcal2(200));


            // Fahrenheit to celcius
            double celcius = getConvertedCal(44);
            if (celcius < 0) ;
            //if (Kelvin>250);  //when i had comment out it turns red***

        }
        public static double getConvertedCal ( double farhenheit) {
            double celcius = (farhenheit - 32) * 5 / 9;
            return celcius;

        }
        //Celcius to Kelvin

          double Kelvin = getConvertedKel(48);
        public static double getConvertedKel ( double celsius){
            double Kelvin = (celsius + 273.15);
            return Kelvin;

        }

        //Kelvin2 to celcius2

          double celcius2 = getConvertedcal2(200);
        public static double getConvertedcal2(double kelvin2){
            double celcius2 =(kelvin2-273.15);
            return celcius2;

        }








    }

