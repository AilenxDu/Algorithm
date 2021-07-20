package com.duke.algorithmlib;

import java.util.Random;

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

        testBulble();

    }


    /**
     * 冒泡排序
     *
     * @param arrs
     * @return
     */
    public static int[] insertSort(int[] arrs) {
        if (arrs == null || arrs.length <= 2) {
            return arrs;
        }

        //從左往右
        for (int i = 0; i < arrs.length - 1; i++) {
            System.out.println("arr_i[" + i + "]=" + arrs[i]);
            for (int j = i + 1; j < arrs.length; j++) {
                System.out.println("arr_j[" + j + "]=" + arrs[j]);
                //比较相邻2个元素大小
                if (arrs[i] > arrs[j]) { //如果大于，交换
                    int temp = arrs[i];
                    arrs[i] = arrs[j];
                    arrs[j] = temp;
                }
            }
            printArray(arrs);

        }

        return arrs;
    }

    /**
     * 冒泡排序
     *时间复杂度 O(n^2)
     * @param arrs
     * @return
     */
    public static int[] bulbleSort(int[] arrs) {
        if (arrs == null || arrs.length <= 2) {
            return arrs;
        }

        //從左往右
        for (int i = 0; i < arrs.length - 1; i++) {
            System.out.println("arr_i[" + i + "]=" + arrs[i]);
            for (int j = 0; j < arrs.length - i - 1; j++) {
                System.out.println("arr_j[" + j + "]=" + arrs[j]);
                //比较相邻2个元素大小
                if (arrs[j] > arrs[j + 1]) { //如果大于，交换
                    int temp = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j + 1] = temp;
                }
            }
            printArray(arrs);


        }

        return arrs;
    }

    public static void testBulble() {
//        int[] grade = {78, 65, 89, 44, -55, 55, 60, 30};
//
//        int[] gradeSort = insertSort(grade);
//        printArray(gradeSort, "gradeSort");

//        int[] bubleSort = bulbleSort(grade);
//        printArray(bubleSort, "bubleSort");

        int[] datas = generateArray();
        printArray(datas);
        bulbleSort(datas);
        printArray(datas);

    }

    public static int[] generateArray() {
        int[] datas = new int[100];
        for (int i = 0; i < datas.length; i++) {
            int randomInt = (int) (new Random().nextFloat() * 1000);
            datas[i] = randomInt;
        }
        return datas;
    }

    /**
     *
     */
    public static void swapElement(int a, int b) {

    }

    public static void printArray(int[] array) {
        printArray(array, null);
    }

    public static void printArray(int[] array, String arrayDescrip) {
        if (array == null || array.length < 1) {
            System.out.println("array may be null or size <1 ");
            return;
        }
        if (arrayDescrip != null) {
            System.out.print("array_" + arrayDescrip + "= ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(" ");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ", ");
            }
            System.out.println(" ");
        }

    }

    public static void printlnArray(int[] array) {
        printlnArray(array, null);
    }

    public static void printlnArray(int[] array, String arrayDescrip) {
        if (array == null || array.length < 1) {
            System.out.println("array may be null or size <1 ");
            return;
        }
        if (arrayDescrip != null) {
            for (int i = 0; i < array.length; i++) {

                System.out.println("array_" + arrayDescrip + "[" + i + "]=" + array[i] + " ,");
            }
        } else {
            for (int i = 0; i < array.length; i++) {

                System.out.println("array[" + i + "]=" + array[i] + " ,");
            }
        }

    }


}
