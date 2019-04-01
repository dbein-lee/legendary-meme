package com.lipc.tools;

/**
 * @author Pengcheng.Li4
 */
public class StackOverFlow {

    private int i = 0;

    public void plus() {
        i++;
        plus();
    }


    public static void main(String[] args) {
     StackOverFlow overFlow = new StackOverFlow();
     overFlow.plus();
    }
}
