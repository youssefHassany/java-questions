public class Main {
    public static void main(String[] args) {
        int[] nums = { 7, 10, 5, 3, 6, 2, 0, 1, 8, 4 };

        int max = nums[0]; // for now
        int indexOfMax = 0; // for now

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                indexOfMax = i;
            }
        }

        System.out.println("Max = " + max); // 10
        System.out.println("index of max = " + indexOfMax); // 1
    }
}
