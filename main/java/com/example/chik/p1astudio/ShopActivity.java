package com.example.chik.p1astudio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

public class ShopActivity extends AppCompatActivity {
    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List<ItemData> mItemList;
    ItemData mItemData;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridlayoutManager = new GridLayoutManager(ShopActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridlayoutManager);

        mItemList = new ArrayList<>();// name, description, img, price
        mItemData = new ItemData("Book", getString(R.string.description_item_book),R.drawable.artboard4, "50 kr.-");
        mItemList.add(mItemData);
        mItemData = new ItemData("Kettle", getString(R.string.description_item_kettle),R.drawable.artboard1, "150 kr.-");
        mItemList.add(mItemData);
        mItemData = new ItemData("Scissor", getString(R.string.description_item_scissor),R.drawable.artboard3, "20 kr.-");
        mItemList.add(mItemData);
        mItemData = new ItemData("Phone", getString(R.string.description_item_phone),R.drawable.artboard2, "3000 kr.-");
        mItemList.add(mItemData);
        mItemData = new ItemData("Harddisk", getString(R.string.description_item_hdd),R.drawable.artboard5, "500 kr.-");
        mItemList.add(mItemData);
        mItemData = new ItemData("T-shirt", getString(R.string.description_item_tShirt),R.drawable.artboard6, "100 kr.-");
        mItemList.add(mItemData);



        ItemAdapter itemAdapter = new ItemAdapter(ShopActivity.this, mItemList);
        mRecyclerView.setAdapter(itemAdapter);


    }



}
