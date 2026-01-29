package fundamentals;

public class SumMultiplesOfFive {

    public static void main(String[] args) {

        SumMultiplesOfFive solver = new SumMultiplesOfFive();

        // Data: An array of integers
        int[] data = {5, 12, 8, 15, 3, 20};

        // Calling the method and storing the return value
        int result = solver.getSum(data);

        System.out.println("The total sum is: " + result);

    }


    /**
     * This method calculates the sum of all numbers divisible by 5.
     */
    public int getSum (int[] numbers) {

        // Variable to store the total sum
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            // Check if the current number is multiple of 5
            if (numbers[i] % 5 == 0) {
                // if true, add the current number to the total sum
                totalSum = totalSum + numbers[i];
            }
        }

        return totalSum;
    }



}
