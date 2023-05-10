package com.tfg.apptrasplanterenal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Clase: SupervivenciaInjerto.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class SupervivenciaInjerto extends AppCompatActivity {
    /* Botones flotantes. */
    ExtendedFloatingActionButton opcionesSupervivenciaInjerto;
    FloatingActionButton botonFlotanteCalcularSupervivenciaInjerto;
    FloatingActionButton botonFlotanteNuevoReceptorSupervivenciaInjerto;
    FloatingActionButton botonFlotanteBorrarSupervivenciaInjerto;
    TextView textViewCalcularSupervivenciaInjerto;
    TextView textViewNuevoReceptorSupervivenciaInjerto;
    TextView textViewBorrarSupervivenciaInjerto;
    Boolean opcionesDesplegadasSupervivenciaInjerto;
    Boolean vistasAtenuadasSupervivenciaInjerto;
    /* Animaciones de los botones flotantes. */
    Animation animAtenuarVistaSupervivenciaInjerto;
    Animation animAumentarVistaSupervivenciaInjerto;
    Animation animGirarOpcionesAlAbrirSupervivenciaInjerto;
    Animation animGirarOpcionesAlCerrarSupervivenciaInjerto;
    Animation animMostrarOpcionesAlAbrirSupervivenciaInjerto;
    Animation animOcultarOpcionesAlCerrarSupervivenciaInjerto;
    /* Vista de texto del titular del layout. */
    TextView textViewModeloSupervivenciaInjerto;
    /* Vistas de texto del Donante. */
    TextView textViewDatosDonanteSupervivenciaInjerto;
    TextView textViewEdadDonanteSupervivenciaInjerto;
    TextView textViewAsistoliaIIDonanteSupervivenciaInjerto;
    TextView textViewAsistoliaIIIDonanteSupervivenciaInjerto;
    /* Vistas de texto de los Receptores. */
    TextView textViewDatosReceptorSupervivenciaInjerto;
    TextView textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto;
    TextView textViewNumeroTrasplanteRenalReceptor;
    TextView textViewDatosReceptorSupervivenciaInjerto_Receptor2;
    TextView textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2;
    TextView textViewNumeroTrasplanteRenalReceptor_Receptor2;
    TextView textViewDatosReceptorSupervivenciaInjerto_Receptor3;
    TextView textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3;
    TextView textViewNumeroTrasplanteRenalReceptor_Receptor3;
    TextView textViewDatosReceptorSupervivenciaInjerto_Receptor4;
    TextView textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4;
    TextView textViewNumeroTrasplanteRenalReceptor_Receptor4;
    TextView textViewDatosReceptorSupervivenciaInjerto_Receptor5;
    TextView textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5;
    TextView textViewNumeroTrasplanteRenalReceptor_Receptor5;
    /* Listas desplegables del Donante. */
    TextInputLayout spinnerEdadDonanteSupervivenciaInjerto;
    /* Listas desplegables de los Receptores. */
    // AutoCompleteTextView, están declaradas en las próximas líneas.
    TextInputLayout spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto;
    TextInputLayout spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto;
    TextInputLayout spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2;
    TextInputLayout spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2;
    TextInputLayout spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3;
    TextInputLayout spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3;
    TextInputLayout spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4;
    TextInputLayout spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4;
    TextInputLayout spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5;
    TextInputLayout spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5;
    /* Listas desplegables - Donante */
    String[] opcionesEdadDonanteSupervivenciaInjerto; /* Del 2 al 100 (99 elementos). */
    /* Listas desplegables - Receptor 1 */
    String[] opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto; /* Del 0 al 100 (101 elementos). */
    String[] opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto; /* Del 1 al 4 (4 elementos). */
    /* Listas desplegables - Donante */
    AutoCompleteTextView autoCompleteTextViewEdadDonanteSupervivenciaInjerto;
    ArrayAdapter<String> adaptadorOpcionesEdadDonanteSupervivenciaInjerto;
    /* Listas deplegables - Receptor 1 */
    AutoCompleteTextView autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto;
    ArrayAdapter<String> adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto;
    AutoCompleteTextView autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto;
    ArrayAdapter<String> adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto;
    /* Switches - Donante */
    SwitchCompat switchCompatAsistoliaIIDonanteSupervivenciaInjerto;
    SwitchCompat switchCompatAsistoliaIIIDonanteSupervivenciaInjerto;
    /* Estado ("Yes"/"No") de los switches - Donante */
    String estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto;
    String estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto;

    /* Listas desplegables - Receptor 2 */
    String[] opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2; /* Del 0 al 100 (101 elementos). */
    String[] opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2; /* Del 1 al 4 (4 elementos). */
    /* Listas deplegables - Receptor 2 */
    AutoCompleteTextView autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2;
    ArrayAdapter<String> adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2;
    AutoCompleteTextView autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2;
    ArrayAdapter<String> adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2;

    /* Listas desplegables - Receptor 3 */
    String[] opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3; /* Del 0 al 100 (101 elementos). */
    String[] opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3; /* Del 1 al 4 (4 elementos). */
    /* Listas deplegables - Receptor 3 */
    AutoCompleteTextView autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3;
    ArrayAdapter<String> adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3;
    AutoCompleteTextView autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3;
    ArrayAdapter<String> adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3;

    /* Listas desplegables - Receptor 4 */
    String[] opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4; /* Del 0 al 100 (101 elementos). */
    String[] opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4; /* Del 1 al 4 (4 elementos). */
    /* Listas deplegables - Receptor 4 */
    AutoCompleteTextView autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4;
    ArrayAdapter<String> adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4;
    AutoCompleteTextView autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4;
    ArrayAdapter<String> adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4;

    /* Listas desplegables - Receptor 5 */
    String[] opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5; /* Del 0 al 100 (101 elementos). */
    String[] opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5; /* Del 1 al 4 (4 elementos). */
    /* Listas deplegables - Receptor 5 */
    AutoCompleteTextView autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5;
    ArrayAdapter<String> adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5;
    AutoCompleteTextView autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5;
    ArrayAdapter<String> adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5;

    /**
     * Método: onCreate.
     * @param  savedInstanceState Referencia a un objeto Bundle que es
     *                            pasado en el método onCreate de cada
     *                            actividad.
     *                            Si se guarda el estado de la aplicación
     *                            en un Bundle (datos dinámicos no
     *                            persistentes en onSavedInstanceState),
     *                            es posible pasarlo al método onCreate
     *                            en el caso que sea necesario crear
     *                            nuevamente la actividad (por ejemplo,
     *                            cuando cambia la orientación del
     *                            dispositivo) para que la información
     *                            previa no se pierda. En el caso de que
     *                            no se hayan proporcionado datos,
     *                            savedInstanceState tiene valor null.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supervivencia_injerto);

        /*
         * Barra de acciones (ActionBar):
         * Botón flecha de retroceso
         * que permite volver a la
         * actividad anterior.
         *
         * https://developer.android.com/reference/android/app/ActionBar
         */
        if (getSupportActionBar() != null) {
            /*
             * getSupportActionBar():
             * Obtiene la referencia a la barra de acciones (ActionBar)
             * de esta actividad.
             * https://developer.android.com/reference/androidx/appcompat/app/AppCompatActivity?hl=es-419#getSupportActionBar()
             *
             * getSupportActionBar().setDisplayShowHomeEnabled(true);
             * Establece si se desea incluir el acceso al inicio de
             * la aplicación (Home) en la barra de acciones (ActionBar).
             * El inicio de la aplicación (Home) se presenta como el icono
             * de una aplicación o un logo.
             *
             * https://developer.android.com/reference/android/app/ActionBar#setDisplayShowHomeEnabled(boolean)
             *
             * getSupportActionBar().setDisplayHomeAsUpEnabled(true);
             * Establece si el inicio de la aplicación (Home) debe mostrarse
             * como un acceso hacia arriba (hacia la anterior actividad, la
             * actividad desde la que ha sido llamada la presente
             * actividad). Establecido a verdadero (true), al seleccionar
             * el inicio de la aplicación (Home), sube un sólo nivel en la
             * interfaz de usuario (regresa a la actividad anterior),
             * en lugar de regresar al nivel superior o actividad principal
             * (MainActivity).
             *
             * https://developer.android.com/reference/android/app/ActionBar#setDisplayHomeAsUpEnabled(boolean)
             */
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        /* Vista deslizable. */
        ScrollView scrollViewModeloSupervivenciaInjerto = findViewById(R.id.scrollViewModeloSupervivenciaInjerto);

        /*
         * Botones flotantes.
         */
        opcionesSupervivenciaInjerto = findViewById(R.id.botonOpcionesSupervivenciaInjerto);
        botonFlotanteCalcularSupervivenciaInjerto = findViewById(R.id.botonCalcularSupervivenciaInjerto);
        botonFlotanteNuevoReceptorSupervivenciaInjerto = findViewById(R.id.botonNuevoReceptorSupervivenciaInjerto);
        botonFlotanteBorrarSupervivenciaInjerto = findViewById(R.id.botonBorrarSupervivenciaInjerto);
        textViewCalcularSupervivenciaInjerto = findViewById(R.id.textViewCalcularSupervivenciaInjerto);
        textViewNuevoReceptorSupervivenciaInjerto = findViewById(R.id.textViewNuevoReceptorSupervivenciaInjerto);
        textViewBorrarSupervivenciaInjerto = findViewById(R.id.textViewBorrarSupervivenciaInjerto);

        /*
         * Animaciones.
         */
        animAtenuarVistaSupervivenciaInjerto = AnimationUtils.loadAnimation(SupervivenciaInjerto.this, R.anim.anim_atenuar_vista);
        animAumentarVistaSupervivenciaInjerto = AnimationUtils.loadAnimation(SupervivenciaInjerto.this, R.anim.anim_aumentar_vista);
        animMostrarOpcionesAlAbrirSupervivenciaInjerto = AnimationUtils.loadAnimation(SupervivenciaInjerto.this, R.anim.anim_mostrar_opciones_abrir);
        animOcultarOpcionesAlCerrarSupervivenciaInjerto = AnimationUtils.loadAnimation(SupervivenciaInjerto.this, R.anim.anim_ocultar_opciones_cerrar);
        animGirarOpcionesAlAbrirSupervivenciaInjerto = AnimationUtils.loadAnimation(SupervivenciaInjerto.this, R.anim.anim_girar_opciones_abrir);
        animGirarOpcionesAlCerrarSupervivenciaInjerto = AnimationUtils.loadAnimation(SupervivenciaInjerto.this, R.anim.anim_girar_opciones_cerrar);

        /* Opciones menú flotante: 'gone' en un inicio. */
        botonFlotanteCalcularSupervivenciaInjerto.setVisibility(View.GONE);
        botonFlotanteNuevoReceptorSupervivenciaInjerto.setVisibility(View.GONE);
        botonFlotanteBorrarSupervivenciaInjerto.setVisibility(View.GONE);
        textViewCalcularSupervivenciaInjerto.setVisibility(View.GONE);
        textViewNuevoReceptorSupervivenciaInjerto.setVisibility(View.GONE);
        textViewBorrarSupervivenciaInjerto.setVisibility(View.GONE);

        /* Estado del menú: desplegado / no desplegado. */
        opcionesDesplegadasSupervivenciaInjerto = false;
        /* Estado de las vistas del formulario: atenuadas / no atenuadas. */
        vistasAtenuadasSupervivenciaInjerto = false;
        /* .setClickable(true) es la opción por defecto para cualquier botón */
        opcionesSupervivenciaInjerto.setClickable(true);

        /* Vista de texto del titular del layout. */
        textViewModeloSupervivenciaInjerto = findViewById(R.id.textViewModeloSupervivenciaInjerto);
        /* Vistas de texto del Donante. */
        textViewDatosDonanteSupervivenciaInjerto = findViewById(R.id.textViewDatosDonanteSupervivenciaInjerto);
        textViewEdadDonanteSupervivenciaInjerto = findViewById(R.id.textViewEdadDonanteSupervivenciaInjerto);
        textViewAsistoliaIIDonanteSupervivenciaInjerto = findViewById(R.id.textViewAsistoliaIIDonanteSupervivenciaInjerto);
        textViewAsistoliaIIIDonanteSupervivenciaInjerto = findViewById(R.id.textViewAsistoliaIIIDonanteSupervivenciaInjerto);
        /* Vistas de texto de los Receptores. */
        textViewDatosReceptorSupervivenciaInjerto = findViewById(R.id.textViewDatosReceptorSupervivenciaInjerto);
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto = findViewById(R.id.textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto);
        textViewNumeroTrasplanteRenalReceptor = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor);
        textViewDatosReceptorSupervivenciaInjerto_Receptor2 = findViewById(R.id.textViewDatosReceptorSupervivenciaInjerto_Receptor2);
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 = findViewById(R.id.textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2);
        textViewNumeroTrasplanteRenalReceptor_Receptor2 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor_Receptor2);
        textViewDatosReceptorSupervivenciaInjerto_Receptor3 = findViewById(R.id.textViewDatosReceptorSupervivenciaInjerto_Receptor3);
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 = findViewById(R.id.textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3);
        textViewNumeroTrasplanteRenalReceptor_Receptor3 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor_Receptor3);
        textViewDatosReceptorSupervivenciaInjerto_Receptor4 = findViewById(R.id.textViewDatosReceptorSupervivenciaInjerto_Receptor4);
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 = findViewById(R.id.textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4);
        textViewNumeroTrasplanteRenalReceptor_Receptor4 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor_Receptor4);
        textViewDatosReceptorSupervivenciaInjerto_Receptor5 = findViewById(R.id.textViewDatosReceptorSupervivenciaInjerto_Receptor5);
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 = findViewById(R.id.textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5);
        textViewNumeroTrasplanteRenalReceptor_Receptor5 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor_Receptor5);
        /* Listas desplegables del Donante. */
        spinnerEdadDonanteSupervivenciaInjerto = findViewById(R.id.spinnerEdadDonanteSupervivenciaInjerto);
        /* Listas desplegables de los Receptores. */
        // AutoCompleteTextView, findViewById en las próximas líneas.
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto = findViewById(R.id.spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto = findViewById(R.id.spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 = findViewById(R.id.spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 = findViewById(R.id.spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 = findViewById(R.id.spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 = findViewById(R.id.spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 = findViewById(R.id.spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 = findViewById(R.id.spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 = findViewById(R.id.spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 = findViewById(R.id.spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5);

        /*
         * Establece el ancho de las vistas
         * AutoCompleteTextView en función
         * del número de píxeles del dispositivo.
         */
        int numeroPixelesAnchoDispositivo;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        /* Relleno de 16sp en margen (16px de escala independiente). */
        int paddingLeft = 16;
        int paddingRight = 16;
        int numeroPixelesDisponibles;
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        numeroPixelesAnchoDispositivo = displayMetrics.widthPixels;
        numeroPixelesDisponibles = numeroPixelesAnchoDispositivo - (paddingLeft + paddingRight);
        spinnerEdadDonanteSupervivenciaInjerto.setMinWidth(numeroPixelesDisponibles);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setMinWidth(numeroPixelesDisponibles);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setMinWidth(numeroPixelesDisponibles);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setMinWidth(numeroPixelesDisponibles);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setMinWidth(numeroPixelesDisponibles);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setMinWidth(numeroPixelesDisponibles);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setMinWidth(numeroPixelesDisponibles);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setMinWidth(numeroPixelesDisponibles);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setMinWidth(numeroPixelesDisponibles);
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setMinWidth(numeroPixelesDisponibles);
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setMinWidth(numeroPixelesDisponibles);
        /* *********************************** */

        /*
         * Listas desplegables - Donante.
         */
        opcionesEdadDonanteSupervivenciaInjerto = new String[99]; /* Del 2 al 100 (99 elementos). */
        for (int i = 0; i < opcionesEdadDonanteSupervivenciaInjerto.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 2 -> i + 2 */
            opcionesEdadDonanteSupervivenciaInjerto[i] = String.valueOf(i+2);
        }
        autoCompleteTextViewEdadDonanteSupervivenciaInjerto =
                findViewById(R.id.autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto);
        adaptadorOpcionesEdadDonanteSupervivenciaInjerto
                = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones,
                opcionesEdadDonanteSupervivenciaInjerto);
        autoCompleteTextViewEdadDonanteSupervivenciaInjerto.setAdapter(adaptadorOpcionesEdadDonanteSupervivenciaInjerto);
        autoCompleteTextViewEdadDonanteSupervivenciaInjerto.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerEdadDonanteSupervivenciaInjerto.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 1.
         */
        opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto = new String[101]; /* Del 0 al 100 (101 elementos). */
        for (int i = 0; i < opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 0 -> i */
            opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto[i] = String.valueOf(i);
        }
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto =
                findViewById(R.id.autoCompleteTextViewSpinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto);
        adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto = new ArrayAdapter<>(SupervivenciaInjerto.this,
                R.layout.list_opciones,
                opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setAdapter(adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 1.
         */
        opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto = new String[4]; /* Del 1 al 4 (4 elementos). */
        for (int i = 0; i < opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 1 -> i + 1 */
            opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto[i] = String.valueOf(i+1);
        }
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto =
                findViewById(R.id.autoCompleteTextViewSpinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto);
        adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto = new ArrayAdapter<>(SupervivenciaInjerto.this,
                R.layout.list_opciones,
                opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setAdapter(adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 2.
         */
        opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 = new String[101]; /* Del 0 al 100 (101 elementos). */
        for (int i = 0; i < opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 0 -> i */
            opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2[i] = String.valueOf(i);
        }
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 = findViewById(R.id.autoCompleteTextViewSpinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2);
        adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setAdapter(adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 2.
         */
        opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 = new String[4]; /* Del 1 al 4 (4 elementos). */
        for (int i = 0; i < opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 1 -> i + 1 */
            opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2[i] = String.valueOf(i+1);
        }
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 = findViewById(R.id.autoCompleteTextViewSpinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2);
        adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setAdapter(adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 3.
         */
        opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 = new String[101]; /* Del 0 al 100 (101 elementos). */
        for (int i = 0; i < opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 0 -> i */
            opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3[i] = String.valueOf(i);
        }
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 = findViewById(R.id.autoCompleteTextViewSpinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3);
        adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setAdapter(adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 3.
         */
        opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 = new String[4]; /* Del 1 al 4 (4 elementos). */
        for (int i = 0; i < opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 1 -> i + 1 */
            opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3[i] = String.valueOf(i+1);
        }
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 = findViewById(R.id.autoCompleteTextViewSpinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3);
        adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setAdapter(adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 4.
         */
        opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 = new String[101]; /* Del 0 al 100 (101 elementos). */
        for (int i = 0; i < opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 0 -> i */
            opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4[i] = String.valueOf(i);
        }
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 = findViewById(R.id.autoCompleteTextViewSpinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4);
        adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setAdapter(adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 4.
         */
        opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 = new String[4]; /* Del 1 al 4 (4 elementos). */
        for (int i = 0; i < opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 1 -> i + 1 */
            opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4[i] = String.valueOf(i+1);
        }
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 = findViewById(R.id.autoCompleteTextViewSpinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4);
        adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setAdapter(adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 5.
         */
        opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 = new String[101]; /* Del 0 al 100 (101 elementos). */
        for (int i = 0; i < opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 0 -> i */
            opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5[i] = String.valueOf(i);
        }
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 = findViewById(R.id.autoCompleteTextViewSpinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5);
        adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setAdapter(adaptadorOpcionesAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5);
        autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setErrorEnabled(false);
        });
        /*
         * Listas desplegables - Receptor 5.
         */
        opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 = new String[4]; /* Del 1 al 4 (4 elementos). */
        for (int i = 0; i < opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 1 -> i + 1 */
            opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5[i] = String.valueOf(i+1);
        }
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 = findViewById(R.id.autoCompleteTextViewSpinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5);
        adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 = new ArrayAdapter<>(SupervivenciaInjerto.this, R.layout.list_opciones, opcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setAdapter(adaptadorOpcionesNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5);
        autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
             * Deshabilita el mensaje de error si estuviese habilitado,
             * al pulsar sobre uno de los valores válidos de la lista
             * deslizable.
             */
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setErrorEnabled(false);
        });

        /*
         * Switches - Donante.
         */
        switchCompatAsistoliaIIDonanteSupervivenciaInjerto = findViewById(R.id.switchAsistoliaIIDonanteSupervivenciaInjerto);
        switchCompatAsistoliaIIIDonanteSupervivenciaInjerto = findViewById(R.id.switchAsistoliaIIIDonanteSupervivenciaInjerto);
        estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto = "No"; /* Estado por defecto. */
        estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto = "No"; /* Estado por defecto. */
        switchCompatAsistoliaIIDonanteSupervivenciaInjerto.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                * switchCompatAsistoliaIIDonanteSuperivenciaInjerto -> "Yes".
                */
                estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto = "Yes";
                /*
                 * Si:
                 * switchCompatAsistoliaIIDonanteSuperivenciaInjerto -> "Yes"
                 * entonces:
                 * switchCompatAsistoliaIIIDonanteSupervivenciaInjerto -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.setChecked(false);
                estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto = "No";
            }
            else {
                /*
                 * switchCompatAsistoliaIIDonanteSuperivenciaInjerto -> "No".
                 */
                estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto = "No";
            }
        });
        switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatAsistoliaIIIDonanteSuperivenciaInjerto -> "Yes".
                 */
                estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto = "Yes";
                /*
                 * Si:
                 * switchCompatAsistoliaIIIDonanteSuperivenciaInjerto -> "Yes"
                 * entonces:
                 * switchCompatAsistoliaIIDonanteSupervivenciaInjerto -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatAsistoliaIIDonanteSupervivenciaInjerto.setChecked(false);
                estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto = "No";
            }
            else {
                /*
                 * switchCompatAsistoliaIIIDonanteSuperivenciaInjerto -> "No".
                 */
                estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto = "No";
            }
        });

        opcionesSupervivenciaInjerto.setOnClickListener(view -> {
            /* Atenúa / aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /*
             * Despliega el menu de opciones al pulsar "+"
             * y oculta el menu de opciones al pulsar "x".
             */
            animacionMenuOpciones();
        });
        botonFlotanteCalcularSupervivenciaInjerto.setOnClickListener(view -> {
            /*
             * Actividad CalcularSupervivenciaInjerto.
             */
            /* Aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionAtenuarVistas();
            /* Oculta el menú de opciones al pulsar sobre uno de los botones flotantes */
            animacionMenuOpciones();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionMenuOpciones();

            Intent intent = new Intent(getApplicationContext(), CalcularSupervivenciaInjerto.class);
            /* Datos del donante. */
            if (!(autoCompleteTextViewEdadDonanteSupervivenciaInjerto.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto", autoCompleteTextViewEdadDonanteSupervivenciaInjerto.getText().toString());
            }
            else {
                spinnerEdadDonanteSupervivenciaInjerto.setErrorEnabled(true);
                spinnerEdadDonanteSupervivenciaInjerto.setError("Required");
            }
            if (!(estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto.equals(""))) {
                intent.putExtra("estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto", estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto);
            }
            if (!(estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto.equals(""))) {
                intent.putExtra("estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto", estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto);
            }
            /* Datos del receptor 1. */
            if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto", autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.getText().toString());
            }
            else {
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setErrorEnabled(true);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setError("Required");
            }
            if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto", autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.getText().toString());
            }
            else {
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setErrorEnabled(true);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setError("Required");
            }
            /* Datos del receptor 2. */
            if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2", autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getText().toString());
            }
            else if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE)) {
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setErrorEnabled(true);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setError("Required");
            }
            if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2", autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getText().toString());
            }
            else if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE)) {
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setErrorEnabled(true);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setError("Required");
            }
            /* Datos del receptor 3. */
            if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3", autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getText().toString());
            }
            else if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE)) {
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setErrorEnabled(true);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setError("Required");
            }
            if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3", autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getText().toString());
            }
            else if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE)) {
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setErrorEnabled(true);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setError("Required");
            }
            /* Datos del receptor 4. */
            if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4", autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getText().toString());
            }
            else if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE)) {
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setErrorEnabled(true);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setError("Required");
            }
            if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4", autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getText().toString());
            }
            else if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE)) {
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setErrorEnabled(true);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setError("Required");
            }
            /* Datos del receptor 5. */
            if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5", autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getText().toString());
            }
            else if (!(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE)) {
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setErrorEnabled(true);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setError("Required");
            }
            if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getText().toString().equals(""))) {
                intent.putExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5", autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getText().toString());
            }
            else if (!(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE)) {
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setErrorEnabled(true);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setError("Required");
            }

            /*
             * Se comprueba que los campos del formulario
             * marcados como "Obligatorio" se hayan cumplimentado.
             */
            if (!(autoCompleteTextViewEdadDonanteSupervivenciaInjerto.getText().toString().equals(""))
                    && !(estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto.equals(""))
                    && !(estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto.equals(""))
                    /* Campos del formulario del receptor 1. Estado 'visible' por defecto. */
                    && !(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.getText().toString().equals(""))
                    && !(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.getText().toString().equals(""))
                    /* Campos del formulario del receptor 2. Estado 'gone' por defecto. */
                    /* Igual a 1 si: Invisible Y NoCumplimentado. */
                    /* Igual a 1 si: Visible Y Cumplimentado. */
                    /* Igual a 0: en caso contrario. */
                    && ((autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE)
                    == (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getText().toString().equals("")))
                    && ((autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE)
                    == (autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getText().toString().equals("")))
                    /* Campos del formulario del receptor 3. Estado 'gone' por defecto. */
                    /* Igual a 1 si: Invisible Y NoCumplimentado. */
                    /* Igual a 1 si: Visible Y Cumplimentado. */
                    /* Igual a 0: en caso contrario. */
                    && ((autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE)
                    == (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getText().toString().equals("")))
                    && ((autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE)
                    == (autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getText().toString().equals("")))
                    /* Campos del formulario del receptor 4. Estado 'gone' por defecto. */
                    /* Igual a 1 si: Invisible Y NoCumplimentado. */
                    /* Igual a 1 si: Visible Y Cumplimentado. */
                    /* Igual a 0: en caso contrario. */
                    && ((autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE)
                    == (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getText().toString().equals("")))
                    && ((autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE)
                    == (autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getText().toString().equals("")))
                    /* Campos del formulario del receptor 5. Estado 'gone' por defecto. */
                    /* Igual a 1 si: Invisible Y NoCumplimentado. */
                    /* Igual a 1 si: Visible Y Cumplimentado. */
                    /* Igual a 0: en caso contrario. */
                    && ((autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE)
                    == (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getText().toString().equals("")))
                    && ((autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE)
                    == (autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getText().toString().equals("")))) {
                /*
                 * Si se han cumplementado todos
                 * los campos del formulario
                 * marcados como "Obligatorio" y
                 * que estén visibles,
                 * se procede a realizar la
                 * petición REST al servicio.
                 */
                startActivity(intent);
            }
            else {
                /*
                 * Existe, al menos, un campo del
                 * formulario marcado como "Obligatorio",
                 * que está 'visible' y que no se ha
                 * cumplimentado.
                 *
                 * Se indica al usuario que
                 * cumplimente los campos del
                 * formulario marcados como
                 * "Obligatorio".
                 */
                Toast.makeText(SupervivenciaInjerto.this, "You must fill in the \"required\" form fields", Toast.LENGTH_SHORT).show();
            }
        });
        botonFlotanteNuevoReceptorSupervivenciaInjerto.setOnClickListener(view -> {
            /*
             * Añadir nuevo receptor al formulario (máximo 5).
             */
            /* Aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionAtenuarVistas();
            /* Oculta el menú de opciones al pulsar sobre uno de los botones flotantes */
            animacionMenuOpciones();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionMenuOpciones();
            /*
             * android:visibility="visible"
             * This view is visible.
             *
             * android:visibility="invisible"
             * This view is invisible, but it still takes up space for layout purposes.
             *
             * android:visibility="gone"
             * This view is invisible, and it doesn't take any space for layout purposes
             *
             * https://developer.android.com/reference/android/view/View
             */
            /*
             * Receptor 5.
             * Si la vista del receptor 2 es 'VISIBLE',
             * la vista del receptor 3 es 'VISIBLE',
             * la vista del receptor 4 es 'VISIBLE',
             * y la vista del receptor 5 es 'GONE',
             * modifica la vista del receptor 5 a 'VISIBLE'.
             */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor5.getVisibility() == View.GONE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.VISIBLE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.VISIBLE);
                textViewNumeroTrasplanteRenalReceptor_Receptor5.setVisibility(View.VISIBLE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.VISIBLE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.VISIBLE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.VISIBLE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaInjerto.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaInjerto.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }
            /*
             * Receptor 4.
             * Si la vista del receptor 2 es 'VISIBLE',
             * la vista del receptor 3 es 'VISIBLE',
             * y la vista del receptor 4 es 'GONE',
             * modifica la vista del receptor 4 a 'VISIBLE'.
             */
            else if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor4.getVisibility() == View.GONE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.VISIBLE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.VISIBLE);
                textViewNumeroTrasplanteRenalReceptor_Receptor4.setVisibility(View.VISIBLE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.VISIBLE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.VISIBLE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.VISIBLE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaInjerto.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaInjerto.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }
            /*
             * Receptor 3.
             * Si la vista del receptor 2 es 'VISIBLE',
             * y la vista del receptor 3 es 'GONE',
             * modifica la vista del receptor 3 a 'VISIBLE'.
             */
            else if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor3.getVisibility() == View.GONE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.VISIBLE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.VISIBLE);
                textViewNumeroTrasplanteRenalReceptor_Receptor3.setVisibility(View.VISIBLE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.VISIBLE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.VISIBLE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.VISIBLE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaInjerto.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaInjerto.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }
            /*
            * Receptor 2.
            * Si la vista del receptor 2 es 'GONE',
            * modifica la vista del receptor 2 a 'VISIBLE'.
            */
            else if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.GONE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.VISIBLE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.VISIBLE);
                textViewNumeroTrasplanteRenalReceptor_Receptor2.setVisibility(View.VISIBLE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.VISIBLE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.VISIBLE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.VISIBLE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaInjerto.postOnAnimationDelayed(() -> {
                    scrollViewModeloSupervivenciaInjerto.fullScroll(ScrollView.FOCUS_DOWN);
                }, tiempoDesplazamientoPrevio);
            }
            /*
             * Aviso número máximo de receptores.
             * El número máximo de receptores es 5.
             */
            else {
                Toast.makeText(SupervivenciaInjerto.this, "The maximum number of recipients is 5", Toast.LENGTH_SHORT).show();
            }
        });
        botonFlotanteBorrarSupervivenciaInjerto.setOnClickListener(view -> {
            /*
             * Resetea al valor por defecto
             * los campos del formulario
             * y modifica las vistas de los
             * receptores 2, 3, 4 y 5 a 'gone'
             * si el estado previo de la vista
             * era 'visible'.
             */
            /* Aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionAtenuarVistas();
            /* Oculta el menú de opciones al pulsar sobre uno de los botones flotantes */
            animacionMenuOpciones();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionMenuOpciones();

            /*
             * Resetear a su valor por defecto todos los campos del formulario.
             */
            /* Resetear - Donante. */
            autoCompleteTextViewEdadDonanteSupervivenciaInjerto.setText("");
            switchCompatAsistoliaIIDonanteSupervivenciaInjerto.setChecked(false);
            switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.setChecked(false);
            /* Resetear - Receptor 1 */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setText("");
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setText("");
            /* Resetear - Receptor 2 */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setText("");
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setText("");
            /* Resetear - Receptor 3 */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setText("");
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setText("");
            /* Resetear - Receptor 4 */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setText("");
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setText("");
            /* Resetear - Receptor 5 */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setText("");
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setText("");
            /*
             * Modifica las vistas de
             * los receptores 2, 3, 4
             * y 5 a 'GONE'.
             *
             * En el caso de que el usuario no
             * haya añadido nuevos receptores,
             * las siguientes sentencias de
             * código carecen de efecto.
             */
            /* Visibilidad 'GONE' - Receptor 5. */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor5.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.GONE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.GONE);
                textViewNumeroTrasplanteRenalReceptor_Receptor5.setVisibility(View.GONE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.GONE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.GONE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.GONE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setVisibility(View.GONE);
            }
            /* Visibilidad 'GONE' - Receptor 4. */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.GONE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.GONE);
                textViewNumeroTrasplanteRenalReceptor_Receptor4.setVisibility(View.GONE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.GONE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.GONE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.GONE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setVisibility(View.GONE);
            }
            /* Visibilidad 'GONE' - Receptor 3. */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.GONE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.GONE);
                textViewNumeroTrasplanteRenalReceptor_Receptor3.setVisibility(View.GONE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.GONE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.GONE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.GONE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setVisibility(View.GONE);
            }
            /* Visibilidad 'GONE' - Receptor 2. */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.GONE);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.GONE);
                textViewNumeroTrasplanteRenalReceptor_Receptor2.setVisibility(View.GONE);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.GONE);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.GONE);
                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.GONE);
                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setVisibility(View.GONE);
            }
            /*
             * Desplaza la vista hasta el inicio
             * del formulario, para que el usuario
             * pueda introducir nuevamente los datos.
             */
            int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
            scrollViewModeloSupervivenciaInjerto.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaInjerto.fullScroll(ScrollView.FOCUS_UP), tiempoDesplazamientoPrevio);
        });
    }

    /*
     * Animaciones.
     */
    /**
     * Método: animacionAtenuarVistas.
     * Disminuye la opacidad al 20% de
     * todas las vistas de tipo TextView
     * SwitchCompat y TextInputLayout
     * contenidas en la vista
     * desplazable ScrollView, al hacer
     * clic sobre el botón flotante
     * ExtendedFloatingActionButton.
     * En el caso de que la opacidad de
     * las vistas ya fuese igual al 20%,
     * aumenta su opacidad hasta el 100%.
     *
     * No modifica la opacidad de los
     * botones del menú:
     * ExtendedFloatingActionButton y
     * FloatingActionButton.
     */
    private void animacionAtenuarVistas() {
        if(!vistasAtenuadasSupervivenciaInjerto) {
            /*
             * Se atenúan todas las vistas,
             * a excepción de las vistas
             * correspondientes con los
             * botones flotantes:
             *
             * opcionesSupervivenciaInjerto
             * botonFlotanteCalcularSupervivenciaInjerto
             * botonFlotanteNuevoReceptorSupervivenciaInjerto
             * botonFlotanteBorrarSupervivenciaInjerto
             */
            /*
             * Las vistas del Donante y Receptor 1 están
             * siempre 'visible'.
             */
            /* Atenuar vista de texto del titular del layout. */
            textViewModeloSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            /* Atenuar vistas de texto del Donante. */
            textViewDatosDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            textViewEdadDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            textViewAsistoliaIIDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            textViewAsistoliaIIIDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            /* Atenuar switches del Donante */
            switchCompatAsistoliaIIDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            /* Atenuar listas desplegables del Donante. */
            spinnerEdadDonanteSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            /* Atenuar vistas de texto del Receptor 1. */
            textViewDatosReceptorSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            textViewNumeroTrasplanteRenalReceptor.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            /* Atenuar listas desplegables del Receptor 1. */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            /* Atenuar vistas de texto y listas desplegables del Receptor 2 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor2.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            }
            /* Atenuar vistas de texto y listas desplegables del Receptor 3 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor3.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            }
            /* Atenuar vistas de texto y listas desplegables del Receptor 4 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor4.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            }
            /* Atenuar vistas de texto y listas desplegables del Receptor 5 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor5.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor5.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAtenuarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAtenuarVistaSupervivenciaInjerto);
            }
            /* ************************************************** */
            /* Estado de las vistas: atenuadas. */
            vistasAtenuadasSupervivenciaInjerto = true;
            /* ******************************** */
        }
        else {
            /*
             * Se aumentan todas las vistas,
             * a excepción de las vistas
             * correspondientes con los
             * botones flotantes:
             *
             * opcionesSupervivenciaInjerto
             * botonFlotanteCalcularSupervivenciaInjerto
             * botonFlotanteNuevoReceptorSupervivenciaInjerto
             * botonFlotanteBorrarSupervivenciaInjerto
             */
            /*
             * Las vistas del Donante y Receptor 1 están
             * siempre 'visible'.
             */
            /* Aumentar vista de texto del titular del layout. */
            textViewModeloSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            /* Aumentar vistas de texto del Donante. */
            textViewDatosDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            textViewEdadDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            textViewAsistoliaIIDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            textViewAsistoliaIIIDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            /* Aumentar switches del Donante */
            switchCompatAsistoliaIIDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            /* Aumentar listas desplegables del Donante. */
            spinnerEdadDonanteSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            /* Aumentar vistas de texto del Receptor 1. */
            textViewDatosReceptorSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            textViewNumeroTrasplanteRenalReceptor.startAnimation(animAumentarVistaSupervivenciaInjerto);
            /* Aumentar listas desplegables del Receptor 1. */
            spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.startAnimation(animAumentarVistaSupervivenciaInjerto);
            /* Aumentar vistas de texto y listas desplegables del Receptor 2 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor2.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.startAnimation(animAumentarVistaSupervivenciaInjerto);
            }
            /* Aumentar vistas de texto y listas desplegables del Receptor 3 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor3.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.startAnimation(animAumentarVistaSupervivenciaInjerto);
            }
            /* Aumentar vistas de texto y listas desplegables del Receptor 4 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor4.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.startAnimation(animAumentarVistaSupervivenciaInjerto);
            }
            /* Aumentar vistas de texto y listas desplegables del Receptor 5 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor_Receptor5.getVisibility() == View.VISIBLE
                    && spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAumentarVistaSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor_Receptor5.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAumentarVistaSupervivenciaInjerto);
                spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.startAnimation(animAumentarVistaSupervivenciaInjerto);
            }
            /* ************************************************** */
            /* Estado de las vistas: aumentadas. */
            vistasAtenuadasSupervivenciaInjerto = false;
            /* ******************************** */
        }
    }
    /**
     * Método: animacionMenuOpciones.
     * Despliega verticalmente hacia
     * arriba los botones
     * FloatingActionButton del menú
     * flotante al hacer clic
     * sobre el botón flotante
     * ExtendedFloatingActionButton.
     * En el caso de que el menú ya
     * estuviese desplegado, los
     * botones del menú se ocultan
     * desplazándose verticalmente
     * hacia abajo.
     */
    private void animacionMenuOpciones() {
        if(!opcionesDesplegadasSupervivenciaInjerto) {
            /* Animación: anim_girar_opciones_abrir.xml. */
            opcionesSupervivenciaInjerto.startAnimation(animGirarOpcionesAlAbrirSupervivenciaInjerto);
            /* Animación: anim_mostrar_opciones_abrir.xml. */
            botonFlotanteCalcularSupervivenciaInjerto.startAnimation(animMostrarOpcionesAlAbrirSupervivenciaInjerto);
            botonFlotanteNuevoReceptorSupervivenciaInjerto.startAnimation(animMostrarOpcionesAlAbrirSupervivenciaInjerto);
            botonFlotanteBorrarSupervivenciaInjerto.startAnimation(animMostrarOpcionesAlAbrirSupervivenciaInjerto);

            /* Muestra las opciones del menú. */
            botonFlotanteCalcularSupervivenciaInjerto.show();
            botonFlotanteNuevoReceptorSupervivenciaInjerto.show();
            botonFlotanteBorrarSupervivenciaInjerto.show();

            /* Hace visible el texto adjunto a cada opción del menú. */
            textViewCalcularSupervivenciaInjerto.setVisibility(View.VISIBLE);
            textViewNuevoReceptorSupervivenciaInjerto.setVisibility(View.VISIBLE);
            textViewBorrarSupervivenciaInjerto.setVisibility(View.VISIBLE);

            /* Habilita que se pueda hacer clic sobre los botones del menu. */
            botonFlotanteCalcularSupervivenciaInjerto.setClickable(true);
            botonFlotanteNuevoReceptorSupervivenciaInjerto.setClickable(true);
            botonFlotanteBorrarSupervivenciaInjerto.setClickable(true);
            /*
             * Deshabilita las vistas del formulario con las que el usuario
             * puede interaccionar.
             * Una vista deshabilitada no responderá ante el 'clic' del
             * usuario; la vista se mostrará en un color más apagado.
             *
             * setEnabled:
             * establece el estado habilitado
             * de esta vista (true, habilitado;
             * false, deshabilitado).
             *
             * https://developer.android.com/reference/android/view/View#setEnabled(boolean)
             */
            /* Deshabilita elementos - Donante. */
            autoCompleteTextViewEdadDonanteSupervivenciaInjerto.setEnabled(false);
            switchCompatAsistoliaIIDonanteSupervivenciaInjerto.setEnabled(false);
            switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.setEnabled(false);
            /* Deshabilita elementos - Receptor 1. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setEnabled(false);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setEnabled(false);
            /* Deshabilita elementos - Receptor 2. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setEnabled(false);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setEnabled(false);
            /* Deshabilita elementos - Receptor 3. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setEnabled(false);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setEnabled(false);
            /* Deshabilita elementos - Receptor 4. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setEnabled(false);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setEnabled(false);
            /* Deshabilita elementos - Receptor 5. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setEnabled(false);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setEnabled(false);
            /* *********************************************************************** */


            /* Estado del menú: desplegado. */
            opcionesDesplegadasSupervivenciaInjerto = true;
        }
        else {
            /* Animación: anim_girar_opciones_cerrar.xml. */
            opcionesSupervivenciaInjerto.startAnimation(animGirarOpcionesAlCerrarSupervivenciaInjerto);
            /* Animación: anim_mostrar_opciones_cerrar.xml. */
            botonFlotanteCalcularSupervivenciaInjerto.startAnimation(animOcultarOpcionesAlCerrarSupervivenciaInjerto);
            botonFlotanteNuevoReceptorSupervivenciaInjerto.startAnimation(animOcultarOpcionesAlCerrarSupervivenciaInjerto);
            botonFlotanteBorrarSupervivenciaInjerto.startAnimation(animOcultarOpcionesAlCerrarSupervivenciaInjerto);

            /* Oculta las opciones del menú. */
            botonFlotanteCalcularSupervivenciaInjerto.hide();
            botonFlotanteNuevoReceptorSupervivenciaInjerto.hide();
            botonFlotanteBorrarSupervivenciaInjerto.hide();

            /* Hace que el texto adjunto a cada opción del menú no sea visible y no ocupe espacio en el layout. */
            textViewCalcularSupervivenciaInjerto.setVisibility(View.GONE);
            textViewNuevoReceptorSupervivenciaInjerto.setVisibility(View.GONE);
            textViewBorrarSupervivenciaInjerto.setVisibility(View.GONE);

            /* Deshabilita que se pueda hacer clic sobre los botones del menu. */
            /*
             * IMPORTANTE: Si los botones no se deshabilitan, se podrá hacer
             * clic sobre ellos incluso si no están visibles.
             */
            botonFlotanteCalcularSupervivenciaInjerto.setClickable(false);
            botonFlotanteNuevoReceptorSupervivenciaInjerto.setClickable(false);
            botonFlotanteBorrarSupervivenciaInjerto.setClickable(false);
            /*
             * Habilita las vistas del formulario con las que el usuario
             * puede interaccionar.
             * Una vista habilitada sí responderá ante el 'clic' del
             * usuario; la vista se mostrará su color establecido.
             *
             * setEnabled:
             * establece el estado habilitado
             * de esta vista (true, habilitado;
             * false, deshabilitado).
             *
             * https://developer.android.com/reference/android/view/View#setEnabled(boolean)
             */
            /* Habilita elementos - Donante. */
            autoCompleteTextViewEdadDonanteSupervivenciaInjerto.setEnabled(true);
            switchCompatAsistoliaIIDonanteSupervivenciaInjerto.setEnabled(true);
            switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.setEnabled(true);
            /* Habilita elementos - Receptor 1. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.setEnabled(true);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto.setEnabled(true);
            /* Habilita elementos - Receptor 2. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.setEnabled(true);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.setEnabled(true);
            /* Habilita elementos - Receptor 3. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.setEnabled(true);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.setEnabled(true);
            /* Habilita elementos - Receptor 4. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.setEnabled(true);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.setEnabled(true);
            /* Habilita elementos - Receptor 5. */
            autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.setEnabled(true);
            autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.setEnabled(true);
            /* *********************************************************************** */

            /* Estado del menú: no desplegado. */
            opcionesDesplegadasSupervivenciaInjerto = false;
        }
    }
    /**
     * Método: limpiarAnimacionAtenuarVistas.
     * Llama al método clearAnimation().
     * Es obligatorio llamar al método anterior
     * antes de establecer (o modificar) la
     * visibilidad (visible, invisible o gone)
     * de una vista.
     * En caso contrario, las vistas pueden
     * permanecer en su estado de visibilidad
     * previa, haciendo caso omiso al cambio
     * de visibilidad.
     */
    private void limpiarAnimacionAtenuarVistas() {
        /*
         * Es obligatorio limpiar la animación antes de
         * establecer la visibilidad de una vista:
         *
         * view.clearAnimation();
         * view.setVisibility(View.GONE);
         *
         * En caso contrario, el cambio de visibilidad
         * de la vista no tendrá efecto.
         */
        /* Limpiar animación de la vista de texto del titular del layout. */
        textViewModeloSupervivenciaInjerto.clearAnimation();
        /* Limpiar animación de las vistas de texto del Donante. */
        textViewDatosDonanteSupervivenciaInjerto.clearAnimation();
        textViewEdadDonanteSupervivenciaInjerto.clearAnimation();
        textViewAsistoliaIIDonanteSupervivenciaInjerto.clearAnimation();
        textViewAsistoliaIIIDonanteSupervivenciaInjerto.clearAnimation();
        /* Limpiar animación de las vistas de texto de los Receptores. */
        textViewDatosReceptorSupervivenciaInjerto.clearAnimation();
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor.clearAnimation();
        textViewDatosReceptorSupervivenciaInjerto_Receptor2.clearAnimation();
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor_Receptor2.clearAnimation();
        textViewDatosReceptorSupervivenciaInjerto_Receptor3.clearAnimation();
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor_Receptor3.clearAnimation();
        textViewDatosReceptorSupervivenciaInjerto_Receptor4.clearAnimation();
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor_Receptor4.clearAnimation();
        textViewDatosReceptorSupervivenciaInjerto_Receptor5.clearAnimation();
        textViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor_Receptor5.clearAnimation();
        /* Limpiar animación de las listas desplegables del Donante. */
        spinnerEdadDonanteSupervivenciaInjerto.clearAnimation();
        /* Limpiar animación de las listas desplegables de los Receptores. */
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto.clearAnimation();
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto.clearAnimation();
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2.clearAnimation();
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2.clearAnimation();
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3.clearAnimation();
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3.clearAnimation();
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4.clearAnimation();
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4.clearAnimation();
        spinnerAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5.clearAnimation();
        spinnerNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5.clearAnimation();
        /* Limpiar animación de los switches - Donante */
        switchCompatAsistoliaIIDonanteSupervivenciaInjerto.clearAnimation();
        switchCompatAsistoliaIIIDonanteSupervivenciaInjerto.clearAnimation();
        /* ******************************** */
    }
    /**
     * Método: limpiarAnimacionAtenuarVistas.
     * Llama al método clearAnimation().
     * Es obligatorio llamar al método anterior
     * antes de establecer (o modificar) la
     * visibilidad (visible, invisible o gone)
     * de una vista.
     * En caso contrario, las vistas pueden
     * permanecer en su estado de visibilidad
     * previa, haciendo caso omiso al cambio
     * de visibilidad.
     */
    private void limpiarAnimacionMenuOpciones() {
        /*
         * Es obligatorio limpiar la animación antes de
         * establecer la visibilidad de una vista:
         *
         * view.clearAnimation();
         * view.setVisibility(View.GONE);
         *
         * En caso contrario, el cambio de visibilidad
         * de la vista no tendrá efecto.
         */
        /* Limpiar animación: anim_girar_opciones_abrir.xml / anim_girar_opciones_cerrar.xml. */
        opcionesSupervivenciaInjerto.clearAnimation();
        /* Limpiar animación: anim_mostrar_opciones_abrir.xml / anim_mostrar_opciones_cerrar.xml. */
        botonFlotanteCalcularSupervivenciaInjerto.clearAnimation();
        botonFlotanteNuevoReceptorSupervivenciaInjerto.clearAnimation();
        botonFlotanteBorrarSupervivenciaInjerto.clearAnimation();
    }

    /*
     * public void finish ()
     * Se llama a este método cuando la actividad ha finalizado y
     * debe cerrarse.
     * El resultado de la actividad (ActivityResult) se propaga
     * a quien lo lanzó (a la actividad que lo lanzó) a través de
     * onActivityResult().
     *
     * https://developer.android.com/reference/android/app/Activity#finish()
     *
     * public void onBackPressed ()
     * Se llama a este método cuando la actividad detecta que
     * el usuario ha pulsado la tecla Atrás.
     * La implementación por defecto depende de la vesión de
     * la plataforma Android:
     *     - En versiones de la plataforma anteriores a Build.VERSION_CODES.S (API 31):
     *       finaliza la actividad actual. Este comportamiento puede ser anulado y
     *       sustituido por el que desee el desarrollador.
     *     - Desde la versión de la plataforma Build.VERSION_CODES.S (API 31):
     *       para actividades que son la actividad raíz de la tarea y que declaren
     *       un IntentFilter con Intent#ACTION_MAIN e Intent#CATEGORY_LAUNCHER en el
     *       manifiesto, la actividad actual y sus correspondientes tareas se moverán
     *       a la parte posterior de la pila de actividades, en lugar de ser finalizadas.
     *       Otras actividades, simplemente se finalizarán.
     *     - Si tiene como objetivo la versión de la plataforma Build.VERSION_CODES.S
     *       (API 31) y superiores y, anula el presente método: se recomienda encarecidamente
     *       llamar a la implementación de la superclase después de finalizar el manejo de
     *       navegación dentro de la aplicación.
     *
     * https://developer.android.com/reference/android/app/Activity#onBackPressed()
     */
    /**
     * Método: onSupportNavigateUp.
     * @return super.onSupportNavigateUp()
     */
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
    /**
     * Método: onBackPressed.
     */
    @Override
    public void onBackPressed() {
        finish();
    }
}
