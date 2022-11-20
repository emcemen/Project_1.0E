package java_tasks;

import java.util.Arrays;

public class Week_7 {

//1. Array -- Find Maximum
//Write a method that can find the maximum number from an int Array
public static int min(int... arr) {

    int min = arr[0];

    for (int each : arr) {
        if (each < min) {
            min = each;
        }
    }
    return min;
}

//2. Array -- Find Minimum
//Write a method that can find the minimum number from an int Array

    public static int max(int... arr) {

        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

//3. Array -- Sort Ascending
//Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
public static int[] sortAscending(int... arr){


    int temp = 0;
    //System.out.println("Sorted array elements:");
    for(int i=0;i<arr.length;i++) {// Creating an outer for loop that ranges from 0 to array length
        for(int j=i+1;j<arr.length;j++) {  //Creating an inner for loop that ranges from i+1 to array length
            if(arr[i] > arr[j]) { // If first variable > second variable, then swap the two numbers using a temporary
                // variable
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

    }
return arr;
}



//4. Array -- Sort Descending
//Write a return method that can sort an int array in Descending order without using the sort method of the Arrays class

    public static int[] sortDescending(int... arr){

    int temp = 0;

    for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }//if code end
        }//inner loop ends

    }//loop ends
        return arr;
}// method ends




public static void main(String[] args) {


    System.out.println("min(13,4,5,2,4) = " + min(13, 4, 5, 2, 4));
    System.out.println("max(13,4,5,6,3,2,1,13) = " + max(13, 4, 5, 6, 3, 2, 1, 13));
    System.out.println("Arrays.toString(sortDescending(9,7,5,3,1)) = " + Arrays.toString(sortDescending(9, 7, 5, 3, 1)));
    System.out.println("Arrays.toString(sortDescending()) = " + Arrays.toString(sortDescending(1,3,5,7,9)));

}

}
