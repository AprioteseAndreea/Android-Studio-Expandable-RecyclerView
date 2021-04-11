package com.example.expandablerecyclerview;

import android.view.View;
import android.widget.TextView;

import com.example.expandablerecyclerview.models.Product;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {
    private TextView mTextView;

    public ProductViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.textView);
    }
    public void bind(Product product){
        mTextView.setText(product.name);
    }
}
