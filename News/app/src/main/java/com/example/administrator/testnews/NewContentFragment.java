package com.example.administrator.testnews;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewContentFragment extends Fragment {
    static View view;
    public static Handler handler=new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            News news= (News) msg.obj;
            String title=news.getTitle();
            String content=news.getContent();
            TextView textView=view.findViewById(R.id.contentTitle);
            textView.setText(title);
            TextView textView1=view.findViewById(R.id.contentContent);
            textView1.setText(content);
            Log.d("reslult",news.getTitle());
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.news_content,container,false);
        return view;
    }


}
