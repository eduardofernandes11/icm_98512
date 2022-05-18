package com.example.homework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class ChangeDial extends AppCompatActivity {

    static Map<String, String> list = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_dial_info);

        Intent data = getIntent();
        String name = data.getStringExtra("name");

        EditText nameInput = (EditText) findViewById(R.id.nameInput);
        EditText numberInput = (EditText) findViewById(R.id.numberInput);

        Button save= (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(nameInput.getText().toString().equals("") || numberInput.getText().toString().equals(""))){
                    if (list.containsKey(name))
                        list.remove(name);
                    list.put(nameInput.getText().toString(), numberInput.getText().toString());
                    startActivity(new Intent(ChangeDial.this, MainActivity.class));
                }
            }
        });
    }
}
