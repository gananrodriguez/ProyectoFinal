package com.example.jhonatan.leonardo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;

    Spinner spinner4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner1 = (Spinner) findViewById(R.id.spinner);
         List spinnerUno = new ArrayList();

        spinnerUno.add("CAT MANIZALES");

        ArrayAdapter uno = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,spinnerUno);
        uno.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner1.setAdapter(uno);

        spinner1.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,"" + String.valueOf(spinner1.getSelectedItem()),Toast.LENGTH_SHORT).show();
                return;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        spinner2 = (Spinner)findViewById(R.id.spinner2);

        List spinnerdos = new ArrayList();

        spinnerdos.add ("Aspirantes");
        spinnerdos.add ("oferta academica");
        spinnerdos.add ("formas de pago");
        spinnerdos.add ("convenios y descuentos");
        spinnerdos.add ("requisitos de inscripcion");
        spinnerdos.add ("homologaciones");
        spinnerdos.add ("traifas institucionales 2017");
        spinnerdos.add ("pre-inscripcion");
        spinnerdos.add ("documentos nuevos");

        ArrayAdapter dos  = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,spinnerdos);
        dos.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner2.setAdapter(dos);
        spinner2.setOnItemSelectedListener (new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main2Activity.this,"" + String.valueOf(spinner2.getSelectedItem()),Toast.LENGTH_SHORT).show();
                return;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });

        spinner3 = (Spinner)findViewById(R.id.spinner3);
        List spinnertres = new ArrayList();

        spinnertres.add ("Estudiantes");
        spinnertres.add ("Calendario academico");
        spinnertres.add ("Tarifas institucionales 2017");
        spinnertres.add("Plataforma Moodle");
        spinnertres.add("Plataforma Q10");
        spinnertres.add("Correo institucional");
        spinnertres.add("Recibo de matricula");
        spinnertres.add("Homologaciones");
        spinnertres.add("Directorio administrativo");
        spinnertres.add("Lineamientos academicos");
        spinnertres.add("Reglamento estudiantil");

        ArrayAdapter tres = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, spinnertres);

        tres.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner3.setAdapter(tres);


        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        spinner4 = (Spinner)findViewById(R.id.spinner4);

        List spinnercuatro = new ArrayList();

        spinnercuatro.add ("Docentes -  tutores");
        spinnercuatro.add ("Plataforma Moodle");
        spinnercuatro.add ("Plataforma Q10");
        spinnercuatro.add("Calendario academico");
        spinnercuatro.add("Correo Institucional");
        spinnercuatro.add("Directorio administrativo");
        spinnercuatro.add("Reserva de equipos");

        ArrayAdapter cuatro = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,spinnercuatro);
        cuatro.setDropDownViewResource(android.R.layout.simple_spinner_item);

        spinner4.setAdapter(cuatro);

        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




// ON

    }

    //PR
}
