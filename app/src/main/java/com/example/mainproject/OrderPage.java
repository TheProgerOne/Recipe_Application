package com.example.mainproject;

import static com.example.mainproject.MainActivity.fullcoursesList;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mainproject.model.Course;
import com.example.mainproject.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_page);

        ListView orders_list = findViewById(R.id.recom_list);

        List<String> coursesTitle = new ArrayList<>();
        for(Course c : MainActivity.fullcoursesList){
            if(Order.items_id.contains(c.getId()))
                coursesTitle.add(c.getTitle());

        }

        orders_list.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, coursesTitle));


    }


    public void fromLiketoRec(View view){
        Intent intent = new Intent(this, RecomendationPage.class);
        MainActivity.courseList.clear();
        MainActivity.courseAdapter.notifyDataSetChanged();
        startActivity(intent);
    }
    public void fromLiketoMain(View view){
        Intent intent = new Intent(this, MainActivity.class);
        MainActivity.courseList.clear();
        MainActivity.courseAdapter.notifyDataSetChanged();
        startActivity(intent);

    }
}