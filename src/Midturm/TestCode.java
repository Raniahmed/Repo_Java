package Midturm;

public class TestCode {

    public static void main(String[] args) {

        TestCode2 testCode = new TestCode2();

        int array1[] = {1,3,5,4,2,7};
        int n1 = array1.length;
        System.out.println("missing smallest positive integer:" +testCode.MissingPositiveValue(array1));
        int arr2[] = {-1, -3, 4, 2};
        int n2 = arr2.length;
        System.out.println("missing smallest positive integer:" +testCode.MissingPositiveValue(arr2));

        int arr3[] = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};
        int n3 = arr3.length;
        System.out.println("missing smallest positive integer:"+testCode.MissingPositiveValue(arr3));

        String result = testCode.trafficTicketingSystem(60,130);
        System.out.println((result));
    }
}











