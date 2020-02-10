package Homework8;
/* Build a printer
        * User can set toner level range between 0 to 100 (toner level cannot be greater than 100)
        * User should be able to see number of page printed
        * User should be able to print both sided (Note: in that case printed page should calculated correctly)
        * User can view current toner level at anytime
        * single page == single toner level; (Example: Toner = 100, printed page = 20, updated toner = 80)
        * If toner reaches < 1, then print "Low Toner, Please add more toner"
        * Max pages can be printed == 100;*/


public class Printer {

    private String name;
    private double tonerLevel = 100;
    private int amountOfPaper;
    private int numberOfPagesPrinted;
    private boolean isdoubleSided;

    public Printer(String name, double tonerLevel, int ammountOfPaper, boolean isDoubleSided) {
        this.name = name;
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
    }
}

//
//    // calculate the number of physical pages we have toner to print
//    int tonerPages = tonerLevel * isdoubleSided ? 1 :  2;
//    // calculate the number of physical pages we need.
//    int physicalPagesRequired = isdoubleSided ? (int) Math.ceil((double) numberOfPagesPrinted / 2) : numberToPrint;
//
//    // calculate the number of physical pages that will actually be printed.
//    int actualPagesPrinted = Math.min(tonerLevel,physicalPagesRequired, amountOfPaper);
//
//// Update printer state.
//    tonerLevel -= actualPagesPrinted / 2;
//    amountOfPaper -= actualPagesPrinted;
//
//    if(tonerLevel == 0) {
//            System.out.println("Out of toner");
//        }
//        if(ammountOfPaper == 0) {
//            System.out.println("Out of Paper");
//        }
//
//    }
//
