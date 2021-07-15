package com.duke.algorithmlib;

public class BasicAIgorithm {
    private static final String TAG = "AI_BasicAIgorithm";

    /**
     * 常数时间的操作：执行时间是固定的操作，叫常数时间的操作
     * 常数时间的操作：算数运算，位运算，比较，自增/减，赋值，数组寻址
     * 反之，执行时间不固定，与样本量的大小有关系的操作，就不是常数时间的操作
     * 时间复杂度 ：就是衡量在完成整个流程时执行了多少次常数时间操作，他是衡量算法复杂度的一种指标，该指标只与数据量有关，与过程之外的优化无关
     * <p>
     * 额外空间复杂度 ： 要实现一个算法流程，在完成算法的流程过程中，你需要开一些空间来支持你的算法流程。
     * 作为输入参数的空间，不算额外空间。
     * 作为输出结果的空间，也不算额外空间。
     * 除此之外，你的流程执行还需要开辟的空间就是额外空间。
     * 如果你的流程只需要开辟有限几个变量的空间，额外空间复杂度就是O(1)
     */


    public static void main(String[] args) {


        System.out.println(TAG + " Hello AI main " + "args:" + args);


    }

    private int getSum() {
        return 0;
    }

    /**
     * 冒泡排序
     * @param arrs
     * @return
     */
    public static int[] bulbleSort(int[] arrs) {
        if(arrs== null || arrs.length<=2) {
            return arrs;
        }

        //從左往右
        for (int i =0;i<arrs.length;i++){
            //比较相邻2个元素大小
            if(arrs[i] > arrs[i+1]) { //如果大于，交换

            }

        }


        return null;
    }


}
