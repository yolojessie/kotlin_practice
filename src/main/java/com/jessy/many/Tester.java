package com.jessy.many;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<String, String> stocks =
                new HashMap<>();
        stocks.put("2330", "台積電");
        stocks.put("2317", "鴻海");
        stocks.put("2330", "TSMC");
        System.out.println(stocks.get("2330"));
        for (String key : stocks.keySet()) {
            System.out.println(stocks.get(key));
        }
//        set();
//        List();

    }

    private static void set() {
        //set => no dupicate
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(6);
        System.out.println(set);
        for (int n : set) {
            System.out.println(n);
        }
    }

    private static void List() {
        int[] numbers = new int[5];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);
        int n1 = list.get(0);
        System.out.println(list.size());
        List<Integer> scores =
                Arrays.asList(68, 88, 78);
        for (int score: scores) {
            System.out.println(score);
        }
    }
}
