/**********************************************************************************************************************
 * Alpha Developer<sup>TM</sup> Inc. Copyright (c) 2019.                                                              *
 * This is the work of, from and by individual team member.  Any duplication or publication of this code without our  *
 * consent AND without this Copyrighted Text is subjected to Copyright Infringement and could even lead to court      *
 * cases.                                                                                                             *
 *                                                                                                                    *
 * Contact emails :-                                                                                                  *
 *     (Group) alphadeveloper3@gmail.com                                                                              *
 *     (Team Leader) shashank.verma2002@gmail.com                                                                     *
 **********************************************************************************************************************/

package com.alpha.dev.materialdialog

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatDialog
import kotlinx.android.synthetic.main.android_material_progress_dialog.*

class MaterialProgressDialog(context: Context) : AppCompatDialog(context) {

    init {
        show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_material_progress_dialog)
        window!!.setBackgroundDrawableResource(R.drawable.dialog_bg)
    }

    fun setTitle(title: String) {
        android_mtrl_pr_title.visibility = View.VISIBLE
        android_mtrl_pr_title.text = title
    }

    fun setMessage(message: String) {
        android_mtrl_pr_message.text = message
    }
}