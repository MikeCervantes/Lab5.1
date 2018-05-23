package com.example.kid_d_000.lab51;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {
    ArrayList<Item> listDatos;
    Context context;

    public AdapterDatos(ArrayList<Item> listDatos, Context context) {
        this.listDatos = listDatos;
        this.context=context;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolderDatos holder, int position) {
        holder.nombre.setText(listDatos.get(position).getNombre());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,DetallesActivity.class);
                intent.putExtra("nombre",holder.nombre.getText().toString());
                intent.putExtra("fabricante",listDatos.get(holder.getAdapterPosition()).getFabricante());
                intent.putExtra("version",listDatos.get(holder.getAdapterPosition()).getVersion());
                intent.putExtra("maxRange",listDatos.get(holder.getAdapterPosition()).getMaxRange());
                intent.putExtra("minDelay",listDatos.get(holder.getAdapterPosition()).getMinDelay());
                intent.putExtra("power",listDatos.get(holder.getAdapterPosition()).getPower());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView nombre;
        CardView card;

        public ViewHolderDatos(View itemView) {
            super(itemView);

            nombre=itemView.findViewById(R.id.idSensor);
            card=itemView.findViewById(R.id.cardView);
        }
    }
}
