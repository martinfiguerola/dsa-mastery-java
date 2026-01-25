package Fundamentals;

public class SumGreaterTen {

    public static void main(String[] args) {

        // 1. Data: An array of integers
        int[] data = {5, 12, 8, 15, 3, 20};

        // 2. Variable to store the count
        int count = 0;

        // 3. Logic: Loop through the array
        for (int i = 0; i < data.length; i++) {
            // Check if the current number is greater than 10
            if (data[i] > 10) {
                count++; // Increment the counter
            }
        }

        // 4. Output the result
        System.out.println("Numbers greater than 10: " + count);
    }

}
