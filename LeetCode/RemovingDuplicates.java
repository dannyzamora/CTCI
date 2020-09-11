package LeetCode;

public class RemovingDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }

        }
        for (int i : nums) {
            System.out.print(i);
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3 };
        System.out.println(removeDuplicates(arr));
    }
}
