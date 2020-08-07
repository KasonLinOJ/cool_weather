package com.example.coolweather;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 如果不为 null 就说明之前已经请求过天气数据了，
         * 那么就没必要让用户再次选择城市，而是直接跳转到 WeatherActivity 即可
         */
//        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
////        if (prefs.getString("weather", null) != null) {
////            Intent intent = new Intent(this, WeatherActivity.class);
////            startActivity(intent);
////            finish();
////        }
    }
}