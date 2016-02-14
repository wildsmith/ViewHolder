package com.wildsmith.viewholder.example;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.wildsmith.viewholder.R;

public class ExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.content_layout);

        createExampleFragment(savedInstanceState);
    }

    private void createExampleFragment(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            addContentFragment(ExampleFragment.newInstance(), ExampleFragment.TAG);
        }
    }

    protected void addContentFragment(Fragment content, String tag) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.content, content, tag);
        if (ft.isAddToBackStackAllowed() && fm.getFragments() != null) {
            ft.addToBackStack(tag);
        }
        ft.commit();
    }
}