package com.example.careersteps

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.careersteps.Webinar

class WebinarAdapter(private val webinars: List<Webinar>, private val onItemClick: (Webinar) -> Unit) :
    RecyclerView.Adapter<WebinarAdapter.WebinarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebinarViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_webinar, parent, false)
        return WebinarViewHolder(view)
    }

    override fun onBindViewHolder(holder: WebinarViewHolder, position: Int) {
        val webinar = webinars[position]
        holder.bind(webinar)
    }

    override fun getItemCount(): Int {
        return webinars.size
    }

    inner class WebinarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val webinarNameTextView: TextView = itemView.findViewById(R.id.textViewWebinarName)
        private val webinarTimeTextView: TextView = itemView.findViewById(R.id.textViewWebinarTime)
        private val viewDetailsButton: Button = itemView.findViewById(R.id.buttonViewDetails)

        fun bind(webinar: Webinar) {
            webinarNameTextView.text = webinar.name
            webinarTimeTextView.text = webinar.time

            viewDetailsButton.setOnClickListener {
                onItemClick.invoke(webinar)
            }
        }
    }
}
