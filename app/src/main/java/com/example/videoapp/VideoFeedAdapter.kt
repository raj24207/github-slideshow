package com.example.videoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VideoFeedAdapter(
    private val videoItems: List<VideoItem>
) : RecyclerView.Adapter<VideoFeedAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.video_item, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoItem = videoItems[position]
        holder.bind(videoItem)
    }

    override fun getItemCount(): Int = videoItems.size

    inner class VideoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.video_title)
        private val uploaderTextView: TextView = itemView.findViewById(R.id.video_uploader)
        // private val thumbnailImageView: ImageView = itemView.findViewById(R.id.video_thumbnail) // We'll load images later

        fun bind(videoItem: VideoItem) {
            titleTextView.text = videoItem.title
            uploaderTextView.text = videoItem.uploaderName
            // For this prototype, we are not loading images from thumbnailUrl.
            // The ImageView in video_item.xml has a placeholder background.
            // If you wanted to load images, you'd use a library like Glide or Picasso here:
            // Glide.with(itemView.context).load(videoItem.thumbnailUrl).into(thumbnailImageView)
        }
    }
}
