package com.example.dell.skyhawk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button inp1;
    EditText noInput;
    String noInputVal;
    LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noInput = findViewById(R.id.UNo);
        l1=findViewById(R.id.vi);
        Toast.makeText(getApplicationContext(),"Wait 2 sec after get start",Toast.LENGTH_SHORT).show();

        inp1 = findViewById(R.id.gst);
        inp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                noInputVal = noInput.getText().toString();
                l1.setVisibility(View.VISIBLE);
                try{
                    Thread.sleep(3000);

                    startActivity(new Intent(getApplicationContext(),MapsActivity.class));}
                catch (Exception e)
                {
                }


            }
        });

    }





}
