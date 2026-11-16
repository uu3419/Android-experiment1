package com.example.lab1;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 实验1：Android 开发基础
 * 第一个 Android 工程：显示 Hello Android，并通过按钮演示控件获取、事件监听与 Toast。
 */
public class MainActivity extends AppCompatActivity {

    private int clickCount = 0;
    private TextView tvCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 把布局文件 activity_main.xml 加载到当前界面
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tv_counter);
        tvCounter.setText(getString(R.string.device_info, Build.VERSION.RELEASE, Build.MODEL));

        Button btnHello = findViewById(R.id.btn_hello);
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                Toast.makeText(MainActivity.this,
                        getString(R.string.toast_hello, clickCount),
                        Toast.LENGTH_SHORT).show();
                tvCounter.setText(getString(R.string.click_count, clickCount));
            }
        });
    }
}
