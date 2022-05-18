package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arr = new ArrayList<>();

        Button dial1= (Button) findViewById(R.id.dial1);
        Button dial2= (Button) findViewById(R.id.dial2);
        Button dial3= (Button) findViewById(R.id.dial3);

        if (ChangeDial.list.size()==0){
            dial1.setText("CASA");
        }
        else {
            for (String key : ChangeDial.list.keySet()) {
                arr.add(key);
            }
            dial1.setText(arr.get(0));
        }

        //dial1.setText(arr.get(0));
        //dial2.setText(arr.get(1));
        //dial3.setText(arr.get(2));

        dial1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                startActivity(new Intent(MainActivity.this, ChangeDial.class).putExtra("name", dial1.getText().toString()));
                return true;
            }
        });

        dial1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+ChangeDial.list.get(dial1.getText().toString())));//change the number
                startActivity(callIntent);
            }
        });

        EditText dial = (EditText) findViewById(R.id.phone);

        Button delete= (Button) findViewById(R.id.buttonDelete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString().substring(0,dial.length()-1), TextView.BufferType.EDITABLE);
            }
        });

        Button button1= (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "1", TextView.BufferType.EDITABLE);
            }
        });

        Button button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "2", TextView.BufferType.EDITABLE);
            }
        });

        Button button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "3", TextView.BufferType.EDITABLE);
            }
        });

        Button button4= (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "4", TextView.BufferType.EDITABLE);
            }
        });

        Button button5= (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "5", TextView.BufferType.EDITABLE);
            }
        });

        Button button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "6", TextView.BufferType.EDITABLE);
            }
        });

        Button button7= (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "7", TextView.BufferType.EDITABLE);
            }
        });

        Button button8= (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "8", TextView.BufferType.EDITABLE);
            }
        });

        Button button9= (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "9", TextView.BufferType.EDITABLE);
            }
        });

        Button button10= (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "+", TextView.BufferType.EDITABLE);
            }
        });

        Button button11= (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "0", TextView.BufferType.EDITABLE);
            }
        });

        Button button12= (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dial.setText(dial.getText().toString() + "#", TextView.BufferType.EDITABLE);
            }
        });

        Button button13= (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:"+dial.getText()));//change the number
                startActivity(callIntent);
            }
        });

    }
}