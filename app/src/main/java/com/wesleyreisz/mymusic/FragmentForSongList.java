package com.wesleyreisz.mymusic;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wesleyreisz.mymusic.R;

import java.util.zip.Inflater;

/**
 * Created by Chapa on 10/19/2015.
 */
public class FragmentForSongList  extends Fragment {

@Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
    return inflater.inflate(R.layout.list_view_layout, container, false);}
}
