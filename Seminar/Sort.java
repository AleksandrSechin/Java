import java.util.Arrays;

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива

public class Sort {
    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 2, 2 };
        int val = 3;
        int[] resArr = moveToEnd(nums, val);
        System.out.println(Arrays.toString(resArr));
    }

    public static int[] moveToEnd(int[] nums, int val) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i + 1] != val) {
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                i = 0;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != val) {
                temp = nums[0];
                nums[0] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
