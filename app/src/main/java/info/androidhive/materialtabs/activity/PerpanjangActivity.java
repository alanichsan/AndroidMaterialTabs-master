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

public class PerpanjangActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText pa,t;
    Button hitung,hitungk;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpanjang);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pa = (EditText) findViewById(R.id.pa);
        t = (EditText) findViewById(R.id.t);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitungk = (Button) findViewById(R.id.hitungk);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa.length() == 0&&t.length() == 0) {
                    Toast.makeText(getApplication(), " tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String panjang = pa.getText().toString();
                    String lebar = t.getText().toString();

                    double pa = Double.parseDouble(panjang);
                    double t = Double.parseDouble(lebar);

                    double Hasil = hasil(pa,t);
                    String output = String.valueOf(Hasil);
                    hitung.setText(output.toString());
                }
            }


            private double hasil(double pa,double t) {
                return pa*t;
            }

        });
        hitungk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pa.length() == 0&&t.length() == 0) {
                    Toast.makeText(getApplication(), " tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String panjang = pa.getText().toString();
                    String lebar = t.getText().toString();

                    double pa = Double.parseDouble(panjang);
                    double t = Double.parseDouble(lebar);

                    double Hasil = hasilk(pa,t);
                    String output = String.valueOf(Hasil);
                    hitungk.setText(output.toString());
                }
            }


            private double hasilk(double pa,double t) {
                return 2*pa+2*t;
            }

        });
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
