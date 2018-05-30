package com.example.module4and5hw;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by askhat on 27-Mar-18.
 */

public class PhonesAdapter extends RecyclerView.Adapter<PhonesAdapter.ViewHolder> {

    private final Context context;
    private final List<Phone> phones;

    public PhonesAdapter(Context context, List<Phone> phones) {
        this.context = context;
        this.phones = phones;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.card, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Phone phone = phones.get(position);
        holder.imageView.setImageResource(phone.getPoster());
        holder.textView.setText(phone.getTitle());
        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Wait...", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return phones.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        private Button button;

        public ViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.card_image);
            textView = itemView.findViewById(R.id.card_text);
            button = itemView.findViewById(R.id.card_button);
        }
    }
}
