package com.example.sarah;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ITEMS extends AppCompatActivity {
     Button save,calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_t_e_m_s);
        save=findViewById(R.id.save);
        calculate=findViewById(R.id.calculate);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ITEMS.this, "items added to cart", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ITEMS.this, "Your ammount have been calculated" , Toast.LENGTH_SHORT).show();
            }
        });
    }

}
