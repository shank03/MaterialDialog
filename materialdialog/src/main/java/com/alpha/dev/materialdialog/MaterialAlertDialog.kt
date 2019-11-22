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
import com.alpha.dev.materialdialog.MaterialDialogInterface.*
import kotlinx.android.synthetic.main.android_material_dialog.*

class MaterialAlertDialog(context: Context,
                          title: String, message: String,
                          positiveButtonText: String, negativeButtonText: String, neutralButtonText: String,
                          positiveOnClickListener: OnPositiveClickListener?, negativeOnClickListener: OnNegativeClickListener?, neutralOnClickListener: OnNeutralClickListener?)
    : AppCompatDialog(context) {

    companion object {
        const val INVALID_STRING = "--"
    }

    init {
        show()
        if (title != INVALID_STRING) {
            android_mtrl_dialog_title.visibility = View.VISIBLE
            android_mtrl_dialog_title.text = title
        }
        if (message != INVALID_STRING) {
            android_mtrl_dialog_message.visibility = View.VISIBLE
            android_mtrl_dialog_message.text = message
        }
        if (positiveButtonText != INVALID_STRING && positiveOnClickListener != null) {
            android_mtrl_positive_btn_text.text = positiveButtonText
            android_mtrl_dialog_positive_btn.visibility = View.VISIBLE

            android_mtrl_dialog_positive_btn.setOnClickListener {
                positiveOnClickListener.onClick(this)
            }
        }
        if (negativeButtonText != INVALID_STRING && negativeOnClickListener != null) {
            android_mtrl_negative_btn_text.text = negativeButtonText
            android_mtrl_dialog_negative_btn.visibility = View.VISIBLE

            android_mtrl_dialog_negative_btn.setOnClickListener {
                negativeOnClickListener.onClick(this)
            }
        }
        if (neutralButtonText != INVALID_STRING && neutralOnClickListener != null) {
            android_mtrl_neutral_btn_text.text = neutralButtonText
            android_mtrl_dialog_neutral_btn.visibility = View.VISIBLE

            android_mtrl_dialog_neutral_btn.setOnClickListener {
                neutralOnClickListener.onClick(this)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_material_dialog)
        window!!.setBackgroundDrawableResource(R.drawable.dialog_bg)
    }

    class Builder(private val context: Context) {
        private var title = INVALID_STRING
        private var message = INVALID_STRING

        private var positiveButtonText = INVALID_STRING
        private var negativeButtonText = INVALID_STRING
        private var neutralButtonText = INVALID_STRING

        private var positiveOnClickListener: OnPositiveClickListener? = null
        private var negativeOnClickListener: OnNegativeClickListener? = null
        private var neutralOnClickListener: OnNeutralClickListener? = null

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun setPositiveButton(text: String, onClickListener: OnPositiveClickListener): Builder {
            this.positiveButtonText = text
            this.positiveOnClickListener = onClickListener
            return this
        }

        fun setNegativeButton(text: String, onClickListener: OnNegativeClickListener): Builder {
            this.negativeButtonText = text
            this.negativeOnClickListener = onClickListener
            return this
        }

        fun setNeutralButton(text: String, onClickListener: OnNeutralClickListener): Builder {
            this.neutralButtonText = text
            this.neutralOnClickListener = onClickListener
            return this
        }

        fun build(): MaterialAlertDialog {
            return MaterialAlertDialog(context, title, message, positiveButtonText, negativeButtonText, neutralButtonText, positiveOnClickListener, negativeOnClickListener, neutralOnClickListener)
        }
    }
}