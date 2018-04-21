package com.example.hassanmoura.test1;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hassanmoura on 4/21/18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

//    private Context mCtx;
    private List<Message> messageList;


    public MyAdapter(List<Message> messageList) {
        this.messageList = messageList;
    }

    public void addMessage(Message msg) {
        messageList.add(msg);
        notifyItemInserted(messageList.size() - 1);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_layout,null );
        ViewHolder holder = new ViewHolder(view);
        return holder;



    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Message data = messageList.get(position);

        holder.name.setText(data.getName());
        holder.content.setText(data.getContent());
        holder.timestamp.setText(DateUtils.getRelativeTimeSpanString(holder.itemView.getContext(), data.getTimestamp()));
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView name, content ,timestamp;



        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            content = itemView.findViewById(R.id.content);
            timestamp = itemView.findViewById(R.id.timestamp);

        }
    }

}
