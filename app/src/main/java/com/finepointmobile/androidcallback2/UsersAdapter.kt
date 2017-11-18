package com.finepointmobile.androidcallback2

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.user_row.view.*

/**
 * Created by danielmalone on 11/18/17.
 */
class UsersAdapter(val users: ArrayList<User>) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindUser(users.get(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.user_row, parent, false);
        return ViewHolder(view)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        fun bindUser(user: User) {
            itemView.first_name.text = user.firstName
        }
    }
}