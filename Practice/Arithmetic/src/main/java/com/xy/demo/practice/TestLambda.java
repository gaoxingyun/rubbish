package com.xy.demo.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by xy on 2017/3/18.
 */
public class TestLambda {

    public static void main(String[] args){

      List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        nums.forEach(num -> {System.out.println(num);});
      List<Integer> newNums =  nums.stream().filter(num -> num > 10).collect(Collectors.toList());
        newNums.forEach(num -> System.out.println(num));
        newNums.sort((x,y) -> {return x > y ? -1:1;});
        newNums.forEach(num -> System.err.println(num));

        List<String> strs = Arrays.asList("a","b","c","d","e","f");

        strs = strs.stream().map(String::toUpperCase).filter(s -> {System.out.println(1);return s.equals(s.toUpperCase());}).collect(Collectors.toList());
        strs.forEach(s -> System.out.println(s));



    }
}
