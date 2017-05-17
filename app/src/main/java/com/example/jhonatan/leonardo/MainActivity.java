package com.example.jhonatan.leonardo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button ingresar;



        ingresar = (Button) findViewById(R.id.button);

        ingresar.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        String usua = ((EditText) findViewById(R.id.editText)).getText().toString();
        String contra = ((EditText) findViewById(R.id.editText2)).getText().toString();

        if (usua.equals("lfgananr") && contra.equals("leonardito"))
        {


            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
        }
        else {
        Toast.makeText(getApplicationContext(),"incorrecto",Toast.LENGTH_LONG).show();
        return;
        }

    }

    //
}
