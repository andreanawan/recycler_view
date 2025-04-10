package com.example.recycler_view;

import static com.example.recycler_view.R.*;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    private List<Makanan> MakananList;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(Makanan modelMakanan);

    }

    public MakananAdapter(List<Makanan> makananList, OnItemClickListener listener) {
        this.MakananList = makananList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Makanan makanan = this.MakananList.get(position);
        holder.namamakanan.setText(makanan.getNama());
        holder.hargamakanan.setText(makanan.getHargaMakanan());
        holder.Deskripsi.setText(makanan.getDeskripsi());
        holder.imagemakanan.setImageResource(makanan.getImagemakanan());

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(makanan);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.MakananList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView namamakanan;
        TextView hargamakanan;
        TextView Deskripsi;
        ImageView imagemakanan;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namamakanan = itemView.findViewById(R.id.tvnamamakanan);
            Deskripsi = itemView.findViewById(R.id.tvdeskripsi);
            hargamakanan = itemView.findViewById(R.id.tvhargamakanan);
            imagemakanan = itemView.findViewById(R.id.mgmakanan);
        }
    }
}
