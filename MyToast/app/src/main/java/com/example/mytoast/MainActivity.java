package com.example.mytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this);
    }
    public void onClick(View view) {
        Toast toast = Toast.makeText( this,  "Toast Simple", Toast.LENGTH_LONG);
        toast.show();
    }
    public void button2(View view){
    Toast toast = Toast.makeText(this "toast re")
}

