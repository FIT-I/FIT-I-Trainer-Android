package com.example.fit_i_trainer.ui.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.fit_i_trainer.PhotoDialog
import com.example.fit_i_trainer.R
import com.example.fit_i_trainer.ui.main.mypage.MypageFragment


class MypageModifyProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_mypage_modify_profile,container,false)
        val ibpre = view.findViewById<View>(R.id.ib_pre)
        val btnphoto = view.findViewById<View>(R.id.btn_click_photo)

        //이전
        ibpre.setOnClickListener{
            val mypageFragment = MypageFragment()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            //이전 화면으로 이동
            transaction.replace(R.id.fl_container,mypageFragment)
            transaction.commit()

        }
        btnphoto.setOnClickListener{
//            val photoDialog = PhotoDialog()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.commit()
        }
        return view
    }




}
