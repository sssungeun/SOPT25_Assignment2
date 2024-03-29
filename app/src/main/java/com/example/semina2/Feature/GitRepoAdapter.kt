package com.example.semina2.Feature

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.semina2.Data.GitRepoItem
import com.example.semina2.R

class GitRepoAdapter(private val context: Context) : RecyclerView.Adapter<GitRepoViewHolder>() {

    var data = listOf<GitRepoItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GitRepoViewHolder {
       //inflate는 layout파일을 메모리로 올리는 함수
        val view = LayoutInflater.from(context).inflate(R.layout.rv_item, parent,false)

        return GitRepoViewHolder(view)
    }

    //숫자 세기
    override fun getItemCount(): Int {
        return data.size
    }

    //list index, 몇번째인지
    override fun onBindViewHolder(holder: GitRepoViewHolder, position: Int) {
        holder.bind(data[position])
//        Glide.with()
//            .load(data[position].profileImg)
//            .into(holder.profileImg)
//
//        Glide
//            .with(itemView)
//            .load()
//
//        Glide //이미지처리
//            .with(itemView)
//            .load() //다양한 것들 로드 가능
//            .into(imageView)
//            .placeholder(R.drawable.) //다른거 보여주기
    }
    }


