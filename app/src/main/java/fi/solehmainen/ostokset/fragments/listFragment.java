package fi.solehmainen.ostokset.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fi.solehmainen.ostokset.ItemListAdapter;
import fi.solehmainen.ostokset.ItemStorage;
import fi.solehmainen.ostokset.R;


public class listFragment extends Fragment {

    RecyclerView recyclerView;
    private ItemListAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.rvList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new ItemListAdapter(getContext().getApplicationContext(), ItemStorage.getInstance().getItems());


        TextView txtData = view.findViewById(R.id.editItem);
        if (getArguments() != null) {
            String dataText = getArguments().getString("dataID");
            txtData.setText(dataText);
        }
        return view;




    }
}