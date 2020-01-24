package Homework7;

public class ReverseArray {
    /*2. Reverse an array (fyi: length of input array can vary)
     *        Eg: Input to method : [25, 15, 3, 2, 40] or [20, 10, 44]
     *              Output/Return from method : [40, 2, 3, 15, 25] or [44, 10, 20]*/




    public int[] reverseArray(int[] myArray){

        //get the array length
        int arrayLength = myArray.length;

        //index of the last array element
        int lastIndex = arrayLength - 1;

        //create a new array
        int[] reversedArray = new int[arrayLength];

        //iterate over myArray[0...n-1], n is number of elements, in reverse direction,[n-1...0] and
        //put all the elements into reversedArray[0..n-1]
        for (int i = 0; i < arrayLength; i++){

            reversedArray[i] = myArray[lastIndex - i];
        }

        return reversedArray;
    }
    }



