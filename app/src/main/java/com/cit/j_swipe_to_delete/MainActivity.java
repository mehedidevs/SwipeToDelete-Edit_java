package com.cit.j_swipe_to_delete;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MainListAdapter mainListAdapter = new MainListAdapter(getMealList());
        recyclerView.setAdapter(mainListAdapter);
    }

    public List<String> getMealList() {
        List<String> mealList = new ArrayList<>();
        mealList.add("Green Thai Curry");
        mealList.add("Granola");
        mealList.add("Poached Eggs");
        mealList.add("Spaghetti");
        mealList.add("Apple Pie");
        mealList.add("Grilled Cheese Sandwich");
        mealList.add("Vegetable Soup");
        mealList.add("Chicken Noodles");
        mealList.add("Fajitas");
        mealList.add("Chicken Pot Pie");
        mealList.add("Pasta and cauliflower casserole with chicken");
        mealList.add("Vegetable stir-fry");
        mealList.add("Sweet potato and orange soup");
        mealList.add("Vegetable Broth");
        return mealList;
    }
}
