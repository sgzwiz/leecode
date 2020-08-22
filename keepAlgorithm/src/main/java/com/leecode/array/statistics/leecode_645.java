package com.leecode.array.statistics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 645. 错误的集合 难度：简单
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,2,4]
 * 输出: [2,3]
 * 注意:
 *
 * 给定数组的长度范围是 [2, 10000]。
 * 给定的数组是无序的。
 */
public class leecode_645 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        Set<Integer> result = funcOne(arr);
        System.out.println(Arrays.toString(result.toArray()));
    }

    private static Set<Integer> funcOne(int[] arr){
        Set<Integer> result = new HashSet<Integer>();
        for (int i =0;i<arr.length;i++){

            while (arr[i] != arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
        }

        for (int i =0;i<arr.length;i++){
            if (arr[i]!= i+1){
                result.add(arr[i]);
                result.add(i+1);

            }
        }
        return result;
    }
}
