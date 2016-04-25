package com.designpatterns.facademodel.exampleSystem.module;

import android.util.Log;

import com.designpatterns.facademodel.exampleSystem.api.BModuleApi;

/**
 * Created by hu on 16-4-24.
 */
public class ModuleC implements BModuleApi {
    private  String TAG="ModuleC";

    @Override
    public void test1() {
        Log.d(TAG,"test1 has been use");

    }

    @Override
    public void test2() {
        Log.d(TAG,"test2 has been use");
    }
}
