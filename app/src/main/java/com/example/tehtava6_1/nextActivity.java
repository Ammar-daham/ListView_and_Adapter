package com.example.tehtava6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {

    int pos = 0;

    TextView tvName, tvStart, tvEnd, tvDescription;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent intent = getIntent();
        pos = intent.getExtras().getInt("Position");

        final CustomAdapter adapter = new CustomAdapter(this);
        final TextView name = findViewById(R.id.tvName);
        TextView startYear = findViewById(R.id.tvStart);
        TextView endYear = findViewById(R.id.tvEnd);
        TextView description = findViewById(R.id.tvDescription);
        //set data
        name.setText(adapter.names[pos]);
        startYear.setText(adapter.stratYear[pos]);
        endYear.setText(adapter.endYear[pos]);
        description.setText(adapter.description[pos]);


        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = pos + 1;

                name.setText(adapter.names[position]);

                if(!(position >= adapter.getCount() - 1)) {
                    pos++;
                } else {
                    pos = -1;
                }

            }
        });


        



    }
}