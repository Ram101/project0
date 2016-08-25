package com.example.ramanandank.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mPopularMoviesApp;
    Button mStockHawkApp;
    Button mBuildItBiggerApp;
    Button mMaterialApp;
    Button mGoUbiquitousApp;
    Button mCapstoneApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtons();
        initListeners();
    }

    private void initListeners() {
        mPopularMoviesApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Button will launch Popular Movies App", Toast.LENGTH_SHORT).show();
            }
        });
        mStockHawkApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Button will launch Stock hawk App", Toast.LENGTH_SHORT).show();
            }
        });
        mBuildItBiggerApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Button will launch Build it Bigger App", Toast.LENGTH_SHORT).show();
            }
        });
        mMaterialApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Button will launch Material App", Toast.LENGTH_SHORT).show();
            }
        });
        mGoUbiquitousApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Button will launch Go Ubiquitous App", Toast.LENGTH_SHORT).show();
            }
        });
        mCapstoneApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This Button will launch Capstone App", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initButtons() {
        mPopularMoviesApp = (Button) findViewById(R.id.popular_movies);
        mStockHawkApp     = (Button) findViewById(R.id.stock_hawk);
        mBuildItBiggerApp = (Button) findViewById(R.id.build_it_bigger);
        mMaterialApp      = (Button) findViewById(R.id.material_app);
        mGoUbiquitousApp  = (Button) findViewById(R.id.go_ubiquitous_app);
        mCapstoneApp      = (Button) findViewById(R.id.capstone_app);
    }
}
