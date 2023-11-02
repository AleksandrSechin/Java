// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1

public class maxcountones {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0 };
        int countMaxOnes = get(nums);
        System.out.println(countMaxOnes);
    }

    public static int get(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 1) {
                count++;
                maxCount = Math.max(maxCount, count); // тернарный оператор maxCount = maxCount > count ? maxCount :
                                                      // count;
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
