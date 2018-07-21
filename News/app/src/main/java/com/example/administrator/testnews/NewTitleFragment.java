package com.example.administrator.testnews;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class NewTitleFragment extends Fragment {
    List<News> list=new ArrayList<News>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.news_title,container,false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        init();
        NewAdapter adapter=new NewAdapter(list);
        recyclerView.setAdapter(adapter);
        return view;
    }
    private void init(){
        for (int i=0;i<20;i++){
            News news=new News("title"+i,"content"+i);
            Log.d("result----------",news.getTitle());
            list.add(news);
        }
    }
}
