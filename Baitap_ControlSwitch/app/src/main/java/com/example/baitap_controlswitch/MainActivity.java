package com.example.baitap_controlswitch;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private LinearLayout mainLayout;
    private Switch switchTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các View
        mainLayout = findViewById(R.id.mainLayout);
        switchTheme = findViewById(R.id.switchTheme);

        // Xử lý sự kiện khi bật/tắt Switch
        switchTheme.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                mainLayout.setBackgroundResource(R.drawable.hinhnen2); // Đổi sang hinhnen2
            } else {
                mainLayout.setBackgroundResource(R.drawable.hinhnen1); // Quay lại hinhnen1
            }
        });
    }
}
