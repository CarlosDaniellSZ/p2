package com.example.p2;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CadAluno  extends AppCompatActivity {

    private EditText nome;
    private EditText rgm;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText)findViewById(R.id.nome);
        rgm = (EditText)findViewById(R.id.rgm);

        ListView listaV_dados = (ListView) findViewById(R.id.listaV_dados);

        inicializarFirebase();
    }
    private void inicializarFirebase(){
        FirebaseApp.initializeApp(MainActivity.this);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

}

