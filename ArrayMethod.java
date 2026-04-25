public class ArrayMethod {

    public static void main(String[] args) {
        int[] nums = {0, 5, 2, 8, 1};

        int[] result = second(nums);

        System.out.println("The largest number is " + result[0] + " and the second largest: " + result[1]);
    }

    static int[] second(int[] nums) {
        int largest = 0;
        int second = 0;

        //second = 2, largest = 8
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                second = largest;
                largest = nums[i];
            }
            else if(nums[i] > second && nums[i] != largest){
                second = nums[i];
            }
        }

        int[] lar_sec = {largest, second};
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > second && nums[i] < largest) {
        //         second = nums[i];
        //     }
        // }
        return lar_sec;
    }
}