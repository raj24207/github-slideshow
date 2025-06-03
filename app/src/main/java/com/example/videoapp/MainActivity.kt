package com.example.videoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView_video_feed)

        // Sample Data
        val sampleVideos = listOf(
            VideoItem("1", "Big Buck Bunny", "Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/BigBuckBunny.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"),
            VideoItem("2", "Elephant's Dream", "Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ElephantsDream.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"),
            VideoItem("3", "For Bigger Blazes", "Google", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerBlazes.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerBlazes.mp4"),
            VideoItem("4", "For Bigger Escape", "Google", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerEscapes.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerEscapes.mp4"),
            VideoItem("5", "For Bigger Fun", "Google", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/ForBiggerFun.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ForBiggerFun.mp4"),
            VideoItem("6", "Sintel", "Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/Sintel.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/Sintel.mp4"),
            VideoItem("7", "Subaru Outback On Street And Dirt", "Garage419", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/SubaruOutbackOnStreetAndDirt.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/SubaruOutbackOnStreetAndDirt.mp4"),
            VideoItem("8", "Tears of Steel", "Blender Foundation", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/images/TearsOfSteel.jpg", "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/TearsOfSteel.mp4")
        )

        val adapter = VideoFeedAdapter(sampleVideos)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
