package com.ekdnam.whatsappclone.Chat;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.ekdnam.whatsappclone.R;

import java.util.ArrayList;

/**
 *
 */
public class MediaAdapter extends RecyclerView.Adapter<MediaAdapter.MediaViewHolder>{

    ArrayList<String> mediaList;
    Context context;

    /**
     *
     * @param context
     * @param mediaList
     */
    public MediaAdapter(Context context, ArrayList<String> mediaList){
        this.context = context;
        this.mediaList = mediaList;
    }

    /**
     *
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MediaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_media, null, false);
        MediaViewHolder mediaViewHolder = new MediaViewHolder(layoutView);
        return mediaViewHolder;
    }

    /**
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull MediaViewHolder holder, int position) {
        Glide.with(context).load(Uri.parse(mediaList.get(position))).into(holder.mMedia);
    }

    /**
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return mediaList.size();
    }

    /**
     *
     */
    public class MediaViewHolder extends RecyclerView.ViewHolder{

        ImageView mMedia;
        public MediaViewHolder(@NonNull View itemView) {
            super(itemView);
            mMedia = itemView.findViewById(R.id.media);
        }
    }

}
