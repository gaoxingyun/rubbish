package com.xy.demo.practice;

import java.util.Stack;

/**
 * Created by xy on 2017/3/4.
 * <p>
 * <p>
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * </p>
 */
public class StackQueue {
    Stack<Integer> stack1 = new Stack<Integer>();// 保存数据，旧数据在下，新数据在上
    Stack<Integer> stack2 = new Stack<Integer>();

    /**
     * @apiNote 入栈
     */
    public void push(int node) {
        stack1.push(node);
    }


    /**
     * @apiNote 出栈
     */
    public int pop() {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int value = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return value;
    }
}
