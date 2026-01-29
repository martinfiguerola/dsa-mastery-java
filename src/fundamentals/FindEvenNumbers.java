package fundamentals;

public class FindEvenNumbers {

    public static void main(String[] args) {

        FindEvenNumbers solver = new FindEvenNumbers();

        int[] tesData = {1, 2, 3, 4, 5, 6};

        int count = solver.countEvens(tesData);

        System.out.println("Even numbers found: " + count);

    }

    public int countEvens (int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++ ) {

            if (nums[i] % 2 == 0){
                count++;
            }
        }

        return count;
    }


}
