package com.example.maple.amazonbooks;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
//Comentario aqui porque la rubrica de esta actividad lo pide
/**
 * Created by maple on 9/1/2017.
 */

public class MiddleFragment extends Fragment {
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.middlefragment, container, false);
        imageView = (ImageView) view.findViewById(R.id.twd_popup);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.mx/Walking-Dead-Pop-Up-S-D-Perry/dp/1608874443/ref=lp_9571770011_1_7?s=books&ie=UTF8&qid=1504260632&sr=1-7"));
                startActivity(browserIntent);
            }
        });
        return view;
    }
}
