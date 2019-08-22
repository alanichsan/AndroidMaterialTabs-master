package info.androidhive.materialtabs.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.Adapter;
import info.androidhive.materialtabs.activity.Bangun;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ThreeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<Bangun> bangunArrayList;

    public ThreeFragment() {
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
        View view = inflater.inflate(R.layout.fragment_three, container, false);
        addData();

        recyclerView = view.findViewById(R.id.recycler_view);

        adapter = new Adapter(bangunArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        return view;
    }
    void addData(){
        bangunArrayList = new ArrayList<>();
        bangunArrayList.add(new Bangun("KUBUS", "V = r x r x r", "L = 6 x r x r"));
        bangunArrayList.add(new Bangun("BALOK", "V = p x l x t", "L = (2 x p x l) + (2 x p x t) + (2 x l x t)"));
        bangunArrayList.add(new Bangun("LIMAS", "V = 1/3 x p x l x t", "L = luas alas + luas selubung limas."));
        bangunArrayList.add(new Bangun("BOLA", "V = 4/3 x π x r3", "L = 4 x π x r2"));
    }
}
