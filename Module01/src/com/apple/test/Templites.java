package com.apple.test;

import java.util.*;

/**
 * @author CodingMaster
 * @create 2020-06-29 12:17
 */
public class Templites {
    /**
     * 这是一个int型的变量
     */
    private int a = 32 ;
    /**
     * 客户的id
     */
    private int uid ;
    /**
     * 这是用户名
     */
    private String  uName;




    public static void main(String[] args) {
        System.out.println("aaa");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("Templites.main");
        int num1=10;
        int num2=10;
        System.out.println("num2 = " + num2);
//        for (String arg : args) {
//            System.out.println("aaa");
//        }
//        for (String arg : args) {
//
//        }
//        for (int i = 0; i < args.length; i++) {
//            String arg = args[i];
//
//        }

        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        for (Object o : arrayList) {
            System.out.println(o);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
        if (arrayList == null) {

        }
        if (arrayList != null) {

        }
        if (arrayList != null) {

        }
        if (arrayList == null) {

        }
        /**
         * 这是一个int
         */


    }

    public void testAaa(){
        System.out.println("这是一个测试");
    }
}
