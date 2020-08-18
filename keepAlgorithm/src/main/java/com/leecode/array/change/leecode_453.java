package com.leecode.array.change;

/**
 * 453. 最小移动次数使数组元素相等 难度:简单
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动将会使 n - 1 个元素增加 1。
 *
 *  
 *
 * 示例:
 *
 * 输入:
 * [1,2,3]
 *
 * 输出:
 * 3
 *
 * 解释:
 * 只需要3次移动（注意每次移动会增加两个元素的值）：
 *
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * 方法三：利用排序 【通过】
 * 方法四：动态规划 【通过
 * 方法六：改进的数学法 【通过】
 */
public class leecode_453 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int move = funcOne(arr);
        System.out.println(move);
    }
    private static int funcOne(int[] arr){
        int move =0,min= Integer.MAX_VALUE;
        for (int i:arr){
            if (i<min) min = i;
        }
        for (int i:arr){
            move += i-min;
        }
        return move;
    }
}
