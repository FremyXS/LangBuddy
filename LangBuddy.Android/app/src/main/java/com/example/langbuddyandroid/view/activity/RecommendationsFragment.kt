package com.example.langbuddyandroid.view.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.toColor
import androidx.navigation.fragment.findNavController
import com.example.langbuddyandroid.R
import com.example.langbuddyandroid.databinding.FragmentRecommendationsBinding

class RecommendationsFragment : Fragment() {

    private lateinit var bind: FragmentRecommendationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bind = FragmentRecommendationsBinding.inflate(layoutInflater, container, false)

        onClickMenu()

        // Inflate the layout for this fragment
        return bind.root
    }

    private fun onClickMenu(){
        bind.mainNavigation.selectedItemId = R.id.menu_recommendations_icon
        bind.mainNavigation.setOnItemSelectedListener{item ->
            when(item.itemId){
                R.id.menu_chat_icon -> {
                    findNavController().navigate(R.id.action_recommendationsFragment_to_chatFragment, null)
                    true
                }
                R.id.menu_global_search_icon -> {
                    findNavController().navigate(R.id.action_recommendationsFragment_to_globalSearchFragment2, null)
                    true
                }
                R.id.menu_likes_icon -> {
                    findNavController().navigate(R.id.action_recommendationsFragment_to_likesFragment, null)
                    true
                }
                R.id.menu_profile_icon -> {
                    findNavController().navigate(R.id.action_recommendationsFragment_to_profileFragment, null)
                    true
                }
                else -> false
            }
        }
    }
}