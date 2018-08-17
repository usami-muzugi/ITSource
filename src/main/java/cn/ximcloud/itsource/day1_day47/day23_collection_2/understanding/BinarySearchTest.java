package cn.ximcloud.itsource.day1_day47.day23_collection_2.understanding;

/**
 * Created by IntelliJ IDEA.
 * Student: wzard
 * Date: 2018-07-10
 * Time: 14:44
 * ProjectName: ITSource
 * To change this template use File | Settings | Editor | File and Code Templates.
 * ////////////////////////////////////////////////////////////////////
 * 14. 二分查找
 * 描述
 * 给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），
 * 如果target不存在于数组中，返回-1。
 **/

public class BinarySearchTest {
    public static void main(String[] args) {
        int sum = 2048;
        int[] arr = new int[sum];
        for (int i = 0; i < sum; i++) {
            arr[i] += i;
        }
        System.out.println(binarySearch(new int[]{4, 5, 9, 9, 12, 13, 14, 15, 15, 18}, 10));
    }

    public static int binarySearch(int[] nums, int target) {
        int minIndex = 0;
        int maxIndex = nums.length - 1;
        int midIndex = (minIndex + maxIndex) / 2;

        if (nums.length == 1) return nums[maxIndex] == target ? 0 : -1;
        if (nums[nums.length - 1] < target) return -1;

        while (true) {
            if (minIndex > midIndex) return -1;
            if (nums[midIndex] == target) {
                while (true) {
                    if (--midIndex == -1) return 0;
                    if (!(nums[midIndex] == target)) return ++midIndex;
                }
            } else if (nums[midIndex] > target) {
                maxIndex = midIndex - 1;
                midIndex = (maxIndex + minIndex) / 2;
            } else if (nums[midIndex] < target) {
                minIndex = midIndex + 1;
                midIndex = (maxIndex + minIndex) / 2;
            }
        }
    }
}
