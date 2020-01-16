package Homework7;

public class ReverseArray {
    /*2. Reverse an array (fyi: length of input array can vary)
     *        Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
     *              Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]*/



        public static void main(String[] args) {
            //    System.out.println(reverseArray());// im gettig stuck here
        }

        public static int[] reverseArray (int[] myArray){

            int[] array = {25, 15, 3, 2, 40};

            int arrayLength = myArray.length;

            int lastIndex = arrayLength - 1;

            int[] reversedArray = new int[arrayLength];

            for (int i = 0; i < arrayLength; i++) {

                reversedArray[i] = myArray[lastIndex - i];
            }

            return reversedArray;
        }
    }



