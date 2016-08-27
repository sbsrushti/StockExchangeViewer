package com.usc.srushti.stockexchangeviewer;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ymehta on 20/04/16.
 */
public class CurrentActivity extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v =  inflater.inflate(R.layout.current_layout, container, false);

        StockDetailActivity stockactivity = (StockDetailActivity) getActivity();
        String mySymbol = stockactivity.getSymbol();

        return v;
    }
}
