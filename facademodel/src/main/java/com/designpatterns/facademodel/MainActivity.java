package com.designpatterns.facademodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.designpatterns.facademodel.exampleSystem.Facade;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Facade facade=new Facade();
        facade.doTestOne();
    }
}
