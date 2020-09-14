package com.wwc.loader;

/**
 * 静态代码块在类初始化的时候执行
 */
class Test{
    static {
        System.out.println("执行静态代码块");
    }
    public static String str="666";
}

public class ClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader=ClassLoader.getSystemClassLoader();
        loader.loadClass("com.wwc.loader.Test");
        System.out.println(Test.str);
        System.out.println("加载Test类");
        Class.forName("com.wwc.loader.Test");
    }
}

