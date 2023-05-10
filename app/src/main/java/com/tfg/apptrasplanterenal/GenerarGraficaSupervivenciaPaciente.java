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
 * Clase: GenerarGraficaSupervivenciaPaciente.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class GenerarGraficaSupervivenciaPaciente extends AppCompatActivity {
    /* Tabla de los Receptores. */
    TableLayout tableLayoutGenerarGraficaSupervivenciaPaciente;
    /* Filas de las tabla de los Receptores. */
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor1;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor2;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor3;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor4;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor5;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7;
    TableRow tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10;
    /* Vistas de texto de los iconos de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Icono;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Icono;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Icono;
    /* Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Texto;
    /* Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Texto;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Texto;
    /* Vistas de texto de las probabilidades de los Receptores. */
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Probabilidad;
    TextView textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Probabilidad;

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
    LineChart lineChartGenerarGraficaSupervivenciaPaciente;
    float tiempo1GenerarGraficaSupervivenciaPaciente; /* En años. */
    float tiempo3GenerarGraficaSupervivenciaPaciente; /* En años. */
    float tiempo5GenerarGraficaSupervivenciaPaciente; /* En años. */
    float tiempo7GenerarGraficaSupervivenciaPaciente; /* En años. */
    float tiempo10GenerarGraficaSupervivenciaPaciente; /* En años. */
    int tiempoAnimacionEjeXGraficaSupervivenciaPaciente; /* En milisegundos. */

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
        setContentView(R.layout.activity_generar_grafica_supervivencia_paciente);

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
        tableLayoutGenerarGraficaSupervivenciaPaciente = findViewById(R.id.tableLayoutGenerarGraficaSupervivenciaPaciente);
        /* Filas de las tabla de los Receptores. */
        tableRowGenerarGraficaSupervivenciaPacienteReceptor1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor1);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor2 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor2);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor3);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor4 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor4);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor5);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7);
        tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10 = findViewById(R.id.tableRowGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10);
        /* Vistas de texto de los iconos de los Receptores. */
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Icono);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Icono);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Icono = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Icono);
        /* Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores. */
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Texto);
        /* Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores. */
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Texto);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Texto = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Texto);
        /* Vistas de texto de las probabilidades de los Receptores. */
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Probabilidad);
        textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Probabilidad = findViewById(R.id.textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Probabilidad);

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
        Intent intentActividadGenerarGraficaSupervivenciaPaciente = getIntent();
        /* Datos recibidos del servicio REST - Receptor 1. */
        String stringCalcularSupervivenciaPacienteReceptor1Tiempo1 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo1");
        String stringCalcularSupervivenciaPacienteReceptor1Tiempo3 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo3");
        String stringCalcularSupervivenciaPacienteReceptor1Tiempo5 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo5");
        String stringCalcularSupervivenciaPacienteReceptor1Tiempo7 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo7");
        String stringCalcularSupervivenciaPacienteReceptor1Tiempo10 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor1Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 2. */
        String stringCalcularSupervivenciaPacienteReceptor2Tiempo1 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo1");
        String stringCalcularSupervivenciaPacienteReceptor2Tiempo3 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo3");
        String stringCalcularSupervivenciaPacienteReceptor2Tiempo5 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo5");
        String stringCalcularSupervivenciaPacienteReceptor2Tiempo7 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo7");
        String stringCalcularSupervivenciaPacienteReceptor2Tiempo10 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor2Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 3. */
        String stringCalcularSupervivenciaPacienteReceptor3Tiempo1 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo1");
        String stringCalcularSupervivenciaPacienteReceptor3Tiempo3 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo3");
        String stringCalcularSupervivenciaPacienteReceptor3Tiempo5 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo5");
        String stringCalcularSupervivenciaPacienteReceptor3Tiempo7 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo7");
        String stringCalcularSupervivenciaPacienteReceptor3Tiempo10 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor3Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 4. */
        String stringCalcularSupervivenciaPacienteReceptor4Tiempo1 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo1");
        String stringCalcularSupervivenciaPacienteReceptor4Tiempo3 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo3");
        String stringCalcularSupervivenciaPacienteReceptor4Tiempo5 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo5");
        String stringCalcularSupervivenciaPacienteReceptor4Tiempo7 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo7");
        String stringCalcularSupervivenciaPacienteReceptor4Tiempo10 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor4Tiempo10");
        /* Datos recibidos del servicio REST - Receptor 5. */
        String stringCalcularSupervivenciaPacienteReceptor5Tiempo1 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo1");
        String stringCalcularSupervivenciaPacienteReceptor5Tiempo3 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo3");
        String stringCalcularSupervivenciaPacienteReceptor5Tiempo5 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo5");
        String stringCalcularSupervivenciaPacienteReceptor5Tiempo7 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo7");
        String stringCalcularSupervivenciaPacienteReceptor5Tiempo10 = intentActividadGenerarGraficaSupervivenciaPaciente.getStringExtra("floatCalcularSupervivenciaPacienteReceptor5Tiempo10");

        /*
         * MPAndroidChart: LineChart.
         */
        lineChartGenerarGraficaSupervivenciaPaciente = findViewById(R.id.lineChartGenerarGraficaSupervivenciaPaciente);
        tiempo1GenerarGraficaSupervivenciaPaciente = 1;   /* 1.00 años. */
        tiempo3GenerarGraficaSupervivenciaPaciente = 3;   /* 3.00 años. */
        tiempo5GenerarGraficaSupervivenciaPaciente = 5;   /* 5.00 años. */
        tiempo7GenerarGraficaSupervivenciaPaciente = 7;   /* 7.00 años. */
        tiempo10GenerarGraficaSupervivenciaPaciente = 10; /* 10.00 años. */
        tiempoAnimacionEjeXGraficaSupervivenciaPaciente = 2500; /* 2500 milisegundos. */
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
        lineChartGenerarGraficaSupervivenciaPaciente.setMinimumWidth(numeroPixelesDisponiblesAncho);
        lineChartGenerarGraficaSupervivenciaPaciente.setMinimumHeight(numeroPixelesDisponiblesAlto);
        tableLayoutGenerarGraficaSupervivenciaPaciente.setMinimumWidth(numeroPixelesDisponiblesAncho);
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
        final String[] tiempoGenerarGraficaSupervivenciaPaciente = new String[] {
                "0 years", "1 year", "2 years", "3 years", "4 years", "5 years",
                "6 years", "7 years", "8 years", "9 years", "10 years", "11 years",
                "12 years" };
        ValueFormatter valueFormatterXAxis = new ValueFormatter() {
            @Override
            public String getAxisLabel(float value, AxisBase axis) {
                return tiempoGenerarGraficaSupervivenciaPaciente[(int) value];
            }
        };
        /*
         * Etiquetas a dibujar en el eje y.
         * Del 0.00 % al 99.99 % -> 10000 elementos.
         * Del 0.00 % al 104.99 % -> 10500 elementos.
         */
        String[] porcentajeGenerarGraficaSupervivenciaPaciente = new String[10500];
        int elemento = 0;
        for (int unidades = 0; unidades < 105; ++unidades) {
            /* Bucle 1: unidades del 0 % al 100 %. */
            for (int decimas = 0; decimas < 10; ++decimas) {
                /* Bucle 2: décimas del .0X % al .9X %. No modifica el valor de X. */
                for (int centesimas = 0; centesimas < 10; ++centesimas) {
                    /* Bucle 3: centésimas del .X0 % al .X9 %. No modifica el valor de X. */
                    /* Se autogeneran los valores del eje y. */
                    porcentajeGenerarGraficaSupervivenciaPaciente[elemento] =
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
                return porcentajeGenerarGraficaSupervivenciaPaciente[(int) value];
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
        XAxis xAxis = lineChartGenerarGraficaSupervivenciaPaciente.getXAxis();
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
        YAxis yAxisLeft = lineChartGenerarGraficaSupervivenciaPaciente.getAxisLeft();
        YAxis yAxisRight = lineChartGenerarGraficaSupervivenciaPaciente.getAxisRight();
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
        lineChartGenerarGraficaSupervivenciaPaciente.getDescription().setEnabled(false);
        lineChartGenerarGraficaSupervivenciaPaciente.getDescription().setText("Patient survival");
        lineChartGenerarGraficaSupervivenciaPaciente.getDescription().setTextSize(16f);
        lineChartGenerarGraficaSupervivenciaPaciente.setDrawGridBackground(false);
        lineChartGenerarGraficaSupervivenciaPaciente.setDrawBorders(true);
        lineChartGenerarGraficaSupervivenciaPaciente.setBorderColor(Color.BLACK);
        lineChartGenerarGraficaSupervivenciaPaciente.setBorderWidth(0.5f);
        lineChartGenerarGraficaSupervivenciaPaciente.setExtraOffsets(0f,24f,0f,24f);

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
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setEnabled(true);
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setDirection(Legend.LegendDirection.LEFT_TO_RIGHT);
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setTextSize(18f);
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setWordWrapEnabled(true);
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setMaxSizePercent(0.95f);
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setXEntrySpace(16f);
        lineChartGenerarGraficaSupervivenciaPaciente.getLegend().setYEntrySpace(8f);

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
        LineDataSet lineDataSetProbabilidadSupervivenciaPacienteReceptor1 = null;
        if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)) {
            /* Gráfica receptor 1. */
            List<Entry> listEjeYProbabilidadSupervivenciaPacienteReceptor1 = new ArrayList<>();
            Entry probabilidadSupervivenciaPacienteReceptor1Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor1Tiempo1));
            listEjeYProbabilidadSupervivenciaPacienteReceptor1.add(probabilidadSupervivenciaPacienteReceptor1Tiempo1);
            Entry probabilidadSupervivenciaPacienteReceptor1Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor1Tiempo3));
            listEjeYProbabilidadSupervivenciaPacienteReceptor1.add(probabilidadSupervivenciaPacienteReceptor1Tiempo3);
            Entry probabilidadSupervivenciaPacienteReceptor1Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor1Tiempo5));
            listEjeYProbabilidadSupervivenciaPacienteReceptor1.add(probabilidadSupervivenciaPacienteReceptor1Tiempo5);
            Entry probabilidadSupervivenciaPacienteReceptor1Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor1Tiempo7));
            listEjeYProbabilidadSupervivenciaPacienteReceptor1.add(probabilidadSupervivenciaPacienteReceptor1Tiempo7);
            Entry probabilidadSupervivenciaPacienteReceptor1Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor1Tiempo10));
            listEjeYProbabilidadSupervivenciaPacienteReceptor1.add(probabilidadSupervivenciaPacienteReceptor1Tiempo10);
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1 = new LineDataSet(listEjeYProbabilidadSupervivenciaPacienteReceptor1,
                    "Recipient 1");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.blue));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.blue));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor1.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 2. */
        LineDataSet lineDataSetProbabilidadSupervivenciaPacienteReceptor2 = null;
        if (!(stringCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)) {
            /* Gráfica receptor 2. */
            List<Entry> listEjeYProbabilidadSupervivenciaPacienteReceptor2 = new ArrayList<>();
            Entry probabilidadSupervivenciaPacienteReceptor2Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor2Tiempo1));
            listEjeYProbabilidadSupervivenciaPacienteReceptor2.add(probabilidadSupervivenciaPacienteReceptor2Tiempo1);
            Entry probabilidadSupervivenciaPacienteReceptor2Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor2Tiempo3));
            listEjeYProbabilidadSupervivenciaPacienteReceptor2.add(probabilidadSupervivenciaPacienteReceptor2Tiempo3);
            Entry probabilidadSupervivenciaPacienteReceptor2Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor2Tiempo5));
            listEjeYProbabilidadSupervivenciaPacienteReceptor2.add(probabilidadSupervivenciaPacienteReceptor2Tiempo5);
            Entry probabilidadSupervivenciaPacienteReceptor2Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor2Tiempo7));
            listEjeYProbabilidadSupervivenciaPacienteReceptor2.add(probabilidadSupervivenciaPacienteReceptor2Tiempo7);
            Entry probabilidadSupervivenciaPacienteReceptor2Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor2Tiempo10));
            listEjeYProbabilidadSupervivenciaPacienteReceptor2.add(probabilidadSupervivenciaPacienteReceptor2Tiempo10);
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2 = new LineDataSet(listEjeYProbabilidadSupervivenciaPacienteReceptor2,
                    "Recipient 2");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.green));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.green));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor2.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 3. */
        LineDataSet lineDataSetProbabilidadSupervivenciaPacienteReceptor3 = null;
        if (!(stringCalcularSupervivenciaPacienteReceptor3Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10 == null)) {
            /* Gráfica receptor 3. */
            List<Entry> listEjeYProbabilidadSupervivenciaPacienteReceptor3 = new ArrayList<>();
            Entry probabilidadSupervivenciaPacienteReceptor3Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor3Tiempo1));
            listEjeYProbabilidadSupervivenciaPacienteReceptor3.add(probabilidadSupervivenciaPacienteReceptor3Tiempo1);
            Entry probabilidadSupervivenciaPacienteReceptor3Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor3Tiempo3));
            listEjeYProbabilidadSupervivenciaPacienteReceptor3.add(probabilidadSupervivenciaPacienteReceptor3Tiempo3);
            Entry probabilidadSupervivenciaPacienteReceptor3Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor3Tiempo5));
            listEjeYProbabilidadSupervivenciaPacienteReceptor3.add(probabilidadSupervivenciaPacienteReceptor3Tiempo5);
            Entry probabilidadSupervivenciaPacienteReceptor3Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor3Tiempo7));
            listEjeYProbabilidadSupervivenciaPacienteReceptor3.add(probabilidadSupervivenciaPacienteReceptor3Tiempo7);
            Entry probabilidadSupervivenciaPacienteReceptor3Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor3Tiempo10));
            listEjeYProbabilidadSupervivenciaPacienteReceptor3.add(probabilidadSupervivenciaPacienteReceptor3Tiempo10);
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3 = new LineDataSet(listEjeYProbabilidadSupervivenciaPacienteReceptor3,
                    "Recipient 3");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.red));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.red));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor3.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 4. */
        LineDataSet lineDataSetProbabilidadSupervivenciaPacienteReceptor4 = null;
        if (!(stringCalcularSupervivenciaPacienteReceptor4Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10 == null)) {
            /* Gráfica receptor 4. */
            List<Entry> listEjeYProbabilidadSupervivenciaPacienteReceptor4 = new ArrayList<>();
            Entry probabilidadSupervivenciaPacienteReceptor4Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor4Tiempo1));
            listEjeYProbabilidadSupervivenciaPacienteReceptor4.add(probabilidadSupervivenciaPacienteReceptor4Tiempo1);
            Entry probabilidadSupervivenciaPacienteReceptor4Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor4Tiempo3));
            listEjeYProbabilidadSupervivenciaPacienteReceptor4.add(probabilidadSupervivenciaPacienteReceptor4Tiempo3);
            Entry probabilidadSupervivenciaPacienteReceptor4Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor4Tiempo5));
            listEjeYProbabilidadSupervivenciaPacienteReceptor4.add(probabilidadSupervivenciaPacienteReceptor4Tiempo5);
            Entry probabilidadSupervivenciaPacienteReceptor4Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor4Tiempo7));
            listEjeYProbabilidadSupervivenciaPacienteReceptor4.add(probabilidadSupervivenciaPacienteReceptor4Tiempo7);
            Entry probabilidadSupervivenciaPacienteReceptor4Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor4Tiempo10));
            listEjeYProbabilidadSupervivenciaPacienteReceptor4.add(probabilidadSupervivenciaPacienteReceptor4Tiempo10);
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4 = new LineDataSet(listEjeYProbabilidadSupervivenciaPacienteReceptor4,
                    "Recipient 4");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.orange));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.orange));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor4.setMode(LineDataSet.Mode.LINEAR);
        }
        /* Gráfica receptor 5. */
        LineDataSet lineDataSetProbabilidadSupervivenciaPacienteReceptor5 = null;
        if (!(stringCalcularSupervivenciaPacienteReceptor5Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo10 == null)) {
            /* Gráfica receptor 5. */
            List<Entry> listEjeYProbabilidadSupervivenciaPacienteReceptor5 = new ArrayList<>();
            Entry probabilidadSupervivenciaPacienteReceptor5Tiempo1 = new Entry(tiempo1GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor5Tiempo1));
            listEjeYProbabilidadSupervivenciaPacienteReceptor5.add(probabilidadSupervivenciaPacienteReceptor5Tiempo1);
            Entry probabilidadSupervivenciaPacienteReceptor5Tiempo3 = new Entry(tiempo3GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor5Tiempo3));
            listEjeYProbabilidadSupervivenciaPacienteReceptor5.add(probabilidadSupervivenciaPacienteReceptor5Tiempo3);
            Entry probabilidadSupervivenciaPacienteReceptor5Tiempo5 = new Entry(tiempo5GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor5Tiempo5));
            listEjeYProbabilidadSupervivenciaPacienteReceptor5.add(probabilidadSupervivenciaPacienteReceptor5Tiempo5);
            Entry probabilidadSupervivenciaPacienteReceptor5Tiempo7 = new Entry(tiempo7GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor5Tiempo7));
            listEjeYProbabilidadSupervivenciaPacienteReceptor5.add(probabilidadSupervivenciaPacienteReceptor5Tiempo7);
            Entry probabilidadSupervivenciaPacienteReceptor5Tiempo10 = new Entry(tiempo10GenerarGraficaSupervivenciaPaciente,
                    100*Float.parseFloat(stringCalcularSupervivenciaPacienteReceptor5Tiempo10));
            listEjeYProbabilidadSupervivenciaPacienteReceptor5.add(probabilidadSupervivenciaPacienteReceptor5Tiempo10);
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5 = new LineDataSet(listEjeYProbabilidadSupervivenciaPacienteReceptor5,
                    "Recipient 5");
            /* **** **** **** **** */
            /*
             * Propiedades para cada una de las gráficas - Color de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5.setColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.magenta));
            /*
             * Propiedades para cada una de las gráficas - Color de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5.setCircleColor(ContextCompat.getColor(getApplicationContext(),
                    R.color.magenta));
            /*
             * Propiedades para cada una de las gráficas - Grosor de la línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5.setLineWidth(4f);
            /*
             * Propiedades para cada una de las gráficas - Radio de los puntos de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5.setCircleRadius(8f);
            /*
             * Propiedades para cada una de las gráficas - Tamaño del texto sobre los puntos de la gráfica.
             * Deshabilitado el texto sobre los puntos de la gráfica.
             * La probabilidad estará indicada debajo de la gráfica, cuyo texto será del mismo color
             * que la correspondiente curva.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5.setValueTextSize(0f);
            /*
             * Propiedades para cada una de las gráficas - Modo de dibujar las línea de la gráfica.
             */
            lineDataSetProbabilidadSupervivenciaPacienteReceptor5.setMode(LineDataSet.Mode.LINEAR);
        }
        
        /*
         * LineData (objeto de datos), encapsula todos los datos asociados
         * con un LineChart (gráfica en la que se dibujan las curvas o líneas).
         *
         * Se representan aquellas curvas para las que se hayan recibidos datos
         * por parte del servicio REST.
         */
        LineData lineDataGenerarGraficaSupervivenciaPaciente = null;
        if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo10.equals("0.0"))) {
                lineDataGenerarGraficaSupervivenciaPaciente = new LineData(lineDataSetProbabilidadSupervivenciaPacienteReceptor1,
                        lineDataSetProbabilidadSupervivenciaPacienteReceptor2,
                        lineDataSetProbabilidadSupervivenciaPacienteReceptor3,
                        lineDataSetProbabilidadSupervivenciaPacienteReceptor4,
                        lineDataSetProbabilidadSupervivenciaPacienteReceptor5);

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
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Icono.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Icono.setVisibility(View.VISIBLE);
                /* Vistas de texto de los textos de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Texto.setVisibility(View.VISIBLE);
                /* Vistas de texto de los tiempos de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Texto.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Texto.setVisibility(View.VISIBLE);
                /* Vistas de texto de las probabilidades de los Receptores 2, 3, 4 y 5. */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Probabilidad.setVisibility(View.VISIBLE);
            }
        }
        else {
            if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo1 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo1 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7 == null)
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10 == null)) {
                if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo1.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7.equals("0.0"))
                        && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10.equals("0.0"))) {
                    lineDataGenerarGraficaSupervivenciaPaciente = new LineData(lineDataSetProbabilidadSupervivenciaPacienteReceptor1,
                            lineDataSetProbabilidadSupervivenciaPacienteReceptor2,
                            lineDataSetProbabilidadSupervivenciaPacienteReceptor3,
                            lineDataSetProbabilidadSupervivenciaPacienteReceptor4);

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
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Icono.setVisibility(View.VISIBLE);
                    /* Vistas de texto de los textos de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Texto.setVisibility(View.VISIBLE);
                    /* Vistas de texto de los tiempos de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Texto.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Texto.setVisibility(View.VISIBLE);
                    /* Vistas de texto de las probabilidades de los Receptores 2, 3 y 4. */
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                    textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                }
            }
            else {
                if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo1 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7 == null)
                        && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10 == null)) {
                    if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo1.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7.equals("0.0"))
                            && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10.equals("0.0"))) {
                        lineDataGenerarGraficaSupervivenciaPaciente = new LineData(lineDataSetProbabilidadSupervivenciaPacienteReceptor1,
                                lineDataSetProbabilidadSupervivenciaPacienteReceptor2,
                                lineDataSetProbabilidadSupervivenciaPacienteReceptor3);

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
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono.setVisibility(View.VISIBLE);
                        /* Vistas de texto de los textos de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto.setVisibility(View.VISIBLE);
                        /* Vistas de texto de los tiempos de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto.setVisibility(View.VISIBLE);
                        /* Vistas de texto de las probabilidades de los Receptores 2 y 3. */
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                        textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                    }
                }
                else {
                    if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                            && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)) {
                        if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo1.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7.equals("0.0"))
                                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10.equals("0.0"))) {
                            lineDataGenerarGraficaSupervivenciaPaciente = new LineData(lineDataSetProbabilidadSupervivenciaPacienteReceptor1,
                                    lineDataSetProbabilidadSupervivenciaPacienteReceptor2);

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
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono.setVisibility(View.VISIBLE);
                            /* Vistas de texto de los textos del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto.setVisibility(View.VISIBLE);
                            /* Vistas de texto de los tiempos del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto.setVisibility(View.VISIBLE);
                            /* Vistas de texto de las probabilidades del Receptor 2. */
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setVisibility(View.VISIBLE);
                            textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setVisibility(View.VISIBLE);
                        }
                    }
                    else {
                        if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)) {
                            if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.equals("0.0"))
                                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.equals("0.0"))
                                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.equals("0.0"))
                                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.equals("0.0"))
                                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.equals("0.0"))) {
                                lineDataGenerarGraficaSupervivenciaPaciente = new LineData(lineDataSetProbabilidadSupervivenciaPacienteReceptor1);
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
        lineChartGenerarGraficaSupervivenciaPaciente.setData(lineDataGenerarGraficaSupervivenciaPaciente);
        lineChartGenerarGraficaSupervivenciaPaciente.invalidate();

        /* Tabla Receptor 1 */
        if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.blue));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo1Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor1Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo3Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor1Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo5Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor1Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo7Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor1Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor1Tiempo10Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor1Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 2 */
        if (!(stringCalcularSupervivenciaPacienteReceptor2Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaPacienteReceptor2Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor2Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.green));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo1Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor2Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo3Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor2Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo5Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor2Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo7Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor2Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor2Tiempo10Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor2Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 3 */
        if (!(stringCalcularSupervivenciaPacienteReceptor3Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaPacienteReceptor3Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor3Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.red));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo1Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor3Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo3Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor3Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo5Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor3Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo7Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor3Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor3Tiempo10Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor3Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 4 */
        if (!(stringCalcularSupervivenciaPacienteReceptor4Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaPacienteReceptor4Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor4Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.orange));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo1Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor4Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo3Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor4Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo5Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor4Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo7Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor4Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor4Tiempo10Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor4Tiempo10.concat(" %"));
            }
        }
        /* Tabla Receptor 5 */
        if (!(stringCalcularSupervivenciaPacienteReceptor5Tiempo1 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo3 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo5 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo7 == null)
                && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo10 == null)) {
            if (!(stringCalcularSupervivenciaPacienteReceptor5Tiempo1.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo3.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo5.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo7.equals("0.0"))
                    && !(stringCalcularSupervivenciaPacienteReceptor5Tiempo10.equals("0.0"))) {
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los iconos de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Icono.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los textos (Receptor 1, 2, 3, 4 y 5) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de los tiempos (1, 3, 5, 7 y 10 años) de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Texto.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Color del texto de las filas.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Probabilidad.setTextColor(ContextCompat.getColor(getApplicationContext(),
                        R.color.magenta));
                /*
                 * Propiedades de cada una de las filas de la tabla - Datos recibidos del servivio REST.
                 * Vistas de texto de las probabilidades de los Receptores.
                 */
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo1Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor5Tiempo1.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo3Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor5Tiempo3.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo5Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor5Tiempo5.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo7Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor5Tiempo7.concat(" %"));
                textViewGenerarGraficaSupervivenciaPacienteReceptor5Tiempo10Probabilidad.setText(stringCalcularSupervivenciaPacienteReceptor5Tiempo10.concat(" %"));
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
        lineChartGenerarGraficaSupervivenciaPaciente.animateX(tiempoAnimacionEjeXGraficaSupervivenciaPaciente);

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