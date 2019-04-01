package com.lipc.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Pengcheng.Li4
 */
public class LambdaTest {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<String>();
        stringList.add("1");
        stringList.add("2");
        StringBuilder stringBuilder = new StringBuilder("1111");
        stringList.forEach(s -> stringBuilder.append(s));
        System.out.println(stringBuilder);

        Map<String, String> map = new HashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.entrySet().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + "=" + s2);
            }
        });

        Runnable t = () -> {
            System.out.println("111");
        };
        t.run();


    }

}
