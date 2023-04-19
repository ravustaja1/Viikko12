package fi.solehmainen.ostokset;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context context;

    private ArrayList<Item> items = new ArrayList<Item>();

    public ItemListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.txtField.setText(items.get(position).getPurchase());
        holder.delete.setImageResource(items.get(position).getImage());
        holder.edit.setImageResource(items.get(position).getImage2());
        holder.editText.setText(items.get(position).getPurchase());

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = holder.getAdapterPosition();
                ItemStorage.getInstance().removeItem(items.get(pos).getId());
                notifyItemRemoved(pos);
            }
        });

        holder.edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = holder.getAdapterPosition();

                if (holder.editText.getVisibility() == View.VISIBLE) {
                    Item item = ItemStorage.getInstance().getItemById(pos);
                    item.setPurchase(holder.editText.getText().toString());
                    holder.editText.setVisibility(View.GONE);
                    notifyDataSetChanged();
                } else {
                    holder.editText.setVisibility(View.VISIBLE);
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
