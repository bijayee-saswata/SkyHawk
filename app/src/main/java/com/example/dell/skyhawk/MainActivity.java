package com.example.dell.skyhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText noInput = findViewById(R.id.UNo);
    String noInputVal = noInput.getText().toString();

    Button inp = findViewById(R.id.gst).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            LinearLayout rl1 = (LinearLayout) findViewById(R.id.vi);
            rl1.setVisibility(View.INVISIBLE);
        }
    });

}
