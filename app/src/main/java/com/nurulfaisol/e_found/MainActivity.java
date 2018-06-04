package com.nurulfaisol.e_found;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabAdapter tabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout =  (TabLayout)findViewById(R.id.TabLayout);
        viewPager = (ViewPager)findViewById(R.id.Pager);
        tabAdapter = new TabAdapter(getSupportFragmentManager());

        tabAdapter.TambahFragment(new BarangDiTemukan(), "BARANG DITEMUKAN");
        tabAdapter.TambahFragment(new BarangHilang(), "BARANG HILANG");
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
