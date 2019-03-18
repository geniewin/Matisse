package com.lxj.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.lxj.matisse.R;
import com.lxj.xpopup.impl.PartShadowPopupView;

/**
 * Description:
 * Create by lxj, at 2019/3/18
 */
public class AlbumPopup extends PartShadowPopupView {
    ListView listView;
    ListAdapter adapter;
    AdapterView.OnItemClickListener itemClickListener;
    public AlbumPopup(@NonNull Context context) {
        super(context);
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.popup_album;
    }

    @Override
    protected void onCreate() {
        super.onCreate();
        Log.e("tag", "onCreate onCreate onCreate");
        listView = findViewById(R.id.listView);

        listView.setBackgroundColor(Color.WHITE);

        listView.setAdapter(this.adapter);
        listView.setOnItemClickListener(itemClickListener);
    }

    public AlbumPopup setAdapter(ListAdapter adapter){
        this.adapter = adapter;
        return this;
    }

    public AlbumPopup setOnItemClickListener(AdapterView.OnItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
        return this;
    }
}
