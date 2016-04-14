package com.ansel.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ansel.databindingdemo.bean.User;
import com.ansel.databindingdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Ansel", "Hall");

        binding.setUser(user);

        User user1 = new User("Hello", "World");
        binding.setUser(user1);

    }

}
