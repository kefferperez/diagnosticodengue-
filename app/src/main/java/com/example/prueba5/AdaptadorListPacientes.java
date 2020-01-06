package com.example.prueba5;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdaptadorListPacientes extends RecyclerView.Adapter<AdaptadorListPacientes.ViewHolder>{
    private Context mCtx;
    private List<Paciente> playerList;
    public AdaptadorListPacientes(Context mCtx, List<Paciente> playerList) {
        this.mCtx=mCtx;
        this.playerList = playerList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.lista_paciente, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Paciente player =playerList.get(position);
        holder.titulo.setText(player.getNombre()+" "+player.getApellidoPaterno()+" "+player.getApellidoMaterno());
        holder.subtitutlo.setText(player.getCodigo());
    }
    @Override
    public int getItemCount() {
        return playerList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titulo, subtitutlo;
        public ImageView icon;
        ViewHolder(View itemView) {
            super(itemView);
            titulo = (TextView)itemView.findViewById(R.id.titulo);
            subtitutlo = (TextView)itemView.findViewById(R.id.subtitulo);
            icon = (ImageView)itemView.findViewById(R.id.icono);
        }
    }
}
