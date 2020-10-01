package com.abi.uts_18415016_wahyuabiantoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTampilNamaKry, txtTampilGol, txtGaPok, txtTunjangan, txtPajak, txtGaBer;
    EditText edtNamaKry, edtGol;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTampilNamaKry = (TextView) findViewById(R.id.txtNama);
        txtTampilGol = (TextView) findViewById(R.id.txtGol);

        edtNamaKry  = (EditText) findViewById(R.id.edtNamaKry);
        edtGol = (EditText) findViewById(R.id.edtGol);

        txtGaPok = (TextView) findViewById(R.id.txtGaPok);
        txtTunjangan = (TextView) findViewById(R.id.txtTunjangan);
        txtPajak = (TextView) findViewById(R.id.txtPajak);
        txtGaBer = (TextView) findViewById(R.id.txtGaBer);

        btnHitung = (Button) findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String NamaKry, golongan;
                double GaPok = 0, Tunjangan = 0, Pajak = 0, Gaber;

                NamaKry = edtNamaKry.getText().toString();
                golongan = edtGol.getText().toString();


                if (golongan.equals("1")) {
                    GaPok = 150000 ;
                    Tunjangan = 1000000 ;
                    Pajak = (GaPok + Tunjangan) * 0.01;

                } else if (golongan.equals("2")) {
                    GaPok = 2000000;
                    Tunjangan = 1500000;
                    Pajak = (GaPok + Tunjangan) * 0.02;

                } else if (golongan.equals("3")) {
                    GaPok = 250000;
                    Tunjangan = 2000000;
                    Pajak = (GaPok + Tunjangan) * 0.03;

                } else if (golongan.equals("4")) {
                    GaPok = 3000000;
                    Tunjangan = 2500000;
                    Pajak = (GaPok + Tunjangan) * 0.01;

                }

                Gaber = GaPok + Tunjangan - Pajak;

                String strNama= edtNamaKry.getText().toString();
                String strGol= edtGol.getText().toString();

                txtTampilNamaKry.setText("Nama Karyawan : " + strNama );
                txtTampilGol.setText("Golongan : " + strGol);
                txtGaPok.setText("Gaji Pokok : " + String.valueOf(GaPok));
                txtTunjangan.setText("Tunjangan : " + String.valueOf(Tunjangan));
                txtPajak.setText("Pajak : " + String.valueOf(Pajak));
                txtGaBer.setText("Gaji Bersih : " + String.valueOf(Gaber));

            }
        });
    }
}