package com.wwc.modle.single;

/**
 * 单例模式
 */
public class SingleMode {

    /**
     *  懒汉式
     */
   /* private static SingleMode singleMode=null;
    //私有化构造函数,防止在外部创建对象
    private SingleMode(){};
    public  static SingleMode getInstance(){
        if(null==singleMode){
            singleMode=new SingleMode();
        }
        return singleMode;
    }*/


    /**
     *  饿汉式
     */
    private static SingleMode singleMode=new SingleMode();
    private SingleMode(){};
    //饿汉式
    public static SingleMode getInstance(){
        return singleMode;
    }
}
