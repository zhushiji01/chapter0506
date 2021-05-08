package edu.xcdq.list;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/5/6 18:17
 */
public class LinkedListDemo02 {
    public static void main(String[] args) {

        LinkedList<Object> list01 = new LinkedList<>();  //链表的方式实现的
        //  1  增加
        list01.add("zhangsan");
        list01.add("wangwu");
        System.out.println(list01);
        //  2  删除
        list01.remove(1);
        System.out.println(list01);
        //  3  修改
        String v = (String) list01.set(1,"xiaowu");
        System.out.println(v);
        System.out.println(list01);
        //  4  查询
        for (Object l: list01){
            System.out.println(l + "\t");
        }
        //  5  求长度
        System.out.println(list01.size());

        /*//  6  清空
        list01.clear();
        System.out.println(list01.size());
        System.out.println(list01.isEmpty());
        */

        //  7  addAll();  运行此段代码需将 “6” 注释掉
        LinkedList<Object> list02 = new LinkedList<>();
        list02.add(111);
        list02.add(222);
        list01.addAll(1,list02);
        System.out.println(list01);

        //  将数据111
    }
}
