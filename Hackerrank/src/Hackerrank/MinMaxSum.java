package Hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MinMaxSum {
 
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = arr[0]+arr[1]+arr[2]+arr[3];
        long max = arr[1]+arr[2]+arr[3]+arr[4];
        System.out.println(min + " " + max);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}