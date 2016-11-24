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
            "Las 10 enfermedades de transmisión sexual más frecuentes en el mundo entero",
            "CLAMIDIA",
            "GONORREA O BLENORRAGIA",
            "SÍFILIS",
            "HERPES GENITAL",
            "VIH/SIDA",
            "TRICONOMIASIS",
            "CONDILOMAS (HPV)",
            "CANDIDIASIS",
            "LADILLAS",
            "SARNA"
    };
    private String[] details = {
            "Son causadas por más de 30 distintas bacterias, virus y parásitos; la mayoría pueden conducir a enfermedades crónicas, esterilidad y eventualmente la muerte.\n" +
                    "\n" +
                    "Sin embargo, a pesar de su alta incidencia, muchos jóvenes y adultos las desconocen. Y no se hacen suficientes esfuerzos para prevenirlas y controlarlas.\n" +
                    "\n" +
                    "Son las enfermedades de transmisión sexual (ETS), que a nivel mundial afectan a uno de cada 10 jóvenes de entre 15 y 24 años y a cada vez más adultos mayores de 45 años.\n" +
                    "\n" +
                    "En América Latina, la falta de datos y estadísticas dificulta hacerse una idea general del panorama. Y los estudios disponibles demuestran que la incidencia de estas enfermedades varía drásticamente de país a país e incluso de un área geográfica a otra dentro de cada nación.",

            "Es la enfermedad bacteriológica más común. Se transmite a través del sexo vaginal, anal y oral. También al compartir juguetes sexuales o de la madre al hijo durante el embarazo o el parto.\n" +
                    "\n" +
                    "Se cura con un antibiótico y la mejor prevención es el preservativo. Se la conoce como “la infección silenciosa” pues en la mayoría de los casos no manifiesta síntomas. Puede infectar la células del cuello del útero, la uretra, el recto y, a veces, la garganta y los ojos.\n" +
                    "\n" +
                    "Si no se detecta a tiempo puede provocar la enfermedad inflamatoria pélvica (EIP), cuyas consecuencias son el dolor pélvico crónico y esterilidad.\n" +
                    "\n" +
                    "En las mujeres, los síntomas son flujo abundante, sangrado anormal entre los períodos menstruales o durante el acto sexual, dolor al tener relaciones o al orinar y en la parte baja del abdomen.\n" +
                    "\n" +
                    "En los hombres se manifiesta con un líquido blancuzco que sale de la uretra y dolor al orinar o en los testículos.",

            "La gonorrea es una infección bacteriológica de transmisión sexual que puede infectar la uretra, el cuello del útero, el recto, el ano y la garganta, si se ha practicado sexo oral. Los síntomas normalmente aparecen entre 1 y 14 días después de la relación sexual.\n" +
                    "\n" +
                    "Es posible no tener síntomas, y los hombres suelen notarlos más que las mujeres. Los síntomas pueden ser ardor al orinar, líquido blanco o amarillo del pene, flujo vaginal amarillento e irritación o flujo del ano.\n" +
                    "\n" +
                    "Una infección de gonorrea durante un embarazo puede causar problemas graves al bebé. Si una madre está infectada puede pasarle la gonorrea a su bebé durante el parto.\n" +
                    "\n" +
                    "Se cura fácilmente con antibióticos. Pero si no se trata, en la mujer la gonorrea –así como la clamidia- se puede convertir en enfermedad inflamatoria de la pelvis que puede impedirle tener hijos.\n" +
                    "\n" +
                    "Si no se trata en los hombres, también puede dejarlos estériles.",

            "Aunque se cura fácilmente con antibióticos o penicilina, causa miles de muertes en todo el mundo. Se contagia por sexo oral, vaginal o anal, por contacto con la piel de un infectado o al compartir juguetes sexuales. También se puede transmitir en una transfusión de sangre. Se lo puede contagiar la embarazada a su bebé, lo que se conoce como sífilis congénita.\n" +
                    "\n" +
                    "Los síntomas coinciden en hombres y mujeres pero pueden ser difíciles de identificar –parecidos a los de la fiebre y la gripe- e incluso imperceptibles.\n" +
                    "\n" +
                    "En una primera etapa, dos o tres semanas después de que la bacteria haya entrado en el cuerpo, aparecen unos chancros (lastimaduras), generalmente indoloros. Si no se trata durante mucho tiempo, la sífilis puede provocar graves daños al corazón, el cerebro, los ojos y otros órganos internos y provocar la muerte.\n" +
                    "\n" +
                    "Se detecta con un exudado o análisis de sangre y observación de la zona genital.\n" +
                    "\n" +
                    "La sífilis aumenta notablemente el riesgo de contraer el virus del sida.",

            "El herpes genital es un virus similar al del herpes que aparece en la boca y se transmite por vía sexual. También puede trasladarse a la boca durante el sexo oral.\n" +
                    "\n" +
                    "A veces los síntomas aparecen mucho tiempo después de al infección, incluso años.\n" +
                    "\n" +
                    "El virus produce unas dolorosas úlceras alrededor de la vagina y en el pene. Al igual que el herpes labial, una vez que el virus entra al cuerpo permanece ahí durante toda la vida, así que las úlceras pueden reaparecer.\n" +
                    "\n" +
                    "Actualmente hay antibióticos que combaten el virus y lo controlan, pero no existe una cura.\n" +
                    "\n" +
                    "En el caso de las embarazadas, representa un riesgo para el bebé, por lo tanto es necesario consultar al médico en caso de haber tenido herpes.",

            "El Virus de la Immunodeficiencia Humana (VIH) infecta a las células del sistema inmunológico y las destruye, reduciendo la capacidad del cuerpo para protegerse de otras infecciones y del cáncer.\n" +
                    "\n" +
                    "No hay cura: la persona queda infectada de por vida. Si empieza a desarrollar infecciones o cáncer se considera que tiene Síndrome de Inmunodeficiencia Adquirido, sida.\n" +
                    "\n" +
                    "El VIH se transmite sólo a través del ingreso de sangre, semen, fluidos vaginales o leche materna al cuerpo. Las dos maneras más frecuentes de contagiarse es por sexo vaginal o anal sin condón o por compartir jeringas o agujas infectadas. El virus puede pasar de madre a bebé antes o durante el parto y al darle de mamar.\n" +
                    "\n" +
                    "Otras vías de contagio son las transfusiones de sangre, el sexo oral y en menor medida en el dentista o a través de besos, si ambas personas tienen heridas en la boca.\n" +
                    "\n" +
                    "Los síntomas no son inmediatos. La única forma de detectar el virus es por medio de un examen de sangre.",

            "Causada por el protozoo Trichomonas vaginalis, es una ETS muy común. Casi siempre se transmite por contacto sexual. En las mujeres, infecta las células de la vagina y la uretra (el orificio para orinar), en los hombres las de la uretra.\n" +
                    "\n" +
                    "Se transmite por sexo vaginal, compartir juguetes sexuales o de la embarazada al hijo.\n" +
                    "\n" +
                    "Casi la mitad de las mujeres no presentan síntomas. Las molestias pueden aparecer desde 3 a 21 días después de contraer el parásito. En las mujeres, los síntomas son flujo blanco o de mal olor, picazón o ardor en la vagina, dolor al orinar y/o al tener relaciones sexuales y molestias abdominales.\n" +
                    "\n" +
                    "En los hombres presenta líquido en la uretra, dolor o ardor al orinar o inflamación del glande o el prepucio (menos común). Se detecta con un hisopado y se cura con antibióticos. En el caso de embarazadas, mujeres que dan de mamar o que toman píldora anticonceptiva, hay que consultar al médico.\n" +
                    "\n" +
                    "Para evitar nuevas infecciones, la pareja sexual debe tratarse también.",
            "Los condilomas o verrugas genitales son sumamente comunes y contagiosas, causadas por el virus del papiloma humano, VPH o HPV, por sus siglas en inglés. Se transmite al mantener relaciones sexuales por vía oral, genital o anal con un infectado aunque también puede contraerse con simple contacto de piel a piel.\n" +
                    "\n" +
                    "Se manifiesta en forma de verrugas localizadas en los genitales o el ano. Sin atención médica, las verrugas crecen y toman una forma similar a una coliflor.\n" +
                    "\n" +
                    "En los hombres, las verrugas genitales se pueden observar generalmente en la cabeza del pene. En las mujeres, algunos tipos de HPV -hay más de 100- pueden llegar a producir cáncer del cuello del útero. Los síntomas incluyen, además de las verrugas, malestar permanente en la zona genital. Si una mujer embarazada tiene condilomas, su hijo puede infectarse durante el parto.\n" +
                    "\n" +
                    "El tratamiento de los condilomas suele ser rápido y sencillo. Se aplican cremas o se extirpan las verrugas con calor, frío, láser o una pequeña intervención quirúrgica.",

            "Es causada por un hongo llamado Candida albicans que vive en la piel, la boca y las áreas genitales. Generalmente se mantiene bajo control, pero a veces crece y produce esta enfermedad.\n" +
                    "\n" +
                    "El uso de ropa ajustada, como jeans o ropa interior de materiales sintéticos que no favorecen la ventilación, el embarazo, la quimioterapia, diabetes, VIH u otras enfermedades que afectan el sistema inmunológico o el uso de productos que irriten la vagina, como jabones o champúes aumentan el riesgo de Candidiasis.\n" +
                    "\n" +
                    "El hongo puede contagiarse a través del sexo vaginal, anal u oral, por los dedos o por compartir juguetes sexuales.\n" +
                    "\n" +
                    "Muchas veces no hay síntomas. El tratamiento es simple y consiste en cremas, óvulos vaginales, pastillas o una combinación de los tres.\n" +
                    "\n" +
                    "Si no se trata, generalmente se van solos, pues el cuerpo los combate de manera natural, pero en el hombre pueden provocar inflamaciones de la uretra.",

            "Las ladillas o piojos púbicos son unos molestos y pequeños parásitos que se clavan en la piel para alimentarse de sangre. Viven en el vello corporal, especialmente en el vello púbico, aunque también pueden encontrarse en el vello de las axilas, la cara o el pecho. Los piojos son de color amarillo-gris y usan sus pinzas para agarrarse a las hebras de cabello.\n" +
                    "\n" +
                    "Las ladillas se pasan fácilmente durante el sexo, pero también se pueden pasar compartiendo ropa, toallas o ropa de cama con alguien que las tiene. Las ladillas no pueden trasmitirse por medio de asientos de inodoro o en piscinas.\n" +
                    "\n" +
                    "Los síntomas son picazón e inflamación en la piel. A veces se pueden ver los piojos y los huevos, y también puntos de sangre ya que los bichos se alimentan de los vasos sanguíneos de la piel.\n" +
                    "\n" +
                    "Se cura con champúes especiales. Deben lavarse las toallas y ropa de cama y evitar tener relaciones sexuales hasta completar el tratamiento.",

            "Es una infección de la piel causada por un minúsculo parasito que anida en la piel y deposita huevos. Se transmite fácilmente a través de contacto físico cercano o sexual. Los niños también pueden contagiarse si están cerca de alguien con sarna.\n" +
                    "\n" +
                    "Los parásitos se alojan en la zona genital, las manos, entre los dedos, en muñecas y codos, axilas, el abdomen, el pecho, alrededor de los pezones en las mujeres, en los pies, los tobillos y las nalgas.\n" +
                    "\n" +
                    "Los bichos sobreviven 72 horas lejos de la piel, por lo tanto pueden estar presentes en la ropa, la cama y las toallas. Algunas personas no perciben los síntomas, que pueden estar ausentes incluso hasta seis semanas después de contraer el parásito.\n" +
                    "\n" +
                    "Los síntomas son gran picazón – que a veces ocurre sólo de noche- irritación y lastimaduras por rascarse\n" +
                    "\n" +
                    "El tratamiento es simple y consiste en aplicarse una loción o crema. Todas las personas cercanas deben tratarse también, y hay que lavar con agua bien caliente la ropa, sábanas y toallas."
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