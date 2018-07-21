package com.example.administrator.testnews;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NewTitleFragment newTitleFragment=new NewTitleFragment();
        NewContentFragment newContentFragment=new NewContentFragment();
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.leftTitle,newTitleFragment);
        fragmentTransaction.replace(R.id.rightContent,newContentFragment);
        fragmentTransaction.commit();
    }

    public void f(){
        NewContentFragment newContentFragment=new NewContentFragment();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.rightContent,newContentFragment);
        fragmentTransaction.commit();
    }
}
