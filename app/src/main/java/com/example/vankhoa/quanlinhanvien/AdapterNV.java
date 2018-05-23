package com.example.vankhoa.quanlinhanvien;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Van Khoa on 4/15/2018.
 */

public class AdapterNV extends ArrayAdapter {
    Context context;
    ArrayList<NhanVien> list;
    int layout;
    public AdapterNV(@NonNull Context context, int resource, @NonNull ArrayList<NhanVien> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.layout=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,parent, false);

        TextView txtid = (TextView) convertView.findViewById(R.id.txtid);
        TextView txtten = (TextView) convertView.findViewById(R.id.txtten);
        TextView txtsdt = (TextView) convertView.findViewById(R.id.txtsdt);
        Button btnsua = (Button) convertView.findViewById(R.id.btnsua);
        Button btnxoa = (Button) convertView.findViewById(R.id.btnxoa);
//        ImageView imghinhdaidien = (ImageView) row.findViewById(R.id.imghinhdaidien);
//        ImageView imghinhdaidien = (ImageView) row.findViewById(R.id.imghinhdaidien);

        NhanVien nhanVien=list.get(position);
        txtid.setText(nhanVien.id+"");
        txtten.setText(nhanVien.ten);
        txtsdt.setText(nhanVien.sdt);
        return convertView;
    }
}
