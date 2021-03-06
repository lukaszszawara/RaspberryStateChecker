package com.example.orangepistate


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class InformationAdapter(
    mainActivity: MainActivity,
    supportFragmentManager: FragmentManager,
    tabCount: Int,
    private var strings: ArrayList<String>
) : FragmentPagerAdapter(supportFragmentManager) {
    var tabCount = tabCount;
    override fun getItem(position: Int): Fragment {
            return InformationTab(strings[position])
    }
    override fun getCount(): Int {
        return tabCount
    }
}