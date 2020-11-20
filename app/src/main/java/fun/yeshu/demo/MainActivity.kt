package `fun`.yeshu.demo

import `fun`.yeshu.ui.ModelDetailActivity
import `fun`.yeshu.ui.ModelListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickSyncDeviceData(view: View) {
        startActivity(Intent(this, SyncDeviceDataActivity::class.java))
    }

    fun onClickSyncDataWhenLogout(view: View) {

    }

    fun onClickSyncDataToServer(view: View) {}

    fun goToModelListActivity(view: View) {
        startActivity(Intent(this, ModelListActivity::class.java))
    }

    fun goToModelDetailActivity(view: View) {
        startActivity(Intent(this, ModelDetailActivity::class.java))
    }

    fun onClickSyncServerData(view: View) {}
}