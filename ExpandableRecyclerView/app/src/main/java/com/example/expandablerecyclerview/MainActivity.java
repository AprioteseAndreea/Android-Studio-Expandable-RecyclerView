package com.example.expandablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.expandablerecyclerview.adapters.FormulaAdapter;
import com.example.expandablerecyclerview.models.Formula;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Formula> formulaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        FormulaAdapter formulaAdapter = new FormulaAdapter(this, formulaList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(formulaAdapter);
    }

    private void initData() {
        formulaList = new ArrayList<>();



        formulaList.add(new Formula("Basic Trigonometry Formulas",
                "formula1"));
        formulaList.add(new Formula("Even Odd Formula",
                "formula2"));
        formulaList.add(new Formula("Cosine Rule",
               "formula3"));
        formulaList.add(new Formula("First Quadrant",
               "formula4"));

    }
}
