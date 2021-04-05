package com.elapp.minggu4view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private com.elapp.minggu4view.MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Fajar", "E4119029", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Arip", "E41190812", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Totok", "E4119129", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Joni", "E41191204", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Doni", "E41192020", "123456789"));

    }
}