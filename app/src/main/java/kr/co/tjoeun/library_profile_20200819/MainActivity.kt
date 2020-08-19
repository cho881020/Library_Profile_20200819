package kr.co.tjoeun.library_profile_20200819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
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

//        Glide로 웹상의 차은우 사진을 프사로 반영
        Glide.with(mContext).load("https://upload.wikimedia.org/wikipedia/commons/thumb/6/65/170924_%ED%91%B8%EB%93%9C%ED%8A%B8%EB%9F%AD%EC%9D%B4%EB%B2%A4%ED%8A%B8.jpg/250px-170924_%ED%91%B8%EB%93%9C%ED%8A%B8%EB%9F%AD%EC%9D%B4%EB%B2%A4%ED%8A%B8.jpg").into(profilePhotoImg)

    }

}