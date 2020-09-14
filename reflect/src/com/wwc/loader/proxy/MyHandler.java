package com.wwc.loader.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyHandler implements InvocationHandler {


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行"+method.getName());
        if(null ==args){
            System.out.println("该方法没有实参");
        }else {
            for(Object arg:args){
                System.out.println(arg);
            }
        }
        System.out.println("执行结束"+method.getName());
        return null;
    }

    /**
     * 动态代理创建对象
     * @param args
     */
    public static void main(String[] args) {
        MyHandler myHandler=new MyHandler();
        Person p= (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class},myHandler);
        //执行每个方法时，都调用了handler的invoke()方法
        p.body();
        p.write("作业");
    }
}
