package com.example.cs.prevencinembarazo;

/**
 * Created by gesab on 9/17/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    private int[] images = {
            R.drawable.img_mesa,
            R.drawable.img_anticonceptivos,
            R.drawable.img_enfermedades,
            R.drawable.img_legal,
            R.drawable.img_faqs,
            R.drawable.img_parque,
            R.drawable.img_mesa
    };
    private String[] titles = {
            "Bienvenida",
            "Anticonceptivos",
            "Enfermedades",
            "Marco Legal",
            "Preguntas Frecuentes",
            "Actividades del Parque",
            "Acerca de ..."
    };
    private String[] details = {
            "Todo a su tiempo. Antes de tomar una decisión, INFÓRMATE Y PIENSA",
            "Información acerca de métodos anticonceptivos",
            "Información acerca de enfermedades venéreas y de transmisión sexual",
            "Implicaciones legales que puede acarrear un embarazo no planeado",
            "Acceso a preguntas frecuentes realizadas",
            "Detalles acerca de las actividades realizadas por el Parque La Libertad",
            "Acerca de la aplicación para evitar la prevención del embarazo no planeado"
    };

    class ViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;

        public ViewHolder(View itemView) {
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    //Click en un cardview
                    //Snackbar.make(v, "Click en la posición: " + position, Snackbar.LENGTH_LONG).setAction("Action", null).show();
                    Intent intent;
                    context = v.getContext();
                    //Bienvenida
                    if (position == 0) {
                        intent = new Intent(context, BienvenidaActivity.class);
                    }
                    // Anticonceptivos
                    else if (position == 1) {
                        //Toast.makeText(context, "test", Toast.LENGTH_LONG).show();
                        intent = new Intent(context, AnticonceptivosActivity.class);
                    }
                    //Enfermendades
                    else if (position == 2) {
                        intent = new Intent(context, EnfermedadesActivity.class);
                    }
                    //Marco Legal
                    else if (position == 3) {
                        intent = new Intent(context, MarcoLegalActivity.class);
                    }
                    //Preguntas Frecuentes
                    else if (position == 4) {
                        intent = new Intent(context, PreguntasFrecuentesActivity.class);
                    }
                    //Actividades del Parque
                    else if (position == 5) {
                        intent = new Intent(context, CalendarioActivity.class);
                    }
                    //Acerca de
                    else {
                        intent = new Intent(context, AcercadeActivity.class);
                    }
                    context.startActivity(intent);
                    ((Activity) context).overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.itemImage.setImageResource(images[i]);
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}