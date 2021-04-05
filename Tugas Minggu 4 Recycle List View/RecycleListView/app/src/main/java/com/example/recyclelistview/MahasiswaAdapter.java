package com.example.recyclelistview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MahasiswaAdapter  extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<Mahasiswa> dataList;

    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent , false);
        return new MahasiswaViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaAdapter.MahasiswaViewHolder holder, int position) {
        holder.txnama.setText(dataList.get(position).getNama());
        holder.txnim.setText(dataList.get(position).getNim());
        holder.txnohp.setText(dataList.get(position).getNohp());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txnama, txnim, txnohp;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txnama = itemView.findViewById(R.id.tx_nama_mahasiswa);
            txnim = itemView.findViewById(R.id.tx_nim_mahasiswa);
            txnohp = itemView.findViewById(R.id.tx_nohp_mahasiswa);
        }
    }
}
