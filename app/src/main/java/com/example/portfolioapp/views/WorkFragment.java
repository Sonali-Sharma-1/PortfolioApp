package com.example.portfolioapp.views;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolioapp.R;


public class WorkFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match

    public WorkFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View workView= inflater.inflate(R.layout.fragment_work, container, false);
        return  workView;
    }

}