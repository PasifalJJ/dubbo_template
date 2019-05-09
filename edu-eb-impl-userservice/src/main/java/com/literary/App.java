package com.literary;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //加载xml配置文件
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        //启动配置文件
        applicationContext.start();

        /*是程序一直处于运行状态
        * 同步代码块，任取一对象作为同步锁对象
        * 同步方法，在方法上synchronize，同步锁对象是this
        * 静态同步方法的同步锁对象是当前类的字节码对象
        * */
        synchronized (App.class){
            while (true){
                try {
                    App.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
