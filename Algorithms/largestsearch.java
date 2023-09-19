package Algorithms;

public class largestsearch {
    public static int largestNumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; // largest value

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = { 21, 34, 45, 67, 34, 23, 56, 89 };

    }

}
