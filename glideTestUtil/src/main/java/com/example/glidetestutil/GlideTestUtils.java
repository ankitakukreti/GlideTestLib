package com.example.glidetestutil;


import android.app.Activity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class GlideTestUtils {
    public static void setGlide(Activity activity, String url, ImageView imageView){
        Glide.with(activity)
                .load(url)
                .into(imageView);
    }
}
