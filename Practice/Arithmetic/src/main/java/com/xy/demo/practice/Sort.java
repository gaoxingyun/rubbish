package com.xy.demo.practice;

import java.util.Random;

/**
 * Created by xy on 2017/3/3.
 *
 * @author xy
 *         <p>
 *         <p>
 *         排序算法实现
 *         </p>
 */
public class Sort {


    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        bubbleSort(array);

        for (int num : array
                ) {
            System.out.println(num);
        }
    }

    /**
     * 快排
     * <p>
     * <p>
     * 一趟快速排序的算法是：
     * 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1；
     * 2）以第一个数组元素作为关键数据，赋值给key，即key=A[0]；
     * 3）从j开始向前搜索，即由后开始向前搜索(j--)，找到第一个小于key的值A[j]，将A[j]和A[i]互换；
     * 4）从i开始向后搜索，即由前开始向后搜索(i++)，找到第一个大于key的A[i]，将A[i]和A[j]互换；
     * 5）重复第3、4步，直到i=j；
     * (3,4步中，没找到符合条件的值，即3中A[j]不小于key,4中A[i]不大于key的时候改变j、i的值，使得j=j-1，i=i+1，直至找到为止。
     * 找到符合条件的值，进行交换的时候i， j指针位置不变。另外，i==j这一过程一定正好是i+或j-完成的时候，此时令循环结束）。
     * </p>
     */

    public static void quickSort(int[] array) {


    }


    /**
     * 冒泡
     * <p>
     * <p>
     * <p>
     * 冒泡排序算法的运作如下：（从后往前）
     * 1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 3. 针对所有的元素重复以上的步骤，除了最后一个。
     * 4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。[1]
     * <p>
     * </p>
     */
    public static void bubbleSort(int[] array) {

        int temp = 0;

        // 第一层循环代表第i+1位已经排序成功
        for (int i = array.length - 1; i > 0; i--) {
            // 第二层循环代表当前比较到第j+1位
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
