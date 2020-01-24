package Midturm;

/*
   1.   Create a method to return missing smallest positive integer (greater than 0) from given array.
        Example:
        For array : [1,3,5,4,2,7]
        Method should return : 6
        For array : [-1, -3, 4, 2]
        Method should return : 1
        For array : [0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2]
        Method should return : 6


   3.   Scenario: Traffic ticketing system
        1. Speed Limit = 70
        2. Every 5 miles over the speed limit will add 1 point
        3. Use Math.floor(1.4)to round the speed to downward value
        4. If user reaches 12 points then license is suspended
        Example:
        userspeed=78(70-75->1point)
        userspeed=88(70-75->1point,75-80->1point,80-85->1point ; total 3 points)*/




public class TestCode2 {
    public TestCode2() {

    }
    ////Traffic ticketing system
    public int MissingPositiveValue(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n) {
                if (arr[i] - 1 != i && arr[arr[i] - 1] != arr[i]) {
                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                    i--;
                }
            }
        }
        for (int i = 0; i < n; i++)
            if (arr[i] != i + 1)
                return i + 1;
        return n + 1;
    }

    //Traffic ticketing system

    public String trafficTicketingSystem(int speedLimit,int userSpeed) {
        int milesOver = userSpeed - speedLimit;
        int licensePoints = Math.floorDiv(milesOver, 5);
        String message = "";
        if (licensePoints > 1 && licensePoints < 12) {
            message = "You have a total of " + licensePoints + " points.";
        } else if (licensePoints >= 12) {
            message = "You have reached: " + licensePoints + " points. Your license will be suspended.";
        }
        return message;

    }
}
