package com.example.videoapp

data class VideoItem(
    val id: String,
    val title: String,
    val uploaderName: String,
    val thumbnailUrl: String,
    val videoUrl: String // Not used for playback in this prototype, but good for data structure
)
