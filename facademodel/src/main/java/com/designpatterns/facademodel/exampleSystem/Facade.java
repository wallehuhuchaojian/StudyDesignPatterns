package com.designpatterns.facademodel.exampleSystem;

import com.designpatterns.facademodel.exampleSystem.module.ModuleA;
import com.designpatterns.facademodel.exampleSystem.module.ModuleB;
import com.designpatterns.facademodel.exampleSystem.module.ModuleC;

/**
 * 装饰模式，封装调用
 * 本质是封装交互，简化调用
 * 不会增加新的功能，只是在内部生成一个实现特定功能的调用顺序实现，方便调用,同是其实实现方法也是提供出来的，如果不用doTestOne，也可以自己调用
 *
 * Facade封装了子系统外部和子系统内部多个模块的交互过程，从而简化了外部的调用，如果没有外观客户需要知道所有子系统的功能然后去调用
 *
 * Created by hu on 16-4-24.
 */
public class Facade  {

    public static  void doTestOne(){
        ModuleA moduleA=new ModuleA();
        ModuleB moduleB=new ModuleB();
        ModuleC moduleC=new ModuleC();
        moduleA.test1();
        moduleB.test1();
        moduleC.test1();

    }
}
