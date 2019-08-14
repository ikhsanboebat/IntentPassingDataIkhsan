package com.example.intentpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homepage extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button explicitintent;
        Button explicitintent2;

        explicitintent = (Button)findViewById(R.id.button_ke_intent1);
        explicitintent.setOnClickListener(this);
        explicitintent2 = (Button)findViewById(R.id.button_ke_intent2);
        explicitintent2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_ke_intent1:
                Intent explicit = new Intent(Homepage.this, MainActivity.class);
                startActivity(explicit);
                break;
            case R.id.button_ke_intent2:
                Intent explicit2 = new Intent(Homepage.this,Main3Activity.class);
                startActivity(explicit2);
                break;
            default:
                break;
        }
    }
}
