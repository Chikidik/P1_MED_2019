package com.example.chik.p1astudio;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder> {

    private Context mContext;
    private List<ItemData> mItemList;

    ItemAdapter(Context mContext, List<ItemData> mItemList) {
        this.mContext = mContext;
        this.mItemList = mItemList;
    }

    @NonNull
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recylerview_row_item,parent,false);
        return new ItemViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {
        holder.mImage.setImageResource(mItemList.get(position).getImage());
        holder.mTitle.setText(mItemList.get(position).getName());
        holder.mPrice.setText(mItemList.get(position).getPrice());
        holder.mCardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Title", mItemList.get(holder.getAdapterPosition()).getName());
                mIntent.putExtra("Description", mItemList.get(holder.getAdapterPosition()).getDescription());
                mIntent.putExtra("Image", mItemList.get(holder.getAdapterPosition()).getImage());
                mIntent.putExtra("Price", mItemList.get(holder.getAdapterPosition()).getPrice());
                mContext.startActivity(mIntent);
            }
            });
        }


    @Override
    public int getItemCount() {
        return mItemList.size();
    }
}

class ItemViewHolder extends RecyclerView.ViewHolder {
    ImageView mImage;
    TextView mTitle;
    TextView mPrice;
    CardView mCardView;

    ItemViewHolder(View itemView) {
        super(itemView);
        mCardView = itemView.findViewById(R.id.cardview);
        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mPrice = itemView.findViewById(R.id.tvPrice);

    }
}