public class HomeworkDatatypes {

/*Homework.Primitive Datatype:
Print:
	The minimum legal age (in years) to purchase alcohol in USA.
	Average monthly salary of an automation engineer in NYC
	Distance between Earth and Moon in miles.
	The national debt of the United State in US dollars
	The interest rate in Chase bank? (use float to store value)
	In which datatype, you should store an item's price?
	Ans for "is your gender female?"
	Your name initials*/


    public static void main(String[] args) {

        byte minAge = 21;
        short averageSalery = 8650;
        int distanceBEarthMoon = 238855;
        long nationalDebt = 23050442180309L;
        float interestRate = 3.725f;
        double itemPrice = 49.99;
        boolean genderFemale = true;
        char nameInitials = 'F';

        System.out.println("Minimum legal age to purchase alcholo in USA is:  " + minAge);
        System.out.println("Average monthly salary of an automation engineer in NYC is:  " + averageSalery);
        System.out.println("Distance between Earth and Moon in miles is:  " + distanceBEarthMoon);
        System.out.println("The national debt of the United States in US dollars is:  " + nationalDebt);
        System.out.println("The interest rate in Chase bank is:  " + interestRate);
        System.out.println("store item price is :  " + itemPrice );
        System.out.println("is your gender female : " +  genderFemale);
        System.out.println("name initials : " + nameInitials);


    }
}
