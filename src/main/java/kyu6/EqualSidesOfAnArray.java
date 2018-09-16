package kyu6;

import java.util.Arrays;

public class EqualSidesOfAnArray {
    public static int findEvenIndex(int[] arr) {

        int sumLeftSide = 0;
        int sumRightSide = 0;

        for (int i = 0; i < arr.length; i++) {

            sumLeftSide += arr[i];
            sumRightSide = 0;

            for (int j = i+2; j < arr.length; j++) {

                sumRightSide += arr[j];
            }

            if(sumLeftSide == sumRightSide){
                return i+1;
            }
        }

        return -1;
    }

    public static int findEvenIndex2(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;
        for (int i = 1; i < arr.length; i++) {
            sumLeft += arr[i-1];
            sumRight -= arr[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}
