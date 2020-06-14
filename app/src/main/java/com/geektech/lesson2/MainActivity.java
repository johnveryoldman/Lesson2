package com.geektech.lesson2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String SAVED_STRING = "saved_string";

    private String inputedText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ololo", "onCreate");

        Log.d("ololo", "inputedText: " + inputedText);
        EditText editText = findViewById(R.id.edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Log.d("ololo", "beforeTextChanged" + s.toString());
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("ololo", "onTextChanged" + s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.d("ololo", "afterTextChanged" + s.toString());
                inputedText = s.toString();
            }
        });
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("ololo", "onRestoreInstanceState");
        inputedText = savedInstanceState.getString(SAVED_STRING);
        Log.d("ololo", "inputedText: " + inputedText);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("ololo", "onSaveInstanceState");
        outState.putString(SAVED_STRING, inputedText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ololo", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ololo", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ololo", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ololo", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("ololo", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ololo", "onDestroy");
    }
}