package Homework7;

/*10. Given two arrays, one contains total marks of 11 students of a class; second array contains their names in same order as marks-array.
        *     double[] sMarks = {90, 89, 91, 67, 87, 88, 93, 90, 100, 81, 54};
        *     String [] sNames = {"Happy", "Peace" , "Jesse", "Kaitlin" , "Amir", "Donald", "Steven", "Vicky", "Hannah" , "David", "Gia"};
        *     Create a method which takes both array as parameters, and returns name of student who scored maximum marks in the class.
        *     For above example : method should return "Hannah"*/


public class maxScore {

    public String getMaximumScore(double[] marks, String[] name) {

        double max = marks[0];
        int Index = 0;
        String getmaxSc = null;

        for (int i = 1; i < marks.length; i++) {

            if (marks[i] > max) {
                max = marks[i];
                Index = i;

            }
        }
            getmaxSc = name[Index];
            return getmaxSc;


        }
    }




