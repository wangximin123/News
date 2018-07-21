package com.example.administrator.testnews;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.ViewHolder> {
    List<News> list;
    private Message message;

    public NewAdapter(List<News> list){
        this.list=list;
        Log.d("result",list.size()+"");
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.title_item,viewGroup,false);
        final ViewHolder viewHolder=new ViewHolder(view);
        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position=viewHolder.getAdapterPosition();
                message = new Message();
                message.obj=list.get(position);
                NewContentFragment.handler.sendMessage(message);
            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        News news=list.get(i);
        viewHolder.title.setText(news.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.itemTitle);
            view=itemView;
        }
    }
}
