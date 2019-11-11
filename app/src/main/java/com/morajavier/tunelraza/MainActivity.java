package com.morajavier.tunelraza;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    ListView listaImagenes;
    ImageView imageViewTmp;
    private ArrayList<Descripciones> descripcionesCont;
    private String[] descripcionesImagens = {
            "Si toda la historia de la Tierra se representara en un año, los ultimos 15 minutos, es decir, de las 23:45 a la media noche del dia 31 de diciembre, significaría los últimos 130 mil años.",
            "Fósiles humanos de hace 160 mil años muestran que los primeros Homo sapiens eran completamente semejantes a nosotros.\n Hace 130 mil años habían bosques en el Ártico, mientras que en África existían ya seres humanos.",
            "Hace 85 mil años comenzó la salida de los primeros humanos modernos de África rumbo a Asia; los cuales se cree estuvieron en peligro de extinción a causa de la erupción de un gran volcán en Sumatra que abrió un cráter de 100 km de ancho, hoy ocupado por el lago Toba.",
            "Hace 55 mil años siguieron las migraciones de los humanos cazadores y recolectores hacia el sur y este de Asia, Australia y Europa.",
            "Hace 32 mil años comenzaron a extinguirse los neandertales. Por otro lado las, primeras señales de la creatividad humana aparecen plasmadas en piedras. Las pinturas rupestres son esencialmente una expresión espiritual primitiva y están relacionadas con prácticas de magia y religión para propiciar la caza.",
            "Los seres humanos no son originarios de América. Se cree que llegaron a este continente procedentes de Siberia hace cerca de 20 mil años. Durante la última glaciación se creó un punto terrestre, conocido como el Estrecho de Bering, por donde cruzaron.",
            "Durante miles de años los humanos se alimentaron y sobrevivieron solo cazando animales y recolectando plantas. Mucho de los animales que se conocian entonces ya no existen.",
            "Hace 10 mil años se inicia la historia humana escrita. En un inicio la escritura era pictográfica, es decir, se usaban dibujos simples que representaban objetos, pero con ellos no podian comunicarse ideas abstractas.",
            "Hace 5 mil 500 años surgen numerosas comunidades agricolas en el valle de Mesopotamia, entre los rios Tigris y Eufrates. Estas comunidades evolucionaron y surgieron las primeras civilizaciones, como los sumerios. Posteriormente aparecieron las culturas acadias, asirias y babilonicas, las cuales aprovecharon las técnicas y conocimientos que se iban desarrollando en la región para formar nuevas grandes ciudades.",
            "Hace 4 mil 500 años se construyeron las piramides de Egipto. La primera de grandes proporciones, albergaba los restos del rey, pero las mas famosas son las de Keops, Kefren y Micerino que se encuentran en el valle de Guiza.",
            "Hasta el final del Neolítico, es decir la Edad de Piedra, la humanidad construía herramientas sólo de este material. Más tarde, aprendió a hacer objetos de metal que resultaron ser cada vez más útiles y resistentes. Primero se usó el cobre y, al mezclarlo con estaño, se obtuvo el bronce."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageViewTmp = findViewById(R.id.imagentunel);
        listaImagenes = findViewById(R.id.list_image_raza);
        descripcionesCont = new ArrayList<Descripciones>();
        descripcionesCont.add(new Descripciones(R.drawable.uno, "Historia de los ultimos 130 mil años"));
        descripcionesCont.add(new Descripciones(R.drawable.dosraz, "De las selvas cálidas a la edad de hielo"));
        descripcionesCont.add(new Descripciones(R.drawable.tresr, "De África hacia el resto del mundo"));
        descripcionesCont.add(new Descripciones(R.drawable.cuatror, "Las miraciones humanas"));
        descripcionesCont.add(new Descripciones(R.drawable.cincora, "Pruebas de la creatividad humana"));
        descripcionesCont.add(new Descripciones(R.drawable.seis, "Los dos últimos minutos"));
        descripcionesCont.add(new Descripciones(R.drawable.siete, "Desaparecen los más grandes"));
        descripcionesCont.add(new Descripciones(R.drawable.ocho, "Primeros registros de la historia humana"));
        descripcionesCont.add(new Descripciones(R.drawable.nueve, "Primeras ciudades"));
        descripcionesCont.add(new Descripciones(R.drawable.diez, "Grandes construcciones"));
        descripcionesCont.add(new Descripciones(R.drawable.once, "Muy cerca de nuestra época"));

        AdaptadorRaza adaptadorRaza = new AdaptadorRaza(MainActivity.this, R.layout.list_item, descripcionesCont);
        //AdaptadorRaza adapterRaza = new AdaptadorRaza(ListFragment.this, R.id.list_item, descripcionesCont);
        listaImagenes.setAdapter(adaptadorRaza);

        listaImagenes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, descripcionesImagens[i], Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void hacerToast(View v){

    }
}
