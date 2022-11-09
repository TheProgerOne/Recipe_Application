package com.example.mainproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mainproject.model.Course;
import com.example.mainproject.model.Order;

import java.util.ArrayList;
import java.util.List;

public class RecomendationPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recom);

    }
        public void fromRectoMain (View view){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        public void fromRectoLike (View view){
            Intent intent = new Intent(this, OrderPage.class);
            startActivity(intent);
        }

}
