package com.jeremyliao.liveeventbus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.btn_test1).setOnClickListener(view -> {
            startActivity(new Intent(getBaseContext(), Test1Activity.class));
        });


        LiveEventBus.get("MainActivityText", String.class).observe(this, str -> {
            TextView textView =  findViewById(R.id.tv_text);
            textView.setText(str);
        });



    }


}
