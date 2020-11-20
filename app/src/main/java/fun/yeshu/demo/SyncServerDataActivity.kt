package `fun`.yeshu.demo


import `fun`.yeshu.domain.model.Model
import `fun`.yeshu.domain.usecase.SyncModelDataFromDeviceUseCase
import `fun`.yeshu.domain.usecase.SyncModelDataFromServerUseCase
import `fun`.yeshu.ui.ModelAdapter
import `fun`.yeshu.ui.ModelListViewModel
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.android.viewmodel.ext.android.viewModel
import kotlinx.android.synthetic.main.activity_data_sync.*
import kotlinx.coroutines.launch
import org.koin.android.ext.android.getKoin

class SyncServerDataActivity : AppCompatActivity() {
    private val viewModel: ModelListViewModel by viewModel()
    private val listAdapter by lazy { ModelAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_sync)
        initView()
        viewModel.data.observe(this, Observer {
            showModelList(it)
        })
    }

    private fun showModelList(data: List<Model>) {
        pb_sync.visibility = View.GONE
        tv_message.visibility = View.VISIBLE
        listAdapter.setData(data)
    }

    private fun initView() {
        val manager = LinearLayoutManager(this)
        manager.orientation = LinearLayoutManager.VERTICAL
        rv_list.layoutManager = manager
        rv_list.adapter = listAdapter

        btn_sync.text = "本地数据为空，点击同步服务器数据"
        tv_message.text = "同步设备数据成功，显示数据"
    }

    fun onClickSyncDeviceData(view: View) {
        btn_sync.visibility = View.GONE
        pb_sync.visibility = View.VISIBLE
        syncDeviceData()
    }

    private fun syncDeviceData() {
        viewModel.viewModelScope.launch {
            val useCase = getKoin().get<SyncModelDataFromServerUseCase>()
            useCase.execute()
            // 同步成功后，加载数据显示
            viewModel.loadData()
        }
    }
}