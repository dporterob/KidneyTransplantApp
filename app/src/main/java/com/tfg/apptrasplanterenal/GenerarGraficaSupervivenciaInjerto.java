package com.tfg.apptrasplanterenal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase: GenerarGraficaSupervivenciaInjerto.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class GenerarGraficaSupervivenciaInjerto extends AppCompatActivity {
    /* Tabla de los Receptores. */
    TableLayout tableLayoutGenerarGraficaSupervivenciaInjerto;
    /* Filas de las tabla de los Receptores. */
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor1;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor2;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor3;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor4;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor5;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10;
    /* Vistas de texto de los iconos de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Icono;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Icono;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Icono;
    /* Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Texto;
    /* Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Texto;
    /* Vistas de texto de las probabilidades de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Probabilidad;

    /*
     * MPAndroidChart: LineChart.
     * https://github.com/PhilJay/MPAndroidChart#more-examples-1
     * https://weeklycoding.com/mpandroidchart-documentation/
     * https://javadoc.jitpack.io/com/github/PhilJay/MPAndroidChart/v3.1.0/javadoc/
     * El número de gráficas de líneas será proporcional al
     * número de receptores a estudiar en el modelo.
     * Se indicará en la gráfica la probabilidad de supervivencia
     * para 1, 3, 5, 7 y 10 años.
     */
    LineChart lineChartGenerarGraficaSupervivenciaInjerto;
    float tiempo1GenerarGraficaSupervivenciaInjerto; /* En años. */
    float tiempo3GenerarGraficaSupervivenciaInjerto; /* En años. */
    float tiempo5GenerarGraficaSupervivenciaInjerto; /* En años. */
    float tiempo7GenerarGraficaSupervivenciaInjerto; /* En años. */
    float tiempo10GenerarGraficaSupervivenciaInjerto; /* En años. */
    int tiempoAnimacionEjeXGraficaSupervivenciaInjerto; /* En milisegundos. */

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
        setContentView(R.layout.activity_generar_grafica_supervivencia_injerto);

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

        /* Tabla de los Receptores. */
        tableLayoutGenerarGraficaSupervivenciaInjerto = findViewById(R.id.tableLayoutGenerarGraficaSupervivenciaInjerto);
        /* Filas de las tabla de los Receptores. */
        tableRowGenerarGraficaSupervivenciaInjertoReceptor1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor1);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor2 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor2);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor3);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor4 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor4);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor5);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7);
        tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10);
        /* Vistas de texto de los iconos de los Receptores. */
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Icono);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Icono);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Icono);
        /* Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores. */
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Texto);
        /* Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores. */
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Texto);
        /* Vistas de texto de las probabilidades de los Receptores. */
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Probabilidad);

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
        Intent intentActividadGenerarGraficaSupervivenciaInjerto = getIntent();
        /* Datos recibidos del servicio REST - Receptor 1. */
        String stringCalcularSupervivenciaInjertoReceptor1Tiempo1 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo1");
        String stringCalcularSupervivenciaInjertoReceptor1Tiempo3 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo3");
        String stringCalcularSupervivenciaInjertoReceptor1Tiempo5 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo5");
        String stringCalcularSupervivenciaInjertoReceptor1Tiempo7 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo7");
        String stringCalcularSupervivenciaInjertoReceptor1Tiempo10 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor1Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 2. */
        String stringCalcularSupervivenciaInjertoReceptor2Tiempo1 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo1");
        String stringCalcularSupervivenciaInjertoReceptor2Tiempo3 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo3");
        String stringCalcularSupervivenciaInjertoReceptor2Tiempo5 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo5");
        String stringCalcularSupervivenciaInjertoReceptor2Tiempo7 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo7");
        String stringCalcularSupervivenciaInjertoReceptor2Tiempo10 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor2Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 3. */
        String stringCalcularSupervivenciaInjertoReceptor3Tiempo1 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo1");
        String stringCalcularSupervivenciaInjertoReceptor3Tiempo3 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo3");
        String stringCalcularSupervivenciaInjertoReceptor3Tiempo5 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo5");
        String stringCalcularSupervivenciaInjertoReceptor3Tiempo7 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo7");
        String stringCalcularSupervivenciaInjertoReceptor3Tiempo10 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor3Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 4. */
        String stringCalcularSupervivenciaInjertoReceptor4Tiempo1 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo1");
        String stringCalcularSupervivenciaInjertoReceptor4Tiempo3 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo3");
        String stringCalcularSupervivenciaInjertoReceptor4Tiempo5 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo5");
        String stringCalcularSupervivenciaInjertoReceptor4Tiempo7 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo7");
        String stringCalcularSupervivenciaInjertoReceptor4Tiempo10 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor4Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 5. */
        String stringCalcularSupervivenciaInjertoReceptor5Tiempo1 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo1");
        String stringCalcularSupervivenciaInjertoReceptor5Tiempo3 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo3");
        String stringCalcularSupervivenciaInjertoReceptor5Tiempo5 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo5");
        String stringCalcularSupervivenciaInjertoReceptor5Tiempo7 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo7");
        String stringCalcularSupervivenciaInjertoReceptor5Tiempo10 = intentActividadGenerarGraficaSupervivenciaInjerto.getStringExtra("floatCalcularSupervivenciaInjertoReceptor5Tiempo10");

        /*
         * MPAndroidChart: LineChart.
         */
        lineChartGenerarGraficaSupervivenciaInjerto = findViewById(R.id.lineChartGenerarGraficaSupervivenciaInjerto);
        tiempo1GenerarGraficaSupervivenciaInjerto = 1;   /* 1.00 años. */
        tiempo3GenerarGraficaSupervivenciaInjerto = 3;   /* 3.00 años. */
        tiempo5GenerarGraficaSupervivenciaInjerto = 5;   /* 5.00 años. */
        tiempo7GenerarGraficaSupervivenciaInjerto = 7;   /* 7.00 años. */
        tiempo10GenerarGraficaSupervivenciaInjerto = 10; /* 10.00 años. */
        tiempoAnimacionEjeXGraficaSupervivenciaInjerto = 2500; /* 2500 milisegundos. */
        /*
         * Establece el ancho de la gráfica
         * y el ancho de la tabla en función
         * del número de píxeles del dispositivo.
         * Se ajusta la altura de la gráfica
         * para que pueda ser vista completamente
         * en cualquier dispositivo.
         */
        /* *********************************** */
        int numeroPixelesAnchoDispositivo;
        int numeroPixelesLargoDispositivo;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        /* Relleno de 16sp en margen (16px de escala independiente) + 30px para mostrar los porcentajes en el eje y. */
        int paddingLeft = 46;
        int paddingRight = 46;
        int numeroPixelesDisponiblesAncho;
        int numeroPixelesDisponiblesAlto;
        WindowManager windowmanager = (WindowManager) getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        windowmanager.getDefaultDisplay().getMetrics(displayMetrics);
        numeroPixelesAnchoDispositivo = displayMetrics.widthPixels;
        numeroPixelesLargoDispositivo = displayMetrics.heightPixels;
        numeroPixelesDisponiblesAncho = numeroPixelesAnchoDispositivo - (paddingLeft + paddingRight);
        numeroPixelesDisponiblesAlto = numeroPixelesLargoDispositivo - (paddingLeft + paddingRight);
        lineChartGenerarGraficaSupervivenciaInjerto.setMinimumWidth(numeroPixelesDisponiblesAncho);
        lineChartGenerarGraficaSupervivenciaInjerto.setMinimumHeight(numeroPixelesDisponiblesAlto);
        tableLayoutGenerarGraficaSupervivenciaInjerto.setMinimumWidth(numeroPixelesDisponiblesAncho);
        /* *********************************** */

        /*
         * Formateo de datos y valores de los ejes.
         * https://weeklycoding.com/mpandroidchart-documentation/setting-data/
         * https://weeklycoding.com/mpandroidchart-documentation/formatting-data-values/
         *
         * Se sustituyen los valores por defecto del eje x (valores numéricos),
         * por valores predeterminados.
         * La clase ValueFormatter permite personalizar el estilo y valor del
         * eje X (XAxis).
         */
        /*
         * Etiquetas a dibujar en el eje x.
         */
        final String[] tiempoGenerarGraficaSupervivenciaInjerto = new String[] {
                "0 years", "1 year", "2 years", "3 years", "4 years", "5 years",
                "6 years", "7 years", "8 years", "9 years", "10 years", "11 years",
                "12 years" };
        ValueFormatter valueFormatterXAxis = new ValueFormatter() {
            @Override
            public String getAxisLabel(float value, AxisBase axis) {
                return tiempoGenerarGraficaSupervivenciaInjerto[(int) value];
            }
        };
        /*
         * Etiquetas a dibujar en el eje y.
         * Del 0.00 % al 99.99 % -> 10000 elementos.
         * Del 0.00 % al 104.99 % -> 10500 elementos.
         */
        String[] porcentajeGenerarGraficaSupervivenciaInjerto = new String[10500];
        int elemento = 0;
        for (int unidades = 0; unidades < 105; ++unidades) {
            /* Bucle 1: unidades del 0 % al 100 %. */
            for (int decimas = 0; decimas < 10; ++decimas) {
                /* Bucle 2: décimas del .0X % al .9X %. No modifica el valor de X. */
                for (int centesimas = 0; centesimas < 10; ++centesimas) {
                    /* Bucle 3: centésimas del .X0 % al .X9 %. No modifica el valor de X. */
                    /* Se autogeneran los valores del eje y. */
                    porcentajeGenerarGraficaSupervivenciaInjerto[elemento] =
                            String.valueOf(unidades)
                                    .concat(".")
                                    .concat(String.valueOf(decimas)
                                            .concat(String.valueOf(centesimas)
                                                    .concat(" %")));
                    elemento = elemento + 1;
                }
            }
        }
        ValueFormatter valueFormatterYAxis = new ValueFormatter() {
            @Override
            public String getAxisLabel(float value, AxisBase axis) {
                return porcentajeGenerarGraficaSupervivenciaInjerto[(int) value];
            }
        };
        /*
         * xAxis.
         * https://weeklycoding.com/mpandroidchart-documentation/axis-general/
         * https://github.com/PhilJay/MPAndroidChart/wiki/XAxis
         *
         * setEnabled:
         * establece la utilización del
         * eje x de la gráfica (false,
         * lo deshabilita).
         *
         * setGranularityEnabled:
         * establece la característica de
         * granularidad, que limita el
         * intervalo en el eje x, al
         * aumentar el zoom de la gráfica.
         *
         * setGranularity:
         * establece el mínimo intervalo
         * entre los valores del eje x.
         * Evita la duplicación de valores
         * al aumentar el zoom hasta tal
         * punto que, el número de decimales
         * establecidos para los ejes no
         * permita distinguir entre los
         * valores de los ejes x e y.
         * La resolución que se establece para
         * el eje x es de 1f (de 0 a 12 años
         * de 1 en 1).
         *
         * setValueFormatter:
         * establece el formateo del eje x
         * con un 'ValueFormatter' predefinido,
         * para todos los 'DataSets' que el
         * objeto de datos contenga.
         * Sustituye el formateo númerico
         * por defecto.
         *
         * setSpaceMin:
         * establece espacio extra para
         * 'axisMinimum', que es añadido
         * automáticamente al valor calculado
         * de 'axisMinimum'.
         * Permite que haya una separación
         * entre el primer punto calculado
         * en la gráfica y el borde lateral
         * izquierdo de la gráfica.
         *
         * setSpaceMax:
         * establece espacio extra para
         * 'axisMaximum', que es añadido
         * automáticamente al valor calculado
         * de 'axisMaximum'.
         * Permite que haya una separación
         * entre el último punto calculado
         * en la gráfica y el borde lateral
         * derecho de la gráfica.
         *
         * setTextSize:
         * establece el tamaño de la letra a 14dp
         * (no soporta 14sp)
         * (sólo válido si setEnabled(true)).
         *
         * setLabelCount:
         * establece el número de valores
         * mostrados inicialmente en el eje.
         */
        XAxis xAxis = lineChartGenerarGraficaSupervivenciaInjerto.getXAxis();
        xAxis.setEnabled(true);
        xAxis.setGranularityEnabled(true);
        xAxis.setGranularity(1f);
        xAxis.setValueFormatter(valueFormatterXAxis);
        xAxis.setSpaceMin(0.5f);
        xAxis.setSpaceMax(0.5f);
        xAxis.setTextSize(14f);
        xAxis.setLabelCount(3);

        /*
         * YAxis.
         * https://weeklycoding.com/mpandroidchart-documentation/axis-general/
         * https://github.com/PhilJay/MPAndroidChart/wiki/YAxis
         *
         * setEnabled:
         * establece la utilización de los
         * ejes y (izquierdo y derecho) de la
         * gráfica (false, lo deshabilita).
         *
         * setGranularityEnabled:
         * establece la característica de
         * granularidad, que limita el
         * intervalo en el eje y, al
         * aumentar el zoom de la gráfica.
         *
         * setGranularity:
         * establece el mínimo intervalo
         * entre los valores del eje y.
         * Evita la duplicación de valores
         * al aumentar el zoom hasta tal
         * punto que, el número de decimales
         * establecidos para los ejes no
         * permita distinguir entre los
         * valores de los ejes x e y.
         * La resolución que se establece para
         * el eje y es de 0.01f (del 0 al 100
         * porciento de 0.01 en 0.01).
         * Se corresponde con la resolución del
         * cálculo realizado por el servicio
         * REST.
         *
         * setValueFormatter:
         * establece el formateo del eje y
         * con un 'ValueFormatter' predefinido,
         * para todos los 'DataSets' que el
         * objeto de datos contenga.
         * Sustituye el formateo númerico
         * por defecto.
         *
         * setAxisMinimum:
         * establece el valor mínimo
         * para el eje y.
         *
         * setAxisMaximum:
         * establece el valor máximo
         * para el eje y.
         * Establecido a 105f (aunque
         * el máximo teórico sea 100f
         * - un 100 %),
         * con el objetivo de que los
         * valores del eje x y los
         * valores del eje y, que estén
         * ambos en extremos de la
         * gráfica (esquinas),
         * no se superpongan.
         *
         * setTextSize:
         * establece el tamaño de la letra a 14dp
         * (no soporta 14sp)
         * (sólo válido si setEnabled(true)).
         *
         * setLabelCount:
         * establece el número de valores
         * mostrados inicialmente en el eje.
         */
        YAxis yAxisLeft = lineChartGenerarGraficaSupervivenciaInjerto.getAxisLeft();
        YAxis yAxisRight = lineChartGenerarGraficaSupervivenciaInjerto.getAxisRight();
        yAxisLeft.setEnabled(true);
        yAxisRight.setEnabled(true);
        yAxisLeft.setGranularityEnabled(true);
        yAxisLeft.setGranularity(0.01f);
        yAxisLeft.setValueFormatter(valueFormatterYAxis);
        yAxisLeft.setAxisMinimum(0f);
        yAxisLeft.setAxisMaximum(10499f);
        yAxisLeft.setTextSize(14f);
        yAxisLeft.setLabelCount(8);
        yAxisRight.setGranularityEnabled(true);
        yAxisRight.setGranularity(0.01f);
        yAxisRight.setValueFormatter(valueFormatterYAxis);
        yAxisRight.setAxisMinimum(0f);
        yAxisRight.setAxisMaximum(10499f);
        yAxisRight.setTextSize(14f);
        yAxisRight.setLabelCount(8);

        /*
         * Descripción o título de la gráfica.
         * https://weeklycoding.com/mpandroidchart-documentation/description/
         *
         * setEnabled:
         * establece la utilización del
         * título de la gráfica (false, lo deshabilita).
         *
         * setText:
         * establece el texto de la gráfica
         * (sólo válido si setEnabled(true)).
         *
         * setTextSize:
         * establece el tamaño de la letra a 16dp
         * (no soporta 16sp)
         * (sólo válido si setEnabled(true)).
         *
         * setGridBackground:
         * establece la utilización del
         * fondo de la gráfica (true, lo habilita).
         *
         * setDrawBorders:
         * establece el dibujo del
         * borde de la gráfica (true, lo habilita).
         *
         * setBorderColor:
         * establece el color del borde de
         * la gráfica.
         *
         * setBorderWidth:
         * establece el ancho del borde de
         * la gráfica.
         *
         * setExtraOffsets:
         * establece un margen extra (alrededor
         * de la vista de la gráfica), como añadido
         * a los márgenes (o rellenos) ya establecidos.
         * https://weeklycoding.com/mpandroidchart-documentation/modifying-the-viewport/
         */
        lineChartGenerarGraficaSupervivenciaInjerto.getDescription().setEnabled(false);
        lineChartGenerarGraficaSupervivenciaInjerto.getDescription().setText("Graft survival");
        lineChartGenerarGraficaSupervivenciaInjerto.getDescription().setTextSize(16f);
        lineChartGenerarGraficaSupervivenciaInjerto.setDrawGridBackground(false);
        lineChartGenerarGraficaSupervivenciaInjerto.setDrawBorders(true);
        lineChartGenerarGraficaSupervivenciaInjerto.setBorderColor(Color.BLACK);
        lineChartGenerarGraficaSupervivenciaInjerto.setBorderWidth(0.5f);
        lineChartGenerarGraficaSupervivenciaInjerto.setExtraOffsets(0f,24f,0f,24f);

        /*
         * Leyenda de la gráfica.
         * https://weeklycoding.com/mpandroidchart-documentation/legend/
         *
         * setEnabled:
         * establece la utilización de la
         * leyenda (la habilita).
         *
         * setDirection:
         * establece la posición en la que debe
         * situarse la leyenda.
         *
         * setTextSize:
         * estable el tamaño de la letra a 16dp
         * (no soporta 16sp).
         *
         * setWordWrapEnabled(true):
         * establece que los elementos de la leyenda no
         * se acorten si salen fuera de los límites de la gráfica,
         * (si no entran en una sola línea); en su lugar
         * se crean tantas líneas como sean necesarias.
         *
         * setMaxSizePercent(float maxSize):
         * establece el tamaño relativo máximo de la vista de
         * gráfico completo en porcentaje. Predeterminado: 0.95f (95%)
         *
         * setXEntrySpace:
         * establece la separación entre los elementos
         * de la leyenda en el eje horizontal (eje x).
         *
         * setYEntrySpace:
         * establece la separación entre los elementos
         * de la leyenda en el eje vertical (eje y).
         */
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setEnabled(true);
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setDirection(Legend.LegendDirection.LEFT_TO_RIGHT);
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setTextSize(18f);
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setWordWrapEnabled(true);
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setMaxSizePercent(0.95f);
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setXEntrySpace(16f);
        lineChartGenerarGraficaSupervivenciaInjerto.getLegend().setYEntrySpace(8f);

        /*
         * Estableciendo los datos de la gráfica.
         * https://weeklycoding.com/mpandroidchart-documentation/setting-data/
         *
         * Para cada punto de la gráfica: Entry(float x, float y):
         * Coordenadas en el eje x: 1, 3, 5, 7 o 10 años.
         * Coordenadas en el eje y: probabilidad calculada por el servicio REST.
         *
         * En primer lugar, se crean las listas que contendrán los valores (x,y)
         * de las gráficas.
         *
         * En segundo lugar, se rellenan las listas con objetos de tipo Entry.
         *
         * Finalmente, una vez cumplimentadas las listas con los objetos de
         * tipo Entry, se crean los objetos de tipo LineDataSet.
         */
        /* Gráfica receptor 1. */
        LineDataSet lineDataSetProbabilidadSupervivenciaInjertoReceptor1 = null;
        if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)) {
            /* Gráfica receptor 1. */
            List<Entry> listEjeYProbabilidadSupervivenciaInjertoReceptor1 = new ArrayList<>();
            Entry probabilidadSupervivenciaInjertoReceptor1Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor1Tiempo1));
            listEjeYProbabilidadSupervivenciaInjertoReceptor1.add(probabilidadSupervivenciaInjertoReceptor1Tiempo1);
            Entry probabilidadSupervivenciaInjertoReceptor1Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor1Tiempo3));
            listEjeYProbabilidadSupervivenciaInjertoReceptor1.add(probabilidadSupervivenciaInjertoReceptor1Tiempo3);
            Entry probabilidadSupervivenciaInjertoReceptor1Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor1Tiempo5));
            listEjeYProbabilidadSupervivenciaInjertoReceptor1.add(probabilidadSupervivenciaInjertoReceptor1Tiempo5);
            Entry probabilidadSupervivenciaInjertoReceptor1Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor1Tiempo7));
            listEjeYProbabilidadSupervivenciaInjertoReceptor1.add(probabilidadSupervivenciaInjertoReceptor1Tiempo7);
            Entry probabilidadSupervivenciaInjertoReceptor1Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor1Tiempo10));
            listEjeYProbabilidadSupervivenciaInjertoReceptor1.add(probabilidadSupervivenciaInjertoReceptor1Tiempo10);
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1 = new LineDataSet(listEjeYProbabilidadSupervivenciaInjertoReceptor1,
                    "Recipient 1");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.blue));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.blue));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor1.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 2. */
        LineDataSet lineDataSetProbabilidadSupervivenciaInjertoReceptor2 = null;
        if (!(stringCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)) {
            /* Gráfica receptor 2. */
            List<Entry> listEjeYProbabilidadSupervivenciaInjertoReceptor2 = new ArrayList<>();
            Entry probabilidadSupervivenciaInjertoReceptor2Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor2Tiempo1));
            listEjeYProbabilidadSupervivenciaInjertoReceptor2.add(probabilidadSupervivenciaInjertoReceptor2Tiempo1);
            Entry probabilidadSupervivenciaInjertoReceptor2Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor2Tiempo3));
            listEjeYProbabilidadSupervivenciaInjertoReceptor2.add(probabilidadSupervivenciaInjertoReceptor2Tiempo3);
            Entry probabilidadSupervivenciaInjertoReceptor2Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor2Tiempo5));
            listEjeYProbabilidadSupervivenciaInjertoReceptor2.add(probabilidadSupervivenciaInjertoReceptor2Tiempo5);
            Entry probabilidadSupervivenciaInjertoReceptor2Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor2Tiempo7));
            listEjeYProbabilidadSupervivenciaInjertoReceptor2.add(probabilidadSupervivenciaInjertoReceptor2Tiempo7);
            Entry probabilidadSupervivenciaInjertoReceptor2Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor2Tiempo10));
            listEjeYProbabilidadSupervivenciaInjertoReceptor2.add(probabilidadSupervivenciaInjertoReceptor2Tiempo10);
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2 = new LineDataSet(listEjeYProbabilidadSupervivenciaInjertoReceptor2,
                    "Recipient 2");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.green));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.green));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor2.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 3. */
        LineDataSet lineDataSetProbabilidadSupervivenciaInjertoReceptor3 = null;
        if (!(stringCalcularSupervivenciaInjertoReceptor3Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10 == null)) {
            /* Gráfica receptor 3. */
            List<Entry> listEjeYProbabilidadSupervivenciaInjertoReceptor3 = new ArrayList<>();
            Entry probabilidadSupervivenciaInjertoReceptor3Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor3Tiempo1));
            listEjeYProbabilidadSupervivenciaInjertoReceptor3.add(probabilidadSupervivenciaInjertoReceptor3Tiempo1);
            Entry probabilidadSupervivenciaInjertoReceptor3Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor3Tiempo3));
            listEjeYProbabilidadSupervivenciaInjertoReceptor3.add(probabilidadSupervivenciaInjertoReceptor3Tiempo3);
            Entry probabilidadSupervivenciaInjertoReceptor3Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor3Tiempo5));
            listEjeYProbabilidadSupervivenciaInjertoReceptor3.add(probabilidadSupervivenciaInjertoReceptor3Tiempo5);
            Entry probabilidadSupervivenciaInjertoReceptor3Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor3Tiempo7));
            listEjeYProbabilidadSupervivenciaInjertoReceptor3.add(probabilidadSupervivenciaInjertoReceptor3Tiempo7);
            Entry probabilidadSupervivenciaInjertoReceptor3Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor3Tiempo10));
            listEjeYProbabilidadSupervivenciaInjertoReceptor3.add(probabilidadSupervivenciaInjertoReceptor3Tiempo10);
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3 = new LineDataSet(listEjeYProbabilidadSupervivenciaInjertoReceptor3,
                    "Recipient 3");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.red));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.red));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor3.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 4. */
        LineDataSet lineDataSetProbabilidadSupervivenciaInjertoReceptor4 = null;
        if (!(stringCalcularSupervivenciaInjertoReceptor4Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10 == null)) {
            /* Gráfica receptor 4. */
            List<Entry> listEjeYProbabilidadSupervivenciaInjertoReceptor4 = new ArrayList<>();
            Entry probabilidadSupervivenciaInjertoReceptor4Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor4Tiempo1));
            listEjeYProbabilidadSupervivenciaInjertoReceptor4.add(probabilidadSupervivenciaInjertoReceptor4Tiempo1);
            Entry probabilidadSupervivenciaInjertoReceptor4Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor4Tiempo3));
            listEjeYProbabilidadSupervivenciaInjertoReceptor4.add(probabilidadSupervivenciaInjertoReceptor4Tiempo3);
            Entry probabilidadSupervivenciaInjertoReceptor4Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor4Tiempo5));
            listEjeYProbabilidadSupervivenciaInjertoReceptor4.add(probabilidadSupervivenciaInjertoReceptor4Tiempo5);
            Entry probabilidadSupervivenciaInjertoReceptor4Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor4Tiempo7));
            listEjeYProbabilidadSupervivenciaInjertoReceptor4.add(probabilidadSupervivenciaInjertoReceptor4Tiempo7);
            Entry probabilidadSupervivenciaInjertoReceptor4Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor4Tiempo10));
            listEjeYProbabilidadSupervivenciaInjertoReceptor4.add(probabilidadSupervivenciaInjertoReceptor4Tiempo10);
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4 = new LineDataSet(listEjeYProbabilidadSupervivenciaInjertoReceptor4,
                    "Recipient 4");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.orange));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.orange));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor4.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 5. */
        LineDataSet lineDataSetProbabilidadSupervivenciaInjertoReceptor5 = null;
        if (!(stringCalcularSupervivenciaInjertoReceptor5Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo10 == null)) {
            /* Gráfica receptor 5. */
            List<Entry> listEjeYProbabilidadSupervivenciaInjertoReceptor5 = new ArrayList<>();
            Entry probabilidadSupervivenciaInjertoReceptor5Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor5Tiempo1));
            listEjeYProbabilidadSupervivenciaInjertoReceptor5.add(probabilidadSupervivenciaInjertoReceptor5Tiempo1);
            Entry probabilidadSupervivenciaInjertoReceptor5Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor5Tiempo3));
            listEjeYProbabilidadSupervivenciaInjertoReceptor5.add(probabilidadSupervivenciaInjertoReceptor5Tiempo3);
            Entry probabilidadSupervivenciaInjertoReceptor5Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor5Tiempo5));
            listEjeYProbabilidadSupervivenciaInjertoReceptor5.add(probabilidadSupervivenciaInjertoReceptor5Tiempo5);
            Entry probabilidadSupervivenciaInjertoReceptor5Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor5Tiempo7));
            listEjeYProbabilidadSupervivenciaInjertoReceptor5.add(probabilidadSupervivenciaInjertoReceptor5Tiempo7);
            Entry probabilidadSupervivenciaInjertoReceptor5Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaInjerto,
                    100*Float.parseFloat(stringCalcularSupervivenciaInjertoReceptor5Tiempo10));
            listEjeYProbabilidadSupervivenciaInjertoReceptor5.add(probabilidadSupervivenciaInjertoReceptor5Tiempo10);
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5 = new LineDataSet(listEjeYProbabilidadSupervivenciaInjertoReceptor5,
                    "Recipient 5");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.magenta));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.magenta));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaInjertoReceptor5.setMode(LineDataSet.Mode.LINEAR);
        }

        /*
         * LineData (objeto de datos), encapsula todos los datos asociados
         * con un LineChart (gráfica en la que se dibujan las curvas o líneas).
         *
         * Se representan aquellas curvas para las que se hayan recibidos datos
         * por parte del servicio REST.
         */
        LineData lineDataGenerarGraficaSupervivenciaInjerto = null;
        if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo10.equals("0.0"))) {
                lineDataGenerarGraficaSupervivenciaInjerto = new LineData(lineDataSetProbabilidadSupervivenciaInjertoReceptor1,
                        lineDataSetProbabilidadSupervivenciaInjertoReceptor2,
                        lineDataSetProbabilidadSupervivenciaInjertoReceptor3,
                        lineDataSetProbabilidadSupervivenciaInjertoReceptor4,
                        lineDataSetProbabilidadSupervivenciaInjertoReceptor5);

                /*
                 * Vistas de texto de la probabilidad de supervivencia
                 * de los receptores 2, 3, 4 y 5 'gone' por defecto.
                 * Vista de texto de la probabilidad de supervivencia
                 * del receptor 1 'visible' por defecto.
                 *
                 * Si se reciben los datos para los receptores
                 * 2, 3, 4 y 5 en la respuesta del servicio REST,
                 * se harán 'visible' los campos de texto de las
                 * filas de la tabla correspondientes con las
                 * probabilidades de supervivencia de dichos receptores.
                 */
                /* Vistas de texto de los iconos de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Icono.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Icono.setVisibility(View.VISIBLE);
                /* Vistas de texto de los textos de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Texto.setVisibility(View.VISIBLE);
                /* Vistas de texto de los tiempos de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Texto.setVisibility(View.VISIBLE);
                /* Vistas de texto de las probabilidades de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            }
        }
        else {
            if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo1 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo1 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7 == null)
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10 == null)) {
                if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10.equals("0.0"))) {
                    lineDataGenerarGraficaSupervivenciaInjerto = new LineData(lineDataSetProbabilidadSupervivenciaInjertoReceptor1,
                            lineDataSetProbabilidadSupervivenciaInjertoReceptor2,
                            lineDataSetProbabilidadSupervivenciaInjertoReceptor3,
                            lineDataSetProbabilidadSupervivenciaInjertoReceptor4);

                    /*
                     * Vistas de texto de la probabilidad de supervivencia
                     * de los receptores 2, 3 y 4 'gone' por defecto.
                     * Vista de texto de la probabilidad de supervivencia
                     * del receptor 1 'visible' por defecto.
                     *
                     * Si se reciben los datos para los receptores
                     * 2, 3 y 4 en la respuesta del servicio REST,
                     * se harán 'visible' los campos de texto de las
                     * filas de la tabla correspondientes con las
                     * probabilidades de supervivencia de dichos receptores.
                     */
                    /* Vistas de texto de los iconos de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Icono.setVisibility(View.VISIBLE);
                    /* Vistas de texto de los textos de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Texto.setVisibility(View.VISIBLE);
                    /* Vistas de texto de los tiempos de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Texto.setVisibility(View.VISIBLE);
                    /* Vistas de texto de las probabilidades de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                }
            }
            else {
                if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo1 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7 == null)
                        && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10 == null)) {
                    if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo1.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7.equals("0.0"))
                            && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10.equals("0.0"))) {
                        lineDataGenerarGraficaSupervivenciaInjerto = new LineData(lineDataSetProbabilidadSupervivenciaInjertoReceptor1,
                                lineDataSetProbabilidadSupervivenciaInjertoReceptor2,
                                lineDataSetProbabilidadSupervivenciaInjertoReceptor3);

                        /*
                         * Vistas de texto de la probabilidad de supervivencia
                         * de los receptores 2 y 3 'gone' por defecto.
                         * Vista de texto de la probabilidad de supervivencia
                         * del receptor 1 'visible' por defecto.
                         *
                         * Si se reciben los datos para los receptores
                         * 2 y 3 en la respuesta del servicio REST,
                         * se harán 'visible' los campos de texto de las
                         * filas de la tabla correspondientes con las
                         * probabilidades de supervivencia de dichos receptores.
                         */
                        /* Vistas de texto de los iconos de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono.setVisibility(View.VISIBLE);
                        /* Vistas de texto de los textos de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto.setVisibility(View.VISIBLE);
                        /* Vistas de texto de los tiempos de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto.setVisibility(View.VISIBLE);
                        /* Vistas de texto de las probabilidades de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                    }
                }
                else {
                    if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                            && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)) {
                        if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo1.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7.equals("0.0"))
                                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10.equals("0.0"))) {
                            lineDataGenerarGraficaSupervivenciaInjerto = new LineData(lineDataSetProbabilidadSupervivenciaInjertoReceptor1,
                                    lineDataSetProbabilidadSupervivenciaInjertoReceptor2);

                            /*
                             * Vistas de texto de la probabilidad de supervivencia
                             * del receptor 2 'gone' por defecto.
                             * Vista de texto de la probabilidad de supervivencia
                             * del receptor 1 'visible' por defecto.
                             *
                             * Si se reciben los datos para el receptor
                             * 2 en la respuesta del servicio REST,
                             * se harán 'visible' los campos de texto de las
                             * filas de la tabla correspondientes con las
                             * probabilidades de supervivencia de dicho receptor.
                             */
                            /* Vistas de texto de los iconos del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono.setVisibility(View.VISIBLE);
                            /* Vistas de texto de los textos del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto.setVisibility(View.VISIBLE);
                            /* Vistas de texto de los tiempos del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                            /* Vistas de texto de las probabilidades del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                        }
                    }
                    else {
                        if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)) {
                            if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.equals("0.0"))
                                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.equals("0.0"))
                                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.equals("0.0"))
                                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.equals("0.0"))
                                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.equals("0.0"))) {
                                lineDataGenerarGraficaSupervivenciaInjerto = new LineData(lineDataSetProbabilidadSupervivenciaInjertoReceptor1);
                            }
                        }
                    }
                }
            }
        }

        /*
         * LineData.
         *
         * setData:
         * establece los datos a representar.
         *
         * invalidate:
         * refresca o actualiza la gráfica
         * (NO refresca o actualiza la vista).
         */
        lineChartGenerarGraficaSupervivenciaInjerto.setData(lineDataGenerarGraficaSupervivenciaInjerto);
        lineChartGenerarGraficaSupervivenciaInjerto.invalidate();

        /* Tabla Receptor 1 */
        if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo1Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor1Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo3Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor1Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo5Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor1Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo7Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor1Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor1Tiempo10Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor1Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 2 */
        if (!(stringCalcularSupervivenciaInjertoReceptor2Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaInjertoReceptor2Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor2Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo1Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor2Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo3Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor2Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo5Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor2Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo7Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor2Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor2Tiempo10Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor2Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 3 */
        if (!(stringCalcularSupervivenciaInjertoReceptor3Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaInjertoReceptor3Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor3Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo1Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor3Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo3Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor3Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo5Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor3Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo7Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor3Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor3Tiempo10Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor3Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 4 */
        if (!(stringCalcularSupervivenciaInjertoReceptor4Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaInjertoReceptor4Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor4Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo1Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor4Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo3Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor4Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo5Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor4Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo7Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor4Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor4Tiempo10Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor4Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 5 */
        if (!(stringCalcularSupervivenciaInjertoReceptor5Tiempo1 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo3 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo5 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo7 == null)
                && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaInjertoReceptor5Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaInjertoReceptor5Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo1Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor5Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo3Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor5Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo5Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor5Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo7Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor5Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaInjertoReceptor5Tiempo10Probabilidad.setText(stringCalcularSupervivenciaInjertoReceptor5Tiempo10.concat(" %"));
            }
        }
        /* ***************************************************************************** */

        /*
         * Animación de la gráfica.
         * https://weeklycoding.com/mpandroidchart-documentation/animations/
         *
         * Las gráficas soportan la posibilidad de crear animaciones:
         * animar eje x, animar eje y o animanar ejes x e y.
         *
         * animateX(int durationMillis):
         * anima los valores de la gráfica en el eje horizontal, esto es,
         * la gráfica se irá generando en el tiempo especificado, de
         * izquierda a derecha.
         *
         * animateY(int durationMillis):
         * anima los valores de la gráfica en el eje vertical, esto es,
         * la gráfica se irá generando en el tiempo especificado, de
         * abajo a arriba.
         *
         * animateXY(int xDuration, int yDuration):
         * anima los valores de la gráfica en los ejes horizontal y vertical,
         * esto es, la gráfica se irá generando en el tiempo especificado, de
         * izquierda a derecha y de abajo a arriba.
         */
        lineChartGenerarGraficaSupervivenciaInjerto.animateX(tiempoAnimacionEjeXGraficaSupervivenciaInjerto);

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