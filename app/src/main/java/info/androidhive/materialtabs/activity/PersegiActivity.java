package info.androidhive.materialtabs.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import info.androidhive.materialtabs.R;

public class PersegiActivity extends AppCompatActivity {
  Toolbar toolbar;
    EditText s;
    Button hitung,hitungk;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        s = (EditText) findViewById(R.id.s);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitungk = (Button) findViewById(R.id.hitungk);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length() == 0) {
                    Toast.makeText(getApplication(), "sisi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double Hasil = hasil(s);
                    String output = String.valueOf(Hasil);
                    hitung.setText(output.toString());
                }
            }


            private double hasil(double s) {
                return s*s;
            }

        });
        hitungk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s.length() == 0) {
                    Toast.makeText(getApplication(), "sisi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isisisi = s.getText().toString();
                    double s = Double.parseDouble(isisisi);
                    double Hasil = hasilk(s);
                    String output = String.valueOf(Hasil);
                    hitungk.setText(output.toString());
                }
            }


            private double hasilk(double s) {
                return 4*s;
            }

        });
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
