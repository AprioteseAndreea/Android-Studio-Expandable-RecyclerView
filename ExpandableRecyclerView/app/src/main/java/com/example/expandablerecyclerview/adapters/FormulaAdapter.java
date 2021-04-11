package com.example.expandablerecyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.expandablerecyclerview.R;
import com.example.expandablerecyclerview.models.Formula;

import java.util.List;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class FormulaAdapter extends RecyclerView.Adapter<FormulaAdapter.ViewHolder>{

    List<Formula> formulaList;
    Context mContext;

    public FormulaAdapter(Context mContext, List<Formula> formulaList) {
        this.formulaList = formulaList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.formula_cell, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        Formula formula = formulaList.get(position);
        holder.textViewMonth.setText(formula.getName());
        holder.textViewName.setText(formula.getFormula());

       holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,holder.textViewMonth.getText(),Toast.LENGTH_SHORT).show();
            }
        });

       boolean isExpanded = formulaList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return formulaList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout expandableLayout;
        TextView textViewMonth;
        TextView textViewName;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            textViewMonth = itemView.findViewById(R.id.textViewMonth);
            textViewName = itemView.findViewById(R.id.formulatext);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            linearLayout =itemView.findViewById(R.id.parent_layout);

           textViewMonth.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                    Formula formula = formulaList.get(getAdapterPosition());
                    formula.setExpanded(!formula.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}