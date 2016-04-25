package com.example.singleton;

/**
 * Created by hu on 16-4-24.
 */
public class Singleton {
//
//    /**懒汉模式
//     * 线程不安全
//     *
//     */
//    private  static  Singleton instance=null;
//    public  static  Singleton getInstance(){
//        if (instance==null){
//            instance=new Singleton();
//
//        }
//        return instance;
//    }

//    /**
//     * 饿汉模式
//     * 没有延时加载
//     */
//    private  static  Singleton instance=new Singleton();
//    public  static  Singleton getInstance(){
//        return instance;
//    }


    /**
     * 最优实现方法
     * 当getInstance第一次被调用时，读取SingletonHolder的instance，导致SingletonHolder的静态类被创建
     */
    private  static  class  SingletonHolder{
        //静态化初始器，保证线程安全
        private  static  Singleton instance=new Singleton();
    }
    public static  Singleton getInstance(){
        return SingletonHolder.instance;
    }



}
