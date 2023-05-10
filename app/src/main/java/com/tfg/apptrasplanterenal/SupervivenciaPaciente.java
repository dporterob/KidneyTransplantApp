package com.tfg.apptrasplanterenal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Clase: SupervivenciaPaciente.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class SupervivenciaPaciente extends AppCompatActivity {
    /* Botones flotantes. */
    ExtendedFloatingActionButton opcionesSupervivenciaPaciente;
    FloatingActionButton botonFlotanteCalcularSupervivenciaPaciente;
    FloatingActionButton botonFlotanteNuevoReceptorSupervivenciaPaciente;
    FloatingActionButton botonFlotanteBorrarSupervivenciaPaciente;
    TextView textViewCalcularSupervivenciaPaciente;
    TextView textViewNuevoReceptorSupervivenciaPaciente;
    TextView textViewBorrarSupervivenciaPaciente;
    Boolean opcionesDesplegadasSupervivenciaPaciente;
    Boolean vistasAtenuadasSupervivenciaPaciente;
    /* Animaciones de los botones flotantes. */
    Animation animAtenuarVistaSupervivenciaPaciente;
    Animation animAumentarVistaSupervivenciaPaciente;
    Animation animGirarOpcionesAlAbrirSupervivenciaPaciente;
    Animation animGirarOpcionesAlCerrarSupervivenciaPaciente;
    Animation animMostrarOpcionesAlAbrirSupervivenciaPaciente;
    Animation animOcultarOpcionesAlCerrarSupervivenciaPaciente;
    /* Vista de texto del titular del layout. */
    TextView textViewModeloSupervivenciaPaciente;
    /* Vistas de texto del Donante. */
    TextView textViewDatosDonanteSupervivenciaPaciente;
    TextView textViewEdadDonanteSupervivenciaPaciente;
    /* Vistas de texto de los Receptores. */
    TextView textViewDatosReceptorSupervivenciaPaciente;
    TextView textViewEdadReceptor4059SupervivenciaPaciente;
    TextView textViewEdadReceptor60SupervivenciaPaciente;
    TextView textViewSexoHombreReceptorSupervivenciaPaciente;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente;
    TextView textViewTiempoDialisisReceptorSupervivenciaPaciente;
    TextView textViewDatosReceptorSupervivenciaPaciente_Receptor2;
    TextView textViewEdadReceptor4059SupervivenciaPaciente_Receptor2;
    TextView textViewEdadReceptor60SupervivenciaPaciente_Receptor2;
    TextView textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2;
    TextView textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2;
    TextView textViewDatosReceptorSupervivenciaPaciente_Receptor3;
    TextView textViewEdadReceptor4059SupervivenciaPaciente_Receptor3;
    TextView textViewEdadReceptor60SupervivenciaPaciente_Receptor3;
    TextView textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3;
    TextView textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3;
    TextView textViewDatosReceptorSupervivenciaPaciente_Receptor4;
    TextView textViewEdadReceptor4059SupervivenciaPaciente_Receptor4;
    TextView textViewEdadReceptor60SupervivenciaPaciente_Receptor4;
    TextView textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4;
    TextView textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4;
    TextView textViewDatosReceptorSupervivenciaPaciente_Receptor5;
    TextView textViewEdadReceptor4059SupervivenciaPaciente_Receptor5;
    TextView textViewEdadReceptor60SupervivenciaPaciente_Receptor5;
    TextView textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5;
    TextView textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5;
    TextView textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5;
    /* Listas desplegables del Donante. */
    TextInputLayout spinnerEdadDonanteSupervivenciaPaciente;
    /* Listas desplegables de los Receptores. */
    // AutoCompleteTextView, están declaradas en las próximas líneas.
    TextInputLayout textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente;
    TextInputLayout textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2;
    TextInputLayout textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3;
    TextInputLayout textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4;
    TextInputLayout textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5;
    /* Switches de los Receptores. */
    // SwitchCompat, están declarados en las próximas líneas.
    /* Listas desplegables - Donante. */
    String[] opcionesEdadDonanteSupervivenciaPaciente; /* Del 2 al 100 (99 elementos) */
    /* Listas desplegables - Donante. */
    AutoCompleteTextView autoCompleteTextViewEdadDonanteSupervivenciaPaciente;
    ArrayAdapter<String> adaptadorOpcionesEdadDonanteSupervivenciaPaciente;
    /* Campos de texto - Receptor 1. */
    EditText editTextTiempoDialisisReceptorSupervivenciaPaciente;
    /* Campos de texto - Receptor 2. */
    EditText editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2;
    /* Campos de texto - Receptor 3. */
    EditText editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3;
    /* Campos de texto - Receptor 4. */
    EditText editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4;
    /* Campos de texto - Receptor 5. */
    EditText editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5;
    /* Switches - Receptor 1. */
    SwitchCompat switchCompatEdadReceptor4059SupervivenciaPaciente;
    SwitchCompat switchCompatEdadReceptor60SupervivenciaPaciente;
    SwitchCompat switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente;
    SwitchCompat switchCompatSexoHombreReceptorSupervivenciaPaciente;
    /* Estado ("Yes"/"No") de los switches - Receptor 1. */
    String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente;
    String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente;
    String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente;
    String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente;
    /* Switches - Receptor 2. */
    SwitchCompat switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2;
    SwitchCompat switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2;
    SwitchCompat switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2;
    SwitchCompat switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2;
    /* Estado ("Yes"/"No") de los switches - Receptor 2. */
    String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2;
    String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2;
    String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2;
    String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2;
    /* Switches - Receptor 3. */
    SwitchCompat switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3;
    SwitchCompat switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3;
    SwitchCompat switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3;
    SwitchCompat switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3;
    /* Estado ("Yes"/"No") de los switches - Receptor 3. */
    String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3;
    String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3;
    String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3;
    String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3;
    /* Switches - Receptor 4. */
    SwitchCompat switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4;
    SwitchCompat switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4;
    SwitchCompat switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4;
    SwitchCompat switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4;
    /* Estado ("Yes"/"No") de los switches - Receptor 4. */
    String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4;
    String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4;
    String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4;
    String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4;
    /* Switches - Receptor 5. */
    SwitchCompat switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5;
    SwitchCompat switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5;
    SwitchCompat switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5;
    SwitchCompat switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5;
    /* Estado ("Yes"/"No") de los switches - Receptor 5. */
    String estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5;
    String estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5;
    String estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5;
    String estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5;

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
        setContentView(R.layout.activity_supervivencia_paciente);

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
        ScrollView scrollViewModeloSupervivenciaPaciente = findViewById(R.id.scrollViewModeloSupervivenciaPaciente);

        /*
         * Botones flotantes.
         */
        opcionesSupervivenciaPaciente = findViewById(R.id.botonOpcionesSupervivenciaPaciente);
        botonFlotanteCalcularSupervivenciaPaciente = findViewById(R.id.botonCalcularSupervivenciaPaciente);
        botonFlotanteNuevoReceptorSupervivenciaPaciente = findViewById(R.id.botonNuevoReceptorSupervivenciaPaciente);
        botonFlotanteBorrarSupervivenciaPaciente = findViewById(R.id.botonBorrarSupervivenciaPaciente);
        textViewCalcularSupervivenciaPaciente = findViewById(R.id.textViewCalcularSupervivenciaPaciente);
        textViewNuevoReceptorSupervivenciaPaciente = findViewById(R.id.textViewNuevoReceptorSupervivenciaPaciente);
        textViewBorrarSupervivenciaPaciente = findViewById(R.id.textViewBorrarSupervivenciaPaciente);

        /*
         * Animaciones.
         */
        animAtenuarVistaSupervivenciaPaciente = AnimationUtils.loadAnimation(SupervivenciaPaciente.this, R.anim.anim_atenuar_vista);
        animAumentarVistaSupervivenciaPaciente = AnimationUtils.loadAnimation(SupervivenciaPaciente.this, R.anim.anim_aumentar_vista);
        animMostrarOpcionesAlAbrirSupervivenciaPaciente = AnimationUtils.loadAnimation(SupervivenciaPaciente.this, R.anim.anim_mostrar_opciones_abrir);
        animOcultarOpcionesAlCerrarSupervivenciaPaciente = AnimationUtils.loadAnimation(SupervivenciaPaciente.this, R.anim.anim_ocultar_opciones_cerrar);
        animGirarOpcionesAlAbrirSupervivenciaPaciente = AnimationUtils.loadAnimation(SupervivenciaPaciente.this, R.anim.anim_girar_opciones_abrir);
        animGirarOpcionesAlCerrarSupervivenciaPaciente = AnimationUtils.loadAnimation(SupervivenciaPaciente.this, R.anim.anim_girar_opciones_cerrar);

        /* Opciones menú flotante: 'gone' en un inicio. */
        botonFlotanteCalcularSupervivenciaPaciente.setVisibility(View.GONE);
        botonFlotanteNuevoReceptorSupervivenciaPaciente.setVisibility(View.GONE);
        botonFlotanteBorrarSupervivenciaPaciente.setVisibility(View.GONE);
        textViewCalcularSupervivenciaPaciente.setVisibility(View.GONE);
        textViewNuevoReceptorSupervivenciaPaciente.setVisibility(View.GONE);
        textViewBorrarSupervivenciaPaciente.setVisibility(View.GONE);

        /* Estado del menú: desplegado / no desplegado. */
        opcionesDesplegadasSupervivenciaPaciente = false;
        /* Estado de las vistas del formulario: atenuadas / no atenuadas. */
        vistasAtenuadasSupervivenciaPaciente = false;
        /* .setClickable(true) es la opción por defecto para cualquier botón */
        opcionesSupervivenciaPaciente.setClickable(true);

        /* Vista de texto del titular del layout. */
        textViewModeloSupervivenciaPaciente = findViewById(R.id.textViewModeloSupervivenciaPaciente);
        /* Vistas de texto del Donante. */
        textViewDatosDonanteSupervivenciaPaciente = findViewById(R.id.textViewDatosDonanteSupervivenciaPaciente);
        textViewEdadDonanteSupervivenciaPaciente = findViewById(R.id.textViewEdadDonanteSupervivenciaPaciente);
        /* Vistas de texto de los Receptores. */
        textViewDatosReceptorSupervivenciaPaciente = findViewById(R.id.textViewDatosReceptorSupervivenciaPaciente);
        textViewEdadReceptor4059SupervivenciaPaciente = findViewById(R.id.textViewEdadReceptor4059SupervivenciaPaciente);
        textViewEdadReceptor60SupervivenciaPaciente = findViewById(R.id.textViewEdadReceptor60SupervivenciaPaciente);
        textViewSexoHombreReceptorSupervivenciaPaciente = findViewById(R.id.textViewSexoHombreReceptorSupervivenciaPaciente);
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente);
        textViewTiempoDialisisReceptorSupervivenciaPaciente = findViewById(R.id.textViewTiempoDialisisReceptorSupervivenciaPaciente);
        textViewDatosReceptorSupervivenciaPaciente_Receptor2 = findViewById(R.id.textViewDatosReceptorSupervivenciaPaciente_Receptor2);
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor2 = findViewById(R.id.textViewEdadReceptor4059SupervivenciaPaciente_Receptor2);
        textViewEdadReceptor60SupervivenciaPaciente_Receptor2 = findViewById(R.id.textViewEdadReceptor60SupervivenciaPaciente_Receptor2);
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2 = findViewById(R.id.textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2);
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2);
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 = findViewById(R.id.textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2);
        textViewDatosReceptorSupervivenciaPaciente_Receptor3 = findViewById(R.id.textViewDatosReceptorSupervivenciaPaciente_Receptor3);
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor3 = findViewById(R.id.textViewEdadReceptor4059SupervivenciaPaciente_Receptor3);
        textViewEdadReceptor60SupervivenciaPaciente_Receptor3 = findViewById(R.id.textViewEdadReceptor60SupervivenciaPaciente_Receptor3);
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3 = findViewById(R.id.textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3);
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3);
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 = findViewById(R.id.textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3);
        textViewDatosReceptorSupervivenciaPaciente_Receptor4 = findViewById(R.id.textViewDatosReceptorSupervivenciaPaciente_Receptor4);
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor4 = findViewById(R.id.textViewEdadReceptor4059SupervivenciaPaciente_Receptor4);
        textViewEdadReceptor60SupervivenciaPaciente_Receptor4 = findViewById(R.id.textViewEdadReceptor60SupervivenciaPaciente_Receptor4);
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4 = findViewById(R.id.textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4);
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4);
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 = findViewById(R.id.textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4);
        textViewDatosReceptorSupervivenciaPaciente_Receptor5 = findViewById(R.id.textViewDatosReceptorSupervivenciaPaciente_Receptor5);
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor5 = findViewById(R.id.textViewEdadReceptor4059SupervivenciaPaciente_Receptor5);
        textViewEdadReceptor60SupervivenciaPaciente_Receptor5 = findViewById(R.id.textViewEdadReceptor60SupervivenciaPaciente_Receptor5);
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5 = findViewById(R.id.textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5);
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 = findViewById(R.id.textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5);
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 = findViewById(R.id.textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5);
        /* Listas desplegables del Donante. */
        spinnerEdadDonanteSupervivenciaPaciente = findViewById(R.id.spinnerEdadDonanteSupervivenciaPaciente);
        /* Listas desplegables de los Receptores. */
        // AutoCompleteTextView, findViewById en las próximas líneas.
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente = findViewById(R.id.textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 = findViewById(R.id.textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 = findViewById(R.id.textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 = findViewById(R.id.textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 = findViewById(R.id.textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5);
        /* Switches de los Receptores. */
        // SwitchCompat, findViewById en las próximas líneas.

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
        spinnerEdadDonanteSupervivenciaPaciente.setMinWidth(numeroPixelesDisponibles);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.setMinWidth(numeroPixelesDisponibles);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setMinWidth(numeroPixelesDisponibles);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setMinWidth(numeroPixelesDisponibles);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setMinWidth(numeroPixelesDisponibles);
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setMinWidth(numeroPixelesDisponibles);
        /* *********************************** */

        /*
         * Listas desplegables - Donante.
         */
        opcionesEdadDonanteSupervivenciaPaciente = new String[99]; /* Del 2 al 100 (99 elementos). */
        for (int i = 0; i < opcionesEdadDonanteSupervivenciaPaciente.length; ++i) {
            /* Se autogeneran los valores */
            /* El primer elemento debe ser 2 -> i + 2 */
            opcionesEdadDonanteSupervivenciaPaciente[i] = String.valueOf(i+2);
        }
        autoCompleteTextViewEdadDonanteSupervivenciaPaciente = findViewById(R.id.autoCompleteTextViewSpinnerEdadDonanteSupervivenciaPaciente);
        adaptadorOpcionesEdadDonanteSupervivenciaPaciente = new ArrayAdapter<>(SupervivenciaPaciente.this, R.layout.list_opciones, opcionesEdadDonanteSupervivenciaPaciente);
        autoCompleteTextViewEdadDonanteSupervivenciaPaciente.setAdapter(adaptadorOpcionesEdadDonanteSupervivenciaPaciente);
        autoCompleteTextViewEdadDonanteSupervivenciaPaciente.setOnItemClickListener((adapterView, view, i, l) -> {
            /*
            * Deshabilita el mensaje de error si estuviese habilitado,
            * al pulsar sobre uno de los valores válidos de la lista
            * deslizable.
            */
            spinnerEdadDonanteSupervivenciaPaciente.setErrorEnabled(false);
        });
        /*
         * EditText - Receptor 1.
         */
        int integerMaximoTiempoDialisisReceptorSupervivenciaPaciente = 8000;
        editTextTiempoDialisisReceptorSupervivenciaPaciente = findViewById(R.id.editTextTiempoDialisisReceptorSupervivenciaPaciente);
        editTextTiempoDialisisReceptorSupervivenciaPaciente.setOnEditorActionListener((textView, actionId, keyEvent) -> {
            if ((keyEvent != null
                    && (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER))
                    || (actionId == EditorInfo.IME_ACTION_DONE)) {
                if(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente.getText().toString())
                        > integerMaximoTiempoDialisisReceptorSupervivenciaPaciente) {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.setErrorEnabled(true);
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.setError("Maximum 8000 days");
                }
                else {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.setErrorEnabled(false);
                }
            }
            return false;
        });
        /*
         * EditText - Receptor 2.
         */
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2 = findViewById(R.id.editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2);
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setOnEditorActionListener((textView, actionId, keyEvent) -> {
            if ((keyEvent != null
                    && (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER))
                    || (actionId == EditorInfo.IME_ACTION_DONE)) {
                if(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getText().toString()) > integerMaximoTiempoDialisisReceptorSupervivenciaPaciente) {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setErrorEnabled(true);
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setError("Maximum 8000 days");
                }
                else {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setErrorEnabled(false);
                }
            }
            return false;
        });
        /*
         * EditText - Receptor 3.
         */
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3 = findViewById(R.id.editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3);
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setOnEditorActionListener((textView, actionId, keyEvent) -> {
            if ((keyEvent != null
                    && (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER))
                    || (actionId == EditorInfo.IME_ACTION_DONE)) {
                if(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getText().toString()) > integerMaximoTiempoDialisisReceptorSupervivenciaPaciente) {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setErrorEnabled(true);
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setError("Maximum 8000 days");
                }
                else {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setErrorEnabled(false);
                }
            }
            return false;
        });
        /*
         * EditText - Receptor 4.
         */
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4 = findViewById(R.id.editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4);
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setOnEditorActionListener((textView, actionId, keyEvent) -> {
            if ((keyEvent != null
                    && (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER))
                    || (actionId == EditorInfo.IME_ACTION_DONE)) {
                if(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getText().toString()) > integerMaximoTiempoDialisisReceptorSupervivenciaPaciente) {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setErrorEnabled(true);
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setError("Maximum 8000 days");
                }
                else {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setErrorEnabled(false);
                }
            }
            return false;
        });
        /*
         * EditText - Receptor 5.
         */
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5 = findViewById(R.id.editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5);
        editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setOnEditorActionListener((textView, actionId, keyEvent) -> {
            if ((keyEvent != null
                    && (keyEvent.getKeyCode() == KeyEvent.KEYCODE_ENTER))
                    || (actionId == EditorInfo.IME_ACTION_DONE)) {
                if(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getText().toString()) > integerMaximoTiempoDialisisReceptorSupervivenciaPaciente) {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setErrorEnabled(true);
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setError("Maximum 8000 days");
                }
                else {
                    textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setErrorEnabled(false);
                }
            }
            return false;
        });

        /*
         * Switches - Receptor 1.
         */
        switchCompatEdadReceptor4059SupervivenciaPaciente = findViewById(R.id.switchEdadReceptor4059SupervivenciaPaciente);
        switchCompatEdadReceptor60SupervivenciaPaciente = findViewById(R.id.switchEdadReceptor60SupervivenciaPaciente);
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente = findViewById(R.id.switchDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente);
        switchCompatSexoHombreReceptorSupervivenciaPaciente = findViewById(R.id.switchSexoHombreReceptorSupervivenciaPaciente);
        estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente = "No"; /* Estado por defecto. */
        estadoSwitchCompatEdadReceptor60SupervivenciaPaciente = "No"; /* Estado por defecto. */
        estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente = "No"; /* Estado por defecto. */
        estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente = "No"; /* Estado por defecto. */
        switchCompatEdadReceptor4059SupervivenciaPaciente.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor60SupervivenciaPaciente -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor60SupervivenciaPaciente.setChecked(false);
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente -> "No".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente = "No";
            }
        });
        switchCompatEdadReceptor60SupervivenciaPaciente.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor60SupervivenciaPaciente -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor4059SupervivenciaPaciente.setChecked(false);
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente -> "No".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente = "No";
            }
        });
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente -> "Yes".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente = "Yes";
            }
            else {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente -> "No".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente = "No";
            }
        });
        switchCompatSexoHombreReceptorSupervivenciaPaciente.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente -> "Yes".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente = "Yes";
            }
            else {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente -> "No".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente = "No";
            }
        });
        /*
         * Switches - Receptor 2.
         */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 = (SwitchCompat) findViewById(R.id.switchEdadReceptor4059SupervivenciaPaciente_Receptor2);
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 = (SwitchCompat) findViewById(R.id.switchEdadReceptor60SupervivenciaPaciente_Receptor2);
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 = (SwitchCompat) findViewById(R.id.switchDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2);
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 = (SwitchCompat) findViewById(R.id.switchSexoHombreReceptorSupervivenciaPaciente_Receptor2);
        estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 = "No"; /* Estado por defecto. */
        estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 = "No"; /* Estado por defecto. */
        estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 = "No"; /* Estado por defecto. */
        estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 = "No"; /* Estado por defecto. */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setChecked(false);
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 -> "No".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 = "No";
            }
        });
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setChecked(false);
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 -> "No".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2 = "No";
            }
        });
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 -> "Yes".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 = "Yes";
            }
            else {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 -> "No".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2 = "No";
            }
        });
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 -> "Yes".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 = "Yes";
            }
            else {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 -> "No".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2 = "No";
            }
        });
        /*
         * Switches - Receptor 3.
         */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 = (SwitchCompat) findViewById(R.id.switchEdadReceptor4059SupervivenciaPaciente_Receptor3);
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 = (SwitchCompat) findViewById(R.id.switchEdadReceptor60SupervivenciaPaciente_Receptor3);
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 = (SwitchCompat) findViewById(R.id.switchDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3);
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 = (SwitchCompat) findViewById(R.id.switchSexoHombreReceptorSupervivenciaPaciente_Receptor3);
        estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 = "No"; /* Estado por defecto. */
        estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 = "No"; /* Estado por defecto. */
        estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 = "No"; /* Estado por defecto. */
        estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 = "No"; /* Estado por defecto. */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setChecked(false);
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 -> "No".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 = "No";
            }
        });
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setChecked(false);
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 -> "No".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3 = "No";
            }
        });
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 -> "Yes".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 = "Yes";
            }
            else {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 -> "No".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3 = "No";
            }
        });
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 -> "Yes".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 = "Yes";
            }
            else {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 -> "No".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3 = "No";
            }
        });
        /*
         * Switches - Receptor 4.
         */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 = (SwitchCompat) findViewById(R.id.switchEdadReceptor4059SupervivenciaPaciente_Receptor4);
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 = (SwitchCompat) findViewById(R.id.switchEdadReceptor60SupervivenciaPaciente_Receptor4);
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 = (SwitchCompat) findViewById(R.id.switchDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4);
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 = (SwitchCompat) findViewById(R.id.switchSexoHombreReceptorSupervivenciaPaciente_Receptor4);
        estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 = "No"; /* Estado por defecto. */
        estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 = "No"; /* Estado por defecto. */
        estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 = "No"; /* Estado por defecto. */
        estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 = "No"; /* Estado por defecto. */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setChecked(false);
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 -> "No".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 = "No";
            }
        });
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setChecked(false);
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 -> "No".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4 = "No";
            }
        });
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 -> "Yes".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 = "Yes";
            }
            else {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 -> "No".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4 = "No";
            }
        });
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 -> "Yes".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 = "Yes";
            }
            else {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 -> "No".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4 = "No";
            }
        });
        /*
         * Switches - Receptor 5.
         */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 = (SwitchCompat) findViewById(R.id.switchEdadReceptor4059SupervivenciaPaciente_Receptor5);
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 = (SwitchCompat) findViewById(R.id.switchEdadReceptor60SupervivenciaPaciente_Receptor5);
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 = (SwitchCompat) findViewById(R.id.switchDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5);
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 = (SwitchCompat) findViewById(R.id.switchSexoHombreReceptorSupervivenciaPaciente_Receptor5);
        estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 = "No"; /* Estado por defecto. */
        estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 = "No"; /* Estado por defecto. */
        estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 = "No"; /* Estado por defecto. */
        estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 = "No"; /* Estado por defecto. */
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setChecked(false);
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 -> "No".
                 */
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 = "No";
            }
        });
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 -> "Yes".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 = "Yes";
                /*
                 * Si:
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 -> "Yes"
                 * entonces:
                 * switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 -> "No"
                 *
                 * Son opciones mututamente excluyentes, esto es, no pueden
                 * estar simultáneamente a "Yes".
                 */
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setChecked(false);
                estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5 = "No";
            }
            else {
                /*
                 * switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 -> "No".
                 */
                estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5 = "No";
            }
        });
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 -> "Yes".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 = "Yes";
            }
            else {
                /*
                 * switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 -> "No".
                 */
                estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5 = "No";
            }
        });
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.setOnCheckedChangeListener((compoundButton, b) -> {
            if (compoundButton.isChecked()) {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 -> "Yes".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 = "Yes";
            }
            else {
                /*
                 * switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 -> "No".
                 */
                estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5 = "No";
            }
        });

        opcionesSupervivenciaPaciente.setOnClickListener(view -> {
                    /* Atenúa / aumenta las vistas del formulario. */
                    animacionAtenuarVistas();
                    /*
                     * Despliega el menu de opciones al pulsar "+"
                     * y oculta el menu de opciones al pulsar "x".
                     */
                    animacionMenuOpciones();
        });
        botonFlotanteCalcularSupervivenciaPaciente.setOnClickListener(view -> {
            /*
             * Actividad CalcularSupervivenciaPaciente.
             */
            /* Aumenta las vistas del formulario. */
            animacionAtenuarVistas();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionAtenuarVistas();
            /* Oculta el menú de opciones al pulsar sobre uno de los botones flotantes */
            animacionMenuOpciones();
            /* Limpia (anula) la animación de las vistas del formulario. */
            limpiarAnimacionMenuOpciones();

            Intent intent = new Intent(getApplicationContext(), CalcularSupervivenciaPaciente.class);
            /* Datos del donante. */
            if (!autoCompleteTextViewEdadDonanteSupervivenciaPaciente.getText().toString().equals("")) {
                intent.putExtra("autoCompleteTextViewEdadDonanteSupervivenciaPaciente", autoCompleteTextViewEdadDonanteSupervivenciaPaciente.getText().toString());
            }
            else {
                spinnerEdadDonanteSupervivenciaPaciente.setErrorEnabled(true);
                spinnerEdadDonanteSupervivenciaPaciente.setError("Required");
            }
            /* Datos del receptor 1. */
            if (!estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente", estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente);
            }
            if (!estadoSwitchCompatEdadReceptor60SupervivenciaPaciente.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente", estadoSwitchCompatEdadReceptor60SupervivenciaPaciente);
            }
            if (!estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente.equals("")) {
                intent.putExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente", estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente);
            }
            if (!estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.equals("")) {
                intent.putExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente", estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente);
            }
            if (!editTextTiempoDialisisReceptorSupervivenciaPaciente.getText().toString().equals("")) {
                intent.putExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente", editTextTiempoDialisisReceptorSupervivenciaPaciente.getText().toString());
            }
            else {
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.setErrorEnabled(true);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.setError("Required");
            }
            /* Datos del receptor 2. */
            if (!estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2", estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2);
            }
            if (!estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2", estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor2);
            }
            if (!estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.equals("")) {
                intent.putExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2", estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2);
            }
            if (!estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.equals("")) {
                intent.putExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2", estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2);
            }
            if (!editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getText().toString().equals("")) {
                intent.putExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2", editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getText().toString());
            }
            else {
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setErrorEnabled(true);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setError("Required");
            }
            /* Datos del receptor 3. */
            if (!estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3", estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3);
            }
            if (!estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3", estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor3);
            }
            if (!estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.equals("")) {
                intent.putExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3", estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3);
            }
            if (!estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.equals("")) {
                intent.putExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3", estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3);
            }
            if (!editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getText().toString().equals("")) {
                intent.putExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3", editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getText().toString());
            }
            else {
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setErrorEnabled(true);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setError("Required");
            }
            /* Datos del receptor 4. */
            if (!estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4", estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4);
            }
            if (!estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4", estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor4);
            }
            if (!estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.equals("")) {
                intent.putExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4", estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4);
            }
            if (!estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.equals("")) {
                intent.putExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4", estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4);
            }
            if (!editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getText().toString().equals("")) {
                intent.putExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4", editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getText().toString());
            }
            else {
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setErrorEnabled(true);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setError("Required");
            }
            /* Datos del receptor 5. */
            if (!estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5", estadoSwitchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5);
            }
            if (!estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.equals("")) {
                intent.putExtra("estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5", estadoSwitchCompatEdadReceptor60SupervivenciaPaciente_Receptor5);
            }
            if (!estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.equals("")) {
                intent.putExtra("estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5", estadoSwitchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5);
            }
            if (!estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.equals("")) {
                intent.putExtra("estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5", estadoSwitchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5);
            }
            if (!editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getText().toString().equals("")) {
                intent.putExtra("editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5", editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getText().toString());
            }
            else {
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setErrorEnabled(true);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setError("Required");
            }

            /*
             * Se comprueba que los campos del formulario
             * marcados como "Obligatorio" se hayan cumplimentado.
             */
            if (!(autoCompleteTextViewEdadDonanteSupervivenciaPaciente.getText().toString().equals(""))
                    /* Campos del formulario del receptor 1. Estado 'visible' por defecto. */
                    && !(editTextTiempoDialisisReceptorSupervivenciaPaciente.getText().toString().equals(""))
                    /* Campos del formulario del receptor 2. Estado 'gone' por defecto. */
                    /* Sentencia igual a 1 si: Gone Y NoCumplimentado. */
                    /* Sentencia igual a 1 si: Visible Y Cumplimentado. */
                    /* Sentencia igual a 0: en caso contrario. */
                    && ((editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE) == (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getText().toString().equals("")))
                    /* Campos del formulario del receptor 3. Estado 'gone' por defecto. */
                    /* Sentencia igual a 1 si: Gone Y NoCumplimentado. */
                    /* Sentencia igual a 1 si: Visible Y Cumplimentado. */
                    /* Sentencia igual a 0: en caso contrario. */
                    && ((editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE) == (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getText().toString().equals("")))
                    /* Campos del formulario del receptor 4. Estado 'gone' por defecto. */
                    /* Sentencia igual a 1 si: Gone Y NoCumplimentado. */
                    /* Sentencia igual a 1 si: Visible Y Cumplimentado. */
                    /* Sentencia igual a 0: en caso contrario. */
                    && ((editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE) == (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getText().toString().equals("")))
                    /* Campos del formulario del receptor 5. Estado 'gone' por defecto. */
                    /* Sentencia igual a 1 si: Gone Y NoCumplimentado. */
                    /* Sentencia igual a 1 si: Visible Y Cumplimentado. */
                    /* Sentencia igual a 0: en caso contrario. */
                    && ((editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE) == (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getText().toString().equals("")))) {
                /* Campo 'TiempoDialisisReceptorSupervivenciaPaciente' del receptor 1. */
                /* (Expresión 1) ¿Gone? = Yes -> Resultado = 1 */
                /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = Yes -> Comienza actividad GenerarGraficaSupervivenciaInjerto */
                /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = No -> Toast con aviso de valor cumplimentado incorrecto */
                if ((editTextTiempoDialisisReceptorSupervivenciaPaciente.getVisibility() == View.GONE || (!(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente.getText().toString()) > 8000)))
                        /* Campo 'TiempoDialisisReceptorSupervivenciaPaciente' del receptor 2. */
                        /* (Expresión 1) ¿Gone? = Yes -> Resultado = 1 */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = Yes -> Comienza actividad GenerarGraficaSupervivenciaInjerto */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = No -> Toast con aviso de valor cumplimentado incorrecto */
                        && (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE || (!(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getText().toString()) > 8000)))
                        /* Campo 'TiempoDialisisReceptorSupervivenciaPaciente' del receptor 3. */
                        /* (Expresión 1) ¿Gone? = Yes -> Resultado = 1 */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = Yes -> Comienza actividad GenerarGraficaSupervivenciaInjerto */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = No -> Toast con aviso de valor cumplimentado incorrecto */
                        && (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE || (!(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getText().toString()) > 8000)))
                        /* Campo 'TiempoDialisisReceptorSupervivenciaPaciente' del receptor 4. */
                        /* (Expresión 1) ¿Gone? = Yes -> Resultado = 1 */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = Yes -> Comienza actividad GenerarGraficaSupervivenciaInjerto */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = No -> Toast con aviso de valor cumplimentado incorrecto */
                        && (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE || (!(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getText().toString()) > 8000)))
                        /* Campo 'TiempoDialisisReceptorSupervivenciaPaciente' del receptor 5. */
                        /* (Expresión 1) ¿Gone? = Yes -> Resultado = 1 */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = Yes -> Comienza actividad GenerarGraficaSupervivenciaInjerto */
                        /* (Expresión 1) ¿Gone? = No -> (Expresión2) ¿Valor cumplimentado NO es MAYOR de 8000? = No -> Toast con aviso de valor cumplimentado incorrecto */
                        && (editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE || (!(Integer.parseInt(editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getText().toString()) > 8000)))) {
                    /*
                     * Si se han cumplementado todos
                     * los campos del formulario
                     * marcados como "Obligatorio" y
                     * que estén visibles,
                     * y el valor del campo
                     * 'TiempoDialisisReceptorSupervivenciaPaciente'
                     * es igual o inferior a 8000 (límite
                     * máximo) se procede a realizar la
                     * petición REST al servicio.
                     */
                    startActivity(intent);
                }
                else {
                    /*
                     * El valor del campo
                     * 'TiempoDialisisReceptorSupervivenciaPaciente'
                     * es superior a 8000 (límite
                     * máximo).
                     *
                     * Se indica al usuario que
                     * cumplimente el campos del
                     * formulario marcado con un
                     * valor válido.
                     */
                    Toast.makeText(SupervivenciaPaciente.this, "Dialysis time: maximum \"8000\" days", Toast.LENGTH_SHORT).show();
                }
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
                Toast.makeText(SupervivenciaPaciente.this, "You must fill in the \"required\" form fields", Toast.LENGTH_SHORT).show();
            }
        });
        botonFlotanteNuevoReceptorSupervivenciaPaciente.setOnClickListener(view -> {
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
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaPaciente.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaPaciente.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }

            /*
             * Receptor 4.
             * Si la vista del receptor 2 es 'VISIBLE',
             * la vista del receptor 3 es 'VISIBLE',
             * y la vista del receptor 4 es 'GONE',
             * modifica la vista del receptor 4 a 'VISIBLE'.
             */
            else if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaPaciente.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaPaciente.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }

            /*
             * Receptor 3.
             * Si la vista del receptor 2 es 'VISIBLE',
             * y la vista del receptor 3 es 'GONE',
             * modifica la vista del receptor 3 a 'VISIBLE'.
             */
            else if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDatosReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaPaciente.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaPaciente.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }

            /*
             * Receptor 2.
             * Si la vista del receptor 2 es 'GONE',
             * modifica la vista del receptor 2 a 'VISIBLE'.
             */
            else if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.GONE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.VISIBLE);

                /*
                 * Desplaza la vista hasta el final
                 * del formulario, para que el usuario
                 * pueda introducir los datos.
                 */
                int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
                scrollViewModeloSupervivenciaPaciente.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaPaciente.fullScroll(ScrollView.FOCUS_DOWN), tiempoDesplazamientoPrevio);
            }
            /*
             * Aviso número máximo de receptores.
             * El número máximo de receptores es 5.
             */
            else {
                Toast.makeText(SupervivenciaPaciente.this, "The maximum number of recipients is 5", Toast.LENGTH_SHORT).show();
            }
        });
        botonFlotanteBorrarSupervivenciaPaciente.setOnClickListener(view -> {
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
            autoCompleteTextViewEdadDonanteSupervivenciaPaciente.setText("");
            /* Resetear - Receptor 1. */
            switchCompatEdadReceptor4059SupervivenciaPaciente.setChecked(false);
            switchCompatEdadReceptor60SupervivenciaPaciente.setChecked(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.setChecked(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente.setChecked(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente.setText("");
            /* Resetear - Receptor 2. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setChecked(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setChecked(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setChecked(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.setChecked(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setText("");
            /* Resetear - Receptor 3. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setChecked(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setChecked(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setChecked(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.setChecked(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setText("");
            /* Resetear - Receptor 4. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setChecked(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setChecked(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setChecked(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.setChecked(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setText("");
            /* Resetear - Receptor 5. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setChecked(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setChecked(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setChecked(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.setChecked(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setText("");
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
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.setVisibility(View.GONE);
            }
            /* Visibilidad 'GONE' - Receptor 4. */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.setVisibility(View.GONE);
            }
            /* Visibilidad 'GONE' - Receptor 3. */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.setVisibility(View.GONE);
            }
            /* Visibilidad 'GONE' - Receptor 2. */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.setVisibility(View.GONE);
            }
            /*
             * Desplaza la vista hasta el inicio
             * del formulario, para que el usuario
             * pueda introducir nuevamente los datos.
             */
            int tiempoDesplazamientoPrevio = 200; /* Tiempo en milisegundos. */
            scrollViewModeloSupervivenciaPaciente.postOnAnimationDelayed(() -> scrollViewModeloSupervivenciaPaciente.fullScroll(ScrollView.FOCUS_UP), tiempoDesplazamientoPrevio);
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
        if(!vistasAtenuadasSupervivenciaPaciente) {
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
            textViewModeloSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            /* Atenuar vistas de texto del Donante. */
            textViewDatosDonanteSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            textViewEdadDonanteSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            /* Atenuar listas desplegables del Donante. */
            spinnerEdadDonanteSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            /* Atenuar vistas de texto del Receptor 1. */
            textViewDatosReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            textViewEdadReceptor4059SupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            textViewEdadReceptor60SupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            textViewSexoHombreReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            textViewTiempoDialisisReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            /* Atenuar switches del Receptor 1. */
            switchCompatEdadReceptor4059SupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            switchCompatEdadReceptor60SupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            switchCompatSexoHombreReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            /* Atenuar listas desplegables del Receptor 1. */
            textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            /* Atenuar vistas de texto y listas desplegables del Receptor 2 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            }
            /* Atenuar vistas de texto y listas desplegables del Receptor 3 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            }
            /* Atenuar vistas de texto y listas desplegables del Receptor 4 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            }
            /* Atenuar vistas de texto y listas desplegables del Receptor 5 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAtenuarVistaSupervivenciaPaciente);
            }
            /* ************************************************** */
            /* Estado de las vistas: atenuadas. */
            vistasAtenuadasSupervivenciaPaciente = true;
            /* ******************************** */
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
            textViewModeloSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            /* Aumentar vistas de texto del Donante. */
            textViewDatosDonanteSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            textViewEdadDonanteSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            /* Aumentar listas desplegables del Donante. */
            spinnerEdadDonanteSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            /* Aumentar vistas de texto del Receptor 1. */
            textViewDatosReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            textViewEdadReceptor4059SupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            textViewEdadReceptor60SupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            textViewSexoHombreReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            textViewTiempoDialisisReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            /* Aumentar switches del Receptor 1. */
            switchCompatEdadReceptor4059SupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            switchCompatEdadReceptor60SupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            switchCompatSexoHombreReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            /* Aumentar listas desplegables del Receptor 1. */
            textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.startAnimation(animAumentarVistaSupervivenciaPaciente);
            /* Aumentar vistas de texto y listas desplegables del Receptor 2 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.startAnimation(animAumentarVistaSupervivenciaPaciente);
            }
            /* Aumentar vistas de texto y listas desplegables del Receptor 3 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.startAnimation(animAumentarVistaSupervivenciaPaciente);
            }
            /* Aumentar vistas de texto y listas desplegables del Receptor 4 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.startAnimation(animAumentarVistaSupervivenciaPaciente);
            }
            /* Aumentar vistas de texto y listas desplegables del Receptor 5 (sólo si las vistas están 'visible'). */
            if (textViewDatosReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE
                    && switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.getVisibility() == View.VISIBLE) {
                textViewDatosReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewEdadReceptor60SupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
                textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.startAnimation(animAumentarVistaSupervivenciaPaciente);
            }
            /* ************************************************** */
            /* Estado de las vistas: aumentadas. */
            vistasAtenuadasSupervivenciaPaciente = false;
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
        if(!opcionesDesplegadasSupervivenciaPaciente) {
            /* Animación: anim_girar_opciones_abrir.xml. */
            opcionesSupervivenciaPaciente.startAnimation(animGirarOpcionesAlAbrirSupervivenciaPaciente);
            /* Animación: anim_mostrar_opciones_abrir.xml. */
            botonFlotanteCalcularSupervivenciaPaciente.startAnimation(animMostrarOpcionesAlAbrirSupervivenciaPaciente);
            botonFlotanteNuevoReceptorSupervivenciaPaciente.startAnimation(animMostrarOpcionesAlAbrirSupervivenciaPaciente);
            botonFlotanteBorrarSupervivenciaPaciente.startAnimation(animMostrarOpcionesAlAbrirSupervivenciaPaciente);

            /* Muestra las opciones del menú. */
            botonFlotanteCalcularSupervivenciaPaciente.show();
            botonFlotanteNuevoReceptorSupervivenciaPaciente.show();
            botonFlotanteBorrarSupervivenciaPaciente.show();

            /* Hace visible el texto adjunto a cada opción del menú. */
            textViewCalcularSupervivenciaPaciente.setVisibility(View.VISIBLE);
            textViewNuevoReceptorSupervivenciaPaciente.setVisibility(View.VISIBLE);
            textViewBorrarSupervivenciaPaciente.setVisibility(View.VISIBLE);

            /* Habilita que se pueda hacer clic sobre los botones del menu. */
            botonFlotanteCalcularSupervivenciaPaciente.setClickable(true);
            botonFlotanteNuevoReceptorSupervivenciaPaciente.setClickable(true);
            botonFlotanteBorrarSupervivenciaPaciente.setClickable(true);
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
            autoCompleteTextViewEdadDonanteSupervivenciaPaciente.setEnabled(false);
            /* Deshabilita elementos - Receptor 1. */
            switchCompatEdadReceptor4059SupervivenciaPaciente.setEnabled(false);
            switchCompatEdadReceptor60SupervivenciaPaciente.setEnabled(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.setEnabled(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente.setEnabled(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente.setEnabled(false);
            /* Deshabilita elementos - Receptor 2. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setEnabled(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setEnabled(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setEnabled(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.setEnabled(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setEnabled(false);
            /* Deshabilita elementos - Receptor 3. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setEnabled(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setEnabled(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setEnabled(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.setEnabled(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setEnabled(false);
            /* Deshabilita elementos - Receptor 4. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setEnabled(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setEnabled(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setEnabled(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.setEnabled(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setEnabled(false);
            /* Deshabilita elementos - Receptor 5. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setEnabled(false);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setEnabled(false);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setEnabled(false);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.setEnabled(false);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setEnabled(false);
            /* *********************************************************************** */

            /* Estado del menú: desplegado. */
            opcionesDesplegadasSupervivenciaPaciente = true;
        }
        else {
            /* Animación: anim_girar_opciones_cerrar.xml. */
            opcionesSupervivenciaPaciente.startAnimation(animGirarOpcionesAlCerrarSupervivenciaPaciente);
            /* Animación: anim_mostrar_opciones_cerrar.xml. */
            botonFlotanteCalcularSupervivenciaPaciente.startAnimation(animOcultarOpcionesAlCerrarSupervivenciaPaciente);
            botonFlotanteNuevoReceptorSupervivenciaPaciente.startAnimation(animOcultarOpcionesAlCerrarSupervivenciaPaciente);
            botonFlotanteBorrarSupervivenciaPaciente.startAnimation(animOcultarOpcionesAlCerrarSupervivenciaPaciente);

            /* Oculta las opciones del menú. */
            botonFlotanteCalcularSupervivenciaPaciente.hide();
            botonFlotanteNuevoReceptorSupervivenciaPaciente.hide();
            botonFlotanteBorrarSupervivenciaPaciente.hide();

            /* Hace que el texto adjunto a cada opción del menú no sea visible y no ocupe espacio en el layout. */
            textViewCalcularSupervivenciaPaciente.setVisibility(View.GONE);
            textViewNuevoReceptorSupervivenciaPaciente.setVisibility(View.GONE);
            textViewBorrarSupervivenciaPaciente.setVisibility(View.GONE);

            /* Deshabilita que se pueda hacer clic sobre los botones del menu. */
            /*
             * IMPORTANTE: Si los botones no se deshabilitan, se podrá hacer
             * clic sobre ellos incluso si no están visibles.
             */
            botonFlotanteCalcularSupervivenciaPaciente.setClickable(false);
            botonFlotanteNuevoReceptorSupervivenciaPaciente.setClickable(false);
            botonFlotanteBorrarSupervivenciaPaciente.setClickable(false);
            /*
             * Habilita las vistas del formulario con las que el usuario
             * puede interaccionar.
             * Una vista habilitada Yes responderá ante el 'clic' del
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
            autoCompleteTextViewEdadDonanteSupervivenciaPaciente.setEnabled(true);
            /* Habilita elementos - Receptor 1. */
            switchCompatEdadReceptor4059SupervivenciaPaciente.setEnabled(true);
            switchCompatEdadReceptor60SupervivenciaPaciente.setEnabled(true);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.setEnabled(true);
            switchCompatSexoHombreReceptorSupervivenciaPaciente.setEnabled(true);
            editTextTiempoDialisisReceptorSupervivenciaPaciente.setEnabled(true);
            /* Habilita elementos - Receptor 2. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.setEnabled(true);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.setEnabled(true);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.setEnabled(true);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.setEnabled(true);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.setEnabled(true);
            /* Habilita elementos - Receptor 3. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.setEnabled(true);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.setEnabled(true);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.setEnabled(true);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.setEnabled(true);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.setEnabled(true);
            /* Habilita elementos - Receptor 4. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.setEnabled(true);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.setEnabled(true);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.setEnabled(true);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.setEnabled(true);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.setEnabled(true);
            /* Habilita elementos - Receptor 5. */
            switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.setEnabled(true);
            switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.setEnabled(true);
            switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.setEnabled(true);
            switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.setEnabled(true);
            editTextTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.setEnabled(true);
            /* *********************************************************************** */

            /* Estado del menú: no desplegado. */
            opcionesDesplegadasSupervivenciaPaciente = false;
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
        textViewModeloSupervivenciaPaciente.clearAnimation();
        /* Limpiar animación de las vistas de texto del Donante. */
        textViewDatosDonanteSupervivenciaPaciente.clearAnimation();
        textViewEdadDonanteSupervivenciaPaciente.clearAnimation();
        /* Limpiar animación de las vistas de texto de los Receptores. */
        textViewDatosReceptorSupervivenciaPaciente.clearAnimation();
        textViewEdadReceptor4059SupervivenciaPaciente.clearAnimation();
        textViewEdadReceptor60SupervivenciaPaciente.clearAnimation();
        textViewSexoHombreReceptorSupervivenciaPaciente.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.clearAnimation();
        textViewTiempoDialisisReceptorSupervivenciaPaciente.clearAnimation();
        textViewDatosReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor2.clearAnimation();
        textViewEdadReceptor60SupervivenciaPaciente_Receptor2.clearAnimation();
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        textViewDatosReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor3.clearAnimation();
        textViewEdadReceptor60SupervivenciaPaciente_Receptor3.clearAnimation();
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        textViewDatosReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor4.clearAnimation();
        textViewEdadReceptor60SupervivenciaPaciente_Receptor4.clearAnimation();
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        textViewDatosReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
        textViewEdadReceptor4059SupervivenciaPaciente_Receptor5.clearAnimation();
        textViewEdadReceptor60SupervivenciaPaciente_Receptor5.clearAnimation();
        textViewSexoHombreReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
        textViewDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
        textViewTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
        /* Limpiar animación de las listas desplegables del Donante. */
        spinnerEdadDonanteSupervivenciaPaciente.clearAnimation();
        /* Limpiar animación de las listas desplegables de los Receptores. */
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente.clearAnimation();
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        textInputLayoutTiempoDialisisReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
        /* Limpiar animación de los switches - Receptores. */
        switchCompatEdadReceptor4059SupervivenciaPaciente.clearAnimation();
        switchCompatEdadReceptor60SupervivenciaPaciente.clearAnimation();
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente.clearAnimation();
        switchCompatSexoHombreReceptorSupervivenciaPaciente.clearAnimation();
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor2.clearAnimation();
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor2.clearAnimation();
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor2.clearAnimation();
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor3.clearAnimation();
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor3.clearAnimation();
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor3.clearAnimation();
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor4.clearAnimation();
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor4.clearAnimation();
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor4.clearAnimation();
        switchCompatEdadReceptor4059SupervivenciaPaciente_Receptor5.clearAnimation();
        switchCompatEdadReceptor60SupervivenciaPaciente_Receptor5.clearAnimation();
        switchCompatDiabetesEnfermedadRenalPrimariaReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
        switchCompatSexoHombreReceptorSupervivenciaPaciente_Receptor5.clearAnimation();
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
        opcionesSupervivenciaPaciente.clearAnimation();
        /* Limpiar animación: anim_mostrar_opciones_abrir.xml / anim_mostrar_opciones_cerrar.xml. */
        botonFlotanteCalcularSupervivenciaPaciente.clearAnimation();
        botonFlotanteNuevoReceptorSupervivenciaPaciente.clearAnimation();
        botonFlotanteBorrarSupervivenciaPaciente.clearAnimation();
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
