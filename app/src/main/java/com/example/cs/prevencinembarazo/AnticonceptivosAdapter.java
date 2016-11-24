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

public class AnticonceptivosAdapter extends RecyclerView.Adapter<AnticonceptivosAdapter.ViewHolder> {
    Context context;
    private String[] titles = {
            "¿Qué y cuáles son los métodos anticonceptivos?",
            "Métodos hormonales:",
            "Métodos no hormonales reversibles:",
            "Métodos no hormonales permanentes:",

            "Ejemplos de métodos anticonceptivos:",
            "Coitus interruptus:",
            "Abstinencia sexual:",
            "Método del ritmo:",
            "Método de la temperatura basal:",
            "Amenorrea de lactancia:",
            "Preservativo:",
            "Preservativo femenino:",
            "Diafragma:",
            "Capuchones cervicales:",
            "Esponja anticonceptiva:",
            "Dispositivo intrauterino (DIU):",
    };
    private String[] details = {
            "Son los métodos o procedimientos que previenen un embarazo en mujeres sexualmente activas, ya sean ellas o sus parejas quienes los usen. Pueden ser hormonales o no hormonales, transitorios o definitivos, basados en tecnología o en conductas. Los métodos anticonceptivos (MAC) disponibles actualmente en Costa Rica son:",

            "Métodos combinados que contienen estrógeno y progestágeno y que se pueden administrar como píldoras, inyecciones, anillo vaginal o parche transdérmico.\n" +
                    "Métodos que contienen solo progestágeno y que se pueden administrar como\n" +
                    "píldoras, inyecciones, implantes, anillo vaginal o dispositivo intrauterino.\n" +
                    "Anticoncepción hormonal de emergencia que puede consistir en píldoras de levonorgestrel solo o en píldoras combinadas (Método de Yuzpe).",

            "Dispositivos intrauterinos con cobre.\n" +
                    "Anticonceptivos de barrera masculinos (condón) y femeninos (condón, diafragma; espermicidas).\n" +
                    "Método de la amenorrea de lactancia.\n" +
                    "Métodos de abstinencia periódica (ritmo o calendario, días fijos o collar del ciclo, temperatura basal, moco cervical (Billings), sintotérmico).",

            "Anticoncepción quirúrgica voluntaria (esterilización) femenina.\n" +
                    "Anticoncepción quirúrgica voluntaria (esterilización) masculina.",

            "",
            "La privación total o parcial de contacto sexual por voluntad propia, se suele practicar por motivos religiosos, morales, emocionales o de contracepción. Se considera 100% efectivo pues no hay penetración vaginal.",
            "Literalmente: coito interrumpido, es un procedimiento natural y de larga data que consiste en extraer el pene de la vagina antes de la eyaculación. No es totalmente fiable, pues la lubricación previa del pene ocurre a través sustancias capaces de fecundar.",
            "También conocido como método del calendario o método Ogino-Knaus, es natural pero no del todo confiable, pues consiste en limitar el coito a los días infértiles previos a la ovulación o posteriores a ella. Tiene un porcentaje de seguridad del 80%, pero es difícil de emplear en mujeres con ciclos menstruales irregulares.",
            "Consiste en la medición en ayunas de la temperatura corporal (boca, ano y vagina) para discernir los días fértiles de la mujer, evitando el coito hasta que el descenso de la misma anuncie el fin de la ovulación. Se le atribuye una tasa de fallos incluso inferior a la del preservativo, pero requiere control estricto del ciclo menstrual.",
            "Durante los primeros 6 meses luego del parto, se produce un período de infertilidad y ausencia de menstruación (amenorrea) que puede emplearse como anticonceptivo natural. Este procedimiento es eficaz siempre y cuando el amamantamiento sea continuo y frecuente.",
            "El profiláctico o condón, es un anticonceptivo de barrera consistente en una funda desechable de látex, que recubre el pene erecto antes de la penetración y aísla los fluidos. Es también eficaz contra enfermedades de transmisión sexual (ETS) y tiene un margen de fallo de apenas 15%, debido a posibles roturas del material.",
            "Semejante al masculino, el condón femenino se ubica dentro de la vagina y separa físicamente el contacto entre los genitales y los fluidos. Es igual de confiable y de eficaz contra las ETS que su versión masculina.",
            "Es un dispositivo flexible y delgado con forma de disco, colocado en el cuello uterino para impedir el acceso al óvulo de los espermatozoides. Muchos contienen también sustancias espermicidas para mayor protección. Requiere de instrucciones médicas para su empleo, pero una vez colocado tiene un margen de fallo de apenas 6%.",
            "Semejantes al diafragma: copas de silicona fina ubicadas en el interior de la vagina, para impedir el acceso de los espermatozoides al útero.",
            "Se introduce al cuello uterino esta esponja sintética y flexible, impregnada de sustancias espermicidas, donde hará las veces de barrera durante el coito. Deberá permanecer allí hasta al menos 8 horas después de la eyaculación, para que surta su efecto completo.",
            "Aparatos especialmente colocados en el cuello uterino por un ginecólogo y que impiden la fecundación, normalmente a través de liberación hormonal. El DIU permanece en el interior del cuerpo y sólo debe ser removido por un especialista."
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
    public AnticonceptivosAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        AnticonceptivosAdapter.ViewHolder viewHolder = new AnticonceptivosAdapter.ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AnticonceptivosAdapter.ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}