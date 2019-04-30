package com.example.demo;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
public class demoUpdate {

    @Value("${server.port}")
    private static String port;

    public void ss() {
        System.out.println("这个是开发的分支");
        System.out.println("这个是master提交的");
        System.out.println("这个开发分支第2个");
        System.out.println("开发进行rebase11");

    }

    public static void main(String[] args) throws IllegalAccessException {
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
        String str2 = new String("str") + new String("01");
        str2.intern();
        System.out.println(str2 == str1);

        User user = null;
        //Assert.notNull(user,"中韩歌会一个e");
        // Integer te = Optional.ofNullable(user).map(s1 -> s1.getAge()).orElseThrow(() -> new IllegalAccessException("无权限"));
        System.out.println(port);
        String[] arr = {"1"};
        String join = String.join(",", arr);
        System.out.println(join);

//        Student student = Student.buildInstance().setAgeee(18);
//        System.out.println(student);
//        String a1="3";
//        String  a2="%0"+a1+"d";
//        String format = String.format(a2, 10L);
//        System.out.println("这个是："+format);

        Student student1 = new Student();
        student1.setAgeee(19);
        student1.setName("小红");
        User user1 = new User();
        BeanUtils.copyProperties(student1, user1);
        System.out.println(user1);
        log.info("这是一个人{}", "吗");
        String format = MessageFormat.format("{0}{1}", "天天", 1);
        System.out.println(format);
        String[] ar = {""};
        String collect = Stream.of(ar).collect(Collectors.joining(","));
        System.out.println(collect);

        ArrayList<String> listA = new ArrayList<>();
        listA.add("a");
        listA.add("b");
        listA.add("c");

        ArrayList<String> listB = new ArrayList<>();
        listB.add("c");
        listB.add("d");
        listB.add("e");
        System.out.println(listA.addAll(listB));
        System.out.println(listA);
        System.out.println(listA.retainAll(listB));
        System.out.println(listA);
        System.out.println(listA.removeAll(listB));
        System.out.println(listA);

        User user2 = new User();
        user2.setAge(18);
        user2.setName("小红");

        User user3 = new User();
        user3.setAge(18);
        user3.setName("小红");
        ArrayList<User> listC = new ArrayList<>();
        listC.add(user2);
        ArrayList<User> listD = new ArrayList<>();
        listD.add(user3);

        System.out.println(listA.containsAll(listD));







    }
}
