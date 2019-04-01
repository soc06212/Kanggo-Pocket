package com.RiDsoft.kangwonhighschool.ui.main.viewholder

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

import com.RiDsoft.kangwonhighschool.R

/**
 * Created by RiD on 2017. 4. 9..
 */

class MainShortcutViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val icon: ImageView = itemView.findViewById<View>(R.id.img_main_menu) as ImageView
    val title: TextView = itemView.findViewById<View>(R.id.txt_main_menu) as TextView
    val cardView: CardView = itemView.findViewById<View>(R.id.cardview_main) as CardView

}
