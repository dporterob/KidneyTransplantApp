package com.tfg.apptrasplanterenal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Clase: MainActivity.
 * @author Daniel Portero Barreña
 * @version 1.0
 * @since 2022
 */

public class MainActivity extends AppCompatActivity {
    /*
     * Drawables ActionBar:
     * Drawable Información, Drawable Contacto y Drawable Copyright.
     */
    Drawable drawableInformacion;
    Drawable drawableContacto;
    Drawable drawableCopyright;
    /*
     * Botones:
     * Botón Modelo Supervivencia Injerto,
     * Botón Modelo Supervivencia Paciente,
     * Botón Salir.
     */
    Button botonSupervivenciaInjerto;
    Button botonSupervivenciaPaciente;
    Button botonSalir;
    /* Diálogo para la aceptación de la política de privacidad (GDPR). */
    AlertDialog.Builder alertDialogBuilder;
    AlertDialog alertDialog;

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
        setContentView(R.layout.activity_main);

        /* Botones. */
        botonSupervivenciaInjerto = findViewById(R.id.botonSupervivenciaInjerto);
        botonSupervivenciaInjerto.setOnClickListener(view -> SupervivenciaInjerto());
        botonSupervivenciaPaciente = findViewById(R.id.botonSupervivenciaPaciente);
        botonSupervivenciaPaciente.setOnClickListener(view -> SupervivenciaPaciente());
        botonSalir = findViewById(R.id.botonSalir);
        botonSalir.setOnClickListener(view -> salir());
        /* Diálogo para la aceptación de la política de privacidad (GDPR). */
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        View viewAlertDialog = getLayoutInflater().inflate(R.layout.view_gdpr, null);
        alertDialogBuilder.setPositiveButton("I agree",
                (dialogInterface, i) -> dialogInterface.dismiss());
        alertDialogBuilder.setView(viewAlertDialog);
        alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    /**
     * Método: onCreateOptionsMenu.
     * @param menu Menú de acciones al que se añaden
     *             tres elementos.
     *             Gestiona los clics sobre cada uno
     *             de los elementos.
     *             Se infla el fichero XML en el
     *             menú con el método
     *             inflate() de la clase MenuInflater.
     * @return true Se debe devolver true para que
     * el menú se muestre; si se devuelve false, el
     * menú no se mostrará.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*
         * Clase MenuInflater:
         * Esta clase se utiliza para instanciar los
         * ficheros XML del menú en objetos Menú.
         *
         * Método inflate():
         * Infla una jerarquía de menú de una fuente
         * XML especificada.
         *
         * https://developer.android.com/reference/android/view/MenuInflater?hl=en
         * https://developer.android.com/reference/android/view/MenuInflater?hl=en#inflate(int,%20android.view.Menu)
         */
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        /*
        * Modificación del color del relleno
        * de los iconos de la AppBar (ActionBar).
        * (el color por defecto, previa
        * modificación, es el color negro).
        *
        * https://developer.android.com/training/appbar
        */
        drawableInformacion = menu.findItem(R.id.informacion).getIcon();
        drawableContacto = menu.findItem(R.id.contacto).getIcon();
        drawableCopyright = menu.findItem(R.id.copyright).getIcon();
        drawableInformacion.setTint(ContextCompat.getColor(getApplicationContext(),
                R.color.white));
        drawableContacto.setTint(ContextCompat.getColor(getApplicationContext(),
                R.color.white));
        drawableCopyright.setTint(ContextCompat.getColor(getApplicationContext(),
                R.color.white));
        return true;
    }
    /**
     * Método: onOptionsItemSelected.
     * @param menuItem Item sobre el que ha hecho clic
     *                 el usuario.
     * @return false Se debe devolver false para permitir
     * que el procesamiento normal del menú continue;
     * si se devuelve true, se consume (termina) aquí.
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.informacion) {
            /*
             * Actividad Informacion.
             */
            Intent intent = new Intent(getApplicationContext(), Informacion.class);
            startActivity(intent);
        }
        if (menuItem.getItemId() == R.id.contacto) {
            /*
             * Actividad Contacto.
             */
            Intent intent = new Intent(getApplicationContext(), Contacto.class);
            startActivity(intent);
        }
        if (menuItem.getItemId() == R.id.copyright) {
            /*
             * Actividad Copyright.
             */
            Intent intent = new Intent(getApplicationContext(), Copyright.class);
            startActivity(intent);
        }
        return false;
    }

    /**
     * Método: SupervivenciaInjerto.
     */
    public void SupervivenciaInjerto(){
        /*
         * Actividad SupervivenciaInjerto.
         */
        Intent intent = new Intent(getApplicationContext(),
                SupervivenciaInjerto.class);
        startActivity(intent);
    }
    /**
     * Método: SupervivenciaPaciente.
     */
    public void SupervivenciaPaciente(){
        /*
         * Actividad SupervivenciaPaciente.
         */
        Intent intent = new Intent(getApplicationContext(),
                SupervivenciaPaciente.class);
        startActivity(intent);
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
     * Método: salir.
     */
    public void salir() {
        finish();
    }
    /**
     * Método: onBackPressed.
     */
    @Override
    public void onBackPressed() {
        finish();
    }
}