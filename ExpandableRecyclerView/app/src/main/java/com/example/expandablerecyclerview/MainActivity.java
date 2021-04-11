package com.example.expandablerecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.expandablerecyclerview.adapters.FormulaAdapter;
import com.example.expandablerecyclerview.models.Formula;
import com.example.expandablerecyclerview.models.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //RecyclerView recyclerView;
   // List<Formula> formulaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Company> companies = new ArrayList<>();

        ArrayList<Product> googleProduct = new ArrayList<>();
        googleProduct.add(new Product("Google AdSense"));
        googleProduct.add(new Product("Google AdSense"));
        googleProduct.add(new Product("Google Drive"));
        googleProduct.add(new Product("Google Mail"));
        googleProduct.add(new Product("Google Doc"));
        googleProduct.add(new Product("Android"));

        Company google = new Company("Google", googleProduct);
        companies.add(google);

        ArrayList<Product> microsoftProducts = new ArrayList<>();
        microsoftProducts.add(new Product("Windows"));
        microsoftProducts.add(new Product("SkyDrive"));
        microsoftProducts.add(new Product("Microsoft Store"));
        microsoftProducts.add(new Product("Microsoft Office"));
        Company microsoft = new Company("Microsoft", microsoftProducts);
        companies.add(microsoft);

        ProductAdapter adapter = new ProductAdapter(companies);
        recyclerView.setAdapter(adapter);




        // recyclerView = findViewById(R.id.recyclerview);

       /* initData();
        initRecyclerView();*/
    }

   /* private void initRecyclerView() {
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

    }*/
}
