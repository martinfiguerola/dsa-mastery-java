package fundamentals;

public class ElementCounter {

    public static void main(String[] args) {

        // 1. Data: An array of integers
        int[] data = {5, 12, 8, 15, 3, 20};

        // 2. Variable to store the total sum
        int totalSum = 0;

        // 3. Logic: Loop through the array
        for (int i = 0; i < data.length; i++) {
            // Check if the current number is multiple of 5
            if (data[i] % 5 == 0) {
                // if true, add the current number to the total sum
                totalSum = totalSum + data[i];
            }
        }

        // 4. Output the result
        System.out.println("totalSum: " + totalSum);
    }

}
