package com.navigation.madusankai.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.testText)
    TextView title;

    @BindView(R.id.edit_text)
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        title.setText("Hello ButterKnife");
    }

    String hello= "kfk";
    @OnClick(R.id.button)
    public void submit() {
        Toast.makeText(MainActivity.this,"Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT).show();
    }

   @OnClick(R.id.submit_button)
    public void submitbutton(){
       Toast.makeText(MainActivity.this,"Hello from Butterknife OnClick annotation", Toast.LENGTH_SHORT).show();
   }
}