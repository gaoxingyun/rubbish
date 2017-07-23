package com.xy.demo.practice;

/**
 * Created by xy on 2017/3/3.
 *
 * @author xy
 *
 * <p>
 *     请实现一个函数，将一个字符串中的空格替换成“%20”。
 *     例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * </p>
 */
public class ReplaceSpace {

    public static void main(String[] args){
        StringBuffer testSb = new StringBuffer("We Are Happy");

        String destStr = "We%20Are%20Happy";

        String ret = replaceSpace(testSb);
        System.out.println(ret);
    }


    /**
     * @apiNote 替换StringBuffer中空格为%20
     * @param str 需替换的StringBuffer
     * @return 替换后的字符串
     * */
    public static String replaceSpace(StringBuffer str) {

        for(int i=0; i< str.length(); i ++){
            if(' ' == str.charAt(i)){
                str = str.replace(i,i+1,"%20");
            }
        }
        return str.toString();
    }
}
