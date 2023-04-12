package com.example.langbuddyandroid.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.langbuddyandroid.databinding.FragmentGlobalSearchBinding
import com.example.langbuddyandroid.databinding.FragmentUserCardBinding
import com.example.langbuddyandroid.model.User.User

class UsersAdapter(private val listener: Listener) : ListAdapter<User, RecyclerView.ViewHolder>(MyDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val bind = FragmentUserCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        return  ItemHolder(bind);
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemHolder).bind(getItem(position), listener, holder.itemView.context)
    }

    class ItemHolder(val bind: FragmentUserCardBinding ): RecyclerView.ViewHolder(bind.root){
        fun bind(user: User, listener: Listener, context: Context){

        }
    }

    class MyDiffCallback: DiffUtil.ItemCallback<User>(){
        override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
            return oldItem == newItem
        }

    }

    interface Listener {
        fun onClick(user: User)
    }
}