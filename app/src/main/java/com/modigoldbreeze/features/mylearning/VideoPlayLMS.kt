package com.modigoldbreeze.features.mylearning

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.modigoldbreeze.R
import com.modigoldbreeze.base.presentation.BaseFragment

class VideoPlayLMS : BaseFragment() {
    private lateinit var mContext:Context
    private lateinit var adapter: VideoAdapter
    private val videos = ArrayList<VideoLMS>()
    private val exoPlayerItems = ArrayList<ExoPlayerItem>()
    lateinit var viewPager2: ViewPager2

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_video_play_l_m_s, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        viewPager2 = view.findViewById(R.id.viewPager2)


        videos.add(
            VideoLMS(
                "Reimbursement",
                "http://3.7.30.86:8073/Commonfolder/DocumentSharing/d9533eaf-9cd7-4b4f-b24d-c54b32d413ce.mp4"
            )
        )

        videos.add(
            VideoLMS(
                "June Training",
                "http://3.7.30.86:8073/Commonfolder/DocumentSharing/EXTREME PARKOUR JUMP over death gap.mp4"
            )
        )

        adapter = VideoAdapter(mContext, videos, object : VideoAdapter.OnVideoPreparedListener {
            override fun onVideoPrepared(exoPlayerItem: ExoPlayerItem) {
                exoPlayerItems.add(exoPlayerItem)
            }
        })

        viewPager2.adapter = adapter

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                val previousIndex = exoPlayerItems.indexOfFirst { it.exoPlayer.isPlaying }
                if (previousIndex != -1) {
                    val player = exoPlayerItems[previousIndex].exoPlayer
                    player.pause()
                    player.playWhenReady = false
                }
                val newIndex = exoPlayerItems.indexOfFirst { it.position == position }
                if (newIndex != -1) {
                    val player = exoPlayerItems[newIndex].exoPlayer
                    player.playWhenReady = true
                    player.play()
                }
            }
        })

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }

    override fun onPause() {
        super.onPause()

        val index = exoPlayerItems.indexOfFirst { it.position == viewPager2.currentItem }
        if (index != -1) {
            val player = exoPlayerItems[index].exoPlayer
            player.pause()
            player.playWhenReady = false
        }
    }

    override fun onResume() {
        super.onResume()

        val index = exoPlayerItems.indexOfFirst { it.position == viewPager2.currentItem }
        if (index != -1) {
            val player = exoPlayerItems[index].exoPlayer
            player.playWhenReady = true
            player.play()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (exoPlayerItems.isNotEmpty()) {
            for (item in exoPlayerItems) {
                val player = item.exoPlayer
                player.stop()
                player.clearMediaItems()
            }
        }
    }

    companion object {
        fun getInstance(objects: Any): VideoPlayLMS {
            val fragment = VideoPlayLMS()
            return fragment
        }
    }
}