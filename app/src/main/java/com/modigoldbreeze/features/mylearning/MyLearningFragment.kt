package com.modigoldbreeze.features.mylearning
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.modigoldbreeze.R
import com.modigoldbreeze.app.types.FragType
import com.modigoldbreeze.base.presentation.BaseFragment
import com.modigoldbreeze.features.contacts.ViewCrmOpptFrag
import com.modigoldbreeze.features.dashboard.presentation.DashboardActivity
import com.etebarian.meowbottomnavigation.MeowBottomNavigation


class MyLearningFragment : BaseFragment(),OnClickListener {
    private lateinit var mContext:Context
    private lateinit var bottomNavigation:MeowBottomNavigation
    private lateinit var cv_lms_learner_space:CardView
    private lateinit var cv_lms_leaderboard:CardView
    private lateinit var ll_knowledgeHub:LinearLayout


    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext=context
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater!!.inflate(R.layout.fragment_my_learning, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        bottomNavigation=view.findViewById(R.id.bottomNavigation)
        cv_lms_learner_space=view.findViewById(R.id.cv_lms_learner_space)
        ll_knowledgeHub=view.findViewById(R.id.ll_frag_search_knowledge_hub_root)
        cv_lms_leaderboard=view.findViewById(R.id.cv_lms_leaderboard)

        bottomNavigation.setOnClickMenuListener { model: MeowBottomNavigation.Model? -> null }

        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.my_performance_))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ftr_my_learning))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ftr_leaderboard))
        bottomNavigation.add(MeowBottomNavigation.Model(4, R.drawable.ftr_knowledge_hub))
       // bottomNavigation.show(1)

        cv_lms_learner_space.setOnClickListener {
            (mContext as DashboardActivity).loadFragment(FragType.SearchLmsFrag, true, "")
        }

        ll_knowledgeHub.setOnClickListener(this)
        cv_lms_leaderboard.setOnClickListener(this)
    }

    fun getURLForResource(resourceId: Int): String {
        return Uri.parse("android.resource://" + com.modigoldbreeze.R::class.java.getPackage().name + "/" + resourceId)
            .toString()
    }

    companion object {
        fun getInstance(objects: Any): MyLearningFragment {
            val fragment = MyLearningFragment()
            return fragment
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            ll_knowledgeHub.id -> {
                (mContext as DashboardActivity).loadFragment(FragType.SearchLmsFrag, true, "")
            }

            cv_lms_leaderboard.id -> {
                (mContext as DashboardActivity).loadFragment(FragType.LeaderboardLmsFrag, true, "")
            }
        }
    }

}