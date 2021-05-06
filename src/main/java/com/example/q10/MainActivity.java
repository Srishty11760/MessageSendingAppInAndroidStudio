package com.example.q10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button b;
EditText et;
String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        et=findViewById(R.id.edt);
        b.setOnClickListener(new clk());
        s=et.getText().toString();
    }

    @Override
    protected void onResume(){
        super.onResume();
        s=et.getText().toString();
    }
    class clk implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,s);
            startActivity(intent.createChooser(intent,"share"));
        }
    }
}