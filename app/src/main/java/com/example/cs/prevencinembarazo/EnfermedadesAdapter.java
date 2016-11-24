package com.example.cs.prevencinembarazo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gesab on 11/23/2016.
 */

public class EnfermedadesAdapter extends RecyclerView.Adapter<EnfermedadesAdapter.ViewHolder> {
    Context context;
    private String[] titles = {
            "Enfermedades",
            "Anticonceptivos",
            "Enfermedades",
            "Marco Legal",
            "Factores de Riesgo",
            "Preguntas Frecuentes",
            "Actividades del Parque",
            "Acerca de ..."
    };
    private String[] details = {
            "Todo a su tiempo. Antes de tomar una decisión, INFÓRMATE Y PIENSA",
            "Información acerca de métodos anticonceptivos",
            "Información acerca de enfermedades venéreas y de transmisión sexual",
            "Implicaciones legales que puede acarrear un embarazo no planeado",
            "Cuestionario para determinar si las conductas sexuales practicadas son riesgosas",
            "Acceso a preguntas frecuentes realizadas",
            "Detalles acerca de las actividades realizadas por el Parque La Libertad",
            "Acerca de la aplicación para evitar la prevención del embarazo no planeado"
    };

    class ViewHolder extends RecyclerView.ViewHolder {
        public int currentItem;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = (TextView) itemView.findViewById(R.id.item_title);
            itemDetail = (TextView) itemView.findViewById(R.id.item_detail);
        }
    }

    @Override
    public EnfermedadesAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        EnfermedadesAdapter.ViewHolder viewHolder = new EnfermedadesAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EnfermedadesAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}