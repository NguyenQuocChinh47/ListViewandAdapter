package com.example.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        return traiCayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView ivHinh;
        TextView txtTen, txtMoTa;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;
        if(convertView==null) {
            holder = new ViewHolder();
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(layout, null);

            // anh xa
            holder.txtTen =  convertView.findViewById(R.id.txt_Ten);
            holder.txtMoTa = convertView.findViewById(R.id.txt_MoTa);
            holder.ivHinh = convertView.findViewById(R.id.iv_Hinh);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        // gan gia tri
        TraiCay traiCay = traiCayList.get(position);
        holder.txtTen.setText(traiCay.getTen());
        holder.txtMoTa.setText(traiCay.getMoTa());
        holder.ivHinh.setImageResource(traiCay.getHinh());
        return convertView;
    }
}
