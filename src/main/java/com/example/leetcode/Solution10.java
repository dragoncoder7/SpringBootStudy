package com.example.leetcode;

import java.util.Arrays;

class Solution10 {
    public static void main(String[] args) {
        Solution10 solution10 =  new Solution10();
        int[] nums = {6,2,6,5,1,2};
        System.out.println(solution10.arrayPairSum(nums));
    }
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        return sum;
    }
    public int arrayPairSum1(int[] nums) {
        int len = nums.length;
        int result = 0;
        if (len <= 200) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i+=2) {
                result += nums[i];
            }
        } else {
            //为什么是20002，因为限制条件是-10000 <= nums[i] <= 10000
            int[] count = new int[20000];
            //把x在count中划分位置，达到排序目的，统计每个位置的数量，索引越低值越小
            for(int x : nums) ++count[x+10000];
            //
            boolean carry = false;
            //
            for(int i = 0;i<20000;i++){
                if(count[i] > 0){
                    if(carry) --count[i];
                    result += (count[i]+1)/2*(i-10000);
                    carry = count[i]%2==1;
                }
            }
        }
        return result;
    }
}