package com.example.zmw.studyitemdrag.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.zmw.studyitemdrag.R;
import com.example.zmw.studyitemdrag.bean.BookTable;
import com.example.zmw.studyitemdrag.view.RoundImageView;

import java.util.List;

/**
 * Created by ZMW on 2016/5/6.
 */
public class AdapterBookList extends BaseRecyclerAdapter<BookTable> {

    Context context;
    public AdapterBookList(Activity activity,List<BookTable> data){
        this.mDatas=data;
        context=activity;
    }
    @Override
    public RecyclerView.ViewHolder onCreate(ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bookshelf,
                parent, false);
        return new MyHolder(layout);
    }

    @Override
    public void onBind(RecyclerView.ViewHolder viewHolder, int RealPosition, BookTable book) {
        if (viewHolder instanceof MyHolder) {
            final MyHolder holder = ((MyHolder) viewHolder);
            holder.tvBookName.setText(book.getName());
            if (book.getCoverImageId().startsWith("http")){
                Glide.with(context).load(book.getCoverImageId()).crossFade(1000).error(R.mipmap.detail_book_default).into(holder
                        .ivBookCover);
            }
        }
    }

    class MyHolder extends Holder {
        private RoundImageView ivBookCover;
        private TextView tvBookName;

        public MyHolder(View itemView) {
            super(itemView);
            ivBookCover = (RoundImageView) itemView.findViewById(R.id.shelf_item_imageview);
            tvBookName = (TextView) itemView.findViewById(R.id.shelf_item_bookname_textview);
        }

    }
}
