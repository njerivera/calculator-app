package com.example.mycalcapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void onButtonClick(View v) {
        EditText e1 = (EditText) findViewById(R.id.editText);
        EditText e2 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int sum = num1 + num2;
        t1.setText(Integer.toString(sum));

    }


    public void onButton2Click(View v) {
        EditText e3 = (EditText) findViewById(R.id.editText);
        EditText e4 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        int num1 = Integer.parseInt(e3.getText().toString());
        int num2 = Integer.parseInt(e4.getText().toString());
        int subtract = num1 - num2;
        t1.setText(Integer.toString(subtract));

    }

    public void onButton3Click(View v) {
        EditText e5 = (EditText) findViewById(R.id.editText);
        EditText e6 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        int num1 = Integer.parseInt(e5.getText().toString());
        int num2 = Integer.parseInt(e6.getText().toString());
        int multiply = num1 * num2;
        t1.setText(Integer.toString(multiply));

    }


    public void onButton4Click(View v) {
        EditText e7 = (EditText) findViewById(R.id.editText);
        EditText e8 = (EditText) findViewById(R.id.editText2);
        TextView t1 = (TextView) findViewById(R.id.textView);
        int num1 = Integer.parseInt(e7.getText().toString());
        int num2 = Integer.parseInt(e8.getText().toString());
        int divide = num1 / num2;
        t1.setText(Integer.toString(divide));


    }
}


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//}
