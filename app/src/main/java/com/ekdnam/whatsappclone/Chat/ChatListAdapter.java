package com.ekdnam.whatsappclone.Chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ekdnam.whatsappclone.ChatActivity;
import com.ekdnam.whatsappclone.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Allows us to show the chats fetched from Firebase in a RecylerView.
 */
public class ChatListAdapter extends RecyclerView.Adapter<ChatListAdapter.ChatListViewHolder> {

    ArrayList<ChatObject> chatList;

    /**
     * @param chatList The chats fetched from Firebase for a specific pair of users
     */
    public ChatListAdapter(ArrayList<ChatObject> chatList) {
        this.chatList = chatList;
    }


    @NonNull
    @Override
    public ChatListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat, null, false);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(lp);

        ChatListViewHolder rcv = new ChatListViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(@NonNull final ChatListViewHolder holder, final int position) {
        holder.mTitle.setText(chatList.get(position).getChatId());

        holder.mLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ChatActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("chatID", chatList.get(holder.getAdapterPosition()).getChatId());
                intent.putExtras(bundle);
                v.getContext().startActivity(intent);
            }
        });
    }

    /**
     * @return size of chatList
     */
    @Override
    public int getItemCount() {
        return chatList.size();
    }

    /**
     * Is used to depict the current position and metadata of an item view in a RecyclerView
     */
    public class ChatListViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public LinearLayout mLayout;

        /**
         * @param view the current view of the mobile screen
         */
        public ChatListViewHolder(View view) {
            super(view);
            mTitle = view.findViewById(R.id.title);
            mLayout = view.findViewById(R.id.layout);
        }
    }
}