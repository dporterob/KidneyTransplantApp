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
 * Clase: CalcularSupervivenciaPaciente.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class CalcularSupervivenciaPaciente extends AppCompatActivity {
    /* Botones flotantes. */
    ExtendedFloatingActionButton opcionesCalcularSupervivenciaPaciente;
    FloatingActionButton botonFlotanteGenerarGraficaSupervivenciaPaciente;
    TextView textViewGenerarGraficaSupervivenciaPaciente;
    Boolean opcionesDesplegadasCalcularSupervivenciaPaciente;
    Boolean vistasAtenuadasCalcularSupervivenciaPaciente;
    /* Animaciones de los botones flotantes. */
    Animation animAtenuarVistaCalcularSupervivenciaPaciente;
    Animation animAumentarVistaCalcularSupervivenciaPaciente;
    Animation animGirarOpcionesAlAbrirCalcularSupervivenciaPaciente;
    Animation animGirarOpcionesAlCerrarCalcularSupervivenciaPaciente;
    Animation animMostrarOpcionesAlAbrirCalcularSupervivenciaPaciente;
    Animation animOcultarOpcionesAlCerrarCalcularSupervivenciaPaciente;
    /* Vista de texto del titular del layout. */
    TextView textViewModeloCalcularSupervivenciaPaciente;
    /* Vista de la petición REST. */
    TextView textViewIndeterminateBarCalcularSupervivenciaPaciente;
    /* Barra de progreso de la petición REST. */
    LinearProgressIndicator linearProgressIndicatorCalcularSupervivenciaPaciente;
    /* Vistas de texto del receptor 1. */
    TextView textViewCalcularSupervivenciaPacienteReceptor1;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo1;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo3;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo5;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo7;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo10;
    TextView textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad;
    /* Vistas de texto del receptor 2. */
    TextView textViewCalcularSupervivenciaPacienteReceptor2;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo1;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo3;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo5;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo7;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo10;
    TextView textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad;
    /* Vistas de texto del receptor 3. */
    TextView textViewCalcularSupervivenciaPacienteReceptor3;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo1;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo3;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo5;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo7;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo10;
    TextView textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad;
    /* Vistas de texto del receptor 4. */
    TextView textViewCalcularSupervivenciaPacienteReceptor4;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo1;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo3;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo5;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo7;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo10;
    TextView textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad;
    /* Vistas de texto del receptor 5. */
    TextView textViewCalcularSupervivenciaPacienteReceptor5;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo1;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo3;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo5;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo7;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo10;
    TextView textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad;
    /* Cadenas de texto genéricas del donante. */
    String stringCalcularSupervivenciaPacienteDonanteEdadDonante;
    /* Cadenas de texto genéricas de los receptores (1, 2, 3, 4 y 5). */
    String stringCalcularSupervivenciaPacienteReceptorEdad4059;
    String stringCalcularSupervivenciaPacienteReceptorEdad60;
    String stringCalcularSupervivenciaPacienteReceptorSexoHombre;
    String stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria;
    String stringCalcularSupervivenciaPacienteReceptorTiempoDialisis;
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
    TextView textViewEdadReceptor4059_1;
    TextView textViewEdadReceptor4059_2;
    TextView textViewEdadReceptor4059_3;
    TextView textViewEdadReceptor4059_4;
    TextView textViewEdadReceptor4059_5;
    TextView textViewEdadReceptor60_1;
    TextView textViewEdadReceptor60_2;
    TextView textViewEdadReceptor60_3;
    TextView textViewEdadReceptor60_4;
    TextView textViewEdadReceptor60_5;
    TextView textViewSexoHombreReceptor1;
    TextView textViewSexoHombreReceptor2;
    TextView textViewSexoHombreReceptor3;
    TextView textViewSexoHombreReceptor4;
    TextView textViewSexoHombreReceptor5;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptor1;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptor2;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptor3;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptor4;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptor5;
    TextView textViewTiempoDialisisReceptor1;
    TextView textViewTiempoDialisisReceptor2;
    TextView textViewTiempoDialisisReceptor3;
    TextView textViewTiempoDialisisReceptor4;
    TextView textViewTiempoDialisisReceptor5;
    /* Datos recibidos del servicio REST - Receptor 1. */
    Float floatCalcularSupervivenciaPacienteReceptor1Tiempo1;
    Float floatCalcularSupervivenciaPacienteReceptor1Tiempo3;
    Float floatCalcularSupervivenciaPacienteReceptor1Tiempo5;
    Float floatCalcularSupervivenciaPacienteReceptor1Tiempo7;
    Float floatCalcularSupervivenciaPacienteReceptor1Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 2. */
    Float floatCalcularSupervivenciaPacienteReceptor2Tiempo1;
    Float floatCalcularSupervivenciaPacienteReceptor2Tiempo3;
    Float floatCalcularSupervivenciaPacienteReceptor2Tiempo5;
    Float floatCalcularSupervivenciaPacienteReceptor2Tiempo7;
    Float floatCalcularSupervivenciaPacienteReceptor2Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 3. */
    Float floatCalcularSupervivenciaPacienteReceptor3Tiempo1;
    Float floatCalcularSupervivenciaPacienteReceptor3Tiempo3;
    Float floatCalcularSupervivenciaPacienteReceptor3Tiempo5;
    Float floatCalcularSupervivenciaPacienteReceptor3Tiempo7;
    Float floatCalcularSupervivenciaPacienteReceptor3Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 4. */
    Float floatCalcularSupervivenciaPacienteReceptor4Tiempo1;
    Float floatCalcularSupervivenciaPacienteReceptor4Tiempo3;
    Float floatCalcularSupervivenciaPacienteReceptor4Tiempo5;
    Float floatCalcularSupervivenciaPacienteReceptor4Tiempo7;
    Float floatCalcularSupervivenciaPacienteReceptor4Tiempo10;
    /* Datos recibidos del servicio REST - Receptor 5. */
    Float floatCalcularSupervivenciaPacienteReceptor5Tiempo1;
    Float floatCalcularSupervivenciaPacienteReceptor5Tiempo3;
    Float floatCalcularSupervivenciaPacienteReceptor5Tiempo5;
    Float floatCalcularSupervivenciaPacienteReceptor5Tiempo7;
    Float floatCalcularSupervivenciaPacienteReceptor5Tiempo10;
    /*
     * Datos que ha recibido el servicio REST,
     * enviados por el cliente (App Trasplante Renal),
     * y con los que ha realizado los cálculos para
     * obtener las probabilidades de supervivencia.
     */
    Integer integerEdadDonante;
    String stringEdadReceptor4059_1;
    String stringEdadReceptor4059_2;
    String stringEdadReceptor4059_3;
    String stringEdadReceptor4059_4;
    String stringEdadReceptor4059_5;
    String stringEdadReceptor60_1;
    String stringEdadReceptor60_2;
    String stringEdadReceptor60_3;
    String stringEdadReceptor60_4;
    String stringEdadReceptor60_5;
    String stringSexoHombreReceptor1;
    String stringSexoHombreReceptor2;
    String stringSexoHombreReceptor3;
    String stringSexoHombreReceptor4;
    String stringSexoHombreReceptor5;
    String stringDiabetesEnfermedadRenalPrimariaReceptor1;
    String stringDiabetesEnfermedadRenalPrimariaReceptor2;
    String stringDiabetesEnfermedadRenalPrimariaReceptor3;
    String stringDiabetesEnfermedadRenalPrimariaReceptor4;
    String stringDiabetesEnfermedadRenalPrimariaReceptor5;
    Integer integerTiempoDialisisReceptor1;
    Integer integerTiempoDialisisReceptor2;
    Integer integerTiempoDialisisReceptor3;
    Integer integerTiempoDialisisReceptor4;
    Integer integerTiempoDialisisReceptor5;
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
        setContentView(R.layout.activity_calcular_supervivencia_paciente);

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
        opcionesCalcularSupervivenciaPaciente = findViewById(R.id.botonOpcionesCalcularSupervivenciaPaciente);
        botonFlotanteGenerarGraficaSupervivenciaPaciente = findViewById(R.id.botonGenerarGraficaSupervivenciaPaciente);
        textViewGenerarGraficaSupervivenciaPaciente = findViewById(R.id.textViewGenerarGraficaSupervivenciaPaciente);

        /*
         * Animaciones.
         */
        animAtenuarVistaCalcularSupervivenciaPaciente = AnimationUtils.loadAnimation(CalcularSupervivenciaPaciente.this, R.anim.anim_atenuar_vista);
        animAumentarVistaCalcularSupervivenciaPaciente = AnimationUtils.loadAnimation(CalcularSupervivenciaPaciente.this, R.anim.anim_aumentar_vista);
        animMostrarOpcionesAlAbrirCalcularSupervivenciaPaciente = AnimationUtils.loadAnimation(CalcularSupervivenciaPaciente.this, R.anim.anim_mostrar_opciones_abrir);
        animOcultarOpcionesAlCerrarCalcularSupervivenciaPaciente = AnimationUtils.loadAnimation(CalcularSupervivenciaPaciente.this, R.anim.anim_ocultar_opciones_cerrar);
        animGirarOpcionesAlAbrirCalcularSupervivenciaPaciente = AnimationUtils.loadAnimation(CalcularSupervivenciaPaciente.this, R.anim.anim_girar_opciones_abrir);
        animGirarOpcionesAlCerrarCalcularSupervivenciaPaciente = AnimationUtils.loadAnimation(CalcularSupervivenciaPaciente.this, R.anim.anim_girar_opciones_cerrar);

        /* Opciones menú flotante: 'gone' en un inicio. */
        botonFlotanteGenerarGraficaSupervivenciaPaciente.setVisibility(View.GONE);
        textViewGenerarGraficaSupervivenciaPaciente.setVisibility(View.GONE);

        /* Estado del menú: desplegado / no desplegado. */
        opcionesDesplegadasCalcularSupervivenciaPaciente = false;
        /* Estado de las vistas del formulario: atenuadas / no atenuadas. */
        vistasAtenuadasCalcularSupervivenciaPaciente = false;
        /* .setClickable(true) es la opción por defecto para cualquier botón */
        opcionesCalcularSupervivenciaPaciente.setClickable(true);

        /* Vista de texto del titular del layout. */
        textViewModeloCalcularSupervivenciaPaciente = findViewById(R.id.textViewModeloCalcularSupervivenciaPaciente);
        /* Vista de la petición REST. */
        textViewIndeterminateBarCalcularSupervivenciaPaciente = findViewById(R.id.textViewIndeterminateBarCalcularSupervivenciaPaciente);
        /* Barra de progreso de la petición REST. */
        linearProgressIndicatorCalcularSupervivenciaPaciente = findViewById(R.id.linearProgressIndicatorCalcularSupervivenciaPaciente);
        /* Vistas de texto del receptor 1. */
        textViewCalcularSupervivenciaPacienteReceptor1 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo1);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo3);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo5);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo7);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo10);
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad);
        /* Vistas de texto del receptor 2. */
        textViewCalcularSupervivenciaPacienteReceptor2 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo1);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo3);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo5);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo7);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo10);
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad);
        /* Vistas de texto del receptor 3. */
        textViewCalcularSupervivenciaPacienteReceptor3 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo1);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo3);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo5);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo7);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo10);
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad);
        /* Vistas de texto del receptor 4. */
        textViewCalcularSupervivenciaPacienteReceptor4 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo1);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo3);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo5);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo7);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo10);
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad);
        /* Vistas de texto del receptor 5. */
        textViewCalcularSupervivenciaPacienteReceptor5 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo1 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo1);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo3 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo3);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo5 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo5);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo7 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo7);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo10 = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo10);
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad = findViewById(R.id.textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad);
        /* Cadenas de texto genéricas del donante. */
        stringCalcularSupervivenciaPacienteDonanteEdadDonante = "Donor age: ";
        /* Cadenas de texto genéricas de los receptores (1, 2, 3, 4 y 5). */
        /*
         * \n : inserta una nueva línea en el texto.
         * Requerido para que el botón flotante del
         * menú de opciones no oculte parcialmente
         * una de las vistas.
         */
        stringCalcularSupervivenciaPacienteReceptorEdad4059 = "Age 40-59: ";
        stringCalcularSupervivenciaPacienteReceptorEdad60 = "Age >60: ";
        stringCalcularSupervivenciaPacienteReceptorSexoHombre = "Male sex: ";
        stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria = "Diabetes as primary kidney\ndisease: ";
        stringCalcularSupervivenciaPacienteReceptorTiempoDialisis = "Dialysis time: ";
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
        textViewEdadReceptor4059_1 = findViewById(R.id.textViewEdadReceptor4059_1);
        textViewEdadReceptor4059_2 = findViewById(R.id.textViewEdadReceptor4059_2);
        textViewEdadReceptor4059_3 = findViewById(R.id.textViewEdadReceptor4059_3);
        textViewEdadReceptor4059_4 = findViewById(R.id.textViewEdadReceptor4059_4);
        textViewEdadReceptor4059_5 = findViewById(R.id.textViewEdadReceptor4059_5);
        textViewEdadReceptor60_1 = findViewById(R.id.textViewEdadReceptor60_1);
        textViewEdadReceptor60_2 = findViewById(R.id.textViewEdadReceptor60_2);
        textViewEdadReceptor60_3 = findViewById(R.id.textViewEdadReceptor60_3);
        textViewEdadReceptor60_4 = findViewById(R.id.textViewEdadReceptor60_4);
        textViewEdadReceptor60_5 = findViewById(R.id.textViewEdadReceptor60_5);
        textViewSexoHombreReceptor1 = findViewById(R.id.textViewSexoHombreReceptor1);
        textViewSexoHombreReceptor2 = findViewById(R.id.textViewSexoHombreReceptor2);
        textViewSexoHombreReceptor3 = findViewById(R.id.textViewSexoHombreReceptor3);
        textViewSexoHombreReceptor4 = findViewById(R.id.textViewSexoHombreReceptor4);
        textViewSexoHombreReceptor5 = findViewById(R.id.textViewSexoHombreReceptor5);
        textViewDiabetesEnfermedadRenalPrimariaReceptor1 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptor1);
        textViewDiabetesEnfermedadRenalPrimariaReceptor2 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptor2);
        textViewDiabetesEnfermedadRenalPrimariaReceptor3 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptor3);
        textViewDiabetesEnfermedadRenalPrimariaReceptor4 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptor4);
        textViewDiabetesEnfermedadRenalPrimariaReceptor5 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptor5);
        textViewTiempoDialisisReceptor1 = findViewById(R.id.textViewTiempoDialisisReceptor1);
        textViewTiempoDialisisReceptor2 = findViewById(R.id.textViewTiempoDialisisReceptor2);
        textViewTiempoDialisisReceptor3 = findViewById(R.id.textViewTiempoDialisisReceptor3);
        textViewTiempoDialisisReceptor4 = findViewById(R.id.textViewTiempoDialisisReceptor4);
        textViewTiempoDialisisReceptor5 = findViewById(R.id.textViewTiempoDialisisReceptor5);

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
        Intent intentActividadCalcularSupervivenciaPaciente = getIntent();
        /* Datos del donante. */
        String autoCompleteTextViewEdadDonanteSupervivenciaPaciente = intentActividadCalcularSupervivenciaPaciente.getStringExtra("autoCompleteTextViewEdadDonanteSupervivenciaPaciente");
        /* Datos del receptor 1. */
        String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente");
        String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente");
        String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente");
        String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente");
        String editTextTiempoDialisisReceptorSupervivenciaPaciente = intentActividadCalcularSupervivenciaPaciente.getStringExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente");
        /* Datos del receptor 2. */
        String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2");
        String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2");
        String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2");
        String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2");
        String editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2");
        /* Datos del receptor 3. */
        String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3");
        String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3");
        String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3");
        String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3");
        String editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3");
        /* Datos del receptor 4. */
        String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4");
        String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4");
        String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4");
        String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4");
        String editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4");
        /* Datos del receptor 5. */
        String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5");
        String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5");
        String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5");
        String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5");
        String editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 = intentActividadCalcularSupervivenciaPaciente.getStringExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5");

        /*
         * Datos recibidos.
         */
        /*
         * Vistas de texto de la probabilidad de supervivencia
         * del donante 'visible' por defecto.
         *
         * Los datos del donante son obligatorios;
         * se comprueba en la actividad SupervivenciaPaciente
         * que el usuario haya introducido los datos.
         */
        /*
         * Vistas de texto de la probabilidad de supervivencia
         * del receptor 1 'visible' por defecto.
         *
         * Los datos del receptor 1 son obligatorios;
         * se comprueba en la actividad SupervivenciaPaciente
         * que el usuario haya introducido los datos.
         */
        if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 != null
                && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 != null
                && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 != null
                && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 != null
                && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 != null) {
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
            textViewCalcularSupervivenciaPacienteReceptor2.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor2.setVisibility(View.VISIBLE);
            textViewEdadReceptor4059_2.setVisibility(View.VISIBLE);
            textViewEdadReceptor60_2.setVisibility(View.VISIBLE);
            textViewSexoHombreReceptor2.setVisibility(View.VISIBLE);
            textViewDiabetesEnfermedadRenalPrimariaReceptor2.setVisibility(View.VISIBLE);
            textViewTiempoDialisisReceptor2.setVisibility(View.VISIBLE);

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
        if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 != null
                && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 != null
                && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 != null
                && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 != null
                && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 != null) {
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
            textViewCalcularSupervivenciaPacienteReceptor3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor3.setVisibility(View.VISIBLE);
            textViewEdadReceptor4059_3.setVisibility(View.VISIBLE);
            textViewEdadReceptor60_3.setVisibility(View.VISIBLE);
            textViewSexoHombreReceptor3.setVisibility(View.VISIBLE);
            textViewDiabetesEnfermedadRenalPrimariaReceptor3.setVisibility(View.VISIBLE);
            textViewTiempoDialisisReceptor3.setVisibility(View.VISIBLE);
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
        if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 != null
                && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 != null
                && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 != null
                && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 != null
                && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 != null) {
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
            textViewCalcularSupervivenciaPacienteReceptor4.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor4.setVisibility(View.VISIBLE);
            textViewEdadReceptor4059_4.setVisibility(View.VISIBLE);
            textViewEdadReceptor60_4.setVisibility(View.VISIBLE);
            textViewSexoHombreReceptor4.setVisibility(View.VISIBLE);
            textViewDiabetesEnfermedadRenalPrimariaReceptor4.setVisibility(View.VISIBLE);
            textViewTiempoDialisisReceptor4.setVisibility(View.VISIBLE);
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
        if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 != null
                && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 != null
                && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 != null
                && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 != null
                && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 != null) {
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
            textViewCalcularSupervivenciaPacienteReceptor5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo1.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo3.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo5.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo7.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo10.setVisibility(View.VISIBLE);
            textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            /*
             * Vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosReceptor5.setVisibility(View.VISIBLE);
            textViewEdadReceptor4059_5.setVisibility(View.VISIBLE);
            textViewEdadReceptor60_5.setVisibility(View.VISIBLE);
            textViewSexoHombreReceptor5.setVisibility(View.VISIBLE);
            textViewDiabetesEnfermedadRenalPrimariaReceptor5.setVisibility(View.VISIBLE);
            textViewTiempoDialisisReceptor5.setVisibility(View.VISIBLE);
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
         * http://localhost:8080/supervivenciaPaciente/ejecutarModelo
         */
        /*
         * Animación inicial de la barra de progreso.
         * https://material.io/components/progress-indicators/android
         */
        linearProgressIndicatorCalcularSupervivenciaPaciente.animate();
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
        //final String urlModeloSupervivenciaPaciente = "http://10.0.2.2:8080/supervivenciaPaciente/ejecutarModelo";
        /* URL para pruebas en el dispositivo físico */
        final String urlModeloSupervivenciaPaciente = "http://localhost:8080/supervivenciaPaciente/ejecutarModelo";
        /* *** *** *** *** *** *** *** *** *** *** *** *** *** *** */
        RequestQueue requestQueuePeticionRESTModeloSupervivenciaPaciente;
        try {
            JSONObject jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente = new JSONObject();
            if (autoCompleteTextViewEdadDonanteSupervivenciaPaciente != null) {
                /* Datos del donante cumplimentados. */
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadDonante",
                                autoCompleteTextViewEdadDonanteSupervivenciaPaciente);
            }
            if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente != null
                    && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente != null
                    && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente != null
                    && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente != null
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente != null) {
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor4059_1",
                                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor60_1",
                                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("sexoHombreReceptor1",
                                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("diabetesEnfermedadRenalPrimariaReceptor1",
                                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("tiempoDialisisReceptor1",
                                editTextTiempoDialisisReceptorSupervivenciaPaciente);
            }
            if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 != null
                    && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 != null
                    && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 != null
                    && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 != null
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 != null) {
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor4059_2",
                                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor60_2",
                                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("sexoHombreReceptor2",
                                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("diabetesEnfermedadRenalPrimariaReceptor2",
                                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("tiempoDialisisReceptor2",
                                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2);
            }
            if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 != null
                    && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 != null
                    && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 != null
                    && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 != null
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 != null) {
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor4059_3",
                                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor60_3",
                                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("sexoHombreReceptor3",
                                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("diabetesEnfermedadRenalPrimariaReceptor3",
                                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("tiempoDialisisReceptor3",
                                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3);
            }
            if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 != null
                    && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 != null
                    && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 != null
                    && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 != null
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 != null) {
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor4059_4",
                                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor60_4",
                                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("sexoHombreReceptor4",
                                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("diabetesEnfermedadRenalPrimariaReceptor4",
                                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("tiempoDialisisReceptor4",
                                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4);
            }
            if (estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 != null
                    && estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 != null
                    && estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 != null
                    && estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 != null
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 != null) {
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor4059_5",
                                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("edadReceptor60_5",
                                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("sexoHombreReceptor5",
                                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("diabetesEnfermedadRenalPrimariaReceptor5",
                                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5);
                jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente
                        .put("tiempoDialisisReceptor5",
                                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5);
            }

            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST,
                    urlModeloSupervivenciaPaciente,
                    new JSONObject(jsonObjectCuerpoPeticionRESTModeloSupervivenciaPaciente.toString()),
                    jsonObjectResponse -> {
                        /*
                         * Petición exitosa (200 OK).
                         * Muestra en color verde el mensaje
                         * "Resultados recibidos correctamente".
                         * El indicador lineal de progreso se muestra
                         * en color verde y, seguidamente, se modifica
                         * su visibilidad a GONE.
                         */
                        textViewIndeterminateBarCalcularSupervivenciaPaciente
                                .setText(getResources().getString(R.string.resultados_recibidos_correctamente_calcular_supervivencia_paciente));
                        textViewIndeterminateBarCalcularSupervivenciaPaciente
                                .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                R.color.green));
                        linearProgressIndicatorCalcularSupervivenciaPaciente
                                .setVisibility(View.GONE);
                        linearProgressIndicatorCalcularSupervivenciaPaciente
                                .clearAnimation();
                        try {
                            /* Donante. */
                            /*
                             * Si el usuario ha introducido los datos del donante
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal).
                             */
                            if (!(autoCompleteTextViewEdadDonanteSupervivenciaPaciente == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                integerEdadDonante
                                        = jsonObjectResponse.getInt("edadDonante");
                                /* Establecer datos que ha recibido el servicio REST para el donante. */
                                textViewEdadDonante
                                        .setText(stringCalcularSupervivenciaPacienteDonanteEdadDonante
                                                .concat(String.valueOf(integerEdadDonante)));
                            }
                            /* *********** */

                            /* Receptor 1. */
                            /* Datos recibidos del servicio REST - Receptor 1. */
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor1").get(0).toString());
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor1").get(1).toString());
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor1").get(2).toString());
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor1").get(3).toString());
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor1").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 1
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaPacienteReceptor1Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo10 == 0.0)
                                    && !(estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente == null)
                                    && !(estadoSwitchCompatEdadReceptor60SupervivenciaPaciente == null)
                                    && !(estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente == null)
                                    && !(estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente == null)
                                    && !(editTextTiempoDialisisReceptorSupervivenciaPaciente == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                stringEdadReceptor4059_1
                                        = jsonObjectResponse.getString("edadReceptor4059_1");
                                stringEdadReceptor60_1
                                        = jsonObjectResponse.getString("edadReceptor60_1");
                                stringSexoHombreReceptor1
                                        = jsonObjectResponse.getString("sexoHombreReceptor1");
                                stringDiabetesEnfermedadRenalPrimariaReceptor1
                                        = jsonObjectResponse.getString("diabetesEnfermedadRenalPrimariaReceptor1");
                                integerTiempoDialisisReceptor1
                                        = jsonObjectResponse.getInt("tiempoDialisisReceptor1");
                                /* Establecer probabilidad de supervivencia para el receptor 1. */
                                textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor1Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor1Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor1Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor1Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor1Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 1. */
                                textViewEdadReceptor4059_1
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad4059
                                                .concat(stringEdadReceptor4059_1));
                                textViewEdadReceptor60_1
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad60
                                                .concat(stringEdadReceptor60_1));
                                textViewSexoHombreReceptor1
                                        .setText(stringCalcularSupervivenciaPacienteReceptorSexoHombre
                                                .concat(String.valueOf(stringSexoHombreReceptor1)));
                                textViewDiabetesEnfermedadRenalPrimariaReceptor1
                                        .setText(stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria
                                                .concat(String.valueOf(stringDiabetesEnfermedadRenalPrimariaReceptor1)));
                                textViewTiempoDialisisReceptor1
                                        .setText(stringCalcularSupervivenciaPacienteReceptorTiempoDialisis
                                                .concat(String.valueOf(integerTiempoDialisisReceptor1)));
                            }
                            /* *********** */

                            /* Receptor 2. */
                            /* Datos recibidos del servicio REST - Receptor 2. */
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor2").get(0).toString());
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor2").get(1).toString());
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor2").get(2).toString());
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor2").get(3).toString());
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor2").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 2
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaPacienteReceptor2Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo10 == 0.0)
                                    && !(estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 == null)
                                    && !(estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 == null)
                                    && !(estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 == null)
                                    && !(estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 == null)
                                    && !(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                stringEdadReceptor4059_2
                                        = jsonObjectResponse.getString("edadReceptor4059_2");
                                stringEdadReceptor60_2
                                        = jsonObjectResponse.getString("edadReceptor60_2");
                                stringSexoHombreReceptor2
                                        = jsonObjectResponse.getString("sexoHombreReceptor2");
                                stringDiabetesEnfermedadRenalPrimariaReceptor2
                                        = jsonObjectResponse.getString("diabetesEnfermedadRenalPrimariaReceptor2");
                                integerTiempoDialisisReceptor2
                                        = jsonObjectResponse.getInt("tiempoDialisisReceptor2");
                                /* Establecer probabilidad de supervivencia para el receptor 2. */
                                textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor2Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor2Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor2Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor2Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor2Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 2. */
                                textViewEdadReceptor4059_2
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad4059
                                                .concat(stringEdadReceptor4059_2));
                                textViewEdadReceptor60_2
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad60
                                                .concat(stringEdadReceptor60_2));
                                textViewSexoHombreReceptor2
                                        .setText(stringCalcularSupervivenciaPacienteReceptorSexoHombre
                                                .concat(String.valueOf(stringSexoHombreReceptor2)));
                                textViewDiabetesEnfermedadRenalPrimariaReceptor2
                                        .setText(stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria
                                                .concat(String.valueOf(stringDiabetesEnfermedadRenalPrimariaReceptor2)));
                                textViewTiempoDialisisReceptor2
                                        .setText(stringCalcularSupervivenciaPacienteReceptorTiempoDialisis
                                                .concat(String.valueOf(integerTiempoDialisisReceptor2)));
                            }
                            /* *********** */

                            /* Receptor 3. */
                            /* Datos recibidos del servicio REST - Receptor 3. */
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor3").get(0).toString());
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor3").get(1).toString());
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor3").get(2).toString());
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor3").get(3).toString());
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor3").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 3
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaPacienteReceptor3Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo10 == 0.0)
                                    && !(estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 == null)
                                    && !(estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 == null)
                                    && !(estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 == null)
                                    && !(estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 == null)
                                    && !(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                stringEdadReceptor4059_3
                                        = jsonObjectResponse.getString("edadReceptor4059_3");
                                stringEdadReceptor60_3
                                        = jsonObjectResponse.getString("edadReceptor60_3");
                                stringSexoHombreReceptor3
                                        = jsonObjectResponse.getString("sexoHombreReceptor3");
                                stringDiabetesEnfermedadRenalPrimariaReceptor3
                                        = jsonObjectResponse.getString("diabetesEnfermedadRenalPrimariaReceptor3");
                                integerTiempoDialisisReceptor3
                                        = jsonObjectResponse.getInt("tiempoDialisisReceptor3");
                                /* Establecer probabilidad de supervivencia para el receptor 3. */
                                textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor3Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor3Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor3Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor3Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor3Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 3. */
                                textViewEdadReceptor4059_3
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad4059
                                                .concat(stringEdadReceptor4059_3));
                                textViewEdadReceptor60_3
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad60
                                                .concat(stringEdadReceptor60_3));
                                textViewSexoHombreReceptor3
                                        .setText(stringCalcularSupervivenciaPacienteReceptorSexoHombre
                                                .concat(String.valueOf(stringSexoHombreReceptor3)));
                                textViewDiabetesEnfermedadRenalPrimariaReceptor3
                                        .setText(stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria
                                                .concat(String.valueOf(stringDiabetesEnfermedadRenalPrimariaReceptor3)));
                                textViewTiempoDialisisReceptor3
                                        .setText(stringCalcularSupervivenciaPacienteReceptorTiempoDialisis
                                                .concat(String.valueOf(integerTiempoDialisisReceptor3)));
                            }
                            /* *********** */

                            /* Receptor 4. */
                            /* Datos recibidos del servicio REST - Receptor 4. */
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor4").get(0).toString());
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor4").get(1).toString());
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor4").get(2).toString());
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor4").get(3).toString());
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor4").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 4
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaPacienteReceptor4Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo10 == 0.0)
                                    && !(estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 == null)
                                    && !(estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 == null)
                                    && !(estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 == null)
                                    && !(estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 == null)
                                    && !(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                stringEdadReceptor4059_4
                                        = jsonObjectResponse.getString("edadReceptor4059_4");
                                stringEdadReceptor60_4
                                        = jsonObjectResponse.getString("edadReceptor60_4");
                                stringSexoHombreReceptor4
                                        = jsonObjectResponse.getString("sexoHombreReceptor4");
                                stringDiabetesEnfermedadRenalPrimariaReceptor4
                                        = jsonObjectResponse.getString("diabetesEnfermedadRenalPrimariaReceptor4");
                                integerTiempoDialisisReceptor4
                                        = jsonObjectResponse.getInt("tiempoDialisisReceptor4");
                                /* Establecer probabilidad de supervivencia para el receptor 4. */
                                textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor4Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor4Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor4Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor4Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor4Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 4. */
                                textViewEdadReceptor4059_4
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad4059
                                                .concat(stringEdadReceptor4059_4));
                                textViewEdadReceptor60_4
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad60
                                                .concat(stringEdadReceptor60_4));
                                textViewSexoHombreReceptor4
                                        .setText(stringCalcularSupervivenciaPacienteReceptorSexoHombre
                                                .concat(String.valueOf(stringSexoHombreReceptor4)));
                                textViewDiabetesEnfermedadRenalPrimariaReceptor4
                                        .setText(stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria
                                                .concat(String.valueOf(stringDiabetesEnfermedadRenalPrimariaReceptor4)));
                                textViewTiempoDialisisReceptor4
                                        .setText(stringCalcularSupervivenciaPacienteReceptorTiempoDialisis
                                                .concat(String.valueOf(integerTiempoDialisisReceptor4)));
                            }
                            /* *********** */

                            /* Receptor 5. */
                            /* Datos recibidos del servicio REST - Receptor 5. */
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo1
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor5").get(0).toString());
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo3
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor5").get(1).toString());
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo5
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor5").get(2).toString());
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo7
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor5").get(3).toString());
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo10
                                    = Float.parseFloat(jsonObjectResponse.getJSONArray("probabilidadExitoSupervivenciaPacienteReceptor5").get(4).toString());
                            /*
                             * Si el usuario ha introducido los datos del receptor 5
                             * en el formulario, entonces, el servicio REST devuelve
                             * en la respuesta los mismos datos que ha recibido del
                             * cliente (App Trasplante Renal). Devuelve además, las
                             * probabilidades para dicho receptor.
                             */
                            if (!(floatCalcularSupervivenciaPacienteReceptor5Tiempo1 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo3 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo5 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo7 == 0.0)
                                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo10 == 0.0)
                                    && !(estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 == null)
                                    && !(estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 == null)
                                    && !(estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 == null)
                                    && !(estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 == null)
                                    && !(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 == null)) {
                                /*
                                 * Datos que ha recibido el servicio REST,
                                 * enviados por el cliente (App Trasplante Renal),
                                 * y con los que ha realizado los cálculos para
                                 * obtener las probabilidades de supervivencia.
                                 */
                                stringEdadReceptor4059_5
                                        = jsonObjectResponse.getString("edadReceptor4059_5");
                                stringEdadReceptor60_5
                                        = jsonObjectResponse.getString("edadReceptor60_5");
                                stringSexoHombreReceptor5
                                        = jsonObjectResponse.getString("sexoHombreReceptor5");
                                stringDiabetesEnfermedadRenalPrimariaReceptor5
                                        = jsonObjectResponse.getString("diabetesEnfermedadRenalPrimariaReceptor5");
                                integerTiempoDialisisReceptor5
                                        = jsonObjectResponse.getInt("tiempoDialisisReceptor5");
                                /* Establecer probabilidad de supervivencia para el receptor 5. */
                                textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor5Tiempo1)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor5Tiempo3)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor5Tiempo5)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor5Tiempo7)
                                                .concat(" %"));
                                textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad
                                        .setText(String.valueOf(floatCalcularSupervivenciaPacienteReceptor5Tiempo10)
                                                .concat(" %"));
                                /* Establecer datos que ha recibido el servicio REST para el receptor 5. */
                                textViewEdadReceptor4059_5
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad4059
                                                .concat(stringEdadReceptor4059_5));
                                textViewEdadReceptor60_5
                                        .setText(stringCalcularSupervivenciaPacienteReceptorEdad60
                                                .concat(stringEdadReceptor60_5));
                                textViewSexoHombreReceptor5
                                        .setText(stringCalcularSupervivenciaPacienteReceptorSexoHombre
                                                .concat(String.valueOf(stringSexoHombreReceptor5)));
                                textViewDiabetesEnfermedadRenalPrimariaReceptor5
                                        .setText(stringCalcularSupervivenciaPacienteReceptorDiabetesEnfermedadRenalPrimaria
                                                .concat(String.valueOf(stringDiabetesEnfermedadRenalPrimariaReceptor5)));
                                textViewTiempoDialisisReceptor5
                                        .setText(stringCalcularSupervivenciaPacienteReceptorTiempoDialisis
                                                .concat(String.valueOf(integerTiempoDialisisReceptor5)));
                            }
                            /* *********** */
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }, error -> {
                        /*
                         * Si la petición REST es errónea,
                         * se muestra el texto de color
                         * rojo 'Error recibiendo resultados'.
                         * La barra de progreso también se
                         * muestra en color rojo.
                         */
                        if (!redDisponible()) {
                            textViewIndeterminateBarCalcularSupervivenciaPaciente
                                    .setText(getResources().getString(R.string.no_conectado_internet_calcular_supervivencia_paciente));
                            textViewIndeterminateBarCalcularSupervivenciaPaciente
                                    .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                    R.color.blue));
                            linearProgressIndicatorCalcularSupervivenciaPaciente
                                    .setVisibility(View.GONE);
                            linearProgressIndicatorCalcularSupervivenciaPaciente
                                    .clearAnimation();
                        }
                        else if (error.networkResponse == null) {
                            textViewIndeterminateBarCalcularSupervivenciaPaciente
                                    .setText(getResources().getString(R.string.servicio_no_disponible_calcular_supervivencia_paciente));
                            textViewIndeterminateBarCalcularSupervivenciaPaciente
                                    .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                    R.color.red));
                            linearProgressIndicatorCalcularSupervivenciaPaciente
                                    .setVisibility(View.GONE);
                            linearProgressIndicatorCalcularSupervivenciaPaciente
                                    .clearAnimation();
                        }
                        else {
                            textViewIndeterminateBarCalcularSupervivenciaPaciente
                                    .setText(getResources().getString(R.string.codigo_error_http_calcular_supervivencia_paciente,String.valueOf(error.networkResponse.statusCode)));
                            textViewIndeterminateBarCalcularSupervivenciaPaciente
                                    .setTextColor(ContextCompat.getColor(getApplicationContext(),
                                    R.color.red));
                            linearProgressIndicatorCalcularSupervivenciaPaciente
                                    .setVisibility(View.GONE);
                            linearProgressIndicatorCalcularSupervivenciaPaciente
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
             * https://github.com/google/volley/blob/master/core/src/main/java/com/android/volley/DefaultRetryPolicy.java
             * https://developer.mozilla.org/en-US/docs/Web/Performance/Understanding_latency#network_throttling
             */
            jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(
                    750,
                    4,
                    1.0f));
            requestQueuePeticionRESTModeloSupervivenciaPaciente = Volley.newRequestQueue(CalcularSupervivenciaPaciente.this);
            requestQueuePeticionRESTModeloSupervivenciaPaciente.add(jsonObjectRequest);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        opcionesCalcularSupervivenciaPaciente.setOnClickListener(view -> {
            /* Atenúa las vistas del formulario. */
            animacionAtenuarVistas();
            /*
             * Despliega el menu de opciones al pulsar "+"
             * y oculta el menu de opciones al pulsar "x".
             */
            animacionMenuOpciones();
        });
        botonFlotanteGenerarGraficaSupervivenciaPaciente.setOnClickListener(view -> {
            /* Aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionAtenuarVistas();
            /* Oculta el menú de opciones al pulsar sobre uno de los botones flotantes */
            animacionMenuOpciones();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionMenuOpciones();

            Intent intent = new Intent(getApplicationContext(), GenerarGraficaSupervivenciaPaciente.class);
            /* Datos recibidos del servicio REST - Receptor 1. */
            if (!(floatCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaPacienteReceptor1Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor1Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo1",
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo3",
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo5",
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo7",
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo10",
                            floatCalcularSupervivenciaPacienteReceptor1Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 2. */
            if (!(floatCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaPacienteReceptor2Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor2Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo1",
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo3",
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo5",
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo7",
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo10",
                            floatCalcularSupervivenciaPacienteReceptor2Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 3. */
            if (!(floatCalcularSupervivenciaPacienteReceptor3Tiempo1 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo3 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo5 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo7 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaPacienteReceptor3Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor3Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo1",
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo3",
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo5",
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo7",
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo10",
                            floatCalcularSupervivenciaPacienteReceptor3Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 4. */
            if (!(floatCalcularSupervivenciaPacienteReceptor4Tiempo1 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo3 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo5 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo7 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaPacienteReceptor4Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor4Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo1",
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo3",
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo5",
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo7",
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo10",
                            floatCalcularSupervivenciaPacienteReceptor4Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo10", "0.0");
            }
            /* Datos recibidos del servicio REST - Receptor 5. */
            if (!(floatCalcularSupervivenciaPacienteReceptor5Tiempo1 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo3 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo5 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo7 == null)
                    && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo10 == null)) {
                if (!(floatCalcularSupervivenciaPacienteReceptor5Tiempo1 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo3 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo5 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo7 == 0.0)
                        && !(floatCalcularSupervivenciaPacienteReceptor5Tiempo10 == 0.0)) {
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo1",
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo1.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo3",
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo3.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo5",
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo5.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo7",
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo7.toString());
                    intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo10",
                            floatCalcularSupervivenciaPacienteReceptor5Tiempo10.toString());
                }
            }
            else {
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo1", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo3", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo5", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo7", "0.0");
                intent.putExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo10", "0.0");
            }
            /*
             * Datos que ha recibido el servicio REST,
             * enviados por el cliente (App Trasplante Renal),
             * y con los que ha realizado los cálculos para
             * obtener las probabilidades de supervivencia.
             *
             * Estos datos no se requieren en la actividad
             * GenerarGraficaSupervivenciaPaciente.
             */
            /* **** **** **** **** **** **** **** **** **** **** */

            startActivity(intent);
        });
    }

    /*
     * Conectividad Internet (WiFi o Datos móviles).
     *
     * https://stackoverflow.com/questions/4238921/detect-whether-there-is-an-internet-connection-available-on-android
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
        if(!vistasAtenuadasCalcularSupervivenciaPaciente) {
            /*
             * Se atenúan todas las vistas,
             * a excepción de las vistas
             * correspondientes con los
             * botones flotantes:
             *
             * opcionesSupervivenciaPaciente
             * botonFlotanteCalcularSupervivenciaPaciente
             * botonFlotanteNuevoReceptorSupervivenciaPaciente
             * botonFlotanteBorrarSupervivenciaPaciente
             */
            /* Atenuar vista de texto del titular del layout. */
            textViewModeloCalcularSupervivenciaPaciente.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            /* Atenuar vista de la petición REST. */
            textViewIndeterminateBarCalcularSupervivenciaPaciente.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            /* Atenuar barra de progreso de la petición REST. */
            linearProgressIndicatorCalcularSupervivenciaPaciente.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            /* Atenuar vistas de texto del receptor 1. */
            textViewCalcularSupervivenciaPacienteReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            /* Atenuar vistas de texto del receptor 2. */
            if (textViewCalcularSupervivenciaPacienteReceptor2.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            /* Atenuar vistas de texto del receptor 3. */
            if (textViewCalcularSupervivenciaPacienteReceptor3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            /* Atenuar vistas de texto del receptor 4. */
            if (textViewCalcularSupervivenciaPacienteReceptor4.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            /* Atenuar vistas de texto del receptor 5. */
            if (textViewCalcularSupervivenciaPacienteReceptor5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo7.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo10.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            /*
             * Atenuar vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosFormulario.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewDatosDonante.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewEdadDonante.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewDatosReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewEdadReceptor4059_1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewEdadReceptor60_1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewSexoHombreReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewDiabetesEnfermedadRenalPrimariaReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            textViewTiempoDialisisReceptor1.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            if (textViewDatosReceptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor2.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            if (textViewDatosReceptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor3.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            if (textViewDatosReceptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_4.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor4.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor4.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor4.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            if (textViewDatosReceptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_5.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor5.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor5.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor5.startAnimation(animAtenuarVistaCalcularSupervivenciaPaciente);
            }
            /* ************************************************** */
            /* Estado de las vistas: atenuadas. */
            vistasAtenuadasCalcularSupervivenciaPaciente = true;
        }
        else {
            /*
             * Se aumentan todas las vistas,
             * a excepción de las vistas
             * correspondientes con los
             * botones flotantes:
             *
             * opcionesSupervivenciaPaciente
             * botonFlotanteCalcularSupervivenciaPaciente
             * botonFlotanteNuevoReceptorSupervivenciaPaciente
             * botonFlotanteBorrarSupervivenciaPaciente
             */
            /* Aumentar vista de texto del titular del layout. */
            textViewModeloCalcularSupervivenciaPaciente.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            /* Aumentar vista de la petición REST. */
            textViewIndeterminateBarCalcularSupervivenciaPaciente.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            /* Aumentar barra de progreso de la petición REST. */
            linearProgressIndicatorCalcularSupervivenciaPaciente.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            /* Aumentar vistas de texto del receptor 1. */
            textViewCalcularSupervivenciaPacienteReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            /* Aumentar vistas de texto del receptor 2. */
            if (textViewCalcularSupervivenciaPacienteReceptor2.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            /* Aumentar vistas de texto del receptor 3. */
            if (textViewCalcularSupervivenciaPacienteReceptor3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            /* Aumentar vistas de texto del receptor 4. */
            if (textViewCalcularSupervivenciaPacienteReceptor4.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            /* Aumentar vistas de texto del receptor 5. */
            if (textViewCalcularSupervivenciaPacienteReceptor5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo1.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo3.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo5.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo7.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo10.getVisibility() == View.VISIBLE
                    && textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad.getVisibility() == View.VISIBLE) {
                textViewCalcularSupervivenciaPacienteReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo7.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo10.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            /*
             * Aumentar vistas de texto de los datos que ha recibido
             * el servicio REST, enviados por el cliente
             * (App Trasplante Renal), y con los que ha
             * realizado los cálculos para obtener las
             * probabilidades de supervivencia.
             */
            textViewDatosFormulario.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewDatosDonante.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewEdadDonante.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewDatosReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewEdadReceptor4059_1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewEdadReceptor60_1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewSexoHombreReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewDiabetesEnfermedadRenalPrimariaReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            textViewTiempoDialisisReceptor1.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            if (textViewDatosReceptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor2.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            if (textViewDatosReceptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor3.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            if (textViewDatosReceptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_4.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor4.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor4.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor4.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            if (textViewDatosReceptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059_5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60_5.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptor5.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptor5.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor4059_5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewEdadReceptor60_5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewSexoHombreReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
                textViewTiempoDialisisReceptor5.startAnimation(animAumentarVistaCalcularSupervivenciaPaciente);
            }
            /* ************************************************** */
            /* Estado de las vistas: aumentadas. */
            vistasAtenuadasCalcularSupervivenciaPaciente = false;
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
        if(!opcionesDesplegadasCalcularSupervivenciaPaciente) {
            /* Animación: anim_girar_opciones_abrir.xml. */
            opcionesCalcularSupervivenciaPaciente.startAnimation(animGirarOpcionesAlAbrirCalcularSupervivenciaPaciente);
            /* Animación: anim_mostrar_opciones_abrir.xml. */
            botonFlotanteGenerarGraficaSupervivenciaPaciente.startAnimation(animMostrarOpcionesAlAbrirCalcularSupervivenciaPaciente);

            /* Muestra las opciones del menú. */
            botonFlotanteGenerarGraficaSupervivenciaPaciente.show();
            /* Hace visible el texto adjunto a cada opción del menú. */
            textViewGenerarGraficaSupervivenciaPaciente.setVisibility(View.VISIBLE);

            /* Habilita que se pueda hacer clic sobre los botones del menu. */
            botonFlotanteGenerarGraficaSupervivenciaPaciente.setClickable(true);

            /* Estado del menú: desplegado. */
            opcionesDesplegadasCalcularSupervivenciaPaciente = true;
        }
        else {
            /* Animación: anim_girar_opciones_cerrar.xml. */
            opcionesCalcularSupervivenciaPaciente.startAnimation(animGirarOpcionesAlCerrarCalcularSupervivenciaPaciente);
            /* Animación: anim_mostrar_opciones_cerrar.xml. */
            botonFlotanteGenerarGraficaSupervivenciaPaciente.startAnimation(animOcultarOpcionesAlCerrarCalcularSupervivenciaPaciente);

            /* Oculta las opciones del menú. */
            botonFlotanteGenerarGraficaSupervivenciaPaciente.hide();
            /* Hace que el texto adjunto a cada opción del menú no sea visible y no ocupe espacio en el layout. */
            textViewGenerarGraficaSupervivenciaPaciente.setVisibility(View.GONE);

            /* Deshabilita que se pueda hacer clic sobre los botones del menu. */
            /*
             * IMPORTANTE: Si los botones no se deshabilitan, se podrá hacer
             * clic sobre ellos incluso si no están visibles.
             */
            botonFlotanteGenerarGraficaSupervivenciaPaciente.setClickable(false);

            /* Estado del menú: no desplegado. */
            opcionesDesplegadasCalcularSupervivenciaPaciente = false;
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
        textViewModeloCalcularSupervivenciaPaciente.clearAnimation();
        /* Aumentar vista de la petición REST. */
        textViewIndeterminateBarCalcularSupervivenciaPaciente.clearAnimation();
        /* Aumentar barra de progreso de la petición REST. */
        linearProgressIndicatorCalcularSupervivenciaPaciente.clearAnimation();
        /* Limpiar vistas de texto del receptor 1. */
        textViewCalcularSupervivenciaPacienteReceptor1.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor1Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 2. */
        textViewCalcularSupervivenciaPacienteReceptor2.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor2Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 3. */
        textViewCalcularSupervivenciaPacienteReceptor3.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor3Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 4. */
        textViewCalcularSupervivenciaPacienteReceptor4.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor4Tiempo10Probabilidad.clearAnimation();
        /* Limpiar vistas de texto del receptor 5. */
        textViewCalcularSupervivenciaPacienteReceptor5.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo1.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo1Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo3.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo3Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo5.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo5Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo7.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo7Probabilidad.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo10.clearAnimation();
        textViewCalcularSupervivenciaPacienteReceptor5Tiempo10Probabilidad.clearAnimation();
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
        textViewEdadReceptor4059_1.clearAnimation();
        textViewEdadReceptor4059_2.clearAnimation();
        textViewEdadReceptor4059_3.clearAnimation();
        textViewEdadReceptor4059_4.clearAnimation();
        textViewEdadReceptor4059_5.clearAnimation();
        textViewEdadReceptor60_1.clearAnimation();
        textViewEdadReceptor60_2.clearAnimation();
        textViewEdadReceptor60_3.clearAnimation();
        textViewEdadReceptor60_4.clearAnimation();
        textViewEdadReceptor60_5.clearAnimation();
        textViewSexoHombreReceptor1.clearAnimation();
        textViewSexoHombreReceptor2.clearAnimation();
        textViewSexoHombreReceptor3.clearAnimation();
        textViewSexoHombreReceptor4.clearAnimation();
        textViewSexoHombreReceptor5.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptor1.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptor2.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptor3.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptor4.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptor5.clearAnimation();
        textViewTiempoDialisisReceptor1.clearAnimation();
        textViewTiempoDialisisReceptor2.clearAnimation();
        textViewTiempoDialisisReceptor3.clearAnimation();
        textViewTiempoDialisisReceptor4.clearAnimation();
        textViewTiempoDialisisReceptor5.clearAnimation();
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
        opcionesCalcularSupervivenciaPaciente.clearAnimation();
        /* Limpiar animación: anim_mostrar_opciones_abrir.xml / anim_mostrar_opciones_cerrar.xml. */
        botonFlotanteGenerarGraficaSupervivenciaPaciente.clearAnimation();
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