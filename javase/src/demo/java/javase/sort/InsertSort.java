package demo.java.javase.sort;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums = {10, 2, 9, 5, 7, 1, 3, 6};

        //  控制比较的轮数
        for (int i=1; i<nums.length; i++) {
            int temp = nums[i]; // 记录操作数
            int j = 0;
            for (j=i-1; j>=0;j--) {
                if (nums[j] > temp) {
                    nums[j+1] = nums[j];
                } else {
                    break;
                }
            }
            if (nums[j+1] != temp) {
                nums[j+1] = temp;
            }
        }

        // 输出结果
        for (int n: nums) {
            System.out.println(n);
        }
    }
}
