package com.lsj.summary.modules.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsj.summary.R;

/**
 * Created by lsj on 16/3/16.
 */
public class PageFragment extends Fragment {

    private int page;

    public static PageFragment newInstance(int page){
        Bundle bundle = new Bundle();
        bundle.putInt("page", page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("page");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page_fragment, container, false);
        TextView title = (TextView) view.findViewById(R.id.title);
        title.setText(page + "");
        return view;
    }
}