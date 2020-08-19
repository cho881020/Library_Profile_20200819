package kr.co.tjoeun.library_profile_20200819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        profilePhotoImg.setOnClickListener {

//            사진을 크게 보는 별개의 액티비티로 이동

            val myIntent = Intent(mContext, ViewProfilePhotoActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun setValues() {

    }

}