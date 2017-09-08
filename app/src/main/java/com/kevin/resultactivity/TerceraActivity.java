package com.kevin.resultactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TerceraActivity extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        boton = (Button) findViewById(R.id.button3);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent();
                intent.putExtra("datos3","datos3");
                intent.putExtra("datos2",getIntent().getStringExtra("datos2"));
                intent.putExtra("datos1",getIntent().getStringExtra("datos1"));
                intent.putExtra("datos",getIntent().getStringExtra("datos"));
                setResult(2,intent);
                finish();
            }
        });

    }
}
