public class basic {

    public static void main(String[] args) {
        char Grade = 'A';
        switch (Grade) {

            case'A':
                System.out.println("Excellent");
                break;

            case'B':
                System.out.println("Good");
                break;

            case'C':
                System.out.println("Well done");
                break;
            default:
                System.out.println("invalid grade");
        }
    }
}
