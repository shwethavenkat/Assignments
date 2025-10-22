public class Sorting {
    public static void main(String[] args) {
        // Given values
        int[] arr = {12, 34, 11, 36, 87, 98, 93};

        // Initialize variables for largest, second largest, and third largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Iterate through the array to find the largest, second largest, and third largest
        for (int num : arr) {
            if (num > largest) {
                // Update all three when a new largest is found
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update second and third largest when a new second largest is found
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != largest && num != secondLargest) {
                // Update third largest
                thirdLargest = num;
            }
        }

        // Print the results
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Third Largest: " + thirdLargest);
    }
}
