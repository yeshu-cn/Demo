package `fun`.yeshu.demo

import `fun`.yeshu.domain.usecase.SyncModelDataFromDeviceUseCase
import `fun`.yeshu.ui.ModelDetailActivity
import `fun`.yeshu.ui.ModelListActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.tv_status
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.koin.android.ext.android.getKoin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickSyncDeviceData(view: View) {
        GlobalScope.launch {
            val useCase = getKoin().get<SyncModelDataFromDeviceUseCase>()
            useCase.execute(System.currentTimeMillis())
            showStatus("sync device data success!")
        }
    }

    private fun showStatus(msg: String) {
        tv_status.text = msg
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