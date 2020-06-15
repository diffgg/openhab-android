package org.openhab.habdroid.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_reg.*
import org.litepal.LitePal
import org.litepal.extension.findFirstAsync
import org.openhab.habdroid.R
import org.openhab.habdroid.core.OpenHabApplication
import org.openhab.habdroid.model.LitePalUserInfo
import org.openhab.habdroid.model.UserInfo
import org.openhab.habdroid.util.SharedPreferencesUtil
import org.openhab.habdroid.util.showToast

/**
 * @Author： zy
 * @Date： 2020/5/12 6:36 PM
 * @Description：
 */
class RegActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)


        mBtnSignIn.setOnClickListener {
            val userName = tvUsername.text.toString().trim()
            val pwd = tvPassword.text.toString().trim()
            if (userName.isEmpty() || pwd.isEmpty()) {
                showToast("用户名或密码不能为空")
                return@setOnClickListener
            }
            if (userName == "admin" && pwd == "admin") {
                showToast("用户名不能和管理员相同")
                return@setOnClickListener
            } else {
                LitePal.where("userName = ?", userName).findFirstAsync<UserInfo>()
                    .listen { userInfo ->
                        if (userInfo == null) {
                            OpenHabApplication.userInfo = null
                            val user = UserInfo()
                            user.userName = userName
                            user.password = pwd

                            val liteUser = LitePalUserInfo()
                            liteUser.userName = userName
                            liteUser.password = pwd
                            liteUser.saveAsync()

                            OpenHabApplication.userInfoReg = user
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        } else if (userInfo.password != pwd) {
                            showToast("用户名或密码错误")
                            return@listen
                        } else {
                            OpenHabApplication.userInfo = null
                            OpenHabApplication.userInfoReg = userInfo
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        }
                    }
            }
        }
    }

}