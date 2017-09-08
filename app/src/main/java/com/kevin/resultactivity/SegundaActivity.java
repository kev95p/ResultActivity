package com.kevin.resultactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        boton = (Button) findViewById(R.id.button2);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegundaActivity.this,TerceraActivity.class);
                intent.putExtra("datos2","datos2");
                intent.putExtra("datos1",getIntent().getStringExtra("datos1"));
                intent.putExtra("datos",getIntent().getStringExtra("datos"));
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        setResult(1,data);
        finish();
    }
}
