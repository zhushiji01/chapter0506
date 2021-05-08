package edu.xcdq.set;

import java.util.TreeSet;

/**
 * @version 1.0
 * @Author: zhushiji
 * @date: 2021/5/8 9:26
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("111");
        set.add("222");
        set.add("历史");
        set.add("地理");
        set.add("asdd");
        set.add("ASDD");
        System.out.println(set);
    }
}
