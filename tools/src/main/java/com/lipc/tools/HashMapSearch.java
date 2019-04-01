package com.lipc.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: HashMapSearch
 * @ProjectName legendary-meme
 * @Description: TODO
 * @Author Pengcheng.Li4
 * @Date 2019/1/24 19:23
 */
public class HashMapSearch {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        for (int i = 0 ;i < 100; i++) {
            map.put(String.valueOf(i), String.valueOf(i));
            if (i == 5){
                map.put(String.valueOf(i), String.valueOf(i+1));
            }
        }


        System.out.println(map.size());
    }
}
