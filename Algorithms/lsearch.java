package Algorithms;

import java.util.*;

public class lsearch {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 21, 34, 45, 67, 78, 90 };
        int key = 78;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println(key + " is at " + index + "th Index");
        }
    }

}
