package com.example.lab32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtten,txtchieucao,txtcanang,txtbmi,txtchuandoan;
    Button btntinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtten = findViewById(R.id.txtten);
        txtchieucao = findViewById(R.id.txtchieucao);
        txtcanang = findViewById(R.id.txtcannang);
        txtbmi = findViewById(R.id.txtbmi);
        txtchuandoan = findViewById(R.id.txtchuandoan);
        btntinh = findViewById(R.id.btntinh);

        btntinh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double W = Double.parseDouble(txtcanang.getText().toString());
                double H = Double.parseDouble(txtchieucao.getText().toString());
                double T = W /(H * H)  ;
                txtbmi.setText("" + T);

                if (T < 18){
                    txtchuandoan.setText(("Nguoi gay"));
                } else if (18.1<= T && T<=24.9){
                    txtchuandoan.setText("Nguoi binh thuong");
                } else if (25<= T && T<=30.9){
                    txtchuandoan.setText("Beo phi cap 1");
                } else if (30>= T && T<= 34.9){
                    txtchuandoan.setText("Beo phi cap 2");
                } else{
                    txtchuandoan.setText("Beo phi cap 3");
                }

            }




        });


    }
}