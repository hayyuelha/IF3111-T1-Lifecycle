package com.example.hp.tutorialandrolifecycle;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * Created by HP on 2/7/2015.
 */
public class SecondActivity extends LifeCycle {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
