package info.androidhive.materialtabs.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.LingkaranActivity;
import info.androidhive.materialtabs.activity.PerpanjangActivity;
import info.androidhive.materialtabs.activity.PersegiActivity;
import info.androidhive.materialtabs.activity.SegitigaActivity;


public class TwoFragment extends Fragment{
    CardView persegi,panjang,lingkaran,segitiga;

    public TwoFragment() {
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
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        persegi= view.findViewById(R.id.persegi) ;
        panjang= view.findViewById(R.id.panjang) ;
        segitiga= view.findViewById(R.id.segitiga);
        lingkaran=view.findViewById(R.id.lingkaran);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), PersegiActivity.class);
                startActivity(in);
            }
        });
        panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), PerpanjangActivity.class);
                startActivity(in);
            }
        });
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), SegitigaActivity.class);
                startActivity(in);
            }
        });
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getActivity(), LingkaranActivity.class);
                startActivity(in);
            }
        });
        return  view;
    }

}
