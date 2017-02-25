package com.example.lisa.playingcardworkout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    Button multiplayer;
    EditText name1;
    EditText name2;
    String nam1;
    String nam2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiplayer=(Button)findViewById(R.id.multiplayer_id);
        name1=(EditText)findViewById(R.id.editText);
        name2=(EditText)findViewById(R.id.editText2);



        multiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, sol.class);
                nam1=name1.getText().toString();
                nam2=name2.getText().toString();
                intent.putExtra("NAME", nam1);
                intent.putExtra("Name2",nam2);
                startActivity(intent);
            }
        });



    }
}
