package com.alpha.dev.materialAlertDialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alpha.dev.materialdialog.MaterialAlertDialog
import com.alpha.dev.materialdialog.MaterialDialogInterface

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MaterialAlertDialog.Builder(this)
            .setTitle("Title")
            .setMessage("As you can see, the message is shown here.")
            .setPositiveButton("OK", MaterialDialogInterface.OnPositiveClickListener {
                //Do something positive
                it.dismiss()
            })
            .setNegativeButton("Cancel", MaterialDialogInterface.OnNegativeClickListener {
                //Do something negative
                it.dismiss()
            })
            .setNeutralButton("Neutral", MaterialDialogInterface.OnNeutralClickListener {
                //Do something neutral
                it.dismiss()
            }).build()      //no need of .show()
    }
}
