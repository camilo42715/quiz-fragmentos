package com.example.mipc.extension;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class QUIZ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        FragmentManager miManejador=getSupportFragmentManager();
        FragmentTransaction miTrasaccion=miManejador.beginTransaction();
        FragmentoMaster miFragmento=new FragmentoMaster();
        miTrasaccion.replace(R.id.ContenedorMaster,miFragmento);
        miTrasaccion.commit();

    }
    public void buscadores(View v){

        FragmentManager manejador1=getSupportFragmentManager();
        FragmentTransaction transaccion1=manejador1.beginTransaction();
        Fragmento1 fragmento2=new Fragmento1();

        transaccion1.replace(R.id.ContenedorMaster,fragmento2);
        transaccion1.commit();
    }


}
