package com.lsj.summary.modules.material;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lsj.summary.R;

/**
 * Created by lsj on 16/2/29.
 */
public class SampleFragment extends Fragment {
    private int page;

    public static SampleFragment newInstance(int page){
        Bundle args = new Bundle();
        args.putInt("page", page);
        SampleFragment fragment = new SampleFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sample_fragment, null);
        return view;
    }
}
