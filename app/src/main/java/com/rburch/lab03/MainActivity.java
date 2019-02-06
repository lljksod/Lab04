package com.rburch.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer praiseCount = 0;
    private String[] mPraises;
    private Button mb1, mb2, mb3, mb4;
    private TextView mTv;

    private static final String PRAISE_COUNTER = "praises";

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt(PRAISE_COUNTER, praiseCount);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            praiseCount = savedInstanceState.getInt(PRAISE_COUNTER);
        }

        mPraises = getResources().getStringArray(R.array.sPraiseArray);

        mTv = findViewById(R.id.detailTextView);
        mb1 = findViewById(R.id.buttonPraise1);
        mb2 = findViewById(R.id.buttonPraise2);
        mb3 = findViewById(R.id.buttonPraise3);
        mb4 = findViewById(R.id.buttonPraise4);

        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                praiseCount++;
                mTv.setText(mPraises[0] + "\n" + "Praise Count = " + praiseCount.toString());
            }
        });

        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                praiseCount++;
                mTv.setText(mPraises[1] + "\n" + "Praise Count = " + praiseCount.toString());
            }
        });

        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                praiseCount++;
                mTv.setText(mPraises[2] + "\n" + "Praise Count = " + praiseCount.toString());
            }
        });

        mb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                praiseCount++;
                mTv.setText(mPraises[3] + "\n" + "Praise Count = " + praiseCount.toString());
            }
        });
    }
}
