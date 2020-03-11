package com.example.praktikumtgs6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resep_detail.*
import kotlinx.android.synthetic.main.resep_list_item.*

class resep_detail_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resep_detail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partjdl = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var parttmp = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var partdesc = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_ANSWER)
            var partimg = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_CHOOSER).toInt()
            item_judul.text = partjdl
            item_tempat.text = parttmp
            item_desc.text = partdesc
            item_img.setImageResource(partimg)
        }
    }
}