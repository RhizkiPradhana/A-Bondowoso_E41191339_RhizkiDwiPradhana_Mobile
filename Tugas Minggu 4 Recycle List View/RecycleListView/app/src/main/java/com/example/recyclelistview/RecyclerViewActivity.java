package com.example.recyclelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView rvMahasiswa;
    private MahasiswaAdapter adapterMahasiswa;
    private ArrayList<Mahasiswa> mDataMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        adapterMahasiswa = new MahasiswaAdapter(mDataMahasiswa);

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager( this));
        rvMahasiswa.setAdapter(adapterMahasiswa);
    }

    private void addData() {
        mDataMahasiswa = new ArrayList<>();
        mDataMahasiswa.add(new Mahasiswa( "Rhizki", "E41191339", "089517099"));
        mDataMahasiswa.add(new Mahasiswa( "Pradhana", "E41191331", "089517021"));
        mDataMahasiswa.add(new Mahasiswa( "Joko", "E41191202", "089517019"));
        mDataMahasiswa.add(new Mahasiswa( "Susanto", "E41191320", "089517015"));
        mDataMahasiswa.add(new Mahasiswa( "Dwi", "E41191223", "089517010"));
        mDataMahasiswa.add(new Mahasiswa( "Chelsea", "E41191330", "089517012"));
        mDataMahasiswa.add(new Mahasiswa( "Putri", "E41191201", "0895170555"));
        mDataMahasiswa.add(new Mahasiswa( "Indah", "E41191334", "0895170412"));

    }

}