package com.xy.demo.practice;

/**
 * Created by xy on 2017/3/3.
 *
 * @author xy
 *
 * <p>题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。</p>
 *
 * <p>思路：</p>
 */
public class SearchArrary {

    public static void main(String[] args){

        int[][] arrary= {{1,2,3},{4,5,6}};
        int num = 1;

        boolean ret = Find(num, arrary);
        System.out.println(ret);
    }

    /**
     * @apiNote 检查数字是否存在于二维数组
     *
     * @param target 需检查的数字
     * @param array 二维数组
     *
     * @return 是否存在
     * */
    public static boolean Find(int target, int [][] array) {
        for (int i=0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                int nowNum = array[i][j];
                if(target == nowNum){
                    return true;
                }
            }
        }
        return false;
    }
}
