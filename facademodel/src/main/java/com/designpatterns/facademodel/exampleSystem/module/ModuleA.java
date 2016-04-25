package com.designpatterns.facademodel.exampleSystem.module;

import android.util.Log;

import com.designpatterns.facademodel.exampleSystem.api.AModuleApi;

/**
 * Created by hu on 16-4-24.
 */
public class ModuleA implements AModuleApi {
    private  String TAG="ModuleA";

    @Override
    public void test1() {
        Log.d(TAG,"test1 has been use");

    }

    @Override
    public void test2() {
        Log.d(TAG,"test2 has been use");
    }
}
