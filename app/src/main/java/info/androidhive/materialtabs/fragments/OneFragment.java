package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;


public class OneFragment extends Fragment{
    EditText angka1, angka2;
    Button kali, tambah, kurang, bagi;
    TextView hasil;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        angka1 =  view.findViewById(R.id.angka1);
        angka2 = view.findViewById(R.id.angka2);
        hasil = view.findViewById(R.id.hasil);
        kurang = view.findViewById(R.id.kurang);
        tambah = view.findViewById(R.id.tambah);
        kali = view.findViewById(R.id.kali);
        bagi = view.findViewById(R.id.bagi);
        tambah.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(angka1.getText().toString());
                    double num2 = Double.parseDouble(angka2.getText().toString());
                    double result = num1 + num2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast.makeText(getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG).show();
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {

                                      @Override
                                      public void onClick(View view) {
                                          if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                                              double num1 = Double.parseDouble(angka1.getText().toString());
                                              double num2 = Double.parseDouble(angka2.getText().toString());
                                              double result = num1 - num2;
                                              hasil.setText(Double.toString(result));
                                          } else {
                                              Toast.makeText(getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG).show();
                                          }


                                      }
                                  }

        );
        kali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(angka1.getText().toString());
                    double num2 = Double.parseDouble(angka2.getText().toString());
                    double result = num1 * num2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast.makeText(getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG).show();
                }


            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ((angka1.getText().length() > 0) && (angka2.getText().length() > 0)) {
                    double num1 = Double.parseDouble(angka1.getText().toString());
                    double num2 = Double.parseDouble(angka2.getText().toString());
                    if (num2 == 0) {
                        Toast.makeText(getContext(), "tidak bisa dibagi 0", Toast.LENGTH_LONG).show();
                    } else {
                        double result = num1 / num2;
                        hasil.setText(Double.toString(result));

                    }
                } else {
                    Toast.makeText(getContext(), "Mohon masukkan Angka pertama & Kedua", Toast.LENGTH_LONG).show();
                }


            }


        });
        return view;

    }

}
