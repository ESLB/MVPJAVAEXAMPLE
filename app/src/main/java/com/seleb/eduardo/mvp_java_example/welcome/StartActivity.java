package com.seleb.eduardo.mvp_java_example.welcome;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.seleb.eduardo.mvp_java_example.R;
import com.seleb.eduardo.mvp_java_example.utils.ActivityUtils;

public class StartActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    private StartPresenter mStartPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_act);

        StartFragment startFragment =
                (StartFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);

        if(startFragment == null) {
            startFragment = new StartFragment();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), startFragment, R.id.contentFrame);
        }

        mStartPresenter = new StartPresenter(startFragment);



    }
}
