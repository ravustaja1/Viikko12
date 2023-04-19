package fi.solehmainen.ostokset;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView delete, edit;

    EditText editText;


    TextView txtField;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        delete = itemView.findViewById(R.id.ivDelete);
        edit = itemView.findViewById(R.id.ivEdit);
        txtField = itemView.findViewById(R.id.tvItem);
        editText = itemView.findViewById(R.id.editPurchase);
    }
}
