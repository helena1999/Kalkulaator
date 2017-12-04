package com.example.opilane.kalkulaator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText opr1, opr2;
    private Button lahuta, liida, jaga, korruta, kustuta;
    private TextView tulemus;
    private Boolean isFirstNumber = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 = (EditText)findViewById(R.id.editOp1);
        opr2 = (EditText)findViewById(R.id.editOp2);
        liida = (Button)findViewById(R.id.liida);
        lahuta = (Button)findViewById(R.id.lahuta);
        korruta = (Button)findViewById(R.id.korruta);
        kustuta = (Button)findViewById(R.id.kustuta);
        jaga = (Button)findViewById(R.id.jaga);
        tulemus = (TextView) findViewById(R.id.tulemus);
        Button yks = (Button)findViewById(R.id.yks);
        Button kaks = (Button)findViewById(R.id.kaks);
        Button kolm = (Button)findViewById(R.id.kolm);
        Button neli = (Button)findViewById(R.id.neli);
        Button viis = (Button)findViewById(R.id.viis);
        Button kuus = (Button)findViewById(R.id.kuus);
        Button seitse = (Button)findViewById(R.id.seitse);
        Button kaheksa = (Button)findViewById(R.id.kaheksa);
        Button yheksa = (Button)findViewById(R.id.yheksa);
        Button kymme = (Button)findViewById(R.id.kymme);

        opr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isFirstNumber = true;
            }
        });
        opr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isFirstNumber = false;
            }
        });


        liida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length()>0)&&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 + oper2;
                    tulemus.setText(Double.toString(tulem));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        lahuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((opr1.getText().length()>0)&&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 - oper2;
                    tulemus.setText(Double.toString(tulem));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });
        korruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length()>0)&&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 * oper2;
                    tulemus.setText(Double.toString(tulem));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                }

            }

        });
        jaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((opr1.getText().length()>0)&&(opr2.getText().length()>0)){
                    double oper1= Double.parseDouble(opr1.getText().toString());
                    double oper2= Double.parseDouble(opr2.getText().toString());
                    double tulem= oper1 / oper2;
                    tulemus.setText(Double.toString(tulem));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this,"Sisesta vajalik number",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
        kustuta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opr1.setText("");
                opr2.setText("");
                tulemus.setText("0.00");
                opr1.requestFocus();
            }
        });

        yks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "1");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "1");
                }

            }
        });

        kaks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "2");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "2");
                }

            }
        });

        kolm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "3");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "3");
                }

            }
        });

        neli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "4");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "4");
                }

            }
        });

        viis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "5");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "5");
                }

            }
        });

        kuus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "6");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "6");
                }

            }
        });

        seitse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "7");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "7");
                }

            }
        });

        kaheksa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "8");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "8");
                }

            }
        });

        yheksa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "9");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "9");
                }

            }
        });

        kymme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (isFirstNumber) {
                    opr1.setText(opr1.getText().toString() + "0");
                }
                else
                {
                    opr2.setText(opr2.getText().toString() + "0");
                }

            }
        });











    }  }