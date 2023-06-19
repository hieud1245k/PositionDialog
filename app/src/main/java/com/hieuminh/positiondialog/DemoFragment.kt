package com.hieuminh.positiondialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hieuminh.positiondialogmodule.PopupFragment

class DemoFragment : PopupFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_demo, container, false)
    }

    companion object {
        fun newInstance() = DemoFragment()
    }
}
