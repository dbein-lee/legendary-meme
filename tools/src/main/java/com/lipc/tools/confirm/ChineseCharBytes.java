package com.lipc.tools.confirm;

import java.io.UnsupportedEncodingException;

public class ChineseCharBytes {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "林";
        System.out.println("UTF-8 length: " + str.getBytes("UTF-8").length + "\n" +
                "GBK length: " + str.getBytes("GBK").length + "\n" +
                "ASCII length: " + str.getBytes("ASCII").length + "\n" +
                "ISO8859-1 length: " + str.getBytes("ISO8859-1").length);
    }

    /**
     UTF-8 length: 3
     GBK length: 1
     ASCII length: 1
     ISO8859-1 length: 1
     */
}
