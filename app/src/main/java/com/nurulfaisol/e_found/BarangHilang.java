package com.nurulfaisol.e_found;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class BarangHilang extends Fragment {
    View view;
    private RecyclerView RV;
    private ArrayList<Barang> ListBarang;

    public BarangHilang() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_barang_di_temukan, container, false);
        RV = view.findViewById(R.id.RV_BarangDiTemukan);
        BarangAdapter barangAdapter = new BarangAdapter(getContext(),ListBarang);
        RV.setLayoutManager(new LinearLayoutManager(getActivity()));
        RV.setAdapter(barangAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListBarang = new ArrayList<>();
        ListBarang.add(new Barang(1,"STNK","1996"));
        ListBarang.add(new Barang(2,"Dompet","Hitam"));
    }
}
