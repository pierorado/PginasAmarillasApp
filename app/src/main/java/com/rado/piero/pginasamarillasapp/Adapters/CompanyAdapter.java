package com.rado.piero.pginasamarillasapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rado.piero.pginasamarillasapp.Models.Company;
import com.rado.piero.pginasamarillasapp.R;

import java.util.ArrayList;
import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.ViewHolder> {
    private static final String TAG=CompanyAdapter.class.getSimpleName();

    private AppCompatActivity activity;

    private List<Company> companies;

    public CompanyAdapter(AppCompatActivity activity){
        this.activity=activity;
        companies=new ArrayList<>();
    }
    public void setCompanies(List<Company> companies){
        this.companies=companies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view  = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_company, viewGroup, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


     class ViewHolder extends RecyclerView.ViewHolder {
         public ViewHolder(@NonNull View itemView) {
             super(itemView);

         }
    }
}
