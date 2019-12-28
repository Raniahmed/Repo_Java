public class temperatureHomework {

        public static void main(String[] args) {


            //Homework
//        Celsius to Kelvin
//        Celsius to Fahrenheit
//        Kelvin to Celsius
//        Kelvin to Fahrenheit

            //Celsius to Kelvin

            double Celsius = 0;
            double Kelvin = (Celsius + 273.15);
            System.out.println("The temperature of Kelvin:"  + (" ")+  Kelvin);

            //Celsius to Fahrenheit

            //Celsius = 5;
            double Fahrenheit =(Celsius * 9/5 + 32);
            System.out.println("The temperature of Fahrenheit :"  +(" ") + Fahrenheit);

            // Kelvin to Celsius

            double Kelvin2Celsius =(Kelvin-273.15);
            System.out.println("The Temperature of Calsius :"  + (" ")+ Kelvin2Celsius);

            // Kelvin to Fahrenheit


            double kelvin2Fahrenheit = (Kelvin * 9/5 - 459.67);
            System.out.println("The temperature of Fahrenheit :" +(" ")+  kelvin2Fahrenheit);
        }
    }
