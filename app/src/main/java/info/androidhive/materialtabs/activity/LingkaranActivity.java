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

public class LingkaranActivity extends AppCompatActivity {
    Toolbar toolbar;
    EditText r;
    Button hitung,hitungk;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);
        setContentView(R.layout.activity_persegi);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        r = (EditText) findViewById(R.id.r);
        hitung = (Button) findViewById(R.id.hitung);
        hasil = (TextView) findViewById(R.id.hasil);
        hitungk = (Button) findViewById(R.id.hitungk);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r.length() == 0) {
                    Toast.makeText(getApplication(), "jari jari tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isisisi = r.getText().toString();
                    double r = Double.parseDouble(isisisi);
                    double Hasil = hasil(r);
                    String output = String.valueOf(Hasil);
                    hitung.setText(output.toString());
                }
            }


            private double hasil(double r) {
                return 3.14*r*r;
            }

        });
        hitungk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r.length() == 0) {
                    Toast.makeText(getApplication(), "jari jari tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isisisi = r.getText().toString();
                    double r = Double.parseDouble(isisisi);
                    double Hasil = hasilk(r);
                    String output = String.valueOf(Hasil);
                    hitungk.setText(output.toString());
                }
            }


            private double hasilk(double r) {
                return 2*3.14*r;
            }

        });
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
