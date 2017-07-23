package com.xy.demo.practice;

import java.util.ArrayList;

/**
 * Created by xy on 2017/3/3.
 *
 * @author xy
 *         <p>
 *         <p>
 *         输入一个链表，从尾到头打印链表每个节点的值。
 *         </p>
 */
public class PrintLinkTable {

    public static void main(String[] args) {
        // 创造链表
        ListNode listNode = new ListNode(0);
        ListNode listNodeTemp = listNode;
        for (int i = 0; i < 100; i++) {
            listNodeTemp.next = new ListNode(i);
            listNodeTemp = listNodeTemp.next;
        }

        ArrayList<Integer> arrayList = printListFromTailToHead(listNode);
        for (int num : arrayList
                ) {
            System.out.println(num);
        }
    }

    /**
     * 从尾到头遍历链表所有节点的值
     *
     * @param listNode 链表
     * @return 链表节点值List
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayListTemp = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode listNodeTemp = listNode;

        for (; ; ) {
            if (listNodeTemp == null) {
                break;
            }
            arrayListTemp.add(listNodeTemp.val);
            listNodeTemp = listNodeTemp.next;
        }

        for (int i = arrayListTemp.size() - 1; i >= 0; i--) {
            arrayList.add(arrayListTemp.get(i));
        }
        return arrayList;
    }
}


/**
 * <p>
 * 链表类
 * </p>
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
