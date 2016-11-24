package com.example.cs.prevencinembarazo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by gesab on 11/23/2016.
 */

public class MarcoLegalAdapter extends RecyclerView.Adapter<MarcoLegalAdapter.ViewHolder> {
    Context context;
    private String[] titles = {
            "Ley de Protección Integral a la Madre Adolescente:",
            "Ley de Promoción de la Igualdad Social de la Mujer ",
            "Ley de Paternidad Responsable"
    };
    private String[] details = {
            "Art. 9: Señala la obligación de las clínicas del Seguro Social y los centros de salud, de “impartir cursos informativos de educación sexual, dirigidos a las madres adolescentes, con el propósito de evitar la posibilidad de otro embarazo no planeado.",
            "Art. 9: Establece el derecho de padres y madres laboralmente activas a contar con el servicio de apoyo de centros infantiles. Los de escasos recursos económicos tendrán además derecho a recibir un subsidio por parte del estado. \n" +
                    "Art. 32: Establece el derecho de la trabajadora que adopte un menor de edad a licencia de maternidad por tres meses. ",
    "Art. 1: Establece un mecanismo para la declaración de paternidad de los presunto padre. "
    };

    class ViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);
        }
    }

    @Override
    public MarcoLegalAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        MarcoLegalAdapter.ViewHolder viewHolder = new MarcoLegalAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MarcoLegalAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}