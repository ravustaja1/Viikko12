package fi.solehmainen.ostokset.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import fi.solehmainen.ostokset.Item;
import fi.solehmainen.ostokset.ItemListAdapter;
import fi.solehmainen.ostokset.ItemStorage;
import fi.solehmainen.ostokset.R;


public class buyFragment extends Fragment {
    Button button;
    EditText editText;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        ItemListAdapter adapter = new ItemListAdapter(getContext().getApplicationContext(), ItemStorage.getInstance().getItems());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_buy, container, false);
        Button button = view.findViewById(R.id.btnAdd);
        TextView txtData = view.findViewById(R.id.editItem);
       /*
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dataText = getArguments().getString("dataID");
                txtData.setText(dataText);
            }
        };
        */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String dataText = getArguments().get(editText.getText().toString()).toString();
                String string = txtData.getText().toString();
            }
        });

        return view;

    }

    public void addItem(View view) {
/*
        Item item = new Item(editText.getText().toString());
        ItemStorage.getInstance().addItem(item);
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
        System.out.println(ItemStorage.getInstance().getItems());
 */
        Bundle data = new Bundle();
        data.putString("dataID", editText.getText().toString());

    }
}