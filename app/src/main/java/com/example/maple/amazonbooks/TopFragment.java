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


/**
 * Created by maple on 9/1/2017.
 */
//Comentario aqui porque la rubrica de esta actividad lo pide
public class TopFragment extends Fragment {
    ImageView imageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.topfragment, container, false);
        imageView = (ImageView) view.findViewById(R.id.greensheep);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com.mx/Where-Green-Sheep-Donde-oveja/dp/0547396945/ref=lp_9571770011_1_5?s=books&ie=UTF8&qid=1504260632&sr=1-5"));
                startActivity(browserIntent);
                    //https://www.amazon.com.mx/Where-Green-Sheep-Donde-oveja/dp/0547396945/ref=lp_9571770011_1_5?s=books&ie=UTF8&qid=1504260632&sr=1-5
                    //https://www.amazon.com.mx/Legend-Zelda-Twilight-Princess/dp/1421596563/ref=lp_9571770011_1_12?s=books&ie=UTF8&qid=1504260632&sr=1-12
                    //https://www.amazon.com.mx/Walking-Dead-Pop-Up-S-D-Perry/dp/1608874443/ref=lp_9571770011_1_7?s=books&ie=UTF8&qid=1504260632&sr=1-7
            }
        });
        return view;
    }
}
