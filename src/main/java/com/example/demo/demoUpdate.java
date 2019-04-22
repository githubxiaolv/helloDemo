package com.example.demo;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntUnaryOperator;

public class demoUpdate {

    public void ss() {
        System.out.println("这个是开发的分支");
        System.out.println("这个是master提交的");
        System.out.println("这个开发分支第2个");
        System.out.println("开发进行rebase");
    }

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        System.out.println(atomicInteger.getAndAdd(5));
        System.out.println(atomicInteger.getAndAdd(-5));
        System.out.println(atomicInteger);

        int andUpdate = atomicInteger.getAndUpdate(operand -> 1);
        System.out.println(andUpdate);
        System.out.println(atomicInteger);
        boolean b = atomicInteger.compareAndSet(1, 2);
        System.out.println(b);


        String s = new String("a").intern();
        String s2 = new String("a").intern();
        System.out.println(s == s2);
        String s3 = "b";
        String s4 = "b";
        System.out.println(s3 == s4);


        String str1 = "str01";
        String str2 = new String("str")+new String("01");
        str2.intern();
        System.out.println(str2==str1);

    }
}
