/*
 * Created by hieu.nguyen.minh@paradox.ai on 2022
 *  Copyright (c) 2016-2022 by Paradox.Ai . All rights reserved.
 *  Last modified 3/29/22, 9:59 AM
 */

package com.hieuminh.positiondialogmodule.popup

import androidx.viewbinding.ViewBinding

 interface InitLayout<VB: ViewBinding> {
    fun getViewBinding(): VB
    fun initView()
    fun initListener()
}
