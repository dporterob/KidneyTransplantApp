package com.tfg.apptrasplanterenal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Clase: CalcularSupervivenciaInjerto.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class CalcularSupervivenciaInjerto extends AppCompatActivity {
    /* Botones flotantes. */
    ExtendedFloatingActionButton opcionesCalcularSupervivenciaInjerto;
    FloatingActionButton botonFlotanteGenerarGraficaSupervivenciaInjerto;
    TextView textViewGenerarGraficaSupervivenciaInjerto;
    Boolean opcionesDesplegadasCalcularSupervivenciaInjerto;
    Boolean vistasAtenuadasCalcularSupervivenciaInjerto;
    /* Animaciones de los botones flotantes. */
    Animation animAtenuarVistaCalcularSupervivenciaInjerto;
    Animation animAumentarVistaCalcularSupervivenciaInjerto;
    Animation animGirarOpcionesAlAbrirCalcularSupervivenciaInjerto;
    Animation animGirarOpcionesAlCerrarCalcularSupervivenciaInjerto;
    Animation animMostrarOpcionesAlAbrirCalcularSupervivenciaInjerto;
    Animation animOcultarOpcionesAlCerrarCalcularSupervivenciaInjerto;
    /* Vista de texto del titular del layout. */
    TextView textViewModeloCalcularSupervivenciaInjerto;
    /* Vista de la petición REST. */
    TextView textViewIndeterminateBarCalcularSupervivenciaInjerto;
    /* Barra de progreso de la petición REST. */
    LinearProgressIndicator linearProgressIndicatorCalcularSupervivenciaInjerto;
    /* Vistas de texto del receptor 1. */
    TextView textViewCalcularSupervivenciaInjertoReceptor1;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo1;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo3;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo5;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo7;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo10;
    TextView textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad;
    /* Vistas de texto del receptor 2. */
    TextView textViewCalcularSupervivenciaInjertoReceptor2;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo1;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo3;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo5;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo7;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo10;
    TextView textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad;
    /* Vistas de texto del receptor 3. */
    TextView textViewCalcularSupervivenciaInjertoReceptor3;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo1;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo3;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo5;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo7;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo10;
    TextView textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad;
    /* Vistas de texto del receptor 4. */
    TextView textViewCalcularSupervivenciaInjertoReceptor4;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo1;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo3;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo5;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo7;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo10;
    TextView textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad;
    /* Vistas de texto del receptor 5. */
    TextView textViewCalcularSupervivenciaInjertoReceptor5;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo1;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo3;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo5;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo7;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo10;
    TextView textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad;
    /* Cadenas de texto genéricas del donante. */
    String stringCalcularSupervivenciaInjertoDonanteEdadDonante;
    String stringCalcularSupervivenciaInjertoDonanteAsistoliaIIDonante;
    String stringCalcularSupervivenciaInjertoDonanteAsistoliaIIIDonante;
    /* Cadenas de texto genéricas de los receptores (1, 2, 3, 4 y 5). */
    String stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante;
    String stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal;
    /*
     * Vistas de texto de los datos que ha recibido
     * el servicio REST, enviados por el cliente
     * (App Trasplante Renal), y con los que ha
     * realizado los cálculos para obtener las
     * probabilidades de supervivencia.
     */
    TextView textViewDatosFormulario;
    TextView textViewDatosDonante;
    TextView textViewDatosReceptor1;
    TextView textViewDatosReceptor2;
    TextView textViewDatosReceptor3;
    TextView textViewDatosReceptor4;
    TextView textViewDatosReceptor5;
    TextView textViewEdadDonante;
    TextView textViewAsistoliaIIDonante;
    TextView textViewAsistoliaIIIDonante;
    TextView textViewAnticuerposCitotoxicosPretrasplanteReceptor1;
    TextView textViewAnticuerposCitotoxicosPretrasplanteReceptor2;
    TextView textViewAnticuerposCitotoxicosPretrasplanteReceptor3;
    TextView textViewAnticuerposCitotoxicosPretrasplanteReceptor4;
    TextView textViewAnticuerposCitotoxicosPretrasplanteReceptor5;
    TextView textViewNumeroTrasplanteRenalReceptor1;
    TextView textViewNumeroTrasplanteRenalReceptor2;
    TextView textViewNumeroTrasplanteRenalReceptor3;
    TextView textViewNumeroTrasplanteRenalReceptor4;
    TextView textViewNumeroTrasplanteRenalReceptor5;
    /* Datos recibidos del servicio REST - Receptor 1. */
    Float floatCalcularSupervivenciaInjertoReceptor1Tiempo1;
    Float floatCalcularSupervivenciaInjertoReceptor1Tiempo3;
    Float floatCalcularSupervivenciaInjertoReceptor1Tiempo5;
    Float floatCalcularSupervivenciaInjertoReceptor1Tiempo7;
    Float floatCalcularSupervivenciaInjertoReceptor1Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 2. */
    Float floatCalcularSupervivenciaInjertoReceptor2Tiempo1;
    Float floatCalcularSupervivenciaInjertoReceptor2Tiempo3;
    Float floatCalcularSupervivenciaInjertoReceptor2Tiempo5;
    Float floatCalcularSupervivenciaInjertoReceptor2Tiempo7;
    Float floatCalcularSupervivenciaInjertoReceptor2Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 3. */
    Float floatCalcularSupervivenciaInjertoReceptor3Tiempo1;
    Float floatCalcularSupervivenciaInjertoReceptor3Tiempo3;
    Float floatCalcularSupervivenciaInjertoReceptor3Tiempo5;
    Float floatCalcularSupervivenciaInjertoReceptor3Tiempo7;
    Float floatCalcularSupervivenciaInjertoReceptor3Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 4. */
    Float floatCalcularSupervivenciaInjertoReceptor4Tiempo1;
    Float floatCalcularSupervivenciaInjertoReceptor4Tiempo3;
    Float floatCalcularSupervivenciaInjertoReceptor4Tiempo5;
    Float floatCalcularSupervivenciaInjertoReceptor4Tiempo7;
    Float floatCalcularSupervivenciaInjertoReceptor4Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 5. */
    Float floatCalcularSupervivenciaInjertoReceptor5Tiempo1;
    Float floatCalcularSupervivenciaInjertoReceptor5Tiempo3;
    Float floatCalcularSupervivenciaInjertoReceptor5Tiempo5;
    Float floatCalcularSupervivenciaInjertoReceptor5Tiempo7;
    Float floatCalcularSupervivenciaInjertoReceptor5Tiempo10;
    /*
     * Datos que ha recibido el servicio REST,
     * enviados por el cliente (App Trasplante Renal),
     * y con los que ha realizado los cálculos para
     * obtener las probabilidades de supervivencia.
     */
    Integer integerEdadDonante;
    String stringAsistoliaIIDonante;
    String stringAsistoliaIIIDonante;
    Integer integerAnticuerposCitotoxicosPretrasplanteReceptor1;
    Integer integerAnticuerposCitotoxicosPretrasplanteReceptor2;
    Integer integerAnticuerposCitotoxicosPretrasplanteReceptor3;
    Integer integerAnticuerposCitotoxicosPretrasplanteReceptor4;
    Integer integerAnticuerposCitotoxicosPretrasplanteReceptor5;
    Integer integerNumeroTrasplanteRenalReceptor1;
    Integer integerNumeroTrasplanteRenalReceptor2;
    Integer integerNumeroTrasplanteRenalReceptor3;
    Integer integerNumeroTrasplanteRenalReceptor4;
    Integer integerNumeroTrasplanteRenalReceptor5;
    /* ************************************************ */

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
        setContentView(R.layout.activity_calcular_supervivencia_injerto);

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

        /*
         * Botones flotantes.
         */
        opcionesCalcularSupervivenciaInjerto = findViewById(R.id.botonOpcionesCalcularSupervivenciaInjerto);
        botonFlotanteGenerarGraficaSupervivenciaInjerto = findViewById(R.id.botonGenerarGraficaSupervivenciaInjerto);
        textViewGenerarGraficaSupervivenciaInjerto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjerto);

        /*
         * Animaciones.
         */
        animAtenuarVistaCalcularSupervivenciaInjerto = AnimationUtils.loadAnimation(CalcularSupervivenciaInjerto.this, R.anim.anim_atenuar_vista);
        animAumentarVistaCalcularSupervivenciaInjerto = AnimationUtils.loadAnimation(CalcularSupervivenciaInjerto.this, R.anim.anim_aumentar_vista);
        animMostrarOpcionesAlAbrirCalcularSupervivenciaInjerto = AnimationUtils.loadAnimation(CalcularSupervivenciaInjerto.this, R.anim.anim_mostrar_opciones_abrir);
        animOcultarOpcionesAlCerrarCalcularSupervivenciaInjerto = AnimationUtils.loadAnimation(CalcularSupervivenciaInjerto.this, R.anim.anim_ocultar_opciones_cerrar);
        animGirarOpcionesAlAbrirCalcularSupervivenciaInjerto = AnimationUtils.loadAnimation(CalcularSupervivenciaInjerto.this, R.anim.anim_girar_opciones_abrir);
        animGirarOpcionesAlCerrarCalcularSupervivenciaInjerto = AnimationUtils.loadAnimation(CalcularSupervivenciaInjerto.this, R.anim.anim_girar_opciones_cerrar);

        /* Opciones menú flotante: 'gone' en un inicio. */
        botonFlotanteGenerarGraficaSupervivenciaInjerto.setVisibility(View.GONE);
        textViewGenerarGraficaSupervivenciaInjerto.setVisibility(View.GONE);

        /* Estado del menú: desplegado / no desplegado. */
        opcionesDesplegadasCalcularSupervivenciaInjerto = false;
        /* Estado de las vistas del formulario: atenuadas / no atenuadas. */
        vistasAtenuadasCalcularSupervivenciaInjerto = false;
        /* .setClickable(true) es la opción por defecto para cualquier botón */
        opcionesCalcularSupervivenciaInjerto.setClickable(true);

        /* Vista de texto del titular del layout. */
        textViewModeloCalcularSupervivenciaInjerto = findViewById(R.id.textViewModeloCalcularSupervivenciaInjerto);
        /* Vista de la petición REST. */
        textViewIndeterminateBarCalcularSupervivenciaInjerto = findViewById(R.id.textViewIndeterminateBarCalcularSupervivenciaInjerto);
        /* Barra de progreso de la petición REST. */
        linearProgressIndicatorCalcularSupervivenciaInjerto = findViewById(R.id.linearProgressIndicatorCalcularSupervivenciaInjerto);
        /* Vistas de texto del receptor 1. */
        textViewCalcularSupervivenciaInjertoReceptor1 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo1);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo3);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo5);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo7);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo10);
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad);
        /* Vistas de texto del receptor 2. */
        textViewCalcularSupervivenciaInjertoReceptor2 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo1);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo3);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo5);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo7);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo10);
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad);
        /* Vistas de texto del receptor 3. */
        textViewCalcularSupervivenciaInjertoReceptor3 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo1);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo3);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo5);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo7);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo10);
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad);
        /* Vistas de texto del receptor 4. */
        textViewCalcularSupervivenciaInjertoReceptor4 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo1);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo3);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo5);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo7);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo10);
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad);
        /* Vistas de texto del receptor 5. */
        textViewCalcularSupervivenciaInjertoReceptor5 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo1);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo3);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo5);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo7);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo10);
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad);
        /* Cadenas de texto genéricas del donante. */
        stringCalcularSupervivenciaInjertoDonanteEdadDonante = "Donor age: ";
        stringCalcularSupervivenciaInjertoDonanteAsistoliaIIDonante = "Donor asystole II: ";
        stringCalcularSupervivenciaInjertoDonanteAsistoliaIIIDonante = "Donor asystole III: ";
        /* Cadenas de texto genéricas de los receptores (1, 2, 3, 4 y 5). */
        /*
         * \n : inserta una nueva línea en el texto.
         * Requerido para que el botón flotante del
         * menú de opciones no oculte parcialmente
         * una de las vistas.
         */
        stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante = "Pre-transplant cytotoxic\nantibodies: ";
        stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal = "Kidney transplant number: ";
        /*
         * Vistas de texto de los datos que ha recibido
         * el servicio REST, enviados por el cliente
         * (App Trasplante Renal), y con los que ha
         * realizado los cálculos para obtener las
         * probabilidades de supervivencia.
         */
        textViewDatosFormulario = findViewById(R.id.textViewDatosFormulario);
        textViewDatosDonante = findViewById(R.id.textViewDatosDonante);
        textViewDatosReceptor1 = findViewById(R.id.textViewDatosReceptor1);
        textViewDatosReceptor2 = findViewById(R.id.textViewDatosReceptor2);
        textViewDatosReceptor3 = findViewById(R.id.textViewDatosReceptor3);
        textViewDatosReceptor4 = findViewById(R.id.textViewDatosReceptor4);
        textViewDatosReceptor5 = findViewById(R.id.textViewDatosReceptor5);
        textViewEdadDonante = findViewById(R.id.textViewEdadDonante);
        textViewAsistoliaIIDonante = findViewById(R.id.textViewAsistoliaIIDonante);
        textViewAsistoliaIIIDonante = findViewById(R.id.textViewAsistoliaIIIDonante);
        textViewAnticuerposCitotoxicosPretrasplanteReceptor1 = findViewById(R.id.textViewAnticuerposCitotoxicosPretrasplanteReceptor1);
        textViewAnticuerposCitotoxicosPretrasplanteReceptor2 = findViewById(R.id.textViewAnticuerposCitotoxicosPretrasplanteReceptor2);
        textViewAnticuerposCitotoxicosPretrasplanteReceptor3 = findViewById(R.id.textViewAnticuerposCitotoxicosPretrasplanteReceptor3);
        textViewAnticuerposCitotoxicosPretrasplanteReceptor4 = findViewById(R.id.textViewAnticuerposCitotoxicosPretrasplanteReceptor4);
        textViewAnticuerposCitotoxicosPretrasplanteReceptor5 = findViewById(R.id.textViewAnticuerposCitotoxicosPretrasplanteReceptor5);
        textViewNumeroTrasplanteRenalReceptor1 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor1);
        textViewNumeroTrasplanteRenalReceptor2 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor2);
        textViewNumeroTrasplanteRenalReceptor3 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor3);
        textViewNumeroTrasplanteRenalReceptor4 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor4);
        textViewNumeroTrasplanteRenalReceptor5 = findViewById(R.id.textViewNumeroTrasplanteRenalReceptor5);

        /*
         * getIntent()
         *
         * Método getIntent() de la clase Intent. Obsoleto desde API level 15.
         * https://developer.android.com/reference/android/content/Intent#getIntent(java.lang.String)
         *
         * Método getIntent() de la clase Activity.
         * https://developer.android.com/reference/android/app/Activity.html#getIntent()
         *
         * Aclaración:
         * https://es.stackoverflow.com/questions/157287/getintent-deprecated-usar-correctamente-parseuri-y-touri
         */
        Intent intentActividadCalcularSupervivenciaInjerto = getIntent();
        /* Datos del donante. */
        String autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto");
        String estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto = intentActividadCalcularSupervivenciaInjerto.getStringExtra("estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto");
        String estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto = intentActividadCalcularSupervivenciaInjerto.getStringExtra("estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto");
        /* Datos del receptor 1. */
        String autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto");
        String autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto");
        /* Datos del receptor 2. */
        String autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2");
        String autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2");
        /* Datos del receptor 3. */
        String autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3");
        String autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3");
        /* Datos del receptor 4. */
        String autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4");
        String autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4");
        /* Datos del receptor 5. */
        String autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5");
        String autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 = intentActividadCalcularSupervivenciaInjerto.getStringExtra("autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5");

        /*
         * Datos recibidos.
         */
        /*
         * Vistas de texto de la probabilidad de supervivencia
         * del donante 'visible' por defecto.
         *
         * Los datos del donante son obligatorios;
         * se comprueba en la actividad SupervivenciaInjerto
         * que el usuario haya introducido los datos.
         */
        /*
         * Vistas de texto de la probabilidad de supervivencia
         * del receptor 1 'visible' por defecto.
         *
         * Los datos del receptor 1 son obligatorios;
         * se comprueba en la actividad SupervivenciaInjerto
         * que el usuario haya introducido los datos.
         */
        if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 != null
                && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 != null) {
            /*
             * Vistas de texto de la probabilidad de supervivencia
             * del receptor 2 'gone' por defecto.
             *
             * Los datos del receptor 2 son opcionales.
             *
             * Si se proporcionan los datos para el receptor 2,
             * se harán 'visible' los campos de texto de la
             * probabilidad de supervivencia de dicho receptor.
             */
            textViewCalcularSupervivenciaInjertoReceptor2.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor2.setVisibility(View.VISIBLE);
            textViewAnticuerposCitotoxicosPretrasplanteReceptor2.setVisibility(View.VISIBLE);
            textViewNumeroTrasplanteRenalReceptor2.setVisibility(View.VISIBLE);
        }
        /*
         * else {
         *     El usuario no ha introducido los datos
         *     correspondientes al receptor 2.
         *     Las vistas de las probabilidades de
         *     supervivencia y las vistas de los datos
         *     interpretados por el servicio REST
         *     se mantienen 'gone' por defecto.
         * }
         */
        if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 != null
                && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 != null) {
            /*
             * Vistas de texto de la probabilidad de supervivencia
             * del receptor 3 'gone' por defecto.
             *
             * Los datos del receptor 3 son opcionales.
             *
             * Si se proporcionan los datos para el receptor 3,
             * se harán 'visible' los campos de texto de la
             * probabilidad de supervivencia de dicho receptor.
             */
            textViewCalcularSupervivenciaInjertoReceptor3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor3.setVisibility(View.VISIBLE);
            textViewAnticuerposCitotoxicosPretrasplanteReceptor3.setVisibility(View.VISIBLE);
            textViewNumeroTrasplanteRenalReceptor3.setVisibility(View.VISIBLE);
        }
        /*
         * else {
         *     El usuario no ha introducido los datos
         *     correspondientes al receptor 3.
         *     Las vistas de las probabilidades de
         *     supervivencia y las vistas de los datos
         *     interpretados por el servicio REST
         *     se mantienen 'gone' por defecto.
         * }
         */
        if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 != null
                && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 != null) {
            /*
             * Vistas de texto de la probabilidad de supervivencia
             * del receptor 4 'gone' por defecto.
             *
             * Los datos del receptor 4 son opcionales.
             *
             * Si se proporcionan los datos para el receptor 4,
             * se harán 'visible' los campos de texto de la
             * probabilidad de supervivencia de dicho receptor.
             */
            textViewCalcularSupervivenciaInjertoReceptor4.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor4.setVisibility(View.VISIBLE);
            textViewAnticuerposCitotoxicosPretrasplanteReceptor4.setVisibility(View.VISIBLE);
            textViewNumeroTrasplanteRenalReceptor4.setVisibility(View.VISIBLE);
        }
        /*
         * else {
         *     El usuario no ha introducido los datos
         *     correspondientes al receptor 4.
         *     Las vistas de las probabilidades de
         *     supervivencia y las vistas de los datos
         *     interpretados por el servicio REST
         *     se mantienen 'gone' por defecto.
         * }
         */
        if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 != null
                && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 != null) {
            /*
             * Vistas de texto de la probabilidad de supervivencia
             * del receptor 5 'gone' por defecto.
             *
             * Los datos del receptor 5 son opcionales.
             *
             * Si se proporcionan los datos para el receptor 5,
             * se harán 'visible' los campos de texto de la
             * probabilidad de supervivencia de dicho receptor.
             */
            textViewCalcularSupervivenciaInjertoReceptor5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor5.setVisibility(View.VISIBLE);
            textViewAnticuerposCitotoxicosPretrasplanteReceptor5.setVisibility(View.VISIBLE);
            textViewNumeroTrasplanteRenalReceptor5.setVisibility(View.VISIBLE);
        }
        /*
         * else {
         *     El usuario no ha introducido los datos
         *     correspondientes al receptor 5.
         *     Las vistas de las probabilidades de
         *     supervivencia y las vistas de los datos
         *     interpretados por el servicio REST
         *     se mantienen 'gone' por defecto.
         * }
         */

        /*
         * Petición al servicio REST.
         * http://localhost:8080/supervivenciaInjerto/ejecutarModelo
         */
        /*
         * Animación inicial de la barra de progreso.
         * https://material.io/components/progress-indicators/android
         */
        linearProgressIndicatorCalcularSupervivenciaInjerto.animate();
        /*
         * Every network request performed by Volley is performed in a background thread.
         * Volley takes care of this behind the scenes. So there is no need to perform a
         *  request on a different thread, since that's already happening.
         * The listeners, on the other hand, are called on the UI thread.
         * You basically answered your own question when you wrote that the data is processed
         * on the UI thread. Simply move that data processing that is performed inside your
         * listeners to a background thread / AsyncTask to free your UI thread and prevent the
         * blocking.
         * https://stackoverflow.com/questions/26588081/make-volley-request-in-different-thread
         */
        /*
         * Volley is an HTTP library that makes networking for Android apps easier and,
         * most importantly, faster.
         * https://google.github.io/volley/
         * https://google.github.io/volley/simple
         * https://github.com/google/volley
         */
        /*
         * java.net.ConnectException: fail to connect to localhost/127.0.0.1(port 8080)
         * Inside the emulator, 127.0.0.1 refers to the emulator itself - not your local machine.
         * You need to use ip 10.0.2.2, which is bridged to your local machine.
         * https://stackoverflow.com/questions/36811202/java-net-connectexception-fail-to-connect-to-localhost-127-0-0-1port-8080-co
         */
        /* *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
        /* URL para pruebas en el emulador (dispositivo virtual) */
        //final String urlModeloSupervivenciaInjerto = "http://10.0.2.2:8080/supervivenciaInjerto/ejecutarModelo";
        /* URL para pruebas en el dispositivo físico */
        final String urlModeloSupervivenciaInjerto = "http://localhost:8080/supervivenciaInjerto/ejecutarModelo";
        /* *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
        RequestQueue requestQueuePeticionRESTModeloSupervivenciaInjerto;
        try {
            JSONObject jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto = new JSONObject();
            if (autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto != null
                    && estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto != null
                    && estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto != null) {
                /* Datos del donante cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("edadDonante",
                                autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("asistoliaIIDonante",
                                estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("asistoliaIIIDonante",
                                estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto);
            }
            if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto != null
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto != null) {
                /* Datos del receptor 1 cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("anticuerposCitotoxicosPretrasplanteReceptor1",
                                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("numeroTrasplanteRenalReceptor1",
                                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto);
            }
            if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 != null
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 != null) {
                /* Datos del receptor 2 cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("anticuerposCitotoxicosPretrasplanteReceptor2",
                                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("numeroTrasplanteRenalReceptor2",
                                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2);
            }
            if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 != null
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 != null) {
                /* Datos del receptor 3 cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("anticuerposCitotoxicosPretrasplanteReceptor3",
                                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("numeroTrasplanteRenalReceptor3",
                                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3);
            }
            if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 != null
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 != null) {
                /* Datos del receptor 4 cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("anticuerposCitotoxicosPretrasplanteReceptor4",
                                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("numeroTrasplanteRenalReceptor4",
                                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4);
            }
            if (autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 != null
                    && autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 != null) {
                /* Datos del receptor 5 cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("anticuerposCitotoxicosPretrasplanteReceptor5",
                                autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto
                        .put("numeroTrasplanteRenalReceptor5",
                                autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5);
            }

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                    urlModeloSupervivenciaInjerto,
                    new JSONObject(jsonObjectCuerpoPeticionRESTModeloSupervivenciaInjerto.toString()),
                    jsonObjectResponse -> {
                        /*
                         * Petición exitosa (200 OK).
                         * Muestra en color verde el mensaje
                         * "Resultados recibidos correctamente".
                         * El indicador lineal de progreso se muestra
                         * en color verde y, seguidamente, se modifica
                         * su visibilidad a GONE.
                         */
                        textViewIndeterminateBarCalcularSupervivenciaInjerto
                                .setText(getResources().getString(R.string.resultados_recibidos_correctamente_calcular_supervivencia_injerto));
                        textViewIndeterminateBarCalcularSupervivenciaInjerto
                                .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                R.color.green));
                        linearProgressIndicatorCalcularSupervivenciaInjerto
                                .setVisibility(View.GONE);
                        linearProgressIndicatorCalcularSupervivenciaInjerto
                                .clearAnimation();
                        try {
                            /* Donante. */
                            /*
                             * Si el usuario ha introducido los datos del donante
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal).
                             */
                            if (!(autoCompleteTextViewSpinnerEdadDonanteSupervivenciaInjerto == null)
                                    && !(estadoSwitchCompatAsistoliaIIDonanteSupervivenciaInjerto == null)
                                    && !(estadoSwitchCompatAsistoliaIIIDonanteSupervivenciaInjerto == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerEdadDonante
                                        = jsonObjectResponse.getInt("edadDonante");
                                stringAsistoliaIIDonante
                                        = jsonObjectResponse.getString("asistoliaIIDonante");
                                stringAsistoliaIIIDonante
                                        = jsonObjectResponse.getString("asistoliaIIIDonante");
                                /* Establecer datos que ha recibido el servicio REST para el donante. */
                                textViewEdadDonante
                                        .setText(stringCalcularSupervivenciaInjertoDonanteEdadDonante
                                                .concat(String.valueOf(integerEdadDonante)));
                                textViewAsistoliaIIDonante
                                        .setText(stringCalcularSupervivenciaInjertoDonanteAsistoliaIIDonante
                                                .concat(stringAsistoliaIIDonante));
                                textViewAsistoliaIIIDonante
                                        .setText(stringCalcularSupervivenciaInjertoDonanteAsistoliaIIIDonante
                                                .concat(stringAsistoliaIIIDonante));
                            }
                            /* *********** */

                            /* Receptor 1. */
                            /* Datos recibidos del servicio REST - Receptor 1. */
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor1").get(0).toString());
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor1").get(1).toString());
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor1").get(2).toString());
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor1").get(3).toString());
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor1").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 1
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaInjertoReceptor1Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo10 == 0.0)
                                    && !(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto == null)
                                    && !(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerAnticuerposCitotoxicosPretrasplanteReceptor1
                                        = jsonObjectResponse.getInt("anticuerposCitotoxicosPretrasplanteReceptor1");
                                integerNumeroTrasplanteRenalReceptor1
                                        = jsonObjectResponse.getInt("numeroTrasplanteRenalReceptor1");
                                /* Establecer probabilidad de supervivencia para el receptor 1. */
                                textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor1Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor1Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor1Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor1Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor1Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 1. */
                                textViewAnticuerposCitotoxicosPretrasplanteReceptor1
                                        .setText(stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante
                                                .concat(String.valueOf(integerAnticuerposCitotoxicosPretrasplanteReceptor1)));
                                textViewNumeroTrasplanteRenalReceptor1
                                        .setText(stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal
                                                .concat(String.valueOf(integerNumeroTrasplanteRenalReceptor1)));
                            }
                            /* *********** */

                            /* Receptor 2. */
                            /* Datos recibidos del servicio REST - Receptor 2. */
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor2").get(0).toString());
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor2").get(1).toString());
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor2").get(2).toString());
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor2").get(3).toString());
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor2").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 2
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaInjertoReceptor2Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo10 == 0.0)
                                    && !(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor2 == null)
                                    && !(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor2 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerAnticuerposCitotoxicosPretrasplanteReceptor2
                                        = jsonObjectResponse.getInt("anticuerposCitotoxicosPretrasplanteReceptor2");
                                integerNumeroTrasplanteRenalReceptor2
                                        = jsonObjectResponse.getInt("numeroTrasplanteRenalReceptor2");
                                /* Establecer probabilidad de supervivencia para el receptor 2. */
                                textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor2Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor2Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor2Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor2Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor2Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 2. */
                                textViewAnticuerposCitotoxicosPretrasplanteReceptor2
                                        .setText(stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante
                                                .concat(String.valueOf(integerAnticuerposCitotoxicosPretrasplanteReceptor2)));
                                textViewNumeroTrasplanteRenalReceptor2
                                        .setText(stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal
                                                .concat(String.valueOf(integerNumeroTrasplanteRenalReceptor2)));
                            }
                            /* *********** */

                            /* Receptor 3. */
                            /* Datos recibidos del servicio REST - Receptor 3. */
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor3").get(0).toString());
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor3").get(1).toString());
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor3").get(2).toString());
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor3").get(3).toString());
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor3").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 3
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaInjertoReceptor3Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo10 == 0.0)
                                    && !(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor3 == null)
                                    && !(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor3 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerAnticuerposCitotoxicosPretrasplanteReceptor3
                                        = jsonObjectResponse.getInt("anticuerposCitotoxicosPretrasplanteReceptor3");
                                integerNumeroTrasplanteRenalReceptor3
                                        = jsonObjectResponse.getInt("numeroTrasplanteRenalReceptor3");
                                /* Establecer probabilidad de supervivencia para el receptor 3. */
                                textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor3Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor3Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor3Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor3Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor3Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 3. */
                                textViewAnticuerposCitotoxicosPretrasplanteReceptor3
                                        .setText(stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante
                                                .concat(String.valueOf(integerAnticuerposCitotoxicosPretrasplanteReceptor3)));
                                textViewNumeroTrasplanteRenalReceptor3
                                        .setText(stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal
                                                .concat(String.valueOf(integerNumeroTrasplanteRenalReceptor3)));
                            }
                            /* *********** */

                            /* Receptor 4. */
                            /* Datos recibidos del servicio REST - Receptor 4. */
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor4").get(0).toString());
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor4").get(1).toString());
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor4").get(2).toString());
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor4").get(3).toString());
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor4").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 4
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaInjertoReceptor4Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo10 == 0.0)
                                    && !(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor4 == null)
                                    && !(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor4 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerAnticuerposCitotoxicosPretrasplanteReceptor4
                                        = jsonObjectResponse.getInt("anticuerposCitotoxicosPretrasplanteReceptor4");
                                integerNumeroTrasplanteRenalReceptor4
                                        = jsonObjectResponse.getInt("numeroTrasplanteRenalReceptor4");
                                /* Establecer probabilidad de supervivencia para el receptor 4. */
                                textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor4Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor4Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor4Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor4Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor4Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 4. */
                                textViewAnticuerposCitotoxicosPretrasplanteReceptor4
                                        .setText(stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante
                                                .concat(String.valueOf(integerAnticuerposCitotoxicosPretrasplanteReceptor4)));
                                textViewNumeroTrasplanteRenalReceptor4
                                        .setText(stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal
                                                .concat(String.valueOf(integerNumeroTrasplanteRenalReceptor4)));
                            }
                            /* *********** */

                            /* Receptor 5. */
                            /* Datos recibidos del servicio REST - Receptor 2. */
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor5").get(0).toString());
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor5").get(1).toString());
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor5").get(2).toString());
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor5").get(3).toString());
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaInjertoReceptor5").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 5
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaInjertoReceptor5Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo10 == 0.0)
                                    && !(autoCompleteTextViewAnticuerposCitotoxicosReceptorSupervivenciaInjerto_Receptor5 == null)
                                    && !(autoCompleteTextViewNumeroTrasplanteRenalReceptorSupervivenciaInjerto_Receptor5 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerAnticuerposCitotoxicosPretrasplanteReceptor5
                                        = jsonObjectResponse.getInt("anticuerposCitotoxicosPretrasplanteReceptor5");
                                integerNumeroTrasplanteRenalReceptor5
                                        = jsonObjectResponse.getInt("numeroTrasplanteRenalReceptor5");
                                /* Establecer probabilidad de supervivencia para el receptor 5. */
                                textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor5Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor5Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor5Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor5Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaInjertoReceptor5Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 5. */
                                textViewAnticuerposCitotoxicosPretrasplanteReceptor5
                                        .setText(stringCalcularSupervivenciaInjertoReceptorAnticuerposCitotoxicosPretrasplante
                                                .concat(String.valueOf(integerAnticuerposCitotoxicosPretrasplanteReceptor5)));
                                textViewNumeroTrasplanteRenalReceptor5
                                        .setText(stringCalcularSupervivenciaInjertoReceptorNumeroTrasplanteRenal
                                                .concat(String.valueOf(integerNumeroTrasplanteRenalReceptor5)));
                            }
                            /* *********** */
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }, error -> {
                        /*
                         * En caso de erro en la petición REST
                         * (HTTP 4XX o HTTP 5XX, siendo 'XX'
                         * el identificador del error del
                         * cliente o del servidor respectivamente),
                         * se muestra un mensaje de posible solución
                         * al error (en color azul) o un mensaje
                         * de error (en color rojo).
                         */
                        if (!redDisponible()) {
                            textViewIndeterminateBarCalcularSupervivenciaInjerto
                                    .setText(getResources().getString(R.string.no_conectado_internet_calcular_supervivencia_injerto));
                            textViewIndeterminateBarCalcularSupervivenciaInjerto
                                    .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                    R.color.blue));
                            linearProgressIndicatorCalcularSupervivenciaInjerto
                                    .setVisibility(View.GONE);
                            linearProgressIndicatorCalcularSupervivenciaInjerto
                                    .clearAnimation();
                        }
                        else if (error.networkResponse == null) {
                            textViewIndeterminateBarCalcularSupervivenciaInjerto
                                    .setText(getResources().getString(R.string.servicio_no_disponible_calcular_supervivencia_injerto));
                            textViewIndeterminateBarCalcularSupervivenciaInjerto
                                    .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                    R.color.red));
                            linearProgressIndicatorCalcularSupervivenciaInjerto
                                    .setVisibility(View.GONE);
                            linearProgressIndicatorCalcularSupervivenciaInjerto
                                    .clearAnimation();
                        }
                        else {
                            textViewIndeterminateBarCalcularSupervivenciaInjerto
                                    .setText(getResources().getString(R.string.codigo_error_http_calcular_supervivencia_injerto,String.valueOf(error.networkResponse.statusCode)));
                            textViewIndeterminateBarCalcularSupervivenciaInjerto
                                    .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                    R.color.red));
                            linearProgressIndicatorCalcularSupervivenciaInjerto
                                    .setVisibility(View.GONE);
                            linearProgressIndicatorCalcularSupervivenciaInjerto
                                    .clearAnimation();
                        }
                    });
            /*
             * com.android.volley.DefaultRetryPolicy:
             *
             * Valores por defecto:
             * DefaultRetryPolicy.DEFAULT_TIMEOUT_MS:   2500
             * DefaultRetryPolicy.DEFAULT_MAX_RETRIES:  1
             * DefaultRetryPolicy.DEFAULT_BACKOFF_MULT: 1.0f
             *
             * Valores establecidos:
             * initialTimeoutMs:  750
             * maxNumRetries:     4
             * backoffMultiplier: 1.0f
             *
             * Intento número 1:
             * timeoutSocketIntento1 = initialTimeoutMs + (initialTimeoutMs * backoffMultiplier) =
             *                        = 750 ms + (750 ms * 1) =
             *                        = 1500 ms.
             * Intento número 2:
             * timeoutSocketIntento2 = timeoutSocketIntento1 + (timeoutSocketIntento1 * backoffMultiplier) =
             *                        = 1500 ms + (1500 ms * 1) =
             *                        = 3000 ms.
             * Intento número 3:
             * timeoutSocketIntento3 = timeoutSocketIntento2 + (timeoutSocketIntento2 * backoffMultiplier) =
             *                        = 3000 ms + (3000 ms * 1) =
             *                        = 6000 ms.
             * Intento número 4:
             * timeoutSocketIntento4 = timeoutSocketIntento3 + (timeoutSocketIntento3 * backoffMultiplier) =
             *                        = 6000 ms + (6000 ms * 1) =
             *                        = 12000 ms.
             *
             * Transcurrido el intento número 4 y existiendo nuevamente un timeout para el socket,
             * Volley lanza un TimeoutError en el controlador de respuesta de error de la interfaz
             * del usuario.
             *
             * https://github.com/google/volley/blob/master/core/src/main/java/com/android/volley
             * /DefaultRetryPolicy.java
             * https://developer.mozilla.org/en-US/docs/Web/Performance/Understanding_latency#network_throttling
             */
            jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(
                    750,
                    4,
                    1.0f));
            requestQueuePeticionRESTModeloSupervivenciaInjerto
                    = Volley.newRequestQueue(CalcularSupervivenciaInjerto.this);
            requestQueuePeticionRESTModeloSupervivenciaInjerto.add(jsonObjectRequest);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        opcionesCalcularSupervivenciaInjerto.setOnClickListener(view -> {
            /* Atenúa las vistas del formulario. */
            animacionAtenuarVistas();
            /*
             * Despliega el menu de opciones al pulsar "+"
             * y oculta el menu de opciones al pulsar "x".
             */
            animacionMenuOpciones();
        });
        botonFlotanteGenerarGraficaSupervivenciaInjerto.setOnClickListener(view -> {
            /* Aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionAtenuarVistas();
            /* Oculta el menú de opciones al pulsar sobre uno de los botones flotantes */
            animacionMenuOpciones();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionMenuOpciones();

            Intent intent = new Intent(getApplicationContext(), GenerarGraficaSupervivenciaInjerto.class);
            /* Datos recibidos del servicio REST - Receptor 1. */
            if (!(floatCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaInjertoReceptor1Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor1Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo1",
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo3",
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo5",
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo7",
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo10",
                            floatCalcularSupervivenciaInjertoReceptor1Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 2. */
            if (!(floatCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaInjertoReceptor2Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor2Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo1",
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo3",
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo5",
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo7",
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo10",
                            floatCalcularSupervivenciaInjertoReceptor2Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 3. */
            if (!(floatCalcularSupervivenciaInjertoReceptor3Tiempo1 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo3 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo5 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo7 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaInjertoReceptor3Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor3Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo1",
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo3",
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo5",
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo7",
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo10",
                            floatCalcularSupervivenciaInjertoReceptor3Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 4. */
            if (!(floatCalcularSupervivenciaInjertoReceptor4Tiempo1 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo3 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo5 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo7 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaInjertoReceptor4Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor4Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo1",
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo3",
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo5",
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo7",
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo10",
                            floatCalcularSupervivenciaInjertoReceptor4Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 5. */
            if (!(floatCalcularSupervivenciaInjertoReceptor5Tiempo1 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo3 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo5 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo7 == null)
                    && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaInjertoReceptor5Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaInjertoReceptor5Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo1",
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo3",
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo5",
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo7",
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo10",
                            floatCalcularSupervivenciaInjertoReceptor5Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo10", "0.0");
            }
            /*
             * Datos que ha recibido el servicio REST,
             * enviados por el cliente (App Trasplante Renal),
             * y con los que ha realizado los cálculos para
             * obtener las probabilidades de supervivencia.
             *
             * Estos datos no se requieren en la actividad
             * GenerarGraficaSupervivenciaInjerto.
             */
            /* **** **** **** **** **** **** **** **** **** **** */

            startActivity(intent);
        });
    }

    /*
     * Conectividad Internet (WiFi o Datos móviles).
     */
    /**
     * Método: redDisponible. Este método sólo es llamado
     * en caso de error en la petición al servicio realizada
     * por la librería HTTP Volley. Ayuda al usuario a encontrar
     * el motivo del error, comprobando si el error es debido
     * a que no se encuentra conectado a una red.
     * @return transporteDisponible boolean que indica
     * si, al menos, existe uno de los transportes disponibles
     * (Ethernet, WiFi, VPN o Celular).
     */
    private boolean redDisponible() {
        boolean transporteDisponible = false;
        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (!(connectivityManager == null)) {
            NetworkCapabilities networkCapabilities
                    = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (!(networkCapabilities == null)) {
                transporteDisponible = networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
                        || networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
                        || networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)
                        || networkCapabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN);
            }
        }
        return transporteDisponible;
    }

    /*
     * Animaciones.
     */
    /**
     * Método: animacionAtenuarVistas.
     * Disminuye la opacidad al 20% de
     * todas las vistas de tipo TextView
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
        if(!vistasAtenuadasCalcularSupervivenciaInjerto) {
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
            /* Atenuar vista de texto del titular del layout. */
            textViewModeloCalcularSupervivenciaInjerto.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            /* Atenuar vista de la petición REST. */
            textViewIndeterminateBarCalcularSupervivenciaInjerto.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            /* Atenuar barra de progreso de la petición REST. */
            linearProgressIndicatorCalcularSupervivenciaInjerto.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            /* Atenuar vistas de texto del receptor 1. */
            textViewCalcularSupervivenciaInjertoReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            /* Atenuar vistas de texto del receptor 2. */
            if (textViewCalcularSupervivenciaInjertoReceptor2.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            /* Atenuar vistas de texto del receptor 3. */
            if (textViewCalcularSupervivenciaInjertoReceptor3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            /* Atenuar vistas de texto del receptor 4. */
            if (textViewCalcularSupervivenciaInjertoReceptor4.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            /* Atenuar vistas de texto del receptor 5. */
            if (textViewCalcularSupervivenciaInjertoReceptor5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            /*
             * Atenuar vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosFormulario.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewDatosDonante.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewEdadDonante.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewAsistoliaIIDonante.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewAsistoliaIIIDonante.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewDatosReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewAnticuerposCitotoxicosPretrasplanteReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            textViewNumeroTrasplanteRenalReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            if (textViewDatosReceptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            if (textViewDatosReceptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            if (textViewDatosReceptor4.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor4.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            if (textViewDatosReceptor5.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor5.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaInjerto);
            }
            /* ************************************************** */
            /* Estado de las vistas: atenuadas. */
            vistasAtenuadasCalcularSupervivenciaInjerto = true;
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
            /* Aumentar vista de texto del titular del layout. */
            textViewModeloCalcularSupervivenciaInjerto.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            /* Aumentar vista de la petición REST. */
            textViewIndeterminateBarCalcularSupervivenciaInjerto.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            /* Aumentar barra de progreso de la petición REST. */
            linearProgressIndicatorCalcularSupervivenciaInjerto.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            /* Aumentar vistas de texto del receptor 1. */
            textViewCalcularSupervivenciaInjertoReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            /* Aumentar vistas de texto del receptor 2. */
            if (textViewCalcularSupervivenciaInjertoReceptor2.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            /* Aumentar vistas de texto del receptor 3. */
            if (textViewCalcularSupervivenciaInjertoReceptor3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            /* Aumentar vistas de texto del receptor 4. */
            if (textViewCalcularSupervivenciaInjertoReceptor4.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            /* Aumentar vistas de texto del receptor 5. */
            if (textViewCalcularSupervivenciaInjertoReceptor5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaInjertoReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            /*
             * Aumentar vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosFormulario.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewDatosDonante.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewEdadDonante.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewAsistoliaIIDonante.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewAsistoliaIIIDonante.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewDatosReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewAnticuerposCitotoxicosPretrasplanteReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            textViewNumeroTrasplanteRenalReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            if (textViewDatosReceptor2.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor2.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            if (textViewDatosReceptor3.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor3.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            if (textViewDatosReceptor4.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor4.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            if (textViewDatosReceptor5.getVisibility() == View.VISIBLE
                    && textViewAnticuerposCitotoxicosPretrasplanteReceptor5.getVisibility() == View.VISIBLE
                    && textViewNumeroTrasplanteRenalReceptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewAnticuerposCitotoxicosPretrasplanteReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
                textViewNumeroTrasplanteRenalReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaInjerto);
            }
            /* ************************************************** */
            /* Estado de las vistas: aumentadas. */
            vistasAtenuadasCalcularSupervivenciaInjerto = false;
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
        if(!opcionesDesplegadasCalcularSupervivenciaInjerto) {
            /* Animación: anim_girar_opciones_abrir.xml. */
            opcionesCalcularSupervivenciaInjerto.startAnimation(animGirarOpcionesAlAbrirCalcularSupervivenciaInjerto);
            /* Animación: anim_mostrar_opciones_abrir.xml. */
            botonFlotanteGenerarGraficaSupervivenciaInjerto.startAnimation(animMostrarOpcionesAlAbrirCalcularSupervivenciaInjerto);

            /* Muestra las opciones del menú. */
            botonFlotanteGenerarGraficaSupervivenciaInjerto.show();
            /* Hace visible el texto adjunto a cada opción del menú. */
            textViewGenerarGraficaSupervivenciaInjerto.setVisibility(View.VISIBLE);

            /* Habilita que se pueda hacer clic sobre los botones del menu. */
            botonFlotanteGenerarGraficaSupervivenciaInjerto.setClickable(true);

            /* Estado del menú: desplegado. */
            opcionesDesplegadasCalcularSupervivenciaInjerto = true;
        }
        else {
            /* Animación: anim_girar_opciones_cerrar.xml. */
            opcionesCalcularSupervivenciaInjerto.startAnimation(animGirarOpcionesAlCerrarCalcularSupervivenciaInjerto);
            /* Animación: anim_mostrar_opciones_cerrar.xml. */
            botonFlotanteGenerarGraficaSupervivenciaInjerto.startAnimation(animOcultarOpcionesAlCerrarCalcularSupervivenciaInjerto);

            /* Oculta las opciones del menú. */
            botonFlotanteGenerarGraficaSupervivenciaInjerto.hide();
            /* Hace que el texto adjunto a cada opción del menú no sea visible y no ocupe espacio en el layout. */
            textViewGenerarGraficaSupervivenciaInjerto.setVisibility(View.GONE);

            /* Deshabilita que se pueda hacer clic sobre los botones del menu. */
            /*
             * IMPORTANTE: Si los botones no se deshabilitan, se podrá hacer
             * clic sobre ellos incluso si no están visibles.
             */
            botonFlotanteGenerarGraficaSupervivenciaInjerto.setClickable(false);

            /* Estado del menú: no desplegado. */
            opcionesDesplegadasCalcularSupervivenciaInjerto = false;
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
        /* Limpiar vista de texto del titular del layout. */
        textViewModeloCalcularSupervivenciaInjerto.clearAnimation();
        /* Aumentar vista de la petición REST. */
        textViewIndeterminateBarCalcularSupervivenciaInjerto.clearAnimation();
        /* Aumentar barra de progreso de la petición REST. */
        linearProgressIndicatorCalcularSupervivenciaInjerto.clearAnimation();
        /* Limpiar vistas de texto del receptor 1. */
        textViewCalcularSupervivenciaInjertoReceptor1.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor1Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 2. */
        textViewCalcularSupervivenciaInjertoReceptor2.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor2Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 3. */
        textViewCalcularSupervivenciaInjertoReceptor3.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor3Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 4. */
        textViewCalcularSupervivenciaInjertoReceptor4.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor4Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 5. */
        textViewCalcularSupervivenciaInjertoReceptor5.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaInjertoReceptor5Tiempo10Probabilidad.clearAnimation();
        /*
         * Limpiar vistas de texto de los datos que ha recibido
         * el servicio REST, enviados por el cliente
         * (App Trasplante Renal), y con los que ha
         * realizado los cálculos para obtener las
         * probabilidades de supervivencia.
         */
        textViewDatosFormulario.clearAnimation();
        textViewDatosDonante.clearAnimation();
        textViewDatosReceptor1.clearAnimation();
        textViewDatosReceptor2.clearAnimation();
        textViewDatosReceptor3.clearAnimation();
        textViewDatosReceptor4.clearAnimation();
        textViewDatosReceptor5.clearAnimation();
        textViewEdadDonante.clearAnimation();
        textViewAsistoliaIIDonante.clearAnimation();
        textViewAsistoliaIIIDonante.clearAnimation();
        textViewAnticuerposCitotoxicosPretrasplanteReceptor1.clearAnimation();
        textViewAnticuerposCitotoxicosPretrasplanteReceptor2.clearAnimation();
        textViewAnticuerposCitotoxicosPretrasplanteReceptor3.clearAnimation();
        textViewAnticuerposCitotoxicosPretrasplanteReceptor4.clearAnimation();
        textViewAnticuerposCitotoxicosPretrasplanteReceptor5.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor1.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor2.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor3.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor4.clearAnimation();
        textViewNumeroTrasplanteRenalReceptor5.clearAnimation();
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
        opcionesCalcularSupervivenciaInjerto.clearAnimation();
        /* Limpiar animación: anim_mostrar_opciones_abrir.xml / anim_mostrar_opciones_cerrar.xml. */
        botonFlotanteGenerarGraficaSupervivenciaInjerto.clearAnimation();
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