package com.example.careersteps
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.careersteps.R
import com.example.careersteps.ProfileFragment
import com.example.careersteps.QuestionnaireFragment
import com.example.careersteps.WebinarsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        /*  val tabLayout: TabLayout = findViewById(R.id.tabLayout)

          val adapter = ViewPagerAdapter(supportFragmentManager)
          adapter.addFragment(WebinarsFragment(), "Webinars")
          adapter.addFragment(QuestionnaireFragment(), "Questionnaire")
          adapter.addFragment(ProfileFragment(), "Profile")

          viewPager.adapter = adapter
          tabLayout.setupWithViewPager(viewPager)
      } */
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(WebinarsFragment(), "Webinars")
        adapter.addFragment(QuestionnaireFragment(), "Questionnaire")
        adapter.addFragment(ProfileFragment(), "Profile")

        viewPager.adapter = adapter

        // Connect ViewPager with BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_webinars -> viewPager.currentItem = 0
                R.id.menu_questionnaire -> viewPager.currentItem = 1
                R.id.menu_profile -> viewPager.currentItem = 2
            }
            true
        }
    }

    class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val fragmentList: MutableList<Fragment> = ArrayList()
        private val titleList: MutableList<String> = ArrayList()

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        override fun getCount(): Int {
            return fragmentList.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }

        fun addFragment(fragment: Fragment, title: String) {
            fragmentList.add(fragment)
            titleList.add(title)
        }
    }
}
