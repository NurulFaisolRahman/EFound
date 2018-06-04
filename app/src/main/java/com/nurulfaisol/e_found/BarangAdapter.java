package com.nurulfaisol.e_found;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.ViewHolder> {

    Context context;
    ArrayList<Barang> ListBarang;
    Dialog dialog;

    public BarangAdapter(Context context, ArrayList<Barang> listBarang) {
        this.context = context;
        ListBarang = listBarang;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.custom_row,parent,false);
        final ViewHolder viewHolder = new ViewHolder(view);

        dialog = new Dialog(context);
        dialog.setContentView(R.layout.pop_up_barang);
        viewHolder.customrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Item "+String.valueOf(viewHolder.getAdapterPosition()), Toast.LENGTH_SHORT).show();
                dialog.show();
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.NamaBarang.setText(ListBarang.get(position).getNamaBarang());
        holder.Deskripsi.setText(ListBarang.get(position).getDeskripsi());
    }

    @Override
    public int getItemCount() {
        return ListBarang.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView NamaBarang,Deskripsi;
        private LinearLayout customrow;

        public ViewHolder(View itemView) {
            super(itemView);
            customrow = itemView.findViewById(R.id.ItemBarang);
            NamaBarang = itemView.findViewById(R.id.NamaBarang);
            Deskripsi = itemView.findViewById(R.id.Deskripsi);

        }
    }
}
